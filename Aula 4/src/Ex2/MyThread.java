package Ex2;

public class MyThread implements Runnable{
    Thread thread;
    private boolean pausada = false;
    private boolean encerrada = false;
    public MyThread(String nome) {
        thread = new Thread(this, nome);
        thread.start();
    }
    public void run() {
        System.out.println(thread.getName() + " iniciando.");
        try {
            for (int i = 1; i <= 160; i++) {
                // Bloco sincronizado para controle de pausa e encerramento
                synchronized (this) {
                    while (pausada) {
                        wait();
                    }
                    if (encerrada) break;
                }
                System.out.print(i + " ");
                if (i % 10 == 0) {
                    System.out.println();
                    Thread.sleep(250); // pausa para facilitar visualização
                }
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " interrompida.");
        }
        System.out.println("\n" + thread.getName() + " finalizando.");
    }
    // Suspender a thread
    public synchronized void pausar() {
        System.out.println("Pausando a Thread");
        try {
            while (pausada){
                wait();
                pausada = false;
            }
        }catch (InterruptedException e){
            System.out.println("Thread " + thread.getName() + " interrompida");
        }
    }
    // Retomar a thread
    public synchronized void retomar() {
        System.out.println("Retomando Thread");
        pausada = false;
        notify();
    }
    // Finalizar a thread
    public synchronized void encerrar() {
        System.out.println("Matando Thread");
        encerrada = true;
        pausada = false;
        notify();

    }
}


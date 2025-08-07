package Ex2;

public class MyThread implements Runnable{
    private String nomeThread;

    public MyThread(String nome){
        nomeThread = nome;
    }

    public void run(){
        System.out.println("Iniciando " + nomeThread);
        try{
            for(int i = 0; i < 10; i++){
                Thread.sleep(400);
                System.out.println("A contagem em " + nomeThread + " e: " + i+1);

            }
        } catch (InterruptedException e){
            System.out.println(nomeThread + " INterrompida");
        }
        System.out.println(nomeThread + "Terminando");
    }
}

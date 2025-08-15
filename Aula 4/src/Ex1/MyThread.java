package Ex1;

public class MyThread implements Runnable{
    Thread thrd;
    TiqueTaque ttOb;

    public MyThread(String nome, TiqueTaque tt) {
        thrd = new Thread(this, nome);
        ttOb = tt;
        thrd.start();
    }

    public void run() {
        if(thrd.getName().equals("Tique")) {
            for(int i=0; i<5; i++) ttOb.tique(true);
            ttOb.tique(false);
        }
        else {
            for(int i=0; i<5; i++) ttOb.taque(true);
            ttOb.taque(false);
        }
    }
}

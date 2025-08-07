package Ex2;

public class UsaThread {
    public static void main(String args[]){
        System.out.println("Thread Principal comecando");
        MyThread T1 = new MyThread("Thread 1");
        MyThread T2 = new MyThread("Thread 2");
        MyThread T3 = new MyThread("Thread 3");

        Thread MyT1 = new Thread(T1);
        Thread MyT2 = new Thread(T2);
        Thread MyT3 = new Thread(T3);

        MyT1.start();
        MyT2.start();
        MyT3.start();
        for(int i = 0; i < 50; i++){
            System.out.println(".");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Thread principal interrompida");
            }
        }
        System.out.println("Thread principal finalizada");


    }
}

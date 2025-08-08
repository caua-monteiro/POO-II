package EX2;

import java.util.*;

public class CestaFrutas extends Thread{
    ArrayList<String> frutas = new ArrayList<>();

    public CestaFrutas(ArrayList<String> f){
        super("Thead Cesta de Frutas");
        frutas = f;
    }

    public void run(){
        System.out.println("Iniciando a Thead");
        try{
            for(String a: frutas){
                System.out.println(a);
                Thread.sleep(100);
            }
            System.out.println("Thread Finalizada");
        }catch (InterruptedException e){
            System.out.println("Thread Interrompida");
        }
    }
}

package EX2;

import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;

public class CestaFrutaAPP {
    public static void main(String[] args){
        System.out.println("Thread Principal iniciando");
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maca");
        frutas.add("Morango");
        frutas.add("Uva");
        frutas.add("Ameixa");
        frutas.add("Banana");

        Thread MyT = new CestaFrutas(frutas);

        MyT.start();
        try{
            for(int i= 0; i<10; i++){
                Thread.sleep(100);
                System.out.println(".");
            }
        }catch (InterruptedException e){
            System.out.println("Thread Principal interrompida");
        }
        System.out.println("Thread Principal finalizada");
    }
}

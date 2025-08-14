public class UsaConta {
    public static void main(String[] args){
        ContaBancaria CB = new ContaBancaria();
        Pessoa P1 = new Pessoa("Thread #P1", CB);
        Pessoa P2 = new Pessoa("Thread #P2", CB);

        try {
            P1.myT.join();
            P2.myT.join();
        }catch (InterruptedException e){
            System.out.println("Thread principal interrompida");
        }
    }
}

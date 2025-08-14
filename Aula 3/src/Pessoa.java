public class Pessoa implements Runnable{
    Thread myT;
    ContaBancaria contaUsuario;

    public Pessoa(String aux, ContaBancaria CB){
        myT = new Thread(this, aux);
        contaUsuario = CB;
        myT.start();
    }

    @Override
    public void run() {
        for(int i = 0; i<100 ; i++){
            contaUsuario.sacar(200);
            contaUsuario.depositar(200);
        }
        System.out.println("Saldo final de " + myT.getName() + ": " + contaUsuario.getSaldo());
    }
}

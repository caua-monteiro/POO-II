public class ContaBancaria {
    double saldo;

    public ContaBancaria(){
        saldo = 1000;
    }
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public synchronized void sacar(double valor){
        this.saldo -= valor;
    }
    public synchronized void depositar(double valor){
        this.saldo += valor;
    }
    public double getSaldo(){
        return saldo;
    }
}

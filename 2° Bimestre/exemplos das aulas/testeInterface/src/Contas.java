public abstract class Contas {
    private Double saldo;

    public Contas(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //pode ficar no conta pois é comum a todos que herdam
    public Double depositar(Double valor){
        this.saldo += valor;
        return this.saldo;
    }
}

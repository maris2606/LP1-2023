public class Pessoal extends Contas implements Retirada, Gastar{
    //pode tudo
    private Double CPF;

    public Pessoal(Double saldo, double CPF) {
        super(saldo);
        this.CPF = CPF;
    }

    @Override
    public Double comprar(Double valorCompra) {
        setSaldo(getSaldo()-valorCompra);
        return getSaldo();
    }

    @Override
    public Double sacar(Double valor) {
        setSaldo(getSaldo()-valor);
        return getSaldo();
    }

    @Override
    public Double dividir(Integer divisor) throws Exception{
        if(divisor == 0) {
            throw new Exception("impossível dividir");
        } else {
            setSaldo(getSaldo() / divisor);
            return getSaldo();
        }
    }

    public Double getCPF() {
        return CPF;
    }

    public void setCPF(Double CPF) {
        this.CPF = CPF;
    }
}

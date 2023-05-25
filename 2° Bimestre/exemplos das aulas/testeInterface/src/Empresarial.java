public class Empresarial extends Contas implements Retirada{
    //pode tudo menos comprar
    private Double CNPJ;

    public Empresarial(Double saldo, double CNPJ) {
        super(saldo);
        this.CNPJ = CNPJ;
    }

    @Override
    public Double sacar(Double valor) {
        //essa onta empresarial tem 5% de desconto
        setSaldo(getSaldo() - valor - (valor * 0.05));
        return getSaldo();
    }

    @Override
    public Double dividir(Integer divisor) {
        setSaldo(getSaldo() / divisor);
        return getSaldo();
    }

    public Double getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(Double CNPJ) {
        this.CNPJ = CNPJ;
    }
}

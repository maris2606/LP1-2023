public class Infantil extends Contas implements Gastar{
    //só pode comprar e depositar


    public Infantil(Double saldo) {
        super(saldo);
    }

    @Override
    public Double comprar(Double valorCompra) {
        setSaldo(getSaldo() - (valorCompra/2));
        //o pai da criança paga 50% do valor da compra

        return getSaldo();
    }
}

package model;

import repository.ExibirInterface;

public class Pedido extends Orcamento implements ExibirInterface {
    private String dataEntrega;
    private Boolean entregue;

    public void entregar()throws Exception{
        if (!entregue){
            entregue = true;
        } else {
            throw new Exception("O pedido já foi entregue!");
        }
    }

    @Override
    public void exibir(Boolean b) {
        if (b){
            System.out.println("pedido: " + getId());
            System.out.println("- Itens: ");
            for (ItemPedido item : getItens()) {
                item.exibir(false);
            }
            System.out.println("Data de Entrega: " + dataEntrega);
            System.out.print("Situação: ");
            if (entregue) {
                System.out.println("entregue");
            } else {
                System.out.println("não entregue");
            }
            System.out.println("Valor total: R$" + getValorTotal()+"\n");
        } else {
            System.out.print("- "+ getId()+", "+dataEntrega+", ");
            if (entregue) {
                System.out.print("entregue, ");
            } else {
                System.out.print("não entregue, ");
            }
            System.out.println("R$"+getValorTotal()+"\n");

        }
    }

    public Pedido(String dataEntrega){
        this.dataEntrega = dataEntrega;
        this.entregue = false;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}

package model;

import repository.ExibirInterface;

import java.util.ArrayList;
import java.util.List;

public class Orcamento implements ExibirInterface {
    private static Long idBase = 0L;
    private Long id;
    private List<ItemPedido> itens = new ArrayList<>();
    private Double valorTotal =0D;

    public Orcamento() {
        idBase += 1;
        this.id = idBase;
    }

    public void addItem (ItemPedido item){
        itens.add(item);
        valorTotal += item.getValor();
    }

    public void removerItem (Long id) throws RuntimeException{

        if ((id.intValue()) <= itens.size()) {
            itens.remove(itens.get(id.intValue()-1));
            valorTotal -= itens.get(id.intValue()-1).getValor();
        } else {
            throw new RuntimeException("O item não foi encontrado!");
        }
    }

    @Override
    public void exibir(Boolean b) {
        if (b){

            System.out.println("Orcamento: " + id);
            System.out.println("- Itens: ");
            for (ItemPedido item: itens) {
                item.exibir(false);
            }
            System.out.println("Valor total: R$"+ getValorTotal()+"\n");

        } else {
            System.out.println("- "+ getId()+", R$"+getValorTotal()+"\n");
        }
    }

    public static Long getIdBase() {
        return idBase;
    }

    public Long getId() {
        return id;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public Double getValorTotal() {
        return valorTotal;
    }
}

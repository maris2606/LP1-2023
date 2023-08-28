import model.ItemPedido;
import model.Orcamento;
import model.Pedido;

public class Main {
    public static void main(String[] args) {
        ItemPedido item1 = new ItemPedido("bermuda", "G", "Jogador", 30d);

        item1.exibir(true);
        item1.exibir(false);

        Orcamento orcamento1 = new Orcamento();
        orcamento1.addItem(item1);

        orcamento1.exibir(true);
        orcamento1.exibir(false);

        ItemPedido item2=new ItemPedido("calça", "G", "jogger", 50d);
        orcamento1.addItem(item2);

        orcamento1.exibir(true);

        try {
            orcamento1.removerItem(1L);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        orcamento1.exibir(true);

        try {
            orcamento1.removerItem(10L);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        orcamento1.exibir(true);

        Pedido pedido1 =  new Pedido("16/06/2023");
        pedido1.addItem(item1);

        pedido1.exibir(true);
        pedido1.exibir(false);

        try {
            pedido1.entregar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        pedido1.exibir(false);

        try {
            pedido1.entregar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        pedido1.exibir(false);

        Orcamento orcamento2 = new Orcamento();
        orcamento2.addItem(item1);

        orcamento2.exibir(true);
        orcamento2.exibir(false);


    }
}


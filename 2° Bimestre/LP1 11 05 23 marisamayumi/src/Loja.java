import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Loja {
    private String nome_loja;
    private List<Clientes> cliente = new ArrayList<>();
    private List<Pedidos> pedidos = new ArrayList<>();

    public Loja(String nome_loja) {
        setNome_loja(nome_loja);
    }

    public void AddCliente(Clientes cliente){
        this.cliente.add(cliente);
    }

    public void MostrarClientes(int i){
        System.out.println("=== Cliente ===");
        System.out.println("nome: "+ cliente.get(i).getNome());
        System.out.println("CPF: "+ cliente.get(i).getCPF());
        System.out.println("telefone: "+ cliente.get(i).getTelefone());


        for (Pedidos pedido: pedidos) {
            if(pedido.getCodigo() == i) {
                System.out.println("+-Pedido " + pedidos.indexOf(pedido) + "--------------------------+");
                System.out.println("| produto: " + pedido.getProduto() + "\t\t\t\t\t\t|");
                System.out.println("| valor: " + pedido.getValor() + "\t\t\t\t\t\t|");
                System.out.println("| código: " + pedido.getCodigo() + "\t\t\t\t\t\t\t|");
                System.out.println("+-----------------------------------+");
            }
        }
    }

    public void AddPedido(Pedidos pedido){

        this.pedidos.add(pedido);
    }

    public String getNome_loja() {return nome_loja;}

    public void setNome_loja(String nome) {
        this.nome_loja = nome;
    }

    public List<Clientes> getCliente() {
        return cliente;
    }

    public void setCliente(List<Clientes> cliente) {
        this.cliente = cliente;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
}

package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="pedidos")
@Table(name="pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedidos")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL) //um para um
    @JoinColumn(name = "pessoa_Id")
    private Pessoa pessoa;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "pedido_produto",
        joinColumns = @JoinColumn(name = "id_pedidos"),
            inverseJoinColumns = @JoinColumn(name = "id_produto")
    )
    private List<Produto> produtos;

    @Column(name = "valor_total")
    private double valorTot;

    public Pedido(Pessoa pessoa, List<Produto> produtos) {
        this.pessoa = pessoa;
        this.produtos = produtos;
    }

    public void addProduto(Produto prod, int qtd){
        for(int i = 0 ; i < qtd; i++){
            this.produtos.add(prod);
        }
        this.valorTot = calc_valorTot();
    }

    public double calc_valorTot (){
        double valor=0;
        for (Produto p : produtos) {
            valor += p.getPreco();
        }
        return valor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", pessoa=" + pessoa +
                ", produtos=" + produtos +
                ", valorTot=" + valorTot +
                '}';
    }

    public double getValorTot() {
        return valorTot;
    }

    public void setValorTot(double valorTot) {
        this.valorTot = valorTot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}

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

    @Column
    private Pessoa pessoa;

    @Column
    private List<Produto> produtos;

    public Pedido(Pessoa pessoa, List<Produto> produtos) {
        this.pessoa = pessoa;
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", pessoa=" + pessoa +
                ", produtos=" + produtos +
                '}';
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

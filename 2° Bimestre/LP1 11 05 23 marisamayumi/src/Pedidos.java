public class Pedidos {

    private Clientes cliente;
    private String produto;
    private float valor;
    private int codigo;

    public Pedidos(Clientes cliente, String produto, float valor, int codigo) {
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
        this.codigo = codigo;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

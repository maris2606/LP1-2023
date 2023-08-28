package model;

import repository.ExibirInterface;

public class ItemPedido implements ExibirInterface {
    private static Long idBase=0L;
    private Long id;
    private String peca;
    private String tamanho;
    private String modelo;
    private Double valor;

    @Override
    public void exibir(Boolean b) {
        if (b){

            System.out.println("Item do pedido: " + id);
            System.out.println("- Peça: "+ getPeca());
            System.out.println("- Modelo: "+ getModelo());
            System.out.println("- Tamanho: "+ getTamanho());
            System.out.println("- Valor: R$"+ getValor()+"\n");

        } else {
            System.out.println("- "+ getPeca()+", "+getModelo()+", "+getTamanho()+", R$"+getValor()+"\n");
        }
    }

    public ItemPedido(String peca, String tamanho, String modelo, Double valor) {
        idBase += 1;
        this.id = idBase;
        this.peca = peca;
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.valor = valor;
    }

    public static Long getIdBase() {
        return idBase;
    }

    public static void setIdBase(Long idBase) {
        ItemPedido.idBase = idBase;
    }

    public Long getId() {
        return id;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}

package model;

public class Gato extends Animal{
    private String pelagem;

    public Gato(String nome, Integer idade, String pelagem) {
        super(nome, idade); //se não tiver construtor vazio na superclasse é obrigatorio
                            //senão é opcional.
        this.pelagem = pelagem;
        //animal tem 1 construtor não vazio
        //obrigatoriamente gato precisa ter também

        //por isso o super, para passar os atributos nome e idade
    }

    //getter e setter só do atributo individual
    //os outros get e set já foram herdados

    public void exibeNome(){
        System.out.println("O nome do gato é: " + super.getNome());
        //ele nao tem acesso ao nome na outra classe ... super é o padrão para herança;
        //precisa pq tbm precisa do super para construir.
    }

    @Override
    public void fazer_som() {
        super.fazer_som();
        System.out.println("miau");
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

}

public class Animal {

    String nome, barulho, especie;
    int idade;

    public Animal (String nome, int idade, String especie, String barulho){
        this.nome = nome;
        this. idade = idade;
        this.barulho = barulho;
        this.especie = especie;
    }

    public void apresentar(){

        System.out.println("oi meu nome é "+ this.nome +" eu sou um "+ this.especie +  " e eu tenho "+ this.idade+" anos");

        for (int i=0; i<5; i++){
            System.out.println(" " + this.barulho + " ");
        }
    }
}

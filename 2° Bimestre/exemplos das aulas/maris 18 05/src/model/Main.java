package model;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Tibbers", 3, "Curta");
        //super ("tibbers", 3) -> executa o contrutor classe pai animal
        //depois executa o construtor do gato com o atributo individual
        Cachorro cachorro = new Cachorro("roberto", 2, "marrom");

        cachorro.exibeNome();
        cachorro.fazer_som();

        System.out.println("");

        gato.exibeNome();
        gato.fazer_som();

    }
}

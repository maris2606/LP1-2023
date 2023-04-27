import java.util.Scanner;

public class mainclass {


    public static void main(String[] args) {
        System.out.println("=== pessoa ===");

        System.out.println("digite os dados para criar uma pessoa:\n");
        String[] dados = inserirdado();

            Pessoa pessoa1 = new Pessoa(Integer.parseInt(dados[0]) ,dados[1], dados[2]);

            pessoa1.apresentar();

        System.out.println("\n\n=== animal ===");

        Animal animal1 = new Animal("pufi", 3, "gato", "miau");

        animal1.apresentar();
    }

    public static String[] inserirdado (){

        Scanner scan = new Scanner(System.in);

        String[] retorno = new String[3];

        System.out.println("digite a idade: ");
        retorno[0] = scan.nextLine();

        System.out.println("digite o nome: ");
        retorno[1] = scan.nextLine();

        System.out.println("digite o cpf:");
        retorno[2] = scan.nextLine();

        return retorno;
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== pessoa ===");

        System.out.println("Quantas pessoas deseja criar?");
        int numPessoa = scan.nextInt();
        Pessoa[] pessoa = new Pessoa[numPessoa];

        for (int i=0; i < numPessoa; i++) {
            System.out.println("digite os dados para criar uma pessoa:\n");
            pessoa[i] = new Pessoa();
        }
        for (int i=0; i < numPessoa; i++) {
            System.out.println("apresentações:\n");
            pessoa[i].apresentar();
        }
        System.out.println("\n===============================");
        System.out.println("animais");
        Animal animal1 = new Animal("ana", 2, "Galinha", "pó");
        animal1.apresentar();
    }

}

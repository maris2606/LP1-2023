import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        /*

        Contas c = new Infantil(500.);
        c.depositar(56.);

        //não consegue acessar diretamente ligados ao infantil

        //teria que converter
        */

        Infantil infantil1 = new Infantil(5000.);
        System.out.println(infantil1.comprar(60.));

        Empresarial empresarial1 = new Empresarial(1000., 12345);
        System.out.println(empresarial1.sacar(100.));

        Pessoal pessoal1 = new Pessoal(1000., 21356);
        System.out.println(pessoal1.sacar(100.));

        try {
            System.out.println(pessoal1.dividir(0));
        } catch ( Exception e){
            System.out.println(e.getMessage());
        }
    }
}

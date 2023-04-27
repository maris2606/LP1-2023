import java.util.Scanner;

public class classe1 {

    //A primeira função percorre um vetor de Strings exibindo todos os valores na tela.

    public static void exibeString (String[] nomes){

        for(int i = 0; i < 3; i++){
            System.out.println(nomes[i]);
        }

    }
    //A segunda função percorre uma matriz de double exibindo todos os valores na tela.

    public static void exibeMatriz (double[][] contas){

        for(int i = 0; i < 4; i++){
            System.out.print("\t");
            for(int j = 0; j < 4; j ++) {
                System.out.print(contas[i][j] + "\t| ");
            }
            System.out.println(" ");
        }
    }
    //A terceira função verifica um número inteiro:

    public static String verify (int op, String[] nome){

        if (op ==1){
            return nome[0];

        } else if (op>=2 && op <=10){
            return nome[1];

        } else if (op>10){
            return nome[2];

        } else {
            return "Opção inválida";
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[3];
        double[][] contas = new double[4][4];
        int opcao;

        System.out.println("\n digite 3 nomes separadamente:  ");
        for(int i = 0; i < 3; i++){
            nomes[i] = scan.nextLine();
        }

        exibeString(nomes);

        System.out.println("=== 1 -> 1° nome \n de 2 à 10 -> 2° nome \n maior que 10 -> 3° nome ===");
        for(int i = 0; i < 4; i++){
            System.out.println("\n Digite um número de opção para exibir um nome:   ");
            opcao = scan.nextInt();

            String nomeMostrado = verify(opcao, nomes);
            System.out.println(nomeMostrado);
        }

        System.out.println("========================================================================\n");

        System.out.println("\n digite 3 números Double:  ");
        double[] numdouble = new double[4];

        for(int i = 1; i < 4; i++){
            numdouble[i]= scan.nextInt();
        }

        // preenchendo matriz
        for (int i = 1; i < 4; i++) {
            contas[0][i] = numdouble[i];
            contas[i][0] = numdouble[i];
        }

        for(int i = 1; i<4 ; i++){
            for(int j = 1; j<4; j++){
                    if (i==j){
                        contas[i][j] = contas[0][j] * contas[i][0];
                    } else {
                        contas[i][j] = contas[i][0] - contas[0][j];
                    }
            }
        }
        exibeMatriz(contas);
    }
}
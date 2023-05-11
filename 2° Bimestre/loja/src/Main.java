import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //instanciação da loja
        System.out.println("Digite o nome da loja: ");
        Loja loja1 = new Loja(scan.nextLine());

        //criar cliente
        System.out.println("Quantos clientes deseja criar? ");
        int numClientes = scan.nextInt();
        scan.nextLine();


        for (int i = 0; i<numClientes; i++) {
            System.out.println("=== criar cliente: ===");

            System.out.println("índice do cliente a ser criado : " + i);

            System.out.println("Digite o nome: ");
            String nome = scan.nextLine();

            System.out.println("Digite o CPF: ");
            String CPF = scan.nextLine();

            System.out.println("Digite o Telefone: ");
            String telefone = scan.nextLine();

            System.out.println("--------------------------------");


            loja1.AddCliente(new Clientes(nome, CPF, telefone));
        }

        //gerando pedidos
        int resp=0;
        do{

            System.out.println("\n=== gerar pedido: ===");
            System.out.println("Digite o índice do cliente: ");
            int indice = scan.nextInt();
            scan.nextLine();

            System.out.println("Digite o nome do produto comprado: ");
            String produto = scan.nextLine();

            System.out.println("Digite o valor do produto: ");
            float valor = scan.nextFloat();
            scan.nextLine();

            System.out.println("--------------------------------");

            loja1.AddPedido(new Pedidos(loja1.getCliente().get(indice), produto, valor, indice));

            System.out.println("\n--- Deseja adicionar mais pedidos? ---\n 0 = sim;  1= não;");
            resp=scan.nextInt();

        }while(resp==0);

        resp=0;

        //exibindo clientes
        System.out.println("=== exibindo clientes: ===");
        do {
            System.out.println("qual cliente quer exibir? digite o índice:");
            int ExCliente = scan.nextInt();
            scan.nextLine();

            loja1.MostrarClientes(ExCliente);

            System.out.println("\n--- Deseja visualizar mais clientes? ---\n 0 = sim;  1= não;");
            resp=scan.nextInt();
        }while(resp==0);
    }
}
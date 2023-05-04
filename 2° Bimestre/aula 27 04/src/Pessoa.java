import java.util.Scanner;
public class Pessoa {
    private int idade;
    private String nome="a";
    private String cpf="a";

    Scanner scan = new Scanner(System.in);


    public int setNome() {
            System.out.println("digite o nome: ");
            String nome = scan.nextLine();

        if (nome.length()<30)
        {
            this.nome = nome;
        } else {
            System.out.println("---nome muito longo!---\n");
            return 0;
        }
        return 1;
    }

    public int setIdade() {
        int idade;
            System.out.println("digite a idade: ");
            idade = scan.nextInt();

        if (idade<110 && idade>0) {
            this.idade = idade;
        } else {
            System.out.println("---idade inválida---\n");
            return 0;
        }
        return 1;
    }

    public int setCpf() {
        System.out.println("digite o cpf:");
        String cpf = scan.nextLine();
        cpf = scan.next();

        int tamcpf = cpf.length();

        if ((tamcpf<=11) && (tamcpf>0)) {
            this.cpf = cpf;
        }
        else {
            System.out.println("---cpf inválido---\n");
            return 0;
        }
        return 1;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }


    public Pessoa (){

        int a,b,c;

        do {
            a = setNome();
        }while(a!=1);

        do {
            b = setIdade();
        }while(b!=1);

        do{
            c = setCpf();
        }while(c!=1);
    }

    public void apresentar (){

        System.out.print("============================\nmeu nome é " + getNome());
        System.out.print(" minha idade é " + getIdade() + " anos");
        System.out.print(" e o meu cpf é " + getCpf());
    }


}


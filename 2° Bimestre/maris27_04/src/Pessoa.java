import java.util.Scanner;

public class Pessoa {
    private int idade;
    private String nome, cpf;

    Scanner scan = new Scanner(System.in);


    public int setNome(String nome) {
        if (nome.length()<30)
        {
            this.nome = nome;
        } else {
            System.out.println("nome muito longo!");
            return 0;
        }
        return 1;
    }

    public int setIdade(int idade) {
        if (idade<110 && idade>0) {
            this.idade = idade;
        } else {
            System.out.println("idade inválida");
            return 0;
        }
        return 1;
    }

    public int setCpf(String cpf) {
        if (cpf.length()>0 && cpf.length()<=11) {
            this.cpf = cpf;
        } else {
            System.out.println("cpf inválida");
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

    public Pessoa(){

    }

    public Pessoa (int idade, String nome, String cpf){
        System.out.println("criando um ser humaninho ... :D");
        int a=1, b=1 , c=1;

        do {
            a = setNome(nome);
        }while(a!=0);

        do {
            b = setIdade(idade);
        }while(b!=0);

         do{
            c = setCpf(cpf);
        }while(c!=0);
    }

    public void apresentar (){

        System.out.println("\nmeu nome é " + getNome());
        System.out.print(" minha idade é " + getIdade() + " anos");
        System.out.print(" e o meu cpf é " + getCpf());
    }
}

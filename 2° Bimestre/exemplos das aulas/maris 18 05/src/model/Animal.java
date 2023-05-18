package model;
import java.util.Scanner;

public abstract class Animal { //não pode construir. continua tendo contrutor
                               //para ser suado apenas pelas as classes filhas
    private String nome;
    private Integer idade;
    Scanner scan = new Scanner(System.in);

    public Animal(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazer_som(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}

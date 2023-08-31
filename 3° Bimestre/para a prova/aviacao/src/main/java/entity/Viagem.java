package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Viagem { //mais cuidado por conter relacionamentos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column //det como collumn qd nao é relacionamento
    private Integer vagas;
    @Column
    private String destino;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "piloto_id") //coluna p ser a chave estrangeira
    private Piloto piloto;
    @ManyToMany(cascade = CascadeType.ALL)//muitos para muitos cria uma tabela nova
    @JoinTable(name = "viagem_passageiro", joinColumns = @JoinColumn(name = "viagem_id"), inverseJoinColumns = @JoinColumn(name = "passageiro_id"))
    private List<Passageiro> passageiros;
    //agora adiciona os id das duas tabelas, comecando pela propria
    //e depois a da outra tabela : inverse join collumns

    //caso nao pudesse ter esses objetos no construtor.
    public Viagem(Integer vagas, String destino) {
        this.vagas = vagas;
        this.destino = destino;
        this.passageiros =new ArrayList<>(); //inicializa pq lista precisa
    }

    public void addPassageiro(Passageiro passageiro){
        if (this.passageiros.size() < vagas){
            this.passageiros.add(passageiro);
        } else {
            System.out.println("Limite de vagas excedido");
        }
    }

    @Override
    public String toString() {
        return "Viagem{" +
                "id=" + id +
                ", vagas=" + vagas +
                ", destino='" + destino + '\'' +
                ", piloto=" + piloto + //como quer mostrar lista, deve colocar to string nele tbm
                ", passageiros=" + passageiros +
                '}';
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    //precisa tratar esse set pra nao add mais que o max de passageiros sem usar verificacao
    public void setPassageiros(List<Passageiro> passageiros) {
        if (passageiros.size()  > vagas) {
            System.out.println("essa mensagem so pode receber "+ vagas + " vagas!");
        } else {
            this.passageiros = passageiros;
        }
    }
}

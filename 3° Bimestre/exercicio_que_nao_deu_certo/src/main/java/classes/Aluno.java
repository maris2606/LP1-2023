package classes;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static org.hibernate.internal.util.collections.ArrayHelper.forEach;

@Entity(name="aluno")
@Table(name="aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String senha;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nota_id")
    private List<Nota> notas = new ArrayList<>();
    @Column
    private String nome;
    @Column
    private String prontuario;
    @Column
    private Double media;

    public Aluno(String senha, String nome, String prontuario) {
        this.media = 0D;
        this.senha = senha;
        this.nome = nome;
        this.prontuario = prontuario;
    }

    public void addNota(Nota nota, Materia materia) throws Exception {
//        for(Aluno a : materia.getAlunos()){
//            if(a.getProntuario() == prontuario) {
                this.notas.add(nota);
                this.media = calcMedia(nota.getNota());
//            } else {
//                throw new Exception("este aluno não está vinculado a esta materia!");
//            }
//        }
    }

    public Double calcMedia(Double nota){
        if(notas.isEmpty()){
            return nota;
        } else {
            return (media + nota)/2;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", senha='" + senha + '\'' +
                ", notas=" + notas +
                ", nome='" + nome + '\'' +
                ", prontuario='" + prontuario + '\'' +
                ", media=" + media +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
}

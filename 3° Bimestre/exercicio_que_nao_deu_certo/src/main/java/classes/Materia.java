package classes;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@Entity(name="materia")
@Table(name="materia")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "professor_id")
    private Professor professor;
    @Column
    private Integer horario;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "materia_aluno",
            joinColumns = @JoinColumn(name = "id_materia"),
            inverseJoinColumns = @JoinColumn(name = "id_aluno")
    )
    private List<Aluno> alunos= new ArrayList<>();
    @Column
    private String codigo;

    public Materia(String codigo) {
        this.codigo = codigo;
    }

    public void addAluno(Aluno aluno, List<Materia> materias) throws Exception {
        for (Materia m : materias) {
            if (m.getHorario() != horario) {
                this.alunos.add(aluno);
            }else if (m.getId() == id){
                this.alunos.add(aluno);
            } else {
                throw new Exception("um aluno não pode estar em duas matérias no mesmo horário");
            }
        }
    }

    public void addProf(Professor prof, List<Materia> materias) throws Exception {
        for (Materia m : materias) {
            if (m.getHorario() != horario) {
                this.professor = prof;
            }else if (m.getId() == id){
                this.professor = prof;
            }else {
                throw new Exception("um professor não pode estar em duas matérias no mesmo horário");
            }
        }
    }

    public void addHorario(Integer horario) throws Exception {
        if(horario>=7 && horario<=12){
            this.horario = horario;
        } else {
            throw new Exception("o horario deve ser entre 7hrs e 12hrs");
        }
    }

    @Override
    public String toString() {
        return "Materia{" +
                "id=" + id +
                ", professor=" + professor +
                ", horario=" + horario +
                ", alunos=" + alunos +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

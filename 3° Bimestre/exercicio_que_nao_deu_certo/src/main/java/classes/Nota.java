package classes;

import java.util.List;
import jakarta.persistence.*;

@Entity(name="nota")
@Table(name="nota")
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "materia_id")
    private Materia materia;
    @Column
    private Double nota;

    public Nota( Materia materia) {
        this.materia = materia;
    }

    public void defNota(Double nota) throws Exception {
        if(nota>=0 && nota<=10){
            this.nota = nota;
        } else {
            throw new Exception("a nota deve ser entre 0 e 10");
        }
    }

    @Override
    public String toString() {
        return "Nota{" +
                "id=" + id +
                ", materia=" + materia +
                ", nota=" + nota +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}

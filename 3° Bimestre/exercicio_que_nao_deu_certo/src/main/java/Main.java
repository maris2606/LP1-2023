import classes.Aluno;
import classes.Materia;
import classes.Nota;
import classes.Professor;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            gerenciarMaterias();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void gerenciarMaterias() throws Exception {
        Aluno a1 = new Aluno("jo123", "Jossane", "sp3089000");
        Aluno a2 = new Aluno("joaoyag", "Joana", "sp3089111");
        Aluno a3 = new Aluno("mih321", "Mihcup", "sp3089222");
        Aluno a4 = new Aluno("maris26", "Maris", "sp3089333");

        List<Materia> materiaList  = new ArrayList<>();

        Professor p1 = new Professor("igor1", "480956778-8", "Igor", "sp3089777");
        Professor p2 = new Professor("ugosemh", "490653872-52", "Ugo", "sp3089999");

        Materia m1 = new Materia("mat06");
        m1.addHorario(12);

        Materia m2 = new Materia("bio02");
        m2.addHorario(8);

        materiaList.add(m1);
        materiaList.add(m2);

        Nota n1 = new Nota(m1);
        n1.defNota(8.5);
        Nota n2 = new Nota(m2);
        n2.defNota(9.5);
        Nota n3 = new Nota(m1);
        n3.defNota(7.5);
        Nota n4 = new Nota(m2);
        n4.defNota(7.5);

        a1.addNota(n2, m1);
        a1.addNota(n1, m1);
        a2.addNota(n2, m1);
        a3.addNota(n1, m1);
        a4.addNota(n2, m1);
        a2.addNota(n1, m1);

        m1.addProf(p1, materiaList);
        m1.addAluno(a1, materiaList);
        m1.addAluno(a2, materiaList);

        System.out.println(m1);

        m2.addProf(p2, materiaList);
        m2.addAluno(a3, materiaList);
        m2.addAluno(a4, materiaList);

        System.out.println(m2);

        System.out.println(a1);
        System.out.println(a2);

        Session session1 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction1 = session1.beginTransaction();

        session1.persist(materiaList);

        transaction1.commit();//fecha

        System.out.println("\n+----------------------------------------------------------------------------------+\n");

        List<Materia> materias = session1.createQuery("from materias", Materia.class).list();
        materias.forEach(m -> System.out.println(m));
    }
}

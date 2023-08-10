import entity.Pessoa;
import org.hibernate.Transaction;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 =new Pessoa("jo", "marques", "jojo@email.com");
        Pessoa p2 =new Pessoa("joao", "feliz", "poc@email.com");
        Pessoa p3 =new Pessoa("mih", "cup", "copo@email.com");
        Pessoa p4 =new Pessoa("maris", "morita", "mim@email.com");

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(p1);//insere no bdd
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);

        transaction.commit();//fecha

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();
        //lista das pessoas add no bdd

        pessoas.forEach(p -> { //arrowfunction
            System.out.println(p);
            System.out.println("a  ");
        });
    }
}

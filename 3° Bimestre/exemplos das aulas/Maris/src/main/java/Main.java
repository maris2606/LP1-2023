import entity.Endereco;
import entity.Pessoa;
import org.hibernate.Transaction;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Pedro","são paulo");
        Endereco e2 = new Endereco("Carlos","caraguatatuba");
        Endereco e3 = new Endereco("Guilherme","itaquaquecetuba");
        Endereco e4 = new Endereco("João","piracanjuba");


        Pessoa p1 =new Pessoa("jo", "marques", "jojo@email.com", e1);
        Pessoa p2 =new Pessoa("joao", "feliz", "poc@email.com", e2);
        Pessoa p3 =new Pessoa("mih", "cup", "copo@email.com", e3);
        Pessoa p4 =new Pessoa("maris", "morita", "mim@email.com", e4);

        Session session1 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction1 = session1.beginTransaction();

        session1.persist(p1);//insere no bdd
        session1.persist(p2);
        session1.persist(p3);
        session1.persist(p4);

        transaction1.commit();//fecha

        System.out.println("\n+----------------------------------------------------------------------------------+\n");

        List<Pessoa> pessoas = session1.createQuery("from Pessoa", Pessoa.class).list();
        //lista das pessoas add no bdd
        pessoas.forEach(p -> System.out.println(p));

        System.out.println("\n+----------------------------------------------------------------------------------+\n");
        for (Pessoa p: pessoas) {
            System.out.println(p.getEndereco());
        }
    }
}

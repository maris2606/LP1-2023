import entity.Endereco;
import entity.Pedido;
import entity.Pessoa;
import entity.Produto;
import org.hibernate.Transaction;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        gerenciarPedido();

    }

    public static void gerenciarPedido(){
            Pessoa p1 = new Pessoa("jo", "ssana", "jo.email.com", new Endereco("jo", "maua"));
            Produto prod1 = new Produto("blusa", 10);
            Produto prod2 = new Produto("calza deshopi", 10);
            Produto prod3 = new Produto("crops", 10);
            List<Produto> produtoList  = new ArrayList<>();

            Pedido pedido1 = new Pedido(p1, produtoList);

            pedido1.addProduto(prod1, 1);
            pedido1.addProduto(prod2,1);
            pedido1.addProduto(prod3,1);

            Session session1 = HibernateUtil.getSessionFactory().openSession();

            Transaction transaction1 = session1.beginTransaction();

            session1.persist(pedido1);//insere no bdd

            transaction1.commit();//fecha

            System.out.println("\n+----------------------------------------------------------------------------------+\n");

            List<Pedido> pedidos = session1.createQuery("from pedidos", Pedido.class).list();
            pedidos.forEach(p -> System.out.println(p));
    }

//    public static void gerenciarPessoa(){
//        Pessoa p1 = new Pessoa("jo", "ssana", "jo.email.com", new Endereco("jo", "maua"));
//
//        Session session2 = HibernateUtil.getSessionFactory().openSession();
//
//        Transaction transaction1 = session2.beginTransaction();
//
//        session2.persist(p1);//insere no bdd
//
//
//        transaction1.commit();//fecha
//
//        System.out.println("\n+----------------------------------------------------------------------------------+\n");
//
//        List<Pessoa> pessoas = session2.createQuery("from Pessoa", Pessoa.class).list();
//        //lista das pessoas add no bdd
//        pessoas.forEach(p -> System.out.println(p));
//
//        System.out.println("\n+----------------------------------------------------------------------------------+\n");
//        for (Pessoa p : pessoas) {
//            System.out.println(p.getEndereco());
//        }
//    }
}

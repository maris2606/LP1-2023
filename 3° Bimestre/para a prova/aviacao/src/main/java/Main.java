import entity.Passageiro;
import entity.Piloto;
import entity.Viagem;
//nao quer sessao do h2 -> import org.h2.engine.Session;
import org.hibernate.Session; //esse é o correto
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //criar objetos de cada tipo

        Piloto piloto1 = new Piloto("igor", "aaa321");
        Passageiro passageiro1 = new Passageiro("jossana","123233454");
        Passageiro passageiro2 = new Passageiro("joao", "12345789");
        Passageiro passageiro3 = new Passageiro("mih", "456834576");
        Passageiro passageiro4 = new Passageiro("maris", "343456586");
        Passageiro passageiro5 = new Passageiro("let", "123781324");

        Viagem viagem = new Viagem(4, "angola");

        viagem.setPiloto(piloto1); //guarda objeto piloto pra viagem
        viagem.setPassageiros(new ArrayList<>(List.of(passageiro1,passageiro2,passageiro3,passageiro4, passageiro5 )));//passa nova lista de passageiros
        //ou cria uma lista separada
        //ou coloca viagem.getpassageiros().add(...) -> consegue add pq retorna uma array de objetos

        System.out.println(viagem); //todos ainda com id nulo por nao estarem cadastrados no BDD

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(viagem);

        transaction.commit();


        //busca e exibe
        List<Viagem> viagens = session.createQuery("from Viagem", Viagem.class).list();
        //uma query é um comando que realiza ação
        //coloca from e o nome da classe ou se setar name, coloca name DA ENTIDADE.
        //coloca a assinatura class da classe e converte p lista com .List().

//        viagens.get(0).addPassageiro(new Passageiro("let", "123781324"));

        for (Viagem v : viagens){
            System.out.println(v);
        }


    }
}

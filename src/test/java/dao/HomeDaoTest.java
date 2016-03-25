package dao;

import domain.Home;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.junit.BeforeClass;
import org.junit.Test;

public class HomeDaoTest {
    private static EntityManager em;
    private static EntityTransaction et;
    
    public HomeDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass(){
        em = singleton.EntityManager.getInstance();
        et = em.getTransaction(); 
    }
    
    @Test
    public void addHome()
    {
        Home h = new Home("23",3, "villa Gossan");
        HomeDao hdao = new HomeDao();
        hdao.create(h);
        System.out.println(h.getId()+" "+h.getArea()+" "+h.getName()+" "+h.getNumberOfPiece());
        hdao.find(h.getId());
    }
    
    
}

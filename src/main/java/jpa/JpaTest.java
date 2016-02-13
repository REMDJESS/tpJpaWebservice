package jpa;

import dao.IDao;
import domain.Home;
import domain.Person;
import factory.DaoFactory;
import java.util.*;

public class JpaTest {
    
	public static void main(String[] args) {
                IDao dao = DaoFactory.getPersonDao();
                
                List<Person> friends = new ArrayList<Person>();
                Person pers = new Person("nom1", "prenom1", "email1");
                
                Person pers1 = new Person("nom2", "prenom2", "email2");
                Person pers2 = new Person("nom3", "prenom3", "email3");
                friends.add(pers1);
                friends.add(pers2);
                pers.setFirends(friends);
                
                List<Home> homes = new ArrayList<Home>();
                Home home1 = new Home("12m²", 4);
                Home home2 = new Home("10m²", 3);
                homes.add(home1);
                homes.add(home2);
                pers.setHomes(homes);
                
                dao.create(pers);
                dao.deleteAll();
                System.out.println("done...");
                System.exit(0);
        }		
}

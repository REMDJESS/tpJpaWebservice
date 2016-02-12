package jpa;

import dao.IDao;
import domain.Person;
import factory.DaoFactory;
import java.util.*;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
                IDao dao = DaoFactory.getPersonDao();
                List<Person> friends = new ArrayList<Person>();
                //List<Person> friends_ = new ArrayList<Person>();
                Person pers = new Person("nom1", "prenom1", "email1");
                Person pers1 = new Person("nom2", "prenom2", "email2");
                Person pers2 = new Person("nom3", "prenom3", "email3");
                friends.add(pers1);
                friends.add(pers2);
                pers.setFirends(friends);
                dao.create(pers);
                
                Person pers_ = new Person("nom1_", "prenom1_", "email1_");
                Person pers1_ = new Person("nom2_", "prenom2_", "email2_");
                Person pers2_ = new Person("nom3_", "prenom3_", "email3_");
                friends.clear();
                friends.add(pers1_);
                friends.add(pers2_);
                pers_.setFirends(friends);
               
                dao.create(pers_);
                
                dao = DaoFactory.getPersonDao();
                Collection<Person> persons = dao.findAll();
                for(Person p : persons){
                    System.out.println(p.getSurname()+" "+p.getForename()+" "+p.getMail());
                }
                
                System.out.println("done");
               System.exit(0);
        }		
}

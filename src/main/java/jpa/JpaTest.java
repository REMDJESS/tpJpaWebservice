package jpa;

import dao.IDao;
import domain.Home;
import domain.Person;
import factory.DaoFactory;
import java.util.*;

public class JpaTest {
    
	public static void main(String[] args) {
                IDao dao = DaoFactory.getPersonDao();
                ///*
                List<Person> friends = new ArrayList<Person>();
                List<Person> friends_ = new ArrayList<Person>();
                
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
                //friends.clear();
                friends_.add(pers1_);
                friends_.add(pers2_);
                pers_.setFirends(friends_);
                dao.create(pers_);
                
                List<Home> homes = new ArrayList<Home>();
                Home home1 = new Home("12m²", 4);
                Home home2 = new Home("10m²", 3);
                homes.add(home1);
                homes.add(home2);
                
                pers.setHomes(homes);
                //Person p = (Person) dao.find(pers.getId());
                dao.update(dao.find(pers));
                
                //*/
                /*
                //dao = DaoFactory.getPersonDao();
                Collection<Person> persons = dao.findAll();
                for(Person p : persons){
                    System.out.println(p);
                    if(p!=null)
                        dao.delete(p);
                }
                */
                System.out.println("done...");
                System.exit(0);
        }		
}

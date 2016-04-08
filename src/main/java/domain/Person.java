package domain;

import java.util.*;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries
({
  @NamedQuery(name="person.find.by.id", query="SELECT p FROM Person p WHERE p.id = :person_id"),
  @NamedQuery(name="person.find.friens.all", query="SELECT p FROM Person p join p.friends WHERE p.id = :person_id"),
  @NamedQuery(name="person.find.home.all", query="SELECT p FROM Person p join p.homes WHERE p.id = :person_id")
})
@XmlRootElement(name="persons")
public class Person {
    private Long id;
    private String surname;
    private String forename;
    private String mail;
    
    private List<Person> friends = new ArrayList<Person>();
    private List<Home> homes = new ArrayList<Home>();

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name="FK_PERSON_ID", referencedColumnName = "PERSON_ID")
    public List<Home> getHomes() {
        return homes;
    }

    public void setHomes(List<Home> homes) {
        this.homes = homes;
    }

    @Id
    @Column(name="PERSON_ID")
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }
   /* public void setFriends(Person friend) {
        this.friends.add(friend);
    }*/
    
    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable
            (
            name="FRIENDS",
            joinColumns = {@JoinColumn(name="PERSON_SOURCE", referencedColumnName = "PERSON_ID")},
            inverseJoinColumns = {@JoinColumn(name="PERSON_TARGET", referencedColumnName="PERSON_ID")}
            )
    public List<Person> getFriends() {
        return friends;
    }
    
    public Person(){ 
    }
    
    public Person(String surname, String forename, String mail){
        this.surname = surname;
        this.forename = forename;
        this.mail = mail;
    }
    
    public String toString(){
        return (this.getSurname()+" "+this.getForename()+" "+this.getMail());  
    }
}

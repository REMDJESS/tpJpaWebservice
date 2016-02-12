package domain;

import java.util.*;
import javax.persistence.*;

@Entity
public class Person {
    private Long id;
    private String surname;
    private String forename;
    private String mail;
    private List<Person> firends = new ArrayList<Person>();

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
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="FK_PERSON_ID", referencedColumnName = "PERSON_ID")
    public List<Person> getFirends() {
        return firends;
    }

    public void setFirends(List<Person> firends) {
        this.firends = firends;
    }
    
    public Person(){
        
    }
    
    public Person(String surname, String forename, String mail){
        this.surname = surname;
        this.forename = forename;
        this.mail = mail;
    }
}

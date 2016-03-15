package fr.istic.sir.rest;

import dao.*;
import domain.*;
import java.util.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
public class PersonResource {
    
    public PersonResource(){
        singleton.EntityManager.getInstance();
    }
    
    @POST
    //@Consumes("application/x-www-form-urlencoded")
    @Consumes({MediaType.APPLICATION_JSON})
    /*public Person addPerson(@FormParam("name") String name, 
    @FormParam("firstname") String firstname, 
    @FormParam("mail") String mail)*/
     public Person addPerson(Person pers)
    {
        PersonDao dao = new PersonDao();
        //Person pers = new Person(name, firstname, mail);
        dao.create(pers);
        return pers;
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public /*String*/Collection<Person> listPerson(){
        PersonDao dao = new PersonDao();
        return dao.findAll();
    }
}

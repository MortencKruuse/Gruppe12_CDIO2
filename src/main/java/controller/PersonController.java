package controller;

import data.DTO.Person;
import data.LocalStorage;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class PersonController {
    private LocalStorage localStorage = new LocalStorage();
    public Person getPerson (){
        return localStorage.getMorten();
    }

    public Person updatePerson(Person person){
        if (person.getAge() < 18)
            throw  new WebApplicationException("Testing forbidden message",Response.Status.FORBIDDEN);
        return localStorage.setMorten(person);
    }
}

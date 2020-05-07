package api;

import controller.PersonController;
import data.DTO.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonService {
    private static PersonController personController = new PersonController();
    @GET
    public Person getPerson(){
        return personController.getPerson();
    }

    @PUT
    public Person updatePerson(Person person){
        return personController.updatePerson(person);
    }
}

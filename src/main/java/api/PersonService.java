package api;

import controller.PersonController;
import data.DTO.UserDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonService {
    private static PersonController personController = new PersonController();
    @GET
    public void getPerson(){

    }

    @PUT
    public void updatePerson(UserDTO userDTO){


    }
}

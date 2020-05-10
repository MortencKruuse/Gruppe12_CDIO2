package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import controller.PersonController;
import data.DTO.UserDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("person")
public class PersonService {
    private String name;
    private String ini;
    private String cpr;
    private String password;
    private String role;
    private static PersonController personController = new PersonController();

    //@GET
    //@Produces(MediaType.APPLICATION_JSON)
    //public String welcome() {
    //    return "Hello user";
    //}

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("create-user")
    public Response createUser(UserDTO user) {
        //personController.createUser(name, ini, cpr, password, role);
        personController.createUser(user.getUsername(), user.getIni(),user.getCpr(), user.getPassword(),user.getRole());
        return Response.status(201).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("get-users")
    public String getUsers(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(personController.getUsers());
        } catch (JsonProcessingException e){
            e.printStackTrace();
            return "Could not retrieve users";
        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("delete-user")
    public void deleteUser(@QueryParam("ID") int ID){
        personController.deleteUser(ID);
    }


}

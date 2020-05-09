/*package api;

import controller.PersonController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.applet.Applet;
import java.io.*;
import java.util.ArrayList;
import java.util.List;



@Path("person")
public class PersonService extends Applet {
    private static PersonController personController = new PersonController();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String welcome() {
        return "Hello user";
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Create-User")
    public void createUser(String name, String ini, String cpr, String password, String role) {
        List<String> list= new ArrayList<>();
        list.add(role);
        personController.createUser(name, ini, cpr, password, list);
    }


}
*/
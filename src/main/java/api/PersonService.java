package api;

import controller.PersonController;
import data.DTO.UserDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

@Path("person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonService {
    private static PersonController personController = new PersonController();
    @GET
    public String welcome(){
        return "Hello user";
    }
    @PUT
    public void createUser(@PathParam("name") String name){


        try {
            Properties properties = new Properties();
            properties.setProperty(createUser("Skab mig og gem mig");
            File file = new File("users.properties");
            FileOutputStream fileOut = new FileOutputStream(file);
            properties.store(fileOut, "Users");
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

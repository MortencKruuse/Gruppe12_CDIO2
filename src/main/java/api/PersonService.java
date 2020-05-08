package api;

import controller.PersonController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.*;
import java.util.ArrayList;


@Path("person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonService {
    private static PersonController personController = new PersonController();

    @GET
    public String welcome() {
        return "Hello user";
    }

    @PUT
    public void createUser(@PathParam("name") String name) {


    }

    private void createFile(String file_user_properties, ArrayList<String> user_ArrayList)
            throws IOException {
        FileWriter writer = new FileWriter(file_user_properties + ".txt");
        int size = user_ArrayList.size();
        for (int i=0;i<size;i++) {
            String str = user_ArrayList.get(i).toString();
            writer.write(str);
            if(i < size-1)
            writer.write("\n");
        }
        writer.close();
    }
}

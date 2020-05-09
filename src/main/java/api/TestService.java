package api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("test")
public class TestService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String helloWorld() {
        return "Hello World";
    }

    // rest/test/name/{name}
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("name/{name}")
    public String helloName(@PathParam("name") String name) {
        return "hello " + name;
    }

    // rest/test/form (html form) -> hello Magnus
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("form")
    public String helloForm(@FormParam("name") String name) {
        return "hello " + name;
    }


    // rest/test/query?name=Magnus?
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("query")
    public String helloQuery(@QueryParam("name") String name) {
        return "hello " + name;
    }
}

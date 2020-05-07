package api;
import controller.AuthenticationController;
import org.glassfish.jersey.server.ContainerRequest;

import javax.naming.AuthenticationException;
import javax.ws.rs.*;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("authentication")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthenticationService {
    @Context
    ContainerRequestContext containerRequestContext;
    private AuthenticationController authenticationController = new AuthenticationController();

    @Path("login")
    @POST
    public void login (){
    }
}


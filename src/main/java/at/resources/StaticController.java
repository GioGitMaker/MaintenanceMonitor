package at.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.InputStream;

@Path("")

public class StaticController {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public InputStream getMessage() throws Exception{
        InputStream resource =getClass().getClassLoader().getResourceAsStream("MaintenanceMode.html");
        return resource;
    }

}

package rest;

import service.ObjectService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("objects")
public class RestResource {

    @Inject ObjectService os;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object get() {
        return os.get();
    }
}

package ulaval.glo2003;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/ping")
public class PingPongResource {
    @POST
    public Response pong() {
        return Response.status(200).entity("ok").build();
    }
}

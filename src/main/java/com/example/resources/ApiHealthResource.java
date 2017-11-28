package com.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/apihealth")
public class ApiHealthResource {

    @GET
    public Response ping() {
        return Response.ok().build();
    }
}
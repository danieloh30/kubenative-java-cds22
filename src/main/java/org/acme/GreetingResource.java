package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService gService;

    @ConfigProperty(name = "username")
    String username;

    @ConfigProperty(name = "username.alias")
    String aliasname;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/username")
    public String greeting() {
        return gService.greeting(aliasname);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Kube Native Java at CDS22!";
    }
}
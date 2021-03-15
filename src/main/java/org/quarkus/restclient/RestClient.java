package org.quarkus.restclient;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@ApplicationScoped
@RegisterRestClient(configKey = "test-filter")
@RegisterProvider(LoggingFilter.class)
public interface RestClient {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello();
}
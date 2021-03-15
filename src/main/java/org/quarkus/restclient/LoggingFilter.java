package org.quarkus.restclient;

import org.jboss.logging.Logger;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import java.io.IOException;

public class LoggingFilter implements ClientRequestFilter, ClientResponseFilter {
    private static final Logger LOG = Logger.getLogger(LoggingFilter.class);

    @Override
    public void filter(ClientRequestContext clientRequestContext) throws IOException {
        LOG.info("request");
    }

    @Override
    public void filter(ClientRequestContext clientRequestContext, ClientResponseContext clientResponseContext) throws IOException {
        LOG.info("response");
    }
}

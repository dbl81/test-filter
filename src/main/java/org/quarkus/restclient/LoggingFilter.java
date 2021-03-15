package org.quarkus.restclient;

import org.jboss.logging.Logger;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import java.io.IOException;

public class LoggingFilter implements ContainerRequestFilter    {
    private static final Logger LOG = Logger.getLogger(LoggingFilter.class);

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        LOG.info("executing filter");
    }
}

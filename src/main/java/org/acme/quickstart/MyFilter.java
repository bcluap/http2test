/*
 * Copyright (C) Jini Guru Technologies (Mauritius) Limited - Company No. : 154309 - All Rights Reserved Unauthorized copying of
 * this file or any of its contents, via any medium is strictly prohibited Proprietary and confidential
 */
package org.acme.quickstart;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class MyFilter implements ContainerRequestFilter {

    private static final Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        requestContext.getEntityStream().readAllBytes();
    }

}

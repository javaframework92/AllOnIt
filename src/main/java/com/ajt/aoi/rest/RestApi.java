package com.ajt.aoi.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api")
public class RestApi {
	public Response home() {
		return Response.ok("Home").build();
	}

}

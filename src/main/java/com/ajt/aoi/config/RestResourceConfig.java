package com.ajt.aoi.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rest")
public class RestResourceConfig extends ResourceConfig {

	public RestResourceConfig() {
		this.packages("com.ajt.aoi.rest");
	}

}

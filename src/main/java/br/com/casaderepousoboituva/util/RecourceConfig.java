package br.com.casaderepousoboituva.util;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

//http://localhost:8080/casaderepousoboituva/rest
@ApplicationPath("rest")
public class RecourceConfig extends ResourceConfig {
	public void ResourceConfig(){
		packages("br.com.casaderepousoboituva.service");
	}		
}
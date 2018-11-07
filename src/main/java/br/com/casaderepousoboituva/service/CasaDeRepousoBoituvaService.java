package br.com.casaderepousoboituva.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import br.com.casaderepousoboituva.util.JavaMailApp;
import com.google.gson.Gson;

import br.com.casaderepousoboituva.domain.Contato;

@Path("contato")
public class CasaDeRepousoBoituvaService {

	// http://localhost:8080/casaderepousoboituva/rest/contato
	@POST
	public String recebeContato(String json){
		Gson gson = new Gson();
		Contato contato = gson.fromJson(json, Contato.class);

		JavaMailApp javaMailApp = new JavaMailApp();
		
		javaMailApp.EnviarEmail(contato);		
		
		String jsonSaida = gson.toJson(contato);
		return jsonSaida;
		
	}
	
}


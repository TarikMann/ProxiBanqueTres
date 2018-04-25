package fr.gtm.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mysql.fabric.Response;

import fr.gtm.domaine.Conseiller;

@Path("/json/Authentification")
public class AuthentificationConseiller {

	

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Conseiller monConseiller) {


		

UserDao monUserDao = new UserDao();
boolean ResultRequete = monUserDao.createClient(user);
String result = "ok "+ ResultRequete;
System.out.println(ResultRequete);


		String resultat = "Track saved : " + user;
		System.out.println(resultat);
		return Response.status(201).entity(result).build();
		
	}


}

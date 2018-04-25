package fr.gtm.proxibanqueSIws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.gtm.dao.ConseillerDao;
import fr.gtm.domaine.Conseiller;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Conseiller monConseiller) {

		monConseiller = new Conseiller(2, "tarik", "tarik", "mannou");
		System.out.println(monConseiller.getLogin());

		ConseillerDao monConseillerDao = new ConseillerDao();

		boolean ResultRequete = monConseillerDao.conseillerConnexion(monConseiller);
		String result = "ok " + ResultRequete;
		System.out.println(ResultRequete);

		String resultat = "Track saved : " + monConseiller;
		System.out.println(resultat);
		return Response.status(201).entity(result).build();

	}
}

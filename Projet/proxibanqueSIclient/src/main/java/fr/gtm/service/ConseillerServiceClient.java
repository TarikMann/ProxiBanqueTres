package fr.gtm.service;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


import fr.gtm.domaine.Conseiller;

public class ConseillerServiceClient {

	/**
	 * @author mathieu - méthode qui prend en paramètre un objet conseiller, qui
	 *         convertit cet objet en format JSON, et qui envoie le conseiller sous
	 *         format JSON en String pour traitement par la mserviccéthode POST de
	 *         la classe ConseillerService
	 * @param objet
	 *            conseiller de type Conseiller
	 * @return boolean
	 */


	public boolean connexion(Conseiller conseiller) { // TODO verifier le type de retour

		// creation d'un conseiller1 pour tester la méthode
		// --------------------------------------------------
		Conseiller conseiller1 = new Conseiller(1, "jean", "Louis", "3");
		System.out.println(conseiller1);

		// creation d'un mapper
		// --------------------------------------------------
		ObjectMapper mapper = new ObjectMapper();

		// boolean res = false;
		String output = "";
		try {

			// creation du client
			Client client = Client.create();

			// conversion objet conseiller en String
			String jsonInString = mapper.writeValueAsString(conseiller);

			System.out.println("Coté client... jsf...");
			System.out.println(jsonInString);

			// creation de la ressource
			WebResource webResource = client
					.resource("http://localhost:8080/proxibanqueSIclient/json/authentification"); // TODO à vérifier

			// envoi de la requête POST
			ClientResponse response = webResource.type("application/json").post(ClientResponse.class, jsonInString);

			// verification du statut de la reponse
			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			output = response.getEntity(String.class);
			System.out.println("output...");
			System.out.println(output);
			boolean res = mapper.readValue(output, Boolean.class);
			System.out.println(res);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// System.out.println("les res = "+ res);
		return true;

	}

}

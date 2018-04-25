package fr.gtm.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.gtm.domaine.Conseiller;
import fr.gtm.service.ConseillerServiceClient;

@ManagedBean(name = "conseiller") // annotation qui permet de donner un nom à un objet (non instancier), nom qui
// peut etre utiliser dans les pages
@SessionScoped
public class ConseillerBean {

	// attrubue du beans

	private Conseiller conseiller;

	// Construteur

	public ConseillerBean() {
		super();
	}
	
	// gets/sets

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	

	public Object appelTraitement() { // la Signature (retour Object) est documentée dans doc JSF commandButton /
		// attribut action
		
		
Conseiller monConseiller = new Conseiller();
		System.out.println(monConseiller);
		
		return monConseiller;
		
//		ConseillerServiceClient service = new ConseillerServiceClient(); // instantiation d'un object conseillerservice
//																			// pour l'appel de couche service
//		service.createUser(c);

//		if (service.createUser(Conseiller)) { // tous les objects creer pour un classe donnee peuvent utilisé les methodee
//											// de
//			// cette classe
//			return "resultatOK";
//		}
//		return "resultatKO";
	}

	

}

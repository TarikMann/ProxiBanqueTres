package fr.gtm.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.gtm.domaine.Conseiller;
import fr.gtm.service.ConseillerServiceClient;


@ManagedBean(name = "conseillerbean") // annotation qui permet de donner un nom à un objet (non instancier), nom qui
// peut etre utiliser dans les pages

@SessionScoped
public class ConseillerBean {

	// attrubue du beans

//	private Conseiller monConseiller;
private String login;
private String password;
	// Construteur
	public ConseillerBean() {
		super();
	}
//	public ConseillerBean(Conseiller monConseiller) {
//		super();
//	this.monConseiller = monConseiller;
//	}
//	
//	// gets/sets
//	public Conseiller getMonConseiller() {
//		return monConseiller;
//	}
//
//	public void setMonConseiller(Conseiller monConseiller) {
//		this.monConseiller = monConseiller;
//	}

	
	
	

	public Object appelTraitement() { // la Signature (retour Object) est documentée dans doc JSF commandButton /
		
		// attribut action
		//compte1.setSoldes(compte1.getSoldes()-somme);	
		
		Conseiller monConseiller = new Conseiller(login, password);
		System.out.println(monConseiller);
	
		
		
ConseillerServiceClient service = new ConseillerServiceClient(); // instantiation d'un object conseillerservice
//																			// pour l'appel de couche service
		service.createUser(c);

//		if (service.createUser(Conseiller)) { // tous les objects creer pour un classe donnee peuvent utilisé les methodee
//											// de
//			// cette classe
//			return "resultatOK";
//		}
//		return "resultatKO";

return null;
	}





	public String getLogin() {
		return login;
	}





	public void setLogin(String login) {
		this.login = login;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}



}

package fr.gtm.dao;

import java.sql.Statement;

import fr.gtm.domaine.Conseiller;

public class ConseillerDao {

	public Conseiller getConseillerConnexion(Conseiller monConseiller) {



		Statement monStatement =  ConnexionSql.connect();
		
		String sql = "Select * from conseiller where conseiller_login = '" + monConseiller.getLogin() + "' AND conseiller_password = '"
				+ monConseiller.getPassword() + "'";
		try {
			// On envoie la requete a la base de données
			this.rs = st.executeQuery(sql);
			// Om met le curseur sur la première ligne des données
			this.rs.first();
			// Affectation des propriétés de l'objet client
			conseillerReturn.setIdConseiller(this.rs.getInt("conseiller_id"));
			conseillerReturn.setNom(this.rs.getString("conseiller_nom"));
			conseillerReturn.setPrenom(this.rs.getString("conseiller_prenom"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conseillerReturn;
		
		return null;
	}

}

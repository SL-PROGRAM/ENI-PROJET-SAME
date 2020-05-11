package fr.eni.same.dal.jdbc;

import fr.eni.same.bo.Bo;
import fr.eni.same.dal.DAO;

/**
 * 
 * exemple de DAO pour un objet métier
 * @author sl
 *
 */
public interface BoDAO extends DAO<Bo> {

	
	/**
	 * ajout des méthode sécifique lié a l'objet
	 * exemple : verifierNbPositif, verifierNom, verifierNbCaractere, …
	 */
}

package fr.eni.same.dal;

import fr.eni.same.dal.jdbc.BoDAO;
import fr.eni.same.dal.jdbc.BoDAOJDBCImpl;

/**
 * La factory sert a changer de couche et a garantir l'interchangabilité de la DAL
 * @author sl
 *
 */

public class Factory {
	
	/**
	 * ici seront inclue toute les methodes pour permettre  de retourner les differents objets metiers a la couche bll
	 * @return
	 */
    public static BoDAO getBoDAO() {
    	return BoDAOJDBCImpl.getBoDAOJdbcImpl();
    }
}

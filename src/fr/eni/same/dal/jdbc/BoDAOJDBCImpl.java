package fr.eni.same.dal.jdbc;

import java.util.List;

import fr.eni.same.bo.Bo;
import fr.eni.same.exception.BusinessException;

public class BoDAOJDBCImpl implements BoDAO{
	/**
	 * mise en place d'un singleton pour garantir la coerence des données
	 */
	
	private static BoDAOJDBCImpl instance;

	/**
	 * constructeur priver pour ne pas permettre la creation d'une autre instance de la class
	 */
    private BoDAOJDBCImpl() {
    }

    /**
     * methode Get pour récupérer l'instance et la créer si elle existe pas
     * @return
     */
    public static synchronized BoDAOJDBCImpl getBoDAOJdbcImpl() {
        if(instance == null){
            instance = new BoDAOJDBCImpl();
        }
        return instance;
    }
	
	/**
	 * insertion methode de l'interface DAO et de l'interfate boDAO
	 */
	@Override
	public void insert(Bo t) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Bo t) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Bo t) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Bo select(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bo> selectAll() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}

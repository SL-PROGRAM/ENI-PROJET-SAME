package fr.eni.same.dal;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionProvider {
	static Connection con = null;

	/**
	 * Ouvre la connexion à la base de donnée
	 * @return
	 */
	public static Connection openConnection() {
		Context context;
		try {
			context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/pool_cnx");
			con = dataSource.getConnection();
			System.out.println("Connexion ouverte");
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
			System.out.println("Erreur");
		}
		return con;
	}
	/**
	 * Ferme la connexion à la base de donnée
	 * @return
	 */
	public static Connection closeConnection() {
		if(con != null) {
			try {
				con.close();
				System.out.println("Connexion fermée");
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
}
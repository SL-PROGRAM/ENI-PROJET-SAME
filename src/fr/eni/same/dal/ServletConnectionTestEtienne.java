package fr.eni.same.dal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet de connexion à la base de donnée
 * SERVLET TEST, NE PAS UTILISER EN PRODUCTION
 * @author etienne
 *
 */
@WebServlet("/ServletConnectionTestEtienne")
public class ServletConnectionTestEtienne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		String query = "SELECT * FROM categories";
		con = ConnectionProvider.openConnection();
		try {
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con = ConnectionProvider.closeConnection();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

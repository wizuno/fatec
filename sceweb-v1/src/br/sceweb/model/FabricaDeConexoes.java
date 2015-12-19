package br.sceweb.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class FabricaDeConexoes {
	Logger logger = Logger.getLogger(FabricaDeConexoes.class);
	public Connection getConnection() {
		String url = "jdbc:mysql://localhost/sceweb";
		try {
			return DriverManager.getConnection(url, "root", "");
		} catch (SQLException e) {
			logger.info("SQLException na classe FabricaDeConexoes");
			throw new RuntimeException(e);
		}
	}
}




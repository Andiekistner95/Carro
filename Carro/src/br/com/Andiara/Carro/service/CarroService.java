package br.com.Andiara.Carro.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.Andiara.Carro.dao.CarroDAO;
import br.com.Andiara.Carro.jdbc.oracle.ConnectionPoolOracle;
import br.com.Andiara.Carro.model.Carro;

public class CarroService {

public List<Carro> listarCarros() throws SQLException{
		
		// usa o try para tentar executar os comandos abaixo, conectando no banco e retornando a lista
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new CarroDAO(con).lista();
		}
		
	}
}

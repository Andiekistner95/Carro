package br.com.Andiara.Carro.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.Andiara.Carro.model.Carro;
import br.com.Andiara.Carro.service.CarroService;

public class TesteCarro {
	public static void main(String[] args) throws SQLException {

		List<Carro> lCarros = new CarroService().listarCarros();

		for (Carro carro : lCarros) {

			System.out.println(carro.toString());
		}

	}
}

package br.com.Andiara.Carro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Andiara.Carro.model.Carro;

public class CarroDAO {

	private final Connection con;

	public CarroDAO(Connection con) {
		this.con = con;
	}

	public List<Carro> lista() throws SQLException {
		List<Carro> Lcarros = new ArrayList<>();

		String sql = "select from CARRO";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.execute();

			try (ResultSet rs = stmt.getResultSet()) {

				while (rs.next()) {

					String placa = rs.getString("PLACA");
					String tipo_Veiculo = rs.getString("TIPO_VEICULO");
					String marca = rs.getString("MARCA");
					String cor = rs.getString("COR");
					Carro carro = new Carro(placa, tipo_Veiculo, marca, cor);
					Lcarros.add(carro);
				}
			}
		}

		return Lcarros;

	}

}

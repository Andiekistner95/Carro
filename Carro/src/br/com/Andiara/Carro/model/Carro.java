package br.com.Andiara.Carro.model;

public class Carro {

	private String placa;
	private String tipo_Veiculo;
	private String marca;
	private String cor;
	
	public Carro(String placa,String tipo_Veiculo,String marca,String cor) {
		setPlaca(placa);
		setTipo_Veiculo(tipo_Veiculo);
		setMarca(marca);
		setCor(cor);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo_Veiculo() {
		return tipo_Veiculo;
	}

	public void setTipo_Veiculo(String tipo_Veiculo) {
		this.tipo_Veiculo = tipo_Veiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
	String dados;
	dados = "\nPlaca: "+getPlaca();
	dados+="\nTipo veiculo: "+getTipo_Veiculo();
	dados+="\nMarca: "+getMarca();
	dados+="\nCor: "+getCor();
		return dados;
	}

}

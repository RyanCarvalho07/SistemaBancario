package model;

public abstract class Conta {

	private Integer numero;
	protected Double saldo;
	private String titular;
	private Integer histTransação;

	public Conta() {
	}

	public Conta(Integer numero, Double saldo, String titular, Integer histTransação) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
		this.histTransação = histTransação;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getHistTransação() {
		return histTransação;
	}

	public void setHistTransação(Integer histTransação) {
		this.histTransação = histTransação;
	}

	public abstract void sacar();

	public abstract void depositar();

	public abstract void transferir();

}

package model;

public class ContaCorrente extends Conta {

	private Double taxaOP;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Integer numero, Double saldo, String titular, Integer histTransação, Double taxaOP) {
		super(numero, saldo, titular, histTransação);
		this.taxaOP = taxaOP;
	}

	public Double getTaxaOP() {
		return taxaOP;
	}

	public void setTaxaOP(Double taxaOP) {
		this.taxaOP = taxaOP;
	}
	
	 
    @Override
    public void sacar() {
    	saldo -= 
    }
	

}

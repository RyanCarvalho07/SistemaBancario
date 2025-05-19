package model;

public final class ContaPoupanca extends Conta {

	private static double TAXA_RENDIMENTO = 0.006;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, Cliente titular) {
		super(numero, titular);
	}

	public double simularRendimentoMensal(int meses) {
		return saldo * Math.pow(TAXA_RENDIMENTO, meses);
	}

	@Override
	public final void saque(double valor) {

	}

	@Override
	public final void depositar(double valor) {

	}

	@Override
	public final void trasferir(double valor, Conta destino) {

	}

}

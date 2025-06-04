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
	public final void sacar(double valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			registrarTransacao(valor, TipoTransacao.SAQUE, this, null);
		}

	}

	@Override
	public final void depositar(double valor) {
		this.saldo += valor;
		registrarTransacao(valor, TipoTransacao.DEPOSITO, null, this);
	}

	@Override
	public final void transferir(double valor, Conta destino) {
		if (this.getSaldo() >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			registrarTransacao(valor, TipoTransacao.TRASFERENCIA, this, destino);
		}

	}

}

package model;

public final class ContaCorrente extends Conta {

	private static double TAXA_DE_OPERACAO = 0.005;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Integer numero, Cliente titular) {
		super(numero, titular);
	}

	@Override
	public final void sacar(double valor) {
		double taxa = valor * TAXA_DE_OPERACAO;
		double valorTotal = valor + taxa;
		if (this.getSaldo() >= valorTotal) {
			this.setSaldo(this.getSaldo() - valorTotal);
			registrarTransacao(valor, TipoTransacao.SAQUE, this);
		}
	}

	@Override
	public final void depositar(double valor) {
		saldo += valor;
		registrarTransacao(valor, TipoTransacao.DEPOSITO, this);
	}

	@Override
	public final void transferir(double valor, Conta destino) {
		double taxa = valor * TAXA_DE_OPERACAO;
		double valorTotal = valor + taxa;
		if (this.getSaldo() >= valorTotal) {
			this.saldo -= valorTotal;
			destino.depositar(valor);
			registrarTransacao(valor, TipoTransacao.TRASFERENCIA, destino);
			registrarTransacao(taxa, TipoTransacao.TARIFA, this);
		}

	}

}
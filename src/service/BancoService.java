package service;

import model.Conta;
import model.TipoTransacao;

public class BancoService {

	private Conta conta;
	
	public BancoService(Conta conta) {
	    this.conta = conta;
	}

	public boolean sacar(Double valor) {
		conta.sacar(valor);
		return true;
	}

	public boolean depositar(Double valor) {
		conta.depositar(valor);
		return true;
	}

	public boolean transferir(Conta destino, Double valor) {
		conta.transferir(valor, destino);
		return true;
	}

	public boolean registrarTransacao(Double valor, TipoTransacao tipo, Conta origem, Conta destino) {
		conta.registrarTransacao(valor, tipo, origem, destino);
		return true;
	}
	

}

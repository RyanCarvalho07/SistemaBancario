package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public  abstract class Conta {

	private Integer numero;
	protected Double saldo;
	private Cliente titular;

	private List<Transacao> historico = new ArrayList<>();;

	public Conta() {
	}

	public Conta(Integer numero, Cliente titular) {
		this.numero = numero;
		this.saldo = 0.0;
		this.titular = titular;
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

	public Cliente getTitular() {
		return titular;
	}

	public List<Transacao> getHistorico() {
		return historico;
	}

	protected void atualizarSaldo(double valor) {
		this.saldo += valor;
	}

	protected void registrarTransacao(double valor, TipoTransacao tipo, Conta destino) {
		historico.add(new Transacao(LocalDateTime.now(), tipo, valor, this, destino));
	}

	public abstract void sacar(double valor);

	public abstract void depositar(double valor);

	public abstract void transferir(double valor, Conta destino);

}

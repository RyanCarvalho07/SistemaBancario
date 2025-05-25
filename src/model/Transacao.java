package model;

import java.time.LocalDateTime;


public class Transacao {

	private LocalDateTime dataHora;
	private TipoTransacao tipo;
	private Double valor;
	private Conta  origem;
	private Conta  destino;

	public Transacao(LocalDateTime dataHora, TipoTransacao tipo, Double valor) {
		this.dataHora = dataHora;
		this.tipo = tipo;
		this.valor = valor;
	}

	
	public Conta getContaOrigem() {
		return origem;
	}
	
	public Conta getContaDestino(){
		 return destino;
	}

	
	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public TipoTransacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoTransacao tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}

package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transacao {
	
	private LocalDateTime dataHora;
	private TipoTransacao tipo;
	private Double valor;
	
	List<Conta> origem = new ArrayList<>();
	List<Conta> destino = new ArrayList<>();
	
	public Transacao(LocalDateTime dataHora, TipoTransacao tipo, double valor, Conta conta, Conta destino) {
		dataHora = dataHora;
		this.tipo = tipo;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}
 
	public Double getValor() {
		return valor;
	}

	
	
	
	
	
	

}

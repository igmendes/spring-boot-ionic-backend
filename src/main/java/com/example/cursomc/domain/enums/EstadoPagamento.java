package com.example.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE (1, "Pendente"),
	QUITADO (2, "Quitadoo"),
	CANCELADO (3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) { //Recebo um código
		if (cod == null) { // se ele é nulo, retorno valor nulo.
			return null; 
		}
		
		for (EstadoPagamento x : EstadoPagamento.values()){ // Percorre todos valores possíveis do TipoCliente (fisica-1 e juridica-2)
			if (cod.equals(x.getCod())) { // Se existir código igual ao que estou procurando, ele retorna o código
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod); // exceção 
	}
}

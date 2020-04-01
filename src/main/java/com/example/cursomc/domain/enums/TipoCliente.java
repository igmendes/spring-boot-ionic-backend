package com.example.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
	public static TipoCliente toEnum(Integer cod) { //Recebo um código
		if (cod == null) { // se ele é nulo, retorno valor nulo.
			return null; 
		}
		
		for (TipoCliente x : TipoCliente.values()){ // Percorre todos valores possíveis do TipoCliente (fisica-1 e juridica-2)
			if (cod.equals(x.getCod())) { // Se existir código igual ao que estou procurando, ele retorna o código
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod); // exceção 
	}
}

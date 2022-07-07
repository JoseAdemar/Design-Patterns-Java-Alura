package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {

		if (orcamento.getQuantidadeDeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}

		return BigDecimal.ZERO;
	}
}

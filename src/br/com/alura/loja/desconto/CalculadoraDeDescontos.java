package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {

		Desconto desconto = new DescontoParaOrcamentoComMaisdeCincoItens
				(new DescontoParaOrcamentoComValorMaiorQueQuinhentos
						(new SemDesconto()));
		return desconto.calcular(orcamento);
	}
}

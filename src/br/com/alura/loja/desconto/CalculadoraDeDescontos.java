package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto CadeiaDeDesconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		
		return CadeiaDeDesconto.calcular(orcamento);
	}

}
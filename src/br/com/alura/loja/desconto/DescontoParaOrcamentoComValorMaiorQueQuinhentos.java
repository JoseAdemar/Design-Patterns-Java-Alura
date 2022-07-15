package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

	public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal efetuarCalcular(Orcamento orcamento) {

		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {

		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}

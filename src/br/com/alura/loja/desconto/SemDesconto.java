package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	protected BigDecimal efetuarCalcular(Orcamento orcamento) {

		return BigDecimal.ZERO;
	}

	public boolean deveAplicar(Orcamento orcamento) {

		return true;
	}

}
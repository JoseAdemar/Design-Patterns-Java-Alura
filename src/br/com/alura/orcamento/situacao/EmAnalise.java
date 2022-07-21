package br.com.alura.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento{

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacaoOrcamento(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacaoOrcamento(new Reprovado());
	}
	
}

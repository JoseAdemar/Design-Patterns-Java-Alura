package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
}

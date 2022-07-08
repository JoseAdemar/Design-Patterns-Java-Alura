package br.com.alura.loja;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.orcamento.Orcamento;

public class TestesDescontos {
	public static void main(String[] args) {

		Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		DecimalFormat df = new DecimalFormat("###,###.###");

		System.out.println(df.format(calculadora.calcular(orcamento1)));
		System.out.println(df.format(calculadora.calcular(orcamento2)));

	}
}

package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.orcamento.Orcamento;

public class TestesImpostos {
	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		ICMS icms = new ICMS();
		ISS iss = new ISS();
		
		System.out.println(calculadora.calcular(orcamento, iss));
	}
}

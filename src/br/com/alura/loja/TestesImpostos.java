package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.orcamento.Orcamento;

public class TestesImpostos {
	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ISS(null)));
	}
}

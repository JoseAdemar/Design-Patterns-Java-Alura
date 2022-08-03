package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.orcamento.pedido.GeraPedido;
import br.com.alura.orcamento.pedido.GeraPedidoHandeler;
import br.com.alura.orcamento.pedido.acao.EnviarEmailPedido;
import br.com.alura.orcamento.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {
	public static void main(String[] args) {

		String cliente = "José Junior";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeDeItens = Integer.parseInt("2");

		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeDeItens);

		GeraPedidoHandeler handler = new GeraPedidoHandeler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido()));

		handler.execute(gerador);
	}
}

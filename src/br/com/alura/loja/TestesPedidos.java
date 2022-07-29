package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.orcamento.pedido.GeraPedido;
import br.com.alura.orcamento.pedido.GeraPedidoHandeler;

public class TestesPedidos {
	public static void main(String[] args) {

		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeDeItens = Integer.parseInt(args[2]);

		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeDeItens);

		GeraPedidoHandeler handler = new GeraPedidoHandeler(/* dependencias */);

		handler.executa(gerador);
	}
}

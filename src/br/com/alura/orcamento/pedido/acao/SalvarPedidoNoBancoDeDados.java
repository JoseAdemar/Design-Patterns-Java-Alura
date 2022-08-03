package br.com.alura.orcamento.pedido.acao;

import br.com.alura.orcamento.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

	 public void executarAcao(Pedido pedido) {
		 System.out.println("Salvando pedido no banco de dados");
	 }
}

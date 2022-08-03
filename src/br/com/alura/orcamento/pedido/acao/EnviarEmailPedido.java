package br.com.alura.orcamento.pedido.acao;

import br.com.alura.orcamento.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	 public void executarAcao(Pedido pedido) {
		 System.out.println("Enviando email com dados do pedido");
	 }
}

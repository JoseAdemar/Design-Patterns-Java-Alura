package br.com.alura.orcamento.pedido;

import java.time.LocalDateTime;

import br.com.alura.orcamento.Orcamento;
import br.com.alura.orcamento.pedido.acao.EnviarEmailPedido;
import br.com.alura.orcamento.pedido.acao.SalvarPedidoNoBancoDeDados;

public class GeraPedidoHandeler {

	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		EnviarEmailPedido email = new EnviarEmailPedido();
		SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();

		email.executar(pedido);
		salvar.executar(pedido);
	}
}

package br.com.alura.orcamento.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.orcamento.Orcamento;
import br.com.alura.orcamento.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandeler {

	private List<AcaoAposGerarPedido> acoes;

	public GeraPedidoHandeler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		acoes.forEach(a -> a.executarAcao(pedido));
	}
}

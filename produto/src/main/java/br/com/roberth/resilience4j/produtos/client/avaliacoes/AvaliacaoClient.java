package br.com.roberth.resilience4j.produtos.client.avaliacoes;

import java.util.List;

public interface AvaliacaoClient {

	List<AvaliacaoModel> buscarTodosPorProduto(Long productId);
}

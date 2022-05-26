package br.com.roberth.resilience4j.produtos.client.cep;

public interface CepClient {

    CepModelResponse buscarInformacoesDeCep(String cep);

}

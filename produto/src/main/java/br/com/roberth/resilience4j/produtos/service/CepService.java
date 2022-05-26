package br.com.roberth.resilience4j.produtos.service;

import br.com.roberth.resilience4j.produtos.client.cep.CepClient;
import br.com.roberth.resilience4j.produtos.client.cep.CepModelResponse;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    private final CepClient cepClient;

    public CepService(CepClient cepClient) {
        this.cepClient = cepClient;
    }

    public CepModelResponse buscarCep(String cep) {
        return this.cepClient.buscarInformacoesDeCep(cep);
    }

}

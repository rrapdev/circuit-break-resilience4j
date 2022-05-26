package br.com.roberth.resilience4j.produtos.infra.client;

import br.com.roberth.resilience4j.produtos.client.cep.CepClient;
import br.com.roberth.resilience4j.produtos.client.cep.CepModelResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

@Component
public class CepClientImpl implements CepClient {

    private final RestTemplate restTemplate;

    private final static String URL_API_CEP = UriComponentsBuilder
            .fromHttpUrl("https://ws.apicep.com/cep/{cepCode}.json")
            .queryParam("cepCode", "{cepCode}")
            .encode()
            .toUriString();

    public CepClientImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public CepModelResponse buscarInformacoesDeCep(String cep) {
        final Map<String, String> parametros = new HashMap<>();
        parametros.put("cepCode", cep);

        CepModelResponse response = restTemplate.getForObject(URL_API_CEP, CepModelResponse.class, parametros);

        return response;
    }

}

package br.com.roberth.resilience4j.produtos.api;

import br.com.roberth.resilience4j.produtos.client.cep.CepModelResponse;
import br.com.roberth.resilience4j.produtos.service.CepService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class CepController {

    private final CepService cepService;

    public CepController(CepService cepService) {
        this.cepService = cepService;
    }

    @GetMapping("/{cep}")
    public CepModelResponse buscarCep(@PathVariable String cep) {
        return cepService.buscarCep(cep);
    }

}

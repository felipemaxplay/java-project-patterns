package br.com.felipemaxplay.projectpatterns.projectpatternsspring.service;

import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping(path = "/{cep}/json/")
    Address getCep(@PathVariable(name = "cep") String cep);
}

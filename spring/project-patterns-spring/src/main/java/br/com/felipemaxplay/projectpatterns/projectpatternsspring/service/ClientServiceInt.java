package br.com.felipemaxplay.projectpatterns.projectpatternsspring.service;

import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Address;
import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Client;
import br.com.felipemaxplay.projectpatterns.projectpatternsspring.http.dto.request.ClientAdressDto;

import java.util.List;

public interface ClientServiceInt {
    List<Client> getAll();

    Client getById(long id);

    Client createClient(ClientAdressDto dto);

    Client updateClient(Client client);

    void deleteById(long id);
}

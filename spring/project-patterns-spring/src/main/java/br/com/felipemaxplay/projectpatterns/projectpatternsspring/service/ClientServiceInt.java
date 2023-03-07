package br.com.felipemaxplay.projectpatterns.projectpatternsspring.service;

import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Client;

import java.util.List;

public interface ClientServiceInt {
    List<Client> getAll();

    Client getById(long id);

    Client createClient(Client client);

    Client updateClient(long id, Client client);

    void deleteById(long id);
}

package br.com.felipemaxplay.projectpatterns.projectpatternsspring.service;

import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Client;
import br.com.felipemaxplay.projectpatterns.projectpatternsspring.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements ClientServiceInt {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAll() {

        return null;
    }

    @Override
    public Client getById(long id) {

        return null;
    }

    @Override
    public Client createClient(Client client) {

        return null;
    }

    @Override
    public Client updateClient(long id, Client client) {

        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}

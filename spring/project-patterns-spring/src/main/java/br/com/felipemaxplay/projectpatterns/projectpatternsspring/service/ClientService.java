package br.com.felipemaxplay.projectpatterns.projectpatternsspring.service;

import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Address;
import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Client;
import br.com.felipemaxplay.projectpatterns.projectpatternsspring.http.dto.request.ClientAdressDto;
import br.com.felipemaxplay.projectpatterns.projectpatternsspring.repository.ClientRepository;
import jakarta.persistence.NoResultException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements ClientServiceInt {

    private final ClientRepository clientRepository;

    private final AddressService addressService;

    public ClientService(ClientRepository clientRepository, AddressService addressService) {
        this.clientRepository = clientRepository;
        this.addressService = addressService;
    }

    @Override
    public List<Client> getAll() {

        return clientRepository.findAll();
    }

    @Override
    public Client getById(long id) {
        Client clientRetrieved = clientRepository.findById(id)
                .orElseThrow(() -> new NoResultException(String.format("Not exist client with id: %d", id)));
        return clientRetrieved;
    }

    @Override
    public Client createClient(ClientAdressDto dto) {
        Address addressCreated = addressService.createAddress(dto.getCep());
        Client clientCreated = new Client(dto.getName(), addressCreated);
        return clientRepository.save(clientCreated);
    }

    @Override
    public Client updateClient(Client client) {
        if(!clientRepository.existsById(client.getId())) {
            throw new NoResultException(String.format("product with id %d not found", client.getId()));
        }
        Address newAddress = addressService.createAddress(client.getAddress().getCep());
        client.setAddress(newAddress);
        Client clientUpdated = clientRepository.save(client);
        return clientUpdated;
    }

    @Override
    public void deleteById(long id) {
        if(!clientRepository.existsById(id)) {
            throw new NoResultException(String.format("Client with id: %d not found", id));
        }
        clientRepository.deleteById(id);
    }
}

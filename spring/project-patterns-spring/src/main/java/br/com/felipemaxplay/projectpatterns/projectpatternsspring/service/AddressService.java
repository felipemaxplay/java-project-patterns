package br.com.felipemaxplay.projectpatterns.projectpatternsspring.service;

import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Address;
import br.com.felipemaxplay.projectpatterns.projectpatternsspring.repository.AddressRepository;
import jakarta.persistence.NoResultException;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements AddressServiceInt {

    private final AddressRepository repository;
    private final ViaCepService viaCepService;

    public AddressService(AddressRepository repository, ViaCepService viaCepService) {
        this.repository = repository;
        this.viaCepService = viaCepService;
    }

    @Override
    public Address getAddressById(String cep) {
        Address addressRetrieved = repository.findById(cep)
                .orElseThrow(() -> new NoResultException(String.format("Address with cep: %s not found.", cep)));
        return addressRetrieved;
    }

    @Override
    public Address createAddress(String cep) {
        Address address = viaCepService.getCep(cep);
        return repository.save(address);
    };

}

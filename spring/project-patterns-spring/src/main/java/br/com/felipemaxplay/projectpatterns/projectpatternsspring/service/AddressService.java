package br.com.felipemaxplay.projectpatterns.projectpatternsspring.service;

import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Address;
import br.com.felipemaxplay.projectpatterns.projectpatternsspring.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements AddressServiceInt{
    private final AddressRepository repository;

    public AddressService(AddressRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Address> getAll() {
        return null;
    }

    @Override
    public Address getById(long id) {
        return null;
    }

    @Override
    public Address createAddress(Address address) {
        return null;
    }

    @Override
    public Address updateAddress(long id, Address address) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}

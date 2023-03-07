package br.com.felipemaxplay.projectpatterns.projectpatternsspring.service;

import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Address;

import java.util.List;

public interface AddressServiceInt {
    List<Address> getAll();

    Address getById(long id);

    Address createAddress(Address address);

    Address updateAddress(long id, Address address);

    void deleteById(long id);
}

package br.com.felipemaxplay.projectpatterns.projectpatternsspring.service;

import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Address;

public interface AddressServiceInt {
    Address getAddressById(String cep);

    Address createAddress(String cep);
}

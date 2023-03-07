package br.com.felipemaxplay.projectpatterns.projectpatternsspring.repository;

import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, String> {
}

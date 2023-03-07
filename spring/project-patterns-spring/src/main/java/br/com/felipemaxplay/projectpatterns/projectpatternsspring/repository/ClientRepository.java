package br.com.felipemaxplay.projectpatterns.projectpatternsspring.repository;

import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}

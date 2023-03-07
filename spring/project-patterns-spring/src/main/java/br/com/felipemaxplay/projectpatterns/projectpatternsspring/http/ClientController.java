package br.com.felipemaxplay.projectpatterns.projectpatternsspring.http;

import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Address;
import br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity.Client;
import br.com.felipemaxplay.projectpatterns.projectpatternsspring.http.dto.request.ClientAdressDto;
import br.com.felipemaxplay.projectpatterns.projectpatternsspring.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/clients")
public class ClientController {
    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Client> getAllClients() {

        return service.getAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Client getClientById(@PathVariable(name = "id") long id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client createClient(@RequestBody ClientAdressDto dto) {
        return service.createClient(dto);
    }

    @PutMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Client updateClient(@PathVariable(name = "id") long id, @RequestBody ClientAdressDto dto) {
        Address address = new Address(dto.getCep());
        Client client = new Client(id, dto.getName(), address);
        return service.updateClient(client);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClient(@PathVariable(name = "id") long id) {
        service.deleteById(id);
    }
}

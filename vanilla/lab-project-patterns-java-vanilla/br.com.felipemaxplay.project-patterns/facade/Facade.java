package facade;

import subsystem.cep.CepApi;
import subsystem.crm.CrmService;

public class Facade {

    public void migrateClient(String name, String cep) {
        String city = CepApi.getCepApiEagerInstance().retrieveCity(cep);
        String state = CepApi.getCepApiEagerInstance().retrieveState(cep);

        CrmService.saveClient(name, cep, city, state);
    }
}

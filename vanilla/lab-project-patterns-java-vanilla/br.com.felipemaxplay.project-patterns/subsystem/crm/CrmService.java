package subsystem.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveClient(String name, String cep, String city, String state) {
        String client = String.format("client={ name:%s, cep:%s, city:%s, state:%s }", name, cep, city, state);
        System.out.println("Client save in CRM service: " + client);
    }
}

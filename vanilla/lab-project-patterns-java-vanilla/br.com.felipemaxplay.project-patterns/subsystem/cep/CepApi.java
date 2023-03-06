package subsystem.cep;

public class CepApi {
    private static CepApi cepApi = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getCepApiEagerInstance() {
        return cepApi;
    }

    public String retrieveCity(String cep) {
        return "Araraquara";
    }

    public String retrieveState(String cep) {
        return "São Paulo";
    }
}
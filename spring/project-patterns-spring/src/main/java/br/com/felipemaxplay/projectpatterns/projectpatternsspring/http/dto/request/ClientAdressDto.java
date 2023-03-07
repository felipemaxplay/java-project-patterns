package br.com.felipemaxplay.projectpatterns.projectpatternsspring.http.dto.request;

public class ClientAdressDto {

    String name;

    String cep;

    @Deprecated
    public ClientAdressDto() {
    }

    public ClientAdressDto(String name, String cep) {
        this.name = name;
        this.cep = cep;
    }

    public String getName() {
        return name;
    }

    public String getCep() {
        return cep;
    }
}

package br.com.felipemaxplay.projectpatterns.projectpatternsspring.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "address_tb")
public class Address {
    @Id
    private String cep;

    @Column(name = "logradouro", nullable = false, length = 30)
    private String logradouro;

    @Column(name = "complemento", nullable = false, length = 30)
    private String complemento;

    @Column(name = "bairro", nullable = false, length = 30)
    private String bairro;

    @Column(name = "localidade", nullable = false, length = 30)
    private String localidade;

    @Column(name = "uf", nullable = false, length = 2)
    private String uf;

    @Column(name = "ibge", nullable = false, length = 30)
    private String ibge;

    @Column(name = "gia", nullable = false, length = 30)
    private String gia;

    @Column(name = "ddd", nullable = false, length = 3)
    private String ddd;

    @Column(name = "siafi", nullable = false, length = 30)
    private String siafi;

    @Deprecated
    public Address() {
    }

    public Address(String cep) {
        this.cep = cep;
    }

    public Address(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String ibge, String gia, String ddd, String siafi) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(cep, address.cep) && Objects.equals(logradouro, address.logradouro) && Objects.equals(complemento, address.complemento) && Objects.equals(bairro, address.bairro) && Objects.equals(localidade, address.localidade) && Objects.equals(uf, address.uf) && Objects.equals(ibge, address.ibge) && Objects.equals(gia, address.gia) && Objects.equals(ddd, address.ddd) && Objects.equals(siafi, address.siafi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi);
    }

    @Override
    public String toString() {
        return "Address{" +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", ibge='" + ibge + '\'' +
                ", gia='" + gia + '\'' +
                ", ddd='" + ddd + '\'' +
                ", siafi='" + siafi + '\'' +
                '}';
    }
}

package br.ifpe.atividade.Web4.models;

public class ProviderModel {

    private String name;
    private String cnpj;
    private Long phone;

    public ProviderModel() {
    }

    public ProviderModel(String name, String cnpj, Long phone) {
        this.name = name;
        this.cnpj = cnpj;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Fornecedor: " + name + " Cnpj: " + cnpj+ " Telefone: " + phone;
    }
}


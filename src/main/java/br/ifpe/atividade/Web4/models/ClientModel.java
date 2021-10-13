package br.ifpe.atividade.Web4.models;

public class ClientModel {
    private String name;
    private Long phone;
    private String email;

    public ClientModel(String name, Long phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public ClientModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente: " + name + " Email: " + email+ " Telefone: " + phone;
    }
}

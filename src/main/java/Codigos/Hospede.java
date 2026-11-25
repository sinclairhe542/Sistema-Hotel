/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigos;

/**
 *
 * @author joaopfc
 */
public class Hospede {
    private String nome;
    private String Cpf;
    private String Telefone;
    private String email;
     private int quartos;
    private int checkin;
    private int checkout;
    private int adultos;
    private int criancas;
    private int dias;
                                // {"CafeManha", "estacionamento", "ServicoQuarto", "AcessoSpa", "Aeroporto", "Minibar"};
    private Double vServiços;  // {12.00, 15.00, 15.00, 35.00, 50.00, 12.00};
    private Double valor;
    
    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getCheckin() {
        return checkin;
    }

    public void setCheckin(int checkin) {
        this.checkin = checkin;
    }

    public int getCheckout() {
        return checkout;
    }

    public void setCheckout(int checkout) {
        this.checkout = checkout;
    }

    public int getAdultos() {
        return adultos;
    }

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public int getCriancas() {
        return criancas;
    }

    public void setCriancas(int criancas) {
        this.criancas = criancas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Double getvServiços() {
        return vServiços;
    }

    public void setvServiços(Double vServiços) {
        this.vServiços = vServiços;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Hospede{" + " nome=" + nome + ", Cpf=" + Cpf + ", Telefone=" + Telefone + ", email=" + email + '}';
    }
    
    
}

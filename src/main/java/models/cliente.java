/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

public class Cliente {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the data_nasc
     */
    public Date getData_nasc() {
        return data_nasc;
    }

    /**
     * @param data_nasc the data_nasc to set
     */
    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    /**
     * @return the endereço
     */
    public String getEndereço() {
        return endereço;
    }

    /**
     * @param endereço the endereço to set
     */
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }


    public int getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(int cod_cli) {
        this.cod_cli = cod_cli;
    }

    private int cod_cli;
    private String nome;
    private Date data_nasc;
    private String endereço;
    private String telefone;
    private String email;

    @Override
    public String toString() {
        return "Cliente{" +
                "cod_cli=" + cod_cli +
                ", nome='" + nome + '\'' +
                ", data_nasc=" + data_nasc +
                ", endereço='" + endereço + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}'+'\n';
    }
}

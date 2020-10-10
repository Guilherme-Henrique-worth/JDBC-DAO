/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import java.sql.Date;

/**
 *
 * @author guilh
 */

public class Vendas {

    /**
     * @return the data_hora
     */
    public Date getData_hora() {
        return data_hora;
    }

    /**
     * @param data_hora the data_hora to set
     */
    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the cli_cod_cli
     */
    public int getCli_cod_cli() {
        return cli_cod_cli;
    }

    /**
     * @param cli_cod_cli the cli_cod_cli to set
     */
    public void setCli_cod_cli(int cli_cod_cli) {
        this.cli_cod_cli = cli_cod_cli;
    }


    public int getCod_venda() {
        return cod_vendas;
    }

    public void setCod_venda(int cod_venda) {
        this.cod_vendas = cod_venda;
    }

    private int cod_vendas;
    private Date data_hora;
    private int total;
    private int cli_cod_cli;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private int quantidade;


    @Override
    public String toString() {
        return "Vendas{" +
                "cod_vendas=" + cod_vendas +
                ", data_hora=" + data_hora +
                ", total=" + total +
                ", cli_cod_cli=" + cli_cod_cli +
                ", quantidade=" + quantidade +
                '}'+"\n";
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author guilh
 */
public class Itens_venda {

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the sub_total
     */
    public int getSub_total() {
        return sub_total;
    }

    /**
     * @param sub_total the sub_total to set
     */
    public void setSub_total(int sub_total) {
        this.sub_total = sub_total;
    }

    /**
     * @return the venda_cod_venda
     */
    public int getVenda_cod_venda() {
        return venda_cod_venda;
    }

    /**
     * @param venda_cod_venda the venda_cod_venda to set
     */
    public void setVenda_cod_venda(int venda_cod_venda) {
        this.venda_cod_venda = venda_cod_venda;
    }

    /**
     * @return the prod_cod_prod
     */
    public int getProd_cod_prod() {
        return prod_cod_prod;
    }

    /**
     * @param prod_cod_prod the prod_cod_prod to set
     */
    public void setProd_cod_prod(int prod_cod_prod) {
        this.prod_cod_prod = prod_cod_prod;
    }
    
    
    
    private int quantidade;
    private int sub_total;
    private int venda_cod_venda;
    private int prod_cod_prod;
}

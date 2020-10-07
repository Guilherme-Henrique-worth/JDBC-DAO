/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author guilh
 */
public class Produtos {

    /**
     * @return the preço_venda
     */
    public int getPreço_venda() {
        return preço_venda;
    }

    /**
     * @param preço_venda the preço_venda to set
     */
    public void setPreço_venda(int preço_venda) {
        this.preço_venda = preço_venda;
    }

    /**
     * @return the descriçao
     */
    public String getDescriçao() {
        return descriçao;
    }

    /**
     * @param descriçao the descriçao to set
     */
    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    /**
     * @return the data_validade
     */
    public Date getData_validade() {
        return data_validade;
    }

    /**
     * @param data_validade the data_validade to set
     */
    public void setData_validade(Date data_validade) {
        this.data_validade = data_validade;
    }

    /**
     * @return the preço_custo
     */
    public int getPreço_custo() {
        return preço_custo;
    }

    /**
     * @param preço_custo the preço_custo to set
     */
    public void setPreço_custo(int preço_custo) {
        this.preço_custo = preço_custo;
    }

    /**
     * @return the estoque
     */
    public int getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the dist_cod_dist
     */
    public int getDist_cod_dist() {
        return dist_cod_dist;
    }

    /**
     * @param dist_cod_dist the dist_cod_dist to set
     */
    public void setDist_cod_dist(int dist_cod_dist) {
        this.dist_cod_dist = dist_cod_dist;
    }
    
    
    
    private int preço_venda;
    private String descriçao;
    private Date data_validade;
    private int preço_custo;
    private int estoque;
    private int dist_cod_dist;
}

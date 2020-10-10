/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import listagem.ClienteEmail;
import listagem.ProdutoVencido;
/*import listagem.Vendas2020;*/
import listagem.Vendas2020;
import models.Cliente;
import models.Distribuidores;
import models.Produtos;
import models.Vendas;
import pacoteDAO.*;

import java.util.List;

/**
 *
 * @author guilh
 */
public class main {
    public static void main(String args[])
    {
        List<Vendas> ven = Vendas2020.read();
        System.out.println(ven);


    }
}

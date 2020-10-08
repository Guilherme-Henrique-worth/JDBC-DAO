/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import listagem.ClienteEmail;
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
        List<Cliente> c = ClienteEmail.read();
        System.out.println(c);
    }
}

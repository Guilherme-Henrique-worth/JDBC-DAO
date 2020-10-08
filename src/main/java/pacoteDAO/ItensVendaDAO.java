/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteDAO;

import connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class ItensVendaDAO {
    public static void create(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("qual a quantidade de produtos?");
            String quantidade = scanner.nextLine();
            System.out.println("qual o sub_total?");
            String sub_total = scanner.nextLine();
            System.out.println("qual o codigo da venda?");
            String venda_cod_venda = scanner.nextLine();
            System.out.println("qual o codigo do produto?");
            String prod_cod_prod = scanner.nextLine();

            stmt= con.prepareStatement("INSERT INTO itens_venda(quantidade, sub_total , venda_cod_venda, prod_cod_prod) VALUES (?, ?, ?, ?)");
            stmt.setString(1,quantidade);
            stmt.setString(2,sub_total);
            stmt.setString(3,venda_cod_venda);
            stmt.setString(4,prod_cod_prod);
            stmt.executeUpdate();

            System.out.println("itens da venda salvos com sucesso!");
        }catch (SQLException ex){
            System.out.println("erro ao salvar: "+ex);
        }finally {
            ConnectionFactory.closeConnection(con,stmt,null);
        }
    }
}

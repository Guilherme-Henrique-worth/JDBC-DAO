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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class ProdutosDAO {
    public static void create(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("qual o preço de venda do produto?");
            String preço_venda = scanner.nextLine();
            System.out.println("qual a descrição do item?");
            String descriçao = scanner.nextLine();
            System.out.println("qual a data de validade do produto?");
            String data_validade = scanner.nextLine();
            System.out.println("qual o custo do produto no distribuidor?");
            String preço_custo = scanner.nextLine();
            System.out.println("qual a quantia em estoque do produto?");
            String estoque = scanner.nextLine();
            System.out.println("qual o codigo do distribuidor?");
            String dist_cod_dist = scanner.nextLine();

            java.util.Date utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(data_validade);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            stmt = con.prepareStatement("INSERT INTO produtos(preço_venda, descriçao, data_validade, preço_custo, estoque, dist_cod_dist) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1,preço_venda);
            stmt.setString(2,descriçao);
            stmt.setDate(3,sqlDate);
            stmt.setString(4,preço_custo);
            stmt.setString(5,estoque);
            stmt.setString(6,dist_cod_dist);

            stmt.executeUpdate();

            System.out.println("Produto salvo com sucesso");

        }catch (SQLException | ParseException ex){
            System.out.println("erro ao salvar: " + ex);
        }finally {
            ConnectionFactory.closeConnection(con,stmt,null);
        }
    }
}

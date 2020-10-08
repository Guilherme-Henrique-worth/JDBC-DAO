/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteDAO;

import connection.ConnectionFactory;
import models.Vendas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilh
 */
public class VendasDAO {
    public static void create(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt= null;

        try{
            Scanner scanner =  new Scanner(System.in);

            System.out.println("qual a data e a hora da compra?");
            String data_hora = scanner.nextLine();
            System.out.println("qual o total da compra?");
            String total = scanner.nextLine();
            System.out.println("qual o codigo do cliente?");
            String cli_cod_cli = scanner.nextLine();

            Date utilDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(data_hora);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            stmt = con.prepareStatement("INSERT INTO vendas(data_hora, total, cli_cod_cli) VALUES(?, ?, ?)");
            stmt.setDate(1,sqlDate);
            stmt.setString(2,total);
            stmt.setString(3,cli_cod_cli);
            stmt.executeUpdate();

            System.out.println("venda salva com sucesso!");

        }catch (SQLException | ParseException ex){
            System.out.println("erro ao salvar: "+ex);
        }finally {
            ConnectionFactory.closeConnection(con,stmt,null);
        }
    }
}

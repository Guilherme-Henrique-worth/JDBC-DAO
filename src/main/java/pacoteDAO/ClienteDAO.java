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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilh
 */
public class ClienteDAO {
    public static void create(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("qual o nome do cliente?");
            String nome = scanner.nextLine();
            System.out.println("qual a data de nascimento?");
            String data_nasc= scanner.nextLine();
            System.out.println("qual o endereço?");
            String endereço= scanner.nextLine();
            System.out.println("qual o telefone");
            String telefone= scanner.nextLine();
            System.out.println("qual o email");
            String email= scanner.nextLine();

            java.util.Date utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(data_nasc);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            
            stmt = con.prepareStatement("INSERT INTO cliente (nome, data_nasc, endereço, telefone, email) VALUES (?,?,?,?,?)");           
            stmt.setString(1,nome);
            stmt.setDate(2,sqlDate);
            stmt.setString(3,endereço);
            stmt.setString(4,telefone);
            stmt.setString(5,email);
            stmt.executeUpdate();
            
            System.out.println("Cliente salvo com sucesso!");
        }catch(SQLException ex){
            System.out.println("erro ao salvar: "+ex);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt,null);
        }
    }   
}

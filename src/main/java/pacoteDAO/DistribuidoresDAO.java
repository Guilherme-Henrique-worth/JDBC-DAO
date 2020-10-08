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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilh
 */
public class DistribuidoresDAO {
    public static void create() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("qual o nome fantasia?");
            String nome_fantasia = scanner.nextLine();
            System.out.println("qual a razão social?");
            String razao_social = scanner.nextLine();
            System.out.println("qual o telefone");
            String telefone = scanner.nextLine();
            System.out.println("qual o email?");
            String email = scanner.nextLine();

            stmt = con.prepareStatement("INSERT INTO distribuidores (nome_fantasia, razao_social, telefone, email) VALUES (?,?,?,?)");
            stmt.setString(1, nome_fantasia);
            stmt.setString(2, razao_social);
            stmt.setString(3, telefone);
            stmt.setString(4, email);
            stmt.executeUpdate();

            System.out.println("distribuidor salvo com sucesso");

        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con,stmt,null);
        }
        }
    }
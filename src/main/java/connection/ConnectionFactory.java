/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




/**
 *
 * @author guilh
 */
public class ConnectionFactory {
    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String DATABASE_URL = "jdbc:mysql://localhost:1433/lpbdalpoo";
    Connection connection = null;

    
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(DATABASE_URL,"root","1313");
        }catch(SQLException|ClassNotFoundException ex){
            throw new RuntimeException("Erro de conexao",ex);
        }
    }

public static void closeConnection(Connection con,PreparedStatement stmt, ResultSet rs){
        
    try{
        if(rs != null){
            rs.close();
        }if(con != null){
            con.close();
        }if(stmt != null){
            stmt.close();
        }
            
        
            
    }catch (SQLException ex){
        System.out.println("erro ao fechar conexão:"+ex);
    }
}




}
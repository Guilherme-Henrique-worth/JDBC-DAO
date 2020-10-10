package listagem;

import connection.ConnectionFactory;
import models.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteEmail {
    public static List<Cliente> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> cliList = new ArrayList<Cliente>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE email is null");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setCod_cli(rs.getInt("cod_cli"));
                cli.setNome(rs.getString("nome"));
                cli.setData_nasc(rs.getDate("data_nasc"));
                cli.setEndereço(rs.getString("endereço"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setEmail(rs.getString("email"));
                cliList.add(cli);
            }

        } catch (SQLException ex) {
            System.out.println("erro ao exibir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cliList;
    }

}

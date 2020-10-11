package listagem;

import connection.ConnectionFactory;
import models.Vendas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ValorTotal {
    public static List<ValorTotal> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ValorTotal> ValorTotalList = new ArrayList<ValorTotal>();

        try {
            stmt = con.prepareStatement("");
            rs = stmt.executeQuery();

            while (rs.next()) {

                ValorTotal val = new ValorTotal();



                ValorTotalList.add(val);
            }


        } catch (SQLException ex) {
            System.out.println("erro ao exibir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ValorTotalList;
    }

}


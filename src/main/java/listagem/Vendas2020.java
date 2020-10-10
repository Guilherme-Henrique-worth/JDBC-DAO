package listagem;

import connection.ConnectionFactory;
import models.Produtos;
import models.Vendas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vendas2020 {
    public static List<Vendas> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Vendas> vendasList = new ArrayList<Vendas>();

        try {
            stmt = con.prepareStatement("select cli_cod_cli,count(*) as 'quantidade' from vendas group by cli_cod_cli");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Vendas ven = new Vendas();


                ven.setCli_cod_cli(rs.getInt("cli_cod_cli"));
                ven.setQuantidade((rs.getInt("quantidade")));

                vendasList.add(ven);
            }


        } catch (SQLException ex) {
            System.out.println("erro ao exibir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return vendasList;
    }

}


package listagem;

import connection.ConnectionFactory;
import models.Cliente;
import models.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoVencido {
    public static List<Produtos> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produtos> proList = new ArrayList<Produtos>();

        try {
            stmt = con.prepareStatement("select * from produtos where data_validade < current_date()  ");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos pro = new Produtos();
                pro.setCod_prod(rs.getInt("cod_prod"));
                pro.setPreço_venda(rs.getInt("preço_venda"));
                pro.setDescriçao(rs.getString("descriçao"));
                pro.setData_validade(rs.getDate("data_validade"));
                pro.setPreço_custo(rs.getInt("preço_custo"));
                pro.setEstoque(rs.getInt("estoque"));
                pro.setDist_cod_dist(rs.getInt("dist_cod_dist"));
                proList.add(pro);
            }

        } catch (SQLException ex) {
            System.out.println("erro ao exibir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return proList;
    }

}
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moraes Torres
 * 
 */
public class PagamentoDAO {

    Connection con = null;
    PreparedStatement ps = null;

    //OPERAÇÕES 
    //INSERT
    public void incluirPagamento(int id, int ida, int idm) {
        ConexaoDAO conexao = new ConexaoDAO();
        con = conexao.obterConexao();
        String sql = "INSERT INTO pagamentos (pkpagamentos, fkassociado, fkmensalidade, dtpagamento) VALUES(?, ?, ?, CURDATE())";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, ida);
            ps.setInt(3, idm);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Pagamento realizado com SUCESSO!");
        } catch (SQLException e) {
            System.out.println("Erro no incluirPagamento(): " + e.getMessage());
        }
    }

    //MÉTODO PARA OBTER A ULTIMA PK DE ASSOCIADO
    public ResultSet obterUltimoPagamento() {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT MAX(pkpagamentos) AS pkpagamentos FROM pagamentos";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Associado obtido com sucesso");
        } catch (Exception e) {
            System.out.println("Erro no obterUltimoPagamento(): " + e.getMessage());
        }//Fim catch
        return rs;
    }
}

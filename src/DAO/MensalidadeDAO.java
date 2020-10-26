package DAO;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moraes Torres
 * 
 */

public class MensalidadeDAO {

    Connection con = null;
    PreparedStatement ps = null;

    //OPERAÇÕES INSERT, UPDATE
    //INSERT
    public void incluirMensalidade(int id, String nome, float vl, Date data) {
        ConexaoDAO conexao = new ConexaoDAO();
        con = conexao.obterConexao();
        String sql = "INSERT INTO mensalidades (pkmensalidade, txnomemes, vlmensalidade, dtmensalidade) VALUE (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nome);
            ps.setFloat(3, vl);
            ps.setDate(4, (java.sql.Date) data);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Mensalidade Incluida com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro no incluirMensalidade: " + e.getMessage());
        }

    }

    //UPDATE
    public void alterarMensalidade(int id, String nome, float vl, Date data) {
        ConexaoDAO conexao = new ConexaoDAO();
        con = conexao.obterConexao();
        String sql = "UPDATE mensalidades SET txnomemes=  ?  , vlmensalidade=? , dtmensalidade= ? WHERE pkmensalidade = ?";
        try {
            ps = con.prepareCall(sql);
            ps.setString(1, nome);
            ps.setFloat(2, vl);
            ps.setDate(3, (java.sql.Date) data);
            ps.setInt(4, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mensalidade Alterada com Sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no alterarMensalidade:" + e.getMessage());
        }

    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //METODOS COMPLEMENTARES
    public ResultSet verificaMensalidade(Date data) {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT pkmensalidade FROM mensalidades WHERE dtmensalidade = ?";
            ps = con.prepareStatement(sql);
            ps.setDate(1, (java.sql.Date) data);
            rs = ps.executeQuery();
            System.out.println("Mensalidade obtidos com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no verificarMensalidade:" + e.getMessage());
        }//Fim catch
        return rs;
    }

    //MÉTODO PARA OBTER OS DADOS PARA A TABELA MENSALIDADES
    public ResultSet tabelaMensalidades() {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT pkmensalidade, txnomemes, vlmensalidade FROM mensalidades ORDER BY dtmensalidade";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Mensalidades obtidas com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no tabelaMensalidade:" + e.getMessage());
        }//Fim catch
        return rs;
    }

    //MÉTODO PARA OBTER A ULTIMA 'PK' DA TABELA MENSALIDADES
    public ResultSet obterUltimaMensalidade() { // metodo para "pegar" a ultima pk de mensalidades
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT MAX(pkmensalidade) AS pkmensalidade FROM mensalidades";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Mensalidade obtida com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no obterUltimaMensalidade:" + e.getMessage());
        }//Fim catch
        return rs;
    }

    //MÉTODO PARA PESQUISAR A MENSALIDADE POR 'MÊS'
    public ResultSet pesquisarPorMes(String nome) {
        ResultSet rs = null;
        ConexaoDAO conexao = new ConexaoDAO();
        con = conexao.obterConexao();
        try {
            String sql = "SELECT * FROM mensalidades WHERE txnomemes LIKE ?";
            ps = con.prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO PESQUISAR!");
            System.out.println(e.getMessage());
        }
        return rs;
    }

    //MÉTODO PARA OBTER A DATA DE UMA MESALIDADE ESPECIFICA
    public ResultSet selecionarDataMensalidade(int id) {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT dtmensalidade FROM mensalidades WHERE pkmensalidade = ? ";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            System.out.println("Data de entrada do Mensalidade obtidos com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO em seleciaonarDataMensalidade():" + e.getMessage());
        }//Fim catch
        return rs;
    }

    //MÉTODO PARA OBTER TODOS AS MENSALIDADES QUE NÃO FORAM PAGAS POR 1 ASSOCIADO EM ESPECIFICO
    public ResultSet selecionarMensalidadesNaoPagas(int id, Date data) {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT * FROM mensalidades WHERE dtmensalidade >= ? EXCEPT (SELECT mensalidades.* FROM mensalidades, pagamentos, associados WHERE pkmensalidade = fkmensalidade AND fkassociado = pkassociado AND dtmensalidade >= ? AND pkassociado= ?) ORDER BY dtmensalidade ";
            ps = con.prepareStatement(sql);
            ps.setDate(1, (java.sql.Date) data);
            ps.setDate(2, (java.sql.Date) data);
            ps.setInt(3, id);
            rs = ps.executeQuery();
            System.out.println("Mensalidades não pagas selecionadas com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO em selecionarMensalidadesNaoPagas():" + e.getMessage());
        }//Fim catch
        return rs;
    }

}

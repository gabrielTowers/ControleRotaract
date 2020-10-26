package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moraes Torres
 * 
 */

public class AssociadoDAO {

    Connection con = null;
    PreparedStatement ps = null;

    //OPERAÇÕES INSERT, UPDATE E DELETE
    //INSERT
    public void incluirAssociado(int id, String nome, int cargo, Date data) {
        ConexaoDAO conexao = new ConexaoDAO();
        con = conexao.obterConexao();
        String sql = "INSERT INTO associados (pkassociado, txnomeassociado, fkcargo, dtentradaassociado) VALUE (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nome);
            ps.setInt(3, cargo);
            ps.setDate(4, (java.sql.Date) data);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Associado Incluido com sucesso");
        } catch (SQLException e) {
            System.err.println("Erro ao incluir: " + e);
        }

    }

    //UPDATE
    public void alterarAssociado(int pk, String nome, int fk) {
        ConexaoDAO conexao = new ConexaoDAO();
        con = conexao.obterConexao();
        String sql = "UPDATE associados SET txnomeassociado=  ?  , fkcargo=? WHERE pkassociado = ?";
        try {
            ps = con.prepareCall(sql);

            ps.setString(1, nome);
            ps.setInt(2, fk);
            ps.setInt(3, pk);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Associado Alterado com Sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no alterar-Associado:" + e.getMessage());
        }

    }

    //DELETE
    public void excluirAssociado(int id) {
        ConexaoDAO conexao = new ConexaoDAO();
        con = conexao.obterConexao();
        String sql = "DELETE FROM associados WHERE pkassociado = ?";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Associado Excluido com Sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no alterar-Associado:" + e.getMessage());
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //MÉTODOS COMPLEMENTARES
    //MÉTODO PARA VERIFICAR SE JÁ EXISTE ALGUM ASSOCIADO COM O NOME QUE ESTÁ TENTANDO INCLUIR OU ALTERAR
    public ResultSet verificaAssociado(String nome) {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT pkassociado FROM associados WHERE txnomeassociado LIKE ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            rs = ps.executeQuery();
            System.out.println("Associados verificado com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no verificarAssociado:" + e.getMessage());
        }//Fim catch
        return rs;
    }

    //MÉTODO PARA OBTER A ULTIMA PK DE ASSOCIADO
    public ResultSet obterUltimoAssociado() { // metodo para contar o numero de linhas da tabela e retornar esse valor
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT MAX(pkassociado) AS pkassociado FROM associados";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Associado obtido com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO AO OBTER ASSOCIADO!");
            System.out.println(e.getMessage());
        }//Fim catch
        return rs;
    }

    //MÉTODO PARA POPULAR A TABELA ASSOCIADOS
    public ResultSet tabelaAssociados() {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT pkassociado, txnomeassociado, txcargo FROM associados, cargos WHERE fkcargo=pkcargo ORDER BY txnomeassociado";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Tabela associados obtida com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO AO OBTER ASSOCIADO!");
            System.out.println(e.getMessage());
        }//Fim catch
        return rs;
    }

    //MÉTODO PARA PESQUISAR O ASSOCIADO PELO NOME
    public ResultSet pesquisarPorNome(String nome) {
        ResultSet rs = null;
        ConexaoDAO conexao = new ConexaoDAO();
        con = conexao.obterConexao();
        try {
            String sql = "SELECT * FROM associados, cargos WHERE fkcargo=pkcargo AND txnomeassociado LIKE ?";
            ps = con.prepareCall(sql);
            ps.setString(1, nome + "%");
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO PESQUISAR!");
            System.out.println(e.getMessage());
        }
        return rs;
    }

    //
    public ResultSet selecionarAssociado(int id) {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT * FROM associados WHERE pkassociado = ? ";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            System.out.println("Associado selecionado com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO AO SELECIONAR ASSOCIADO!");
            System.out.println(e.getMessage());
        }//Fim catch
        return rs;
    }

    //MÉTODO PARA SELECIONAR A DATA DO ASSICOADO
    public ResultSet selecionarDataAssociado(int id) {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT dtentradaassociado FROM associados WHERE pkassociado = ? ";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            System.out.println("Data de entrada do Associado obtido com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO em seleciaonarDataAssociado():" + e.getMessage());
        }//Fim catch
        return rs;
    }
    
    //MÉTODO PARA PESQUISAR O ASSOCIADO Q PAGOU A MENSALIDADE
    public ResultSet pesquisaAssociadoPag(String nome) {
        ResultSet rs = null;
        ConexaoDAO conexao = new ConexaoDAO();
        con = conexao.obterConexao();
        try {
            String sql = "SELECT pkassociado, dtentradaassociado FROM associados, cargos WHERE txnomeassociado LIKE ?";
            ps = con.prepareCall(sql);
            ps.setString(1, nome);
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO PESQUISAR!");
            System.out.println(e.getMessage());
        }
        return rs;
    }
}

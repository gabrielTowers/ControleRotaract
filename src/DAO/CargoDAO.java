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

public class CargoDAO {

    Connection con = null;
    PreparedStatement ps = null;

    //INSERT
    public void incluirCargo(int id, String nome) {
        ConexaoDAO conexao = new ConexaoDAO();
        con = conexao.obterConexao();
        String sql = "INSERT INTO cargos (pkcargo, txcargo) VALUE (?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nome);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cargo incluido com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao incluirCargo(): " + e.getMessage());
        }
    }

    //UPDATE
    public void alterarCargo(int pk, String nome) {
        ConexaoDAO conexao = new ConexaoDAO();
        con = conexao.obterConexao();
        String sql = "UPDATE cargos SET txcargo=  ?  WHERE pkcargo = ?";
        try {
            ps = con.prepareCall(sql);

            ps.setString(1, nome);
            ps.setInt(2, pk);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cargo Alterado com Sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no alterarCargp():" + e.getMessage());
        }

    }

    //DELETE
    public void excluirCargo(int id) {
        ConexaoDAO conexao = new ConexaoDAO();
        con = conexao.obterConexao();
        String sql = "DELETE FROM cargos WHERE pkcargo = ?";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cargo Excluido com Sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no excluirCargo():" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possivel EXCLUIR o Cargo, verifique se tem algum Associado com esse Cargo");
        }
    }

    //MÉTODO PARA OBERTER TODOS OS CARGOS PARA COLOCAR NA "jComboBox"
    public ResultSet obterCargoParaCB() {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT * FROM cargos ORDER BY txcargo";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Cargos obtidos com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no obterCargoParaCB(): " + e.getMessage());
        }//Fim catch
        return rs;
    }

    //MÉTODO PARA OBTER A ULTIMA PK DE CARGO
    public ResultSet obterUltimoCargo() { // metodo para contar o numero de linhas da tabela e retornar esse valor
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT MAX(pkcargo) AS pkcargo FROM cargos";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Ultimo Cargo obtido com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no obterUltimoCargo():" + e.getMessage());
        }//Fim catch
        return rs;
    }

    //MÉTODO PARA SELECIONAR O CARGO DA TABELA "cargos" E ENCONTAR A K REFERENTE A ELE 
    public ResultSet selecionarCargo(String cargo) {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT * FROM cargos WHERE txcargo = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, cargo);
            rs = ps.executeQuery();
            System.out.println("Cargo selecionado com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no selecionarCargo():" + e.getMessage());
        }//Fim catch
        return rs;
    }

    //MÉTODO PARA POPULAR A TABELA jTable
    public ResultSet tabelaCargos() {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT pkcargo, txcargo FROM cargos ORDER BY pkcargo";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Tabela Cargos obtido com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no tabelaCargos():" + e.getMessage());
        }//Fim catch
        return rs;
    }

    //MÉTODO PARA VERIFICAR SE JÁ EXISTE ALGUM CARGO COM O NOME QUE ESTÁ TENTANDO INCLUIR OU ALTERAR
    public ResultSet verificarCargo(String nome) {
        ResultSet rs = null;
        try {
            ConexaoDAO conexao = new ConexaoDAO();
            con = conexao.obterConexao();
            String sql = "SELECT pkcargo FROM cargos WHERE txcargo LIKE ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            rs = ps.executeQuery();
            System.out.println("Cargo verificado com sucesso");
        } catch (Exception e) {
            System.out.println("ERRO no verificarCargo():" + e.getMessage());
        }//Fim catch
        return rs;
    }
}

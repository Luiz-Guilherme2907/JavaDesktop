/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.util.ArrayList;
import Model.Emprestimos;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author NEX
 */
public class EmprestimosDAO {

    private final Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Emprestimos> listaEmp = new ArrayList<>();

    public EmprestimosDAO(Connection connection) {
        this.connection = connection;
    }

    /* public static void main(String[] args) throws SQLException {
       Connection conexao = new Conexao().getConnection();
        EmprestimosDAO emprestimosDAO = new EmprestimosDAO(conexao);
        
        Emprestimos emprestimos = new Emprestimos(1, 1, LocalDateTime.now(), LocalDateTime.now());
        emprestimosDAO.insertBD(emprestimos);
        
    }*/
    //Inserir amigos no banco
    public void insertBD(Emprestimos emprestimos) throws SQLException {

        String sql = "INSERT INTO emprestimos (idAmigo, idFerramenta, dataEmprestimo, dataDevolucao, estaEmprestada) VALUES ('" + emprestimos.getIdAmigos() + "', '" + emprestimos.getIdFerramentas() + "', '" + emprestimos.getDataEmprestimo() + "', '" + emprestimos.getDataDevolucao() + "', '" + 1 + "'); ";
        ps = connection.prepareStatement(sql);
        ps.execute();
        connection.close();
    }

    public ArrayList<Emprestimos> listarEmprestimos() throws SQLException {

        String sql = "SELECT * FROM emprestimos";
        ArrayList<Emprestimos> lista = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Date data = rs.getDate("dataEmprestimo");

                Date data1 = rs.getDate("dataDevolucao");
                Date data2 = rs.getDate("dataDevolvida");

                Emprestimos emprestimos = new Emprestimos();
                emprestimos.setDataDevolucao(Util.Util.converterData(data1));
                emprestimos.setDataEmprestimo(Util.Util.converterData(data));
                //emprestimos.setDataDevolvida(Util.Util.converterData(data2));
                emprestimos.setId(rs.getInt("id"));
                emprestimos.setIdAmigos(rs.getInt("idAmigo"));
                emprestimos.setIdFerramentas(rs.getInt("idFerramenta"));
                emprestimos.setEstaEmprestada(rs.getInt("estaEmprestada"));

                lista.add(emprestimos);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimosDAO ListaEmp()" + erro);

        }
        connection.close();
        return lista;

    }

    /* public ArrayList<Emprestimos> listarEmprestimosEmprestada() throws SQLException {
//Verificar sitax
        String sql = "SELECT * FROM emprestimos WHRERE estaEmprestada = ?";
        ArrayList<Emprestimos> lista = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            ps.setBoolean(1, true);
            rs = ps.executeQuery();

            while (rs.next()) {
                Date data = rs.getDate("dataEmprestimo");

                Date data1 = rs.getDate("dataDevolucao");

                Emprestimos emprestimos = new Emprestimos();
                emprestimos.setDataDevolucao(Util.Util.converterData(data1));
                emprestimos.setDataEmprestimo(Util.Util.converterData(data));
                emprestimos.setId(rs.getInt("id"));
                emprestimos.setIdAmigos(rs.getInt("idAmigo"));
                emprestimos.setIdFerramentas(rs.getInt("idFerramenta"));

                lista.add(emprestimos);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimosDAO ListaEmp()" + erro);

        }
        connection.close();
        return lista;

    }*/
    public void updateEmprestimos(int estaEmprestada, int id) {
        String sql = "UPDATE emprestimos SET estaEmprestada = ? WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);

            //add valores que deseja atualizar
            ps.setInt(1, estaEmprestada);
//Em testes!!!!{           
// ps.setDate(id, new Date());}
            //Qual o id do registro
            ps.setInt(2, id);

            //executar a query
            ps.execute();
            //fehcar conexao
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro em update emprestimos" + ex);
        }

    }

    public Emprestimos buscarEmprestimo(int id) throws SQLException {
        Emprestimos emprestimos = new Emprestimos();
        String sql = "SELECT * FROM emprestimos WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                emprestimos.setId(rs.getInt("id"));
                emprestimos.setIdFerramentas(rs.getInt("idFerramenta"));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO BuscarEmprestimo()" + erro);

        }
        connection.close();
        return emprestimos;
    }

    public List<Emprestimos> relatorioAmigos(int idAmigo) throws SQLException {

        String sql = "SELECT * FROM emprestimos WHERE idAmigo = ?";
        ArrayList<Emprestimos> lista = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, idAmigo);
            rs = ps.executeQuery();

            while (rs.next()) {
                Emprestimos emprestimos = new Emprestimos();
                emprestimos.setIdAmigos(rs.getInt("idAmigo"));
                emprestimos.setIdFerramentas(rs.getInt("idFerramenta"));
                lista.add(emprestimos);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO relatorioAmigos()" + erro);

        }
        connection.close();
        return lista;

    }

    public void updateDataDevolucao(Emprestimos emprestimos, int id) {
        String sql = "UPDATE emprestimos SET dataDevolucao = ? WHERE id = ?";
        LocalDate localDate = emprestimos.getDataDevolucao();
        java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
        try {
            ps = connection.prepareStatement(sql);

            //add valores que deseja atualizar
            ps.setDate(1, sqlDate);

            //Qual o id do registro
            ps.setInt(2, id);

            //executar a query
            ps.execute();
            //fehcar conexao
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro em update data devolução " + ex);
        }

    }

}

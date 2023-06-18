/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.AmigosDAO;
import DAO.Conexao;
import DAO.EmprestimosDAO;
import DAO.FerramentaDAO;
import DTO.EmprestimosDTO;
import Model.Amigos;
import Model.Emprestimos;
import Model.Ferramentas;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import View.TelaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class ListaAmigosFerramentasController {

    private TelaPrincipal view;

    public ListaAmigosFerramentasController(TelaPrincipal view) {
        this.view = view;
    }

    public void listarAmigos() {
        //Faz a coenxao com a classe e manda os dados para a tela dentro da tabela;
        try {
            Connection conexao = new Conexao().getConnection();
            AmigosDAO amigosdao = new AmigosDAO(conexao);

            DefaultTableModel model = (DefaultTableModel) view.getTable_amigos().getModel();
            model.setNumRows(0);

            ArrayList<Amigos> lista = amigosdao.listarAmigos();

            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getEmail(),
                    lista.get(i).getTelefone(),});

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Amigos" + erro);

        }

    }

    public void listarFerramentas() {
        //Faz a coenxao com a classe e manda os dados para a tela dentro da tabela;
        try {
            Connection conexao = new Conexao().getConnection();
            FerramentaDAO ferramentaDAO = new FerramentaDAO(conexao);

            DefaultTableModel model = (DefaultTableModel) view.getTable_ferramentas().getModel();
            model.setNumRows(0);

            ArrayList<Ferramentas> lista = ferramentaDAO.listarFerramentas();

            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getMarca(),
                    lista.get(i).getPreco(),});

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Ferramentas" + erro);

        }

    }

    public void listarEmprestimos() {
        //Faz a coenxao com a classe e manda os dados para a tela dentro da tabela;
        try {
            Connection conexao1 = new Conexao().getConnection();
            FerramentaDAO ferramentaDAO = new FerramentaDAO(conexao1);

            ArrayList<Ferramentas> listaFerramentas = ferramentaDAO.listarFerramentas();

            Connection conexao2 = new Conexao().getConnection();

            AmigosDAO amigosDAO = new AmigosDAO(conexao2);
            ArrayList<Amigos> listaAmigos = amigosDAO.listarAmigos();

            Connection conexao = new Conexao().getConnection();
            EmprestimosDAO emprestimodao = new EmprestimosDAO(conexao);

            DefaultTableModel model = (DefaultTableModel) view.getTabelaEmprestimo().getModel();
            model.setNumRows(0);

            ArrayList<EmprestimosDTO> lista = new ArrayList<>();
            ArrayList<Emprestimos> listaBD = emprestimodao.listarEmprestimos();

            for (Emprestimos emprestimos : listaBD) {

                Ferramentas ferramentas = buscarFerramentas(emprestimos.getIdFerramentas(), listaFerramentas);
                Amigos amigos = busqueAmigo(emprestimos.getIdAmigos(), listaAmigos);
                System.out.println(amigos);
                if (amigos != null && ferramentas != null && emprestimos.getEstaEmprestada() == 1) {
                    EmprestimosDTO emprestimosDTO = new EmprestimosDTO(emprestimos.getId(), amigos.getNome(), ferramentas.getNome(), Util.Util.converterData(emprestimos.getDataDevolucao()), Util.Util.converterData(emprestimos.getDataEmprestimo()));
                    model.addRow(new Object[]{
                        emprestimosDTO.getId(),
                        emprestimosDTO.getAmigo(),
                        emprestimosDTO.getFerramenta(),
                        emprestimosDTO.getDataEmprestimo(),
                        emprestimosDTO.getDataDevolucao()

                    });
                }

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Ferramentas" + erro);

        }

    }

    private Amigos busqueAmigo(int id, ArrayList<Amigos> listaAmigos) {
        Amigos amigos = null;
        for (Amigos amigo : listaAmigos) {
            if (amigo.getId() == id) {
                amigos = amigo;

            }

        }
        return amigos;

    }

    private Ferramentas buscarFerramentas(int id, ArrayList<Ferramentas> listaFerramentas) {
        Ferramentas ferramentas = null;
        for (Ferramentas ferramenta : listaFerramentas) {

            if (ferramenta.getId() == id) {
                ferramentas = ferramenta;

            }

        }
        return ferramentas;

    }
    
     public int buscarQuantidade(int idAmigo,ArrayList<Emprestimos> lista1){
        
        int quantidadeFerramenta = 0;
        
        for(int i = 0; i < lista1.size(); i++){
        
            if(lista1.get(i).getIdAmigos() == idAmigo){
                    quantidadeFerramenta++;
            
            }
        
        }
        return quantidadeFerramenta;
    }
    
    public void relatorio(){
        System.out.println("Controller.ListaAmigosFerramentasController.relatorio()");
          try {
            Connection conexao = new Conexao().getConnection();
            AmigosDAO amigosDAO = new AmigosDAO(conexao);

            DefaultTableModel model = (DefaultTableModel) view.getTableRelatorio().getModel();
            model.setNumRows(0);

            ArrayList<Amigos> lista = amigosDAO.listarAmigos();
            
            Connection conexao1 = new Conexao().getConnection();
            EmprestimosDAO emprestimosDAO = new EmprestimosDAO(conexao1);
             ArrayList<Emprestimos> lista1 = emprestimosDAO.listarEmprestimos();
            for (int i = 0; i < lista.size(); i++) {
                int quantidade = buscarQuantidade(lista.get(i).getId(), lista1);
                model.addRow(new Object[]{  
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    quantidade 
                    
                });
                    
            }
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Amigos" + erro);

        }
    
    
    }
    
    public void updateDate(){
        int id = Integer.parseInt(view.getIdid().getText());
        
        String dataDevolucao = view.getTxtDated().getText();
        Emprestimos emprestimos = new Emprestimos();
        emprestimos.setDataDevolucao(Util.Util.converterData(dataDevolucao));
        Connection conexao = new Conexao().getConnection();
        EmprestimosDAO emprestimosDAO = new EmprestimosDAO(conexao);
        
        emprestimosDAO.updateDataDevolucao(emprestimos, id);
        JOptionPane.showMessageDialog(null, "Data Alterada com sucesso!");
        
        
    
    
    }
}

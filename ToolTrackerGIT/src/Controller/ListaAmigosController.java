/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.AmigosDAO;
import DAO.Conexao;
import DAO.EmprestimosDAO;
import Model.Amigos;
import Model.Emprestimos;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import View.TelaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class ListaAmigosController {

    private TelaPrincipal view;

    public ListaAmigosController(TelaPrincipal view) {
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

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Amigos" + erro);

        }
            
       
    }
    
    /*public int buscarQuantidade(int idAmigo,ArrayList<Emprestimos> lista1){
        
        int quantidadeFerramenta = 0;
        
        for(int i = 0; i < lista1.size(); i++){
        
            if(lista1.get(i).getIdAmigos() == idAmigo){
                    quantidadeFerramenta++;
            
            }
        
        }
        return quantidadeFerramenta;
    }
    
    public void relatorio(){
        
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
                    lista.get(i).getNome(),
                    quantidade 
                    
                });
                    
            }
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Amigos" + erro);

        }
    
    
    }*/
     
}

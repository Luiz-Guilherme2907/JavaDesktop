/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import View.TelaPrincipal;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Guilherme
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        
        TelaPrincipal TP = new TelaPrincipal();
        TP.setVisible(true);
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH) + 1; // Mês começa em 0, então adicionamos 1
        int ano = calendar.get(Calendar.YEAR);

        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
        
//     Connection conexao = new Conexao().getConnection();
//        EmprestimosDAO emprestimosDAO = new EmprestimosDAO(conexao);
//        List<Emprestimos> lista = emprestimosDAO.relatorioAmigos(1);
//        System.out.println(lista.get(1).getIdAmigos());
//        System.out.println(lista.get(1).getIdFerramentas());
//        System.out.println(data);
    }
}

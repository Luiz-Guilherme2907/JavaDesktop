package View;

import Controller.ListaAmigosFerramentasController;
import DAO.Conexao;
import DAO.EmprestimosDAO;
import DAO.FerramentaDAO;
import Model.Emprestimos;
import Model.Ferramentas;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/*
IMPORTANTE, EM CASO DE ERRO NO CÓDIGO, Verifique o caminho das imagens em todas as classes View

É simples, vá ate sua pasta do netbeans no explorador de arquivos e encontre o projeto do ToolTracker, depois copie e cole seu caminho
sobrescrevendo o existente até a parte (facul)


exemplo antes : "C:\\Users\\caiop\\OneDrive\\Documentos\\NetBeansProjects\\Facul\\ToolTracker\\src\\I_Icons\\lua_tema.png"));

exemplo depois: "C:\\Users\\SeuZÉ\\Documentos\\NetBeansProjects\\ToolTracker\\src\\I_Icons\\lua_tema.png")); 

 */

 /*
author @Caio / @Guilherme
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private boolean b_editarOuDeletar;

    public static boolean tema = true;   // True = Claro / False = Escuro //

    private final ListaAmigosFerramentasController controller;

    //Indica qual tela é mostrada
    private boolean cardHome = true;
    private boolean cardAmigos = false;
    private boolean cardFerramentas = false;
    private boolean cardRelatorio = false;

    public TelaPrincipal() {
        initComponents();
        //Colocando o icone do Sistema/Janela
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/ToolTracker Logo Oficial.png")).getImage());

        this.label_indicar_sair.setVisible(false);

        controller = new ListaAmigosFerramentasController(this);

        // Codigo para iniciar os carregamentos de tabelas.
        controller.listarAmigos();
        controller.listarFerramentas();
        controller.listarEmprestimos();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPop_botoes = new javax.swing.JPopupMenu();
        popupHome = new javax.swing.JMenuItem();
        popupAmigos = new javax.swing.JMenuItem();
        popupFerramentas = new javax.swing.JMenuItem();
        popupRelatorio = new javax.swing.JMenuItem();
        Separator_botoes = new javax.swing.JPopupMenu.Separator();
        popupOpcoes = new javax.swing.JMenuItem();
        popupSair = new javax.swing.JMenuItem();
        JPop_Home = new javax.swing.JPopupMenu();
        popup_home_RE = new javax.swing.JMenuItem();
        Separator_home = new javax.swing.JPopupMenu.Separator();
        popup_home_refresh = new javax.swing.JMenuItem();
        JPop_Amigos = new javax.swing.JPopupMenu();
        popup_amigos_cadastrar = new javax.swing.JMenuItem();
        Separator_amigos = new javax.swing.JPopupMenu.Separator();
        popup_amigos_refresh = new javax.swing.JMenuItem();
        JPop_Ferramentas = new javax.swing.JPopupMenu();
        popup_ferramentas_cadastrar = new javax.swing.JMenuItem();
        Separator_ferramentas = new javax.swing.JPopupMenu.Separator();
        popup_ferramentas_refresh = new javax.swing.JMenuItem();
        divisoria = new javax.swing.JPanel();
        JP_Principal = new javax.swing.JPanel();
        JP_Home = new javax.swing.JPanel();
        painelDataDevolucao = new javax.swing.JPanel();
        b_alterarDataDevolução = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idid = new javax.swing.JTextField();
        MaskFormatter maskFormatter = null;
        try{
            maskFormatter = new MaskFormatter("##/##/####");
        }catch(Exception e){
            e.printStackTrace();
        }
        txtDated = new javax.swing.JFormattedTextField(maskFormatter);
        b_fechar_edicao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        label_fundo_editarEmprestimos = new javax.swing.JLabel();
        realizarEmprestimo = new javax.swing.JButton();
        CadastrarAmigoHome = new javax.swing.JButton();
        CadastrarFerramentaHome = new javax.swing.JButton();
        devolverEmprestimo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaEmprestimo = new javax.swing.JTable();
        b_refreshEmprestimos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label_titulo_home = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        editarEmprestimo = new javax.swing.JButton();
        label_fundo_home = new javax.swing.JLabel();
        JP_ListaAmigos = new javax.swing.JPanel();
        label_titulo_amigos = new javax.swing.JLabel();
        b_cadastrarAmigos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_amigos = new javax.swing.JTable();
        b_editarAmigo = new javax.swing.JButton();
        deleteAmigo = new javax.swing.JButton();
        atualizarTabela = new javax.swing.JButton();
        label_logo_amigos = new javax.swing.JLabel();
        label_fundo_amigos = new javax.swing.JLabel();
        JP_ListaFerramentas = new javax.swing.JPanel();
        label_titulo_ferramentas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_ferramentas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        b_cadastrarFerramenta = new javax.swing.JButton();
        b_editarFerramenta = new javax.swing.JButton();
        b_apagarFerramenta = new javax.swing.JButton();
        AtualizarFerramentas = new javax.swing.JButton();
        label_fundo_ferramentas = new javax.swing.JLabel();
        JP_Relatorio = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableRelatorio = new javax.swing.JTable();
        label_titulo_relatorio = new javax.swing.JLabel();
        b_relatorioDetalhado = new javax.swing.JButton();
        label_fundo_relatorio = new javax.swing.JLabel();
        JP_Lista = new javax.swing.JPanel();
        b_mudarTema = new javax.swing.JButton();
        b_Home = new javax.swing.JButton();
        b_ListaAmigos = new javax.swing.JButton();
        b_ListaFerramentas = new javax.swing.JButton();
        b_relatorio = new javax.swing.JButton();
        b_opcoes = new javax.swing.JButton();
        label_sair = new javax.swing.JLabel();
        label_indicar_sair = new javax.swing.JLabel();
        label_botoes = new javax.swing.JLabel();

        popupHome.setText("Home");
        popupHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupHomeActionPerformed(evt);
            }
        });
        JPop_botoes.add(popupHome);

        popupAmigos.setText("Amigos");
        popupAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupAmigosActionPerformed(evt);
            }
        });
        JPop_botoes.add(popupAmigos);

        popupFerramentas.setText("Ferramentas");
        popupFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupFerramentasActionPerformed(evt);
            }
        });
        JPop_botoes.add(popupFerramentas);

        popupRelatorio.setText("Relatório");
        popupRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupRelatorioActionPerformed(evt);
            }
        });
        JPop_botoes.add(popupRelatorio);
        JPop_botoes.add(Separator_botoes);

        popupOpcoes.setText("Opções");
        popupOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupOpcoesActionPerformed(evt);
            }
        });
        JPop_botoes.add(popupOpcoes);

        popupSair.setText("Sair");
        popupSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupSairActionPerformed(evt);
            }
        });
        JPop_botoes.add(popupSair);

        popup_home_RE.setText("Realizar Emprestimo");
        popup_home_RE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_home_REActionPerformed(evt);
            }
        });
        JPop_Home.add(popup_home_RE);
        JPop_Home.add(Separator_home);

        popup_home_refresh.setText("Refresh");
        popup_home_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_home_refreshActionPerformed(evt);
            }
        });
        JPop_Home.add(popup_home_refresh);
        popup_home_refresh.getAccessibleContext().setAccessibleName("Refresh");

        popup_amigos_cadastrar.setText("Cadastrar Amigo");
        popup_amigos_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_amigos_cadastrarActionPerformed(evt);
            }
        });
        JPop_Amigos.add(popup_amigos_cadastrar);
        JPop_Amigos.add(Separator_amigos);

        popup_amigos_refresh.setText("Refresh");
        popup_amigos_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_amigos_refreshActionPerformed(evt);
            }
        });
        JPop_Amigos.add(popup_amigos_refresh);
        popup_amigos_refresh.getAccessibleContext().setAccessibleName("Refresh");

        popup_ferramentas_cadastrar.setText("Cadastrar Ferramenta");
        popup_ferramentas_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_ferramentas_cadastrarActionPerformed(evt);
            }
        });
        JPop_Ferramentas.add(popup_ferramentas_cadastrar);
        JPop_Ferramentas.add(Separator_ferramentas);

        popup_ferramentas_refresh.setText("Refresh");
        popup_ferramentas_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_ferramentas_refreshActionPerformed(evt);
            }
        });
        JPop_Ferramentas.add(popup_ferramentas_refresh);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setIconImages(null);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        divisoria.setBackground(new java.awt.Color(0, 0, 0));
        divisoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(divisoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 0, 3, 700));

        JP_Principal.setPreferredSize(new java.awt.Dimension(1575, 300));
        JP_Principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JP_PrincipalMouseReleased(evt);
            }
        });
        JP_Principal.setLayout(new java.awt.CardLayout());

        JP_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelDataDevolucao.setVisible(false);
        painelDataDevolucao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_alterarDataDevolução.setText("Alterar");
        b_alterarDataDevolução.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_alterarDataDevolução.setFocusPainted(false);
        b_alterarDataDevolução.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarDataDevoluçãoActionPerformed(evt);
            }
        });
        painelDataDevolucao.add(b_alterarDataDevolução, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 108, 136, -1));

        jLabel1.setFont(new java.awt.Font("Counter-Strike", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alterar Data de devolução");
        painelDataDevolucao.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 308, 30));

        idid.setText("Não mexer");
        setVisible(false);
        painelDataDevolucao.add(idid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 71, -1));
        painelDataDevolucao.add(txtDated, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 48, 136, -1));

        b_fechar_edicao.setText("Fechar");
        b_fechar_edicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_fechar_edicao.setFocusPainted(false);
        b_fechar_edicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_fechar_edicaoActionPerformed(evt);
            }
        });
        painelDataDevolucao.add(b_fechar_edicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 165, 136, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        painelDataDevolucao.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 3, 240));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        painelDataDevolucao.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 238, 320, 3));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        painelDataDevolucao.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 0, 3, 240));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        painelDataDevolucao.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 3));

        label_fundo_editarEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png"))); // NOI18N
        painelDataDevolucao.add(label_fundo_editarEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 240));

        JP_Home.add(painelDataDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 320, 240));

        realizarEmprestimo.setText("Realizar Emprestimo");
        realizarEmprestimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        realizarEmprestimo.setFocusPainted(false);
        realizarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarEmprestimoActionPerformed(evt);
            }
        });
        JP_Home.add(realizarEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 320, -1));

        CadastrarAmigoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/icone_addA_1.png"))); // NOI18N
        CadastrarAmigoHome.setBorderPainted(false);
        CadastrarAmigoHome.setContentAreaFilled(false);
        CadastrarAmigoHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastrarAmigoHome.setFocusPainted(false);
        CadastrarAmigoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarAmigoHomeActionPerformed(evt);
            }
        });
        JP_Home.add(CadastrarAmigoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 130, 130));

        CadastrarFerramentaHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/icone_addF.png"))); // NOI18N
        CadastrarFerramentaHome.setBorderPainted(false);
        CadastrarFerramentaHome.setContentAreaFilled(false);
        CadastrarFerramentaHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastrarFerramentaHome.setFocusPainted(false);
        CadastrarFerramentaHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarFerramentaHomeActionPerformed(evt);
            }
        });
        JP_Home.add(CadastrarFerramentaHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 130, 130));

        devolverEmprestimo.setText("Devolver Emprestimo");
        devolverEmprestimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devolverEmprestimo.setFocusPainted(false);
        devolverEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverEmprestimoActionPerformed(evt);
            }
        });
        JP_Home.add(devolverEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 320, -1));

        tabelaEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Amigo", "Ferramenta", "Data de emprestimo", "Data de devolução"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEmprestimo.setShowGrid(false);
        jScrollPane4.setViewportView(tabelaEmprestimo);
        if (tabelaEmprestimo.getColumnModel().getColumnCount() > 0) {
            tabelaEmprestimo.getColumnModel().getColumn(0).setResizable(false);
            tabelaEmprestimo.getColumnModel().getColumn(1).setResizable(false);
            tabelaEmprestimo.getColumnModel().getColumn(2).setResizable(false);
            tabelaEmprestimo.getColumnModel().getColumn(3).setResizable(false);
            tabelaEmprestimo.getColumnModel().getColumn(4).setResizable(false);
        }

        JP_Home.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 590, 470));

        b_refreshEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/refresh_icon.png"))); // NOI18N
        b_refreshEmprestimos.setBorderPainted(false);
        b_refreshEmprestimos.setContentAreaFilled(false);
        b_refreshEmprestimos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refreshEmprestimos.setFocusPainted(false);
        b_refreshEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refreshEmprestimosActionPerformed(evt);
            }
        });
        JP_Home.add(b_refreshEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 40, 40));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo_home.setFont(new java.awt.Font("Segoe UI Black", 1, 94)); // NOI18N
        label_titulo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/ToolTracker_titulo_preto.png"))); // NOI18N
        jPanel1.add(label_titulo_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 670, 130));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/ToolTracker Logo Oficial.png"))); // NOI18N
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 160, 190));

        JP_Home.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        editarEmprestimo.setText("Editar Emprestimo");
        editarEmprestimo.setFocusPainted(false);
        editarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEmprestimoActionPerformed(evt);
            }
        });
        JP_Home.add(editarEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 320, -1));

        label_fundo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png"))); // NOI18N
        JP_Home.add(label_fundo_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 700));

        JP_Principal.add(JP_Home, "Home");

        JP_ListaAmigos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo_amigos.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        label_titulo_amigos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Amigos_titulo_preto.png"))); // NOI18N
        JP_ListaAmigos.add(label_titulo_amigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 320, 50));

        b_cadastrarAmigos.setText("Cadastrar Amigo");
        b_cadastrarAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cadastrarAmigos.setFocusPainted(false);
        b_cadastrarAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarAmigosActionPerformed(evt);
            }
        });
        JP_ListaAmigos.add(b_cadastrarAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 390, 255, -1));

        table_amigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Email", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_amigos);
        if (table_amigos.getColumnModel().getColumnCount() > 0) {
            table_amigos.getColumnModel().getColumn(0).setResizable(false);
        }

        JP_ListaAmigos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 30, 690, 660));

        b_editarAmigo.setText("Editar Amigo");
        b_editarAmigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_editarAmigo.setFocusPainted(false);
        b_editarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editarAmigoActionPerformed(evt);
            }
        });
        JP_ListaAmigos.add(b_editarAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 465, 255, -1));

        deleteAmigo.setText("Apagar Amigo");
        deleteAmigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteAmigo.setFocusPainted(false);
        deleteAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAmigoActionPerformed(evt);
            }
        });
        JP_ListaAmigos.add(deleteAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 541, 255, -1));

        atualizarTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/refresh_icon.png"))); // NOI18N
        atualizarTabela.setBorderPainted(false);
        atualizarTabela.setContentAreaFilled(false);
        atualizarTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarTabelaActionPerformed(evt);
            }
        });
        JP_ListaAmigos.add(atualizarTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 40, 40));

        label_logo_amigos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/ToolTracker Logo Oficial.png"))); // NOI18N
        label_logo_amigos.setToolTipText("");
        JP_ListaAmigos.add(label_logo_amigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 112, 236, 223));

        label_fundo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png"))); // NOI18N
        JP_ListaAmigos.add(label_fundo_amigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1060, 700));

        JP_Principal.add(JP_ListaAmigos, "Lista Amigos");

        JP_ListaFerramentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo_ferramentas.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        label_titulo_ferramentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/ferramentas_titulo_preto.png"))); // NOI18N
        JP_ListaFerramentas.add(label_titulo_ferramentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 50));

        table_ferramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Marca", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_ferramentas);

        JP_ListaFerramentas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 690, 660));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/ToolTracker Logo Oficial.png"))); // NOI18N
        jLabel8.setToolTipText("");
        JP_ListaFerramentas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        b_cadastrarFerramenta.setText("Cadastrar Ferramenta");
        b_cadastrarFerramenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cadastrarFerramenta.setFocusPainted(false);
        b_cadastrarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarFerramentaActionPerformed(evt);
            }
        });
        JP_ListaFerramentas.add(b_cadastrarFerramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 250, -1));

        b_editarFerramenta.setText("Editar Ferramenta");
        b_editarFerramenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_editarFerramenta.setFocusPainted(false);
        b_editarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editarFerramentaActionPerformed(evt);
            }
        });
        JP_ListaFerramentas.add(b_editarFerramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 250, -1));

        b_apagarFerramenta.setText("Apagar Ferramenta");
        b_apagarFerramenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_apagarFerramenta.setFocusPainted(false);
        b_apagarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarFerramentaActionPerformed(evt);
            }
        });
        JP_ListaFerramentas.add(b_apagarFerramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 250, -1));

        AtualizarFerramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/refresh_icon.png"))); // NOI18N
        AtualizarFerramentas.setBorderPainted(false);
        AtualizarFerramentas.setContentAreaFilled(false);
        AtualizarFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AtualizarFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarFerramentasActionPerformed(evt);
            }
        });
        JP_ListaFerramentas.add(AtualizarFerramentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, 30, 30));

        label_fundo_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png"))); // NOI18N
        JP_ListaFerramentas.add(label_fundo_ferramentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1060, 700));

        JP_Principal.add(JP_ListaFerramentas, "Lista Ferramentas");

        JP_Relatorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id Amigo", "Nome do Amigo", "Quantidade de Emprestimos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableRelatorio);
        if (tableRelatorio.getColumnModel().getColumnCount() > 0) {
            tableRelatorio.getColumnModel().getColumn(0).setResizable(false);
            tableRelatorio.getColumnModel().getColumn(1).setResizable(false);
            tableRelatorio.getColumnModel().getColumn(2).setResizable(false);
        }

        JP_Relatorio.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 750, 560));

        label_titulo_relatorio.setFont(new java.awt.Font("Counter-Strike", 0, 48)); // NOI18N
        label_titulo_relatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo_relatorio.setText("Relatorio");
        JP_Relatorio.add(label_titulo_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 410, 90));

        b_relatorioDetalhado.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        b_relatorioDetalhado.setText("Relatório Detalhado");
        b_relatorioDetalhado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_relatorioDetalhado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_relatorioDetalhadoActionPerformed(evt);
            }
        });
        JP_Relatorio.add(b_relatorioDetalhado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, -1));

        label_fundo_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png"))); // NOI18N
        JP_Relatorio.add(label_fundo_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1060, 700));

        JP_Principal.add(JP_Relatorio, "Relatorio");

        getContentPane().add(JP_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 0, 1060, 700));

        JP_Lista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JP_Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JP_ListaMouseReleased(evt);
            }
        });
        JP_Lista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_mudarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/lua_tema.png"))); // NOI18N
        b_mudarTema.setBorderPainted(false);
        b_mudarTema.setContentAreaFilled(false);
        b_mudarTema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_mudarTema.setFocusPainted(false);
        b_mudarTema.setFocusable(false);
        b_mudarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mudarTemaActionPerformed(evt);
            }
        });
        JP_Lista.add(b_mudarTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 40, 40));

        b_Home.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        b_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/casa_1.png"))); // NOI18N
        b_Home.setText("   Home");
        b_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_Home.setFocusPainted(false);
        b_Home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_HomeActionPerformed(evt);
            }
        });
        JP_Lista.add(b_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 217, 85));

        b_ListaAmigos.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        b_ListaAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/amigos_lp.png"))); // NOI18N
        b_ListaAmigos.setText("   Amigos");
        b_ListaAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_ListaAmigos.setFocusPainted(false);
        b_ListaAmigos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_ListaAmigos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        b_ListaAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ListaAmigosActionPerformed(evt);
            }
        });
        JP_Lista.add(b_ListaAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 94, 217, 85));

        b_ListaFerramentas.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        b_ListaFerramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/ferramentas_lp.png"))); // NOI18N
        b_ListaFerramentas.setText("    Ferramentas");
        b_ListaFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_ListaFerramentas.setFocusable(false);
        b_ListaFerramentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_ListaFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ListaFerramentasActionPerformed(evt);
            }
        });
        JP_Lista.add(b_ListaFerramentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 185, 217, 85));

        b_relatorio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        b_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/emprestimos_lp.png"))); // NOI18N
        b_relatorio.setText("    Relatório");
        b_relatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_relatorio.setFocusable(false);
        b_relatorio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_relatorio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        b_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_relatorioActionPerformed(evt);
            }
        });
        JP_Lista.add(b_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 276, 217, 85));

        b_opcoes.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        b_opcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/opcoes_lp.png"))); // NOI18N
        b_opcoes.setText("    Opções");
        b_opcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_opcoes.setFocusPainted(false);
        b_opcoes.setFocusable(false);
        b_opcoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_opcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_opcoesActionPerformed(evt);
            }
        });
        JP_Lista.add(b_opcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 618, 217, 80));

        label_sair.setFont(new java.awt.Font("Counter-Strike", 0, 36)); // NOI18N
        label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/I_fechar_preto.png"))); // NOI18N
        label_sair.setText("X");
        label_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_sairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_sairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_sairMouseExited(evt);
            }
        });
        JP_Lista.add(label_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 30, 40));

        label_indicar_sair.setFont(new java.awt.Font("Counter-Strike", 2, 12)); // NOI18N
        label_indicar_sair.setText("Sair");
        JP_Lista.add(label_indicar_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 40, 40));

        label_botoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/fundo_botoes_branco.png"))); // NOI18N
        JP_Lista.add(label_botoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 230, 710));

        getContentPane().add(JP_Lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão de opções
    private void b_opcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_opcoesActionPerformed
        Opcoes opcoes = new Opcoes();
        
        if(opcoes.estaAberto() == false){
        opcoes.setVisible(true);    
        opcoes.setAberto(true);
        
        } else if(opcoes.estaAberto() == true){
        JOptionPane.showMessageDialog(null, "Uma janela de opções já está aberta!", "Não foi possivel abrir a janela", 2);
        }
    }//GEN-LAST:event_b_opcoesActionPerformed

    //Botão Home
    private void b_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_HomeActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Home");

        //Para verificação do PopUp Menu
        cardAmigos = false;
        cardHome = true;
        cardFerramentas = false;
        cardRelatorio = false;
    }//GEN-LAST:event_b_HomeActionPerformed

    //Botão Amigos
    private void b_ListaAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ListaAmigosActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Lista Amigos");

        //Para verificação do PopUp Menu
        cardAmigos = true;
        cardHome = false;
        cardFerramentas = false;
        cardRelatorio = false;
    }//GEN-LAST:event_b_ListaAmigosActionPerformed

    //Botão Ferramentas
    private void b_ListaFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ListaFerramentasActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Lista Ferramentas");

        //Para verificação do PopUp Menu
        cardAmigos = false;
        cardHome = false;
        cardFerramentas = true;
        cardRelatorio = false;
    }//GEN-LAST:event_b_ListaFerramentasActionPerformed

    //Botão Relatorio
    private void b_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_relatorioActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Relatorio");

        // Para verificação do PopUp Menu
        cardAmigos = false;
        cardHome = false;
        cardFerramentas = false;
        cardRelatorio = true;
        controller.relatorio();

    }//GEN-LAST:event_b_relatorioActionPerformed

    //Código para aparecer o Pop-Up menu no Panel das opções (Home, amigos, ferramentas, rank)
    private void JP_ListaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_ListaMouseReleased
        if (evt.isPopupTrigger()) {
            JPop_botoes.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_JP_ListaMouseReleased

    //Ação de PopUp Sair (JPanel Botões)
    private void popupSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_popupSairActionPerformed

    //Indicador de PopUps No panel da direita
    private void JP_PrincipalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_PrincipalMouseReleased

        if ((evt.isPopupTrigger()) && (cardHome == true)) {
            JPop_Home.show(this, evt.getX() + 230, evt.getY());
        }

        if ((evt.isPopupTrigger()) && (cardAmigos == true)) {
            JPop_Amigos.show(this, evt.getX() + 230, evt.getY());
        }

        if ((evt.isPopupTrigger()) && (cardFerramentas == true)) {
            JPop_Ferramentas.show(this, evt.getX() + 230, evt.getY());
        }
        
    }//GEN-LAST:event_JP_PrincipalMouseReleased

    private void b_cadastrarAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarAmigosActionPerformed
        RegistrosAmigos registroAmigos = new RegistrosAmigos();

        //Verificar se já esta aberto
        if(registroAmigos.isAberto() == false){
        registroAmigos.setAberto(true);
            
            
        registroAmigos.setVisible(true);
        registroAmigos.getjBotaoCadastro().setVisible(true);
        
        }else if(registroAmigos.isAberto() == true){
            
            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
            
        }
    }//GEN-LAST:event_b_cadastrarAmigosActionPerformed

////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Mudança de tema!!
    private void b_mudarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mudarTemaActionPerformed

        try {

            // Obter o Look and Feel atual
            String currentLF = UIManager.getLookAndFeel().getClass().getName();
            System.out.println("tela1 " + currentLF);

            // Verificar se o tema atual é escuro ou claro
            if (currentLF.equals("javax.swing.plaf.nimbus.NimbusLookAndFeel")) {
                // Definir algumas propriedades para o tema claro
                UIManager.put("control", new Color(214, 217, 223));
                UIManager.put("text", new Color(0, 0, 0));
                UIManager.put("nimbusBase", new Color(214, 217, 223));
                UIManager.put("nimbusBlueGrey", new Color(193, 200, 206));
                UIManager.put("nimbusFocus", new Color(115, 164, 209));
                UIManager.put("nimbusLightBackground", new Color(214, 217, 223));
                UIManager.put("nimbusOrange", new Color(191, 98, 4));
                UIManager.put("nimbusSelectedText", new Color(0, 0, 0));
                UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
                // Se for escuro, mudar para claro
                

                temaClaro();
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); //Aqui é possível tirar aquele Modelo de inicio padrão

            } else {
                // Definir algumas propriedades para o tema escuro
                UIManager.put("control", new Color(68, 68, 68));
                UIManager.put("text", new Color(214, 217, 223));
                UIManager.put("nimbusBase", new Color(18, 30, 49));
                UIManager.put("nimbusBlueGrey", new Color(48, 57, 67));
                UIManager.put("nimbusFocus", new Color(115, 164, 209));
                UIManager.put("nimbusLightBackground", new Color(18, 30, 49));
                UIManager.put("nimbusOrange", new Color(191, 98, 4));
                UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
                UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
                // Se for claro, mudar para escuro

                temaEscuro();
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

            }
            
            // Verificar se o tema atual é o Nimbus claro (era outro tema)
            

            // Atualizar a aparência da interface do usuário
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_b_mudarTemaActionPerformed

    public static boolean getTema() {
        return tema;
    }

    //IMPORTANTE, caso não funcione, Mude o Caminho dos icones em sua Maquina!
    public void temaClaro() {

        tema = true;

        b_mudarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/lua_tema.png")));

        label_titulo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/ToolTracker_titulo_preto.png")));
        label_titulo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Amigos_titulo_preto.png")));
        label_titulo_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/ferramentas_titulo_preto.png")));

        label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/I_fechar_preto.png")));

        label_botoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/fundo_botoes_branco.png")));

        label_fundo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png")));
        label_fundo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png")));
        label_fundo_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png")));
        label_fundo_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png")));
        label_fundo_editarEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png")));
        
    }

    public void temaEscuro() {

        tema = false;

        b_mudarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/sol_tema.png")));

        label_titulo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/ToolTracker_titulo_branco.png")));
        label_titulo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Amigos_titulo_branco.png")));
        label_titulo_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/ferramentas_titulo_branco.png")));

        label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/I_fechar_branco.png")));

        label_botoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/fundo_botoes_preto.png")));

        label_fundo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_2.png")));
        label_fundo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_2.png")));
        label_fundo_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_2.png")));
        label_fundo_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_2.png")));
        label_fundo_editarEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_2.png")));
        
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////  

    private void b_editarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editarAmigoActionPerformed

        int linhaSelecionada = table_amigos.getSelectedRow();

        if (linhaSelecionada != -1) {

            CarregarCampos();
            
        } else {
           
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");

        }


    }//GEN-LAST:event_b_editarAmigoActionPerformed

    private void atualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarTabelaActionPerformed
        controller.listarAmigos();
    }//GEN-LAST:event_atualizarTabelaActionPerformed

    private void deleteAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAmigoActionPerformed

        int linhaSelecionada = table_amigos.getSelectedRow();

        if (linhaSelecionada != -1) {

            camposNaoEditaveis();
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um amigo que deseja excluir!");

        }


    }//GEN-LAST:event_deleteAmigoActionPerformed

    //Eventos dos PopUps Menu (JPanel Botões)
    private void popupHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupHomeActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Home");

        //Para verificação do PopUp Menu
        cardAmigos = false;
        cardHome = true;
        cardFerramentas = false;
        cardRelatorio = false;
    }//GEN-LAST:event_popupHomeActionPerformed

    private void popupAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupAmigosActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Lista Amigos");

        //Para verificação do PopUp Menu
        cardAmigos = true;
        cardHome = false;
        cardFerramentas = false;
        cardRelatorio = false;
    }//GEN-LAST:event_popupAmigosActionPerformed

    private void popupFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupFerramentasActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Lista Ferramentas");

        //Para verificação do PopUp Menu
        cardAmigos = false;
        cardHome = false;
        cardFerramentas = true;
        cardRelatorio = false;
    }//GEN-LAST:event_popupFerramentasActionPerformed

    private void popupRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupRelatorioActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Relatorio");

        // Para verificação do PopUp Menu
        cardAmigos = false;
        cardHome = false;
        cardFerramentas = false;
        cardRelatorio = true;
    }//GEN-LAST:event_popupRelatorioActionPerformed

    private void popupOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupOpcoesActionPerformed
        Opcoes opcoes = new Opcoes();
        
        if(opcoes.estaAberto() == false){
        opcoes.setVisible(true);    
        opcoes.setAberto(true);
        
        } else if(opcoes.estaAberto() == true){
        JOptionPane.showMessageDialog(null, "Uma janela de opções já está aberta!", "Não foi possivel abrir a janela", 2);
        }
    }//GEN-LAST:event_popupOpcoesActionPerformed

    //Fim PopUp (DashBoard)
    
    private void realizarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarEmprestimoActionPerformed
        ViewEmprestimos emp = null;
        try {
            emp = new ViewEmprestimos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Verificar se já está aberto:
        if(emp.isAberto() == false){
        
            emp.setAberto(true);
            emp.setVisible(true);
        
        }else if(emp.isAberto() == true){
       
            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
       
        }
    }//GEN-LAST:event_realizarEmprestimoActionPerformed

    private void b_cadastrarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarFerramentaActionPerformed
        RegistroFerramentas registroFerramentas = new RegistroFerramentas();

        //Verificar se janela já está aberta
        if (registroFerramentas.isAberto() == false) {

            registroFerramentas.setAberto(true);

            registroFerramentas.setVisible(true);
            registroFerramentas.getjBotaoCadastroFerramenta().setVisible(true);
            registroFerramentas.getjDeleteFerramenta().setVisible(false);

        } else if(registroFerramentas.isAberto() == true) {
            
            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
            
        }
        
    }//GEN-LAST:event_b_cadastrarFerramentaActionPerformed

    private void b_editarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editarFerramentaActionPerformed

        b_editarOuDeletar = true;

        int linhaSelecionada = table_ferramentas.getSelectedRow();

        if (linhaSelecionada != -1) {
            
            CarregarCamposFerramentas();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");

        }
    }//GEN-LAST:event_b_editarFerramentaActionPerformed

    private void AtualizarFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarFerramentasActionPerformed
        controller.listarFerramentas();
    }//GEN-LAST:event_AtualizarFerramentasActionPerformed

    //Botão de abrir tela para apagar Ferramenta selecionada
    private void b_apagarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarFerramentaActionPerformed

        b_editarOuDeletar = false;

        int linhaSelecionada = table_ferramentas.getSelectedRow();

        if (linhaSelecionada != -1) {
            camposNaoEditaveisFerramentas();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma ferramenta que deseja excluir!");

        }
    }//GEN-LAST:event_b_apagarFerramentaActionPerformed

    private void CadastrarAmigoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarAmigoHomeActionPerformed
        RegistrosAmigos RA = new RegistrosAmigos();

        //Verificar se já está aberto
        if(RA.isAberto() == false){
            RA.setAberto(true);
            
            RA.setVisible(true);
            RA.getjBotaoCadastro().setVisible(true);
        
        }else if(RA.isAberto() == true){
            
            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
            
        }    
    }//GEN-LAST:event_CadastrarAmigoHomeActionPerformed

    private void CadastrarFerramentaHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarFerramentaHomeActionPerformed
        RegistroFerramentas RF = new RegistroFerramentas();

        //Verificar se já está aberto
        if(RF.isAberto() == false){
        RF.setAberto(true);
        
        RF.setVisible(true);
        RF.getjBotaoCadastroFerramenta().setVisible(true);
        
        }else if(RF.isAberto() == true){
            
            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
            
        }
    }//GEN-LAST:event_CadastrarFerramentaHomeActionPerformed

    private void popup_amigos_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_amigos_cadastrarActionPerformed
        RegistrosAmigos registroAmigos = new RegistrosAmigos();

        registroAmigos.setVisible(true);
        registroAmigos.getjBotaoCadastro().setVisible(true);
    }//GEN-LAST:event_popup_amigos_cadastrarActionPerformed

    private void devolverEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverEmprestimoActionPerformed
        int linhaSelecionada = tabelaEmprestimo.getSelectedRow();

        if (linhaSelecionada != -1) {

            camposNaoEditaveisEmprestimo();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um emprestimo que deseja devolver!");

        }    }//GEN-LAST:event_devolverEmprestimoActionPerformed

  

    private void b_refreshEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refreshEmprestimosActionPerformed

        controller.listarEmprestimos();
    }//GEN-LAST:event_b_refreshEmprestimosActionPerformed

    private void b_relatorioDetalhadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_relatorioDetalhadoActionPerformed

        int setar = tableRelatorio.getSelectedRow();
        if (setar >= 0) {
            // System.out.println(tableRelatorio.getModel().getValueAt(setar, 0).toString());
            String nomeAmigo = tableRelatorio.getModel().getValueAt(setar, 1).toString();
            int transform = Integer.parseInt(tableRelatorio.getModel().getValueAt(setar, 0).toString());

            try {
                Connection conexao = new Conexao().getConnection();
                EmprestimosDAO emprestimosDAO = new EmprestimosDAO(conexao);
                List<Emprestimos> relatorio = emprestimosDAO.relatorioAmigos(transform);
                Connection conexao1 = new Conexao().getConnection();
                FerramentaDAO ferramentaDAO = new FerramentaDAO(conexao1);
                ArrayList<Ferramentas> listarFerramentas = ferramentaDAO.listarFerramentas();
                RelatorioDetalhado RD = new RelatorioDetalhado(); //RD = Relatorio Detalhado
                
                if(RD.isAberto() == false){
                RD.setAberto(true);
                  
                RD.setVisible(true);
                
                DefaultTableModel model = (DefaultTableModel) RD.getTableDetalhes().getModel();
                model.setNumRows(0);
                for (int i = 0; i < relatorio.size(); i++) {
                    Ferramentas ferramentas = Util.Util.buscarFerramentas(relatorio.get(i).getIdFerramentas(), listarFerramentas);
                    model.addRow(new Object[]{
                        nomeAmigo,
                        ferramentas.getNome(),
                        ferramentas.getMarca()
                    });

                    }
                }else if(RD.isAberto() == true) {
                    
                    JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");

        }
    }//GEN-LAST:event_b_relatorioDetalhadoActionPerformed

    private void label_sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_sairMouseEntered
        label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/I_fechar_vermelho.png")));
        label_indicar_sair.setVisible(true);
    }//GEN-LAST:event_label_sairMouseEntered

    private void label_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_sairMouseExited

        if (tema == true) {
            label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/I_fechar_preto.png")));
        } else if (tema == false) {
            label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/I_fechar_branco.png")));
        }

        label_indicar_sair.setVisible(false);
    }//GEN-LAST:event_label_sairMouseExited

    private void label_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_label_sairMouseClicked

    private void editarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEmprestimoActionPerformed
        int linhaSelecionada = tabelaEmprestimo.getSelectedRow();

        if (linhaSelecionada != -1) {
            carregarCamposData();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");

        }


      }//GEN-LAST:event_editarEmprestimoActionPerformed

    private void b_alterarDataDevoluçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarDataDevoluçãoActionPerformed
        controller.updateDate();
        painelDataDevolucao.setVisible(false);
        devolverEmprestimo.setVisible(true);
        realizarEmprestimo.setVisible(true);
        editarEmprestimo.setVisible(true);
    }//GEN-LAST:event_b_alterarDataDevoluçãoActionPerformed

    private void b_fechar_edicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_fechar_edicaoActionPerformed
        painelDataDevolucao.setVisible(false);
        devolverEmprestimo.setVisible(true);
        realizarEmprestimo.setVisible(true);
        editarEmprestimo.setVisible(true);
    }//GEN-LAST:event_b_fechar_edicaoActionPerformed

    //RESTO DOS POPUPS MENU 
    //(Home)
    private void popup_home_REActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_home_REActionPerformed
        ViewEmprestimos emp = null;
        try {
            emp = new ViewEmprestimos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Verificar se já está aberto:
        if(emp.isAberto() == false){
        
            emp.setAberto(true);
            
            emp.setVisible(true);
        
        }else if(emp.isAberto() == true){
       
            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
       
        }
    }//GEN-LAST:event_popup_home_REActionPerformed

    private void popup_home_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_home_refreshActionPerformed
         controller.listarEmprestimos();
    }//GEN-LAST:event_popup_home_refreshActionPerformed

    //(Amigos) P.S Cadastrar Amigo POPUP se encontra antes no código pois foi feito anteriormente
    private void popup_amigos_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_amigos_refreshActionPerformed
        controller.listarAmigos();
    }//GEN-LAST:event_popup_amigos_refreshActionPerformed

    //(Ferramentas)
    private void popup_ferramentas_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_ferramentas_cadastrarActionPerformed
         RegistroFerramentas registroFerramentas = new RegistroFerramentas();

        //Verificar se janela já está aberta
        if (registroFerramentas.isAberto() == false) {

            registroFerramentas.setAberto(true);

            registroFerramentas.setVisible(true);
            registroFerramentas.getjBotaoCadastroFerramenta().setVisible(true);
            registroFerramentas.getjDeleteFerramenta().setVisible(false);

        } else if(registroFerramentas.isAberto() == true) {
            
            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
            
        }
        
    }//GEN-LAST:event_popup_ferramentas_cadastrarActionPerformed

    private void popup_ferramentas_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_ferramentas_refreshActionPerformed
          controller.listarFerramentas();
    }//GEN-LAST:event_popup_ferramentas_refreshActionPerformed
    
    
    
    
    
    
    
    
    //Fim PopUps
//PopUp de sair está localizado anteriormente!
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarFerramentas;
    private javax.swing.JButton CadastrarAmigoHome;
    private javax.swing.JButton CadastrarFerramentaHome;
    private javax.swing.JPanel JP_Home;
    private javax.swing.JPanel JP_Lista;
    private javax.swing.JPanel JP_ListaAmigos;
    private javax.swing.JPanel JP_ListaFerramentas;
    private javax.swing.JPanel JP_Principal;
    private javax.swing.JPanel JP_Relatorio;
    private javax.swing.JPopupMenu JPop_Amigos;
    private javax.swing.JPopupMenu JPop_Ferramentas;
    private javax.swing.JPopupMenu JPop_Home;
    private javax.swing.JPopupMenu JPop_botoes;
    private javax.swing.JPopupMenu.Separator Separator_amigos;
    private javax.swing.JPopupMenu.Separator Separator_botoes;
    private javax.swing.JPopupMenu.Separator Separator_ferramentas;
    private javax.swing.JPopupMenu.Separator Separator_home;
    private javax.swing.JButton atualizarTabela;
    private javax.swing.JButton b_Home;
    private javax.swing.JButton b_ListaAmigos;
    private javax.swing.JButton b_ListaFerramentas;
    private javax.swing.JButton b_alterarDataDevolução;
    private javax.swing.JButton b_apagarFerramenta;
    private javax.swing.JButton b_cadastrarAmigos;
    private javax.swing.JButton b_cadastrarFerramenta;
    private javax.swing.JButton b_editarAmigo;
    private javax.swing.JButton b_editarFerramenta;
    private javax.swing.JButton b_fechar_edicao;
    private javax.swing.JButton b_mudarTema;
    private javax.swing.JButton b_opcoes;
    private javax.swing.JButton b_refreshEmprestimos;
    private javax.swing.JButton b_relatorio;
    private javax.swing.JButton b_relatorioDetalhado;
    private javax.swing.JButton deleteAmigo;
    private javax.swing.JButton devolverEmprestimo;
    private javax.swing.JPanel divisoria;
    private javax.swing.JButton editarEmprestimo;
    private javax.swing.JTextField idid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel label_botoes;
    private javax.swing.JLabel label_fundo_amigos;
    private javax.swing.JLabel label_fundo_editarEmprestimos;
    private javax.swing.JLabel label_fundo_ferramentas;
    private javax.swing.JLabel label_fundo_home;
    private javax.swing.JLabel label_fundo_relatorio;
    private javax.swing.JLabel label_indicar_sair;
    private javax.swing.JLabel label_logo_amigos;
    private javax.swing.JLabel label_sair;
    private javax.swing.JLabel label_titulo_amigos;
    private javax.swing.JLabel label_titulo_ferramentas;
    private javax.swing.JLabel label_titulo_home;
    private javax.swing.JLabel label_titulo_relatorio;
    private javax.swing.JPanel painelDataDevolucao;
    private javax.swing.JMenuItem popupAmigos;
    private javax.swing.JMenuItem popupFerramentas;
    private javax.swing.JMenuItem popupHome;
    private javax.swing.JMenuItem popupOpcoes;
    private javax.swing.JMenuItem popupRelatorio;
    private javax.swing.JMenuItem popupSair;
    private javax.swing.JMenuItem popup_amigos_cadastrar;
    private javax.swing.JMenuItem popup_amigos_refresh;
    private javax.swing.JMenuItem popup_ferramentas_cadastrar;
    private javax.swing.JMenuItem popup_ferramentas_refresh;
    private javax.swing.JMenuItem popup_home_RE;
    private javax.swing.JMenuItem popup_home_refresh;
    private javax.swing.JButton realizarEmprestimo;
    private javax.swing.JTable tabelaEmprestimo;
    private javax.swing.JTable tableRelatorio;
    private javax.swing.JTable table_amigos;
    private javax.swing.JTable table_ferramentas;
    private javax.swing.JFormattedTextField txtDated;
    // End of variables declaration//GEN-END:variables

    public JTable getTable_amigos() {
        return table_amigos;
    }

    public void setTable_amigos(JTable table_amigos) {
        this.table_amigos = table_amigos;
    }

    public void CarregarCampos() {
        RegistrosAmigos RA = new RegistrosAmigos(); //RA = Registro Amigos
        
        //Verificar se já está aberto
        if(RA.isAberto() == false){
        
        RA.setAberto(true);
            
        RA.setVisible(true);
        int setar = table_amigos.getSelectedRow();
        RA.getUpdate().setVisible(true);
        RA.getTxtnome().setText(table_amigos.getModel().getValueAt(setar, 1).toString());
        RA.getTxtemail().setText(table_amigos.getModel().getValueAt(setar, 2).toString());
        RA.getTxttelefone().setText(table_amigos.getModel().getValueAt(setar, 3).toString());
        RA.getTxtId().setText(table_amigos.getModel().getValueAt(setar, 0).toString());
        
        }else if(RA.isAberto() == true) {
            
            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
            
        }   
        
    } //Check

    public void camposNaoEditaveis() {
        RegistrosAmigos RA = new RegistrosAmigos(); // RA = Registro Amigos
        
        //Verificar se já esta aberto
        if(RA.isAberto() == false){
        RA.setAberto(true);
            
        RA.setVisible(true);
        RA.getjDeleteAmigo().setVisible(true);
        RA.getjBotaoCadastro().setVisible(false);

        int setar = table_amigos.getSelectedRow();
        RA.getUpdate().setVisible(false);
        RA.getTxtnome().setText(table_amigos.getModel().getValueAt(setar, 1).toString());
        RA.getTxtemail().setText(table_amigos.getModel().getValueAt(setar, 2).toString());
        RA.getTxttelefone().setText(table_amigos.getModel().getValueAt(setar, 3).toString());
        RA.getTxtId().setText(table_amigos.getModel().getValueAt(setar, 0).toString());
        RA.getTxtnome().setEnabled(false);
        RA.getTxtemail().setEnabled(false);
        RA.getTxttelefone().setEnabled(false);
        
        }else if(RA.isAberto() == true){
            
        JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);    
            
        }
        
    } //Check

    public void CarregarCamposFerramentas() {
        RegistroFerramentas RF = new RegistroFerramentas();
      
        //Verificar se já está aberto
        if(RF.isAberto() == false){
        
        RF.setAberto(true);
            
        RF.setVisible(true);

        if (b_editarOuDeletar == true) {
            RF.getjDeleteFerramenta().setVisible(false);
            RF.getUpdateFerramenta().setVisible(true);

        } else if (b_editarOuDeletar == false) {
            RF.getUpdateFerramenta().setVisible(false);
            RF.getjDeleteFerramenta().setVisible(true);
        }

        int setar = table_ferramentas.getSelectedRow();

        RF.getTxtnomeFerramenta().setText(table_ferramentas.getModel().getValueAt(setar, 1).toString());
        RF.getTxtMarca().setText(table_ferramentas.getModel().getValueAt(setar, 2).toString());
        RF.getTxtPreco().setText(table_ferramentas.getModel().getValueAt(setar, 3).toString());
        RF.getTxtId().setText(table_ferramentas.getModel().getValueAt(setar, 0).toString());
        
        } else if(RF.isAberto() == true){
            
            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
            
        }
        
    } //Check

    public void camposNaoEditaveisFerramentas() {
        RegistroFerramentas RF = new RegistroFerramentas();
        
        //Verificar se já está aberto
        if(RF.isAberto() == false){
        RF.setAberto(true);
        
        RF.setVisible(true);

        RF.getjDeleteFerramenta().setVisible(true);
        RF.getjBotaoCadastroFerramenta().setVisible(false);

        int setar = table_ferramentas.getSelectedRow();

        RF.getUpdateFerramenta().setVisible(false);
        RF.getTxtnomeFerramenta().setText(table_ferramentas.getModel().getValueAt(setar, 1).toString());
        RF.getTxtMarca().setText(table_ferramentas.getModel().getValueAt(setar, 2).toString());
        RF.getTxtPreco().setText(table_ferramentas.getModel().getValueAt(setar, 3).toString());
        RF.getTxtId().setText(table_ferramentas.getModel().getValueAt(setar, 0).toString());
        RF.getTxtnomeFerramenta().setEnabled(false);
        RF.getTxtMarca().setEnabled(false);
        RF.getTxtPreco().setEnabled(false);
        
        }else if(RF.isAberto() == true){
        
        JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
            
        }
        
    } //Check

    public void camposNaoEditaveisEmprestimo() {

        DevolverFerramenta DF = new DevolverFerramenta(); //DF = DevolverFerramenta
        
        //Verificar se já esta aberto:
        if(DF.isAberto() == false){
        
        DF.setAberto(true);
            
        DF.setVisible(true);
        DF.getjDevolver().setVisible(true);

        int setar = tabelaEmprestimo.getSelectedRow();

        DF.getTxtId().setText(tabelaEmprestimo.getModel().getValueAt(setar, 0).toString());
        DF.getTxtNomeAmigos().setText(tabelaEmprestimo.getModel().getValueAt(setar, 1).toString());
        DF.getTxtNomeFerramenta().setText(tabelaEmprestimo.getModel().getValueAt(setar, 2).toString());
        DF.getTxtDataEmprestimo().setText(tabelaEmprestimo.getModel().getValueAt(setar, 3).toString());
        DF.getTxtDataDevolcao().setText(tabelaEmprestimo.getModel().getValueAt(setar, 4).toString());
        DF.getTxtNomeAmigos().setEnabled(false);
        DF.getTxtNomeFerramenta().setEnabled(false);
        DF.getTxtDataEmprestimo().setEnabled(false);
        DF.getTxtDataDevolcao().setEnabled(false);
        
        }else if(DF.isAberto() == true) {
            
            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
            
        }

    } // Check

    public void carregarCamposData() {
        idid.setVisible(false);
        realizarEmprestimo.setVisible(false);
        devolverEmprestimo.setVisible(false);
        editarEmprestimo.setVisible(false);
        painelDataDevolucao.setVisible(true);

        int setar = tabelaEmprestimo.getSelectedRow();
        idid.setText(tabelaEmprestimo.getModel().getValueAt(setar, 0).toString());
        txtDated.setText(tabelaEmprestimo.getModel().getValueAt(setar, 4).toString());

    }

    public JTable getTable_ferramentas() {
        return table_ferramentas;
    }

    public void setTable_ferramentas(JTable table_ferramentas) {
        this.table_ferramentas = table_ferramentas;
    }

    public JTable getTabelaEmprestimo() {
        return tabelaEmprestimo;
    }

    public void setTabelaEmprestimo(JTable tabelaEmprestimo) {
        this.tabelaEmprestimo = tabelaEmprestimo;
    }

    public JTable getTableRelatorio() {
        return tableRelatorio;
    }

    public void setTableRelatorio(JTable tableRelatorio) {
        this.tableRelatorio = tableRelatorio;
    }

    public JButton getEditarEmprestimo() {
        return editarEmprestimo;
    }

    public void setEditarEmprestimo(JButton editarEmprestimo) {
        this.editarEmprestimo = editarEmprestimo;
    }

    public JTextField getIdid() {
        return idid;
    }

    public void setIdid(JTextField idid) {
        this.idid = idid;
    }

    public JFormattedTextField getTxtDated() {
        return txtDated;
    }

    public void setTxtDated(JFormattedTextField txtDated) {
        this.txtDated = txtDated;
    }

   
   

    public JButton getAlterarDataDevolução() {
        return b_alterarDataDevolução;
    }

    public void setAlterarDataDevolução(JButton alterarDataDevolução) {
        this.b_alterarDataDevolução = alterarDataDevolução;
    }

}

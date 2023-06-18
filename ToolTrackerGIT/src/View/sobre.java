/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Desktop;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URI;

/**
 *
 * @author caiop
 */
public class sobre extends javax.swing.JFrame {

    private static boolean aberto = false;
    
     TelaPrincipal TP = new TelaPrincipal();
    
    public sobre() {
        
        initComponents();
        
         if(TP.getTema() == true){
            
            label_fundo_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png")));
            
        }else 
            if(TP.getTema() == false){
        
           label_fundo_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_2.png")));
                }  
         
         //Quando fechar pela aba não da erro!
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                aberto = false;
                dispose();
            }
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b_voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        esquerda = new javax.swing.JPanel();
        direita = new javax.swing.JPanel();
        baixo = new javax.swing.JPanel();
        cima = new javax.swing.JPanel();
        label_instagram = new javax.swing.JLabel();
        label_fundo_sobre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_voltar.setBackground(new java.awt.Color(8, 119, 197));
        b_voltar.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        b_voltar.setForeground(new java.awt.Color(255, 255, 255));
        b_voltar.setText("Voltar");
        b_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_voltar.setFocusPainted(false);
        b_voltar.setFocusable(false);
        b_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_voltarActionPerformed(evt);
            }
        });
        jPanel1.add(b_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 370, 170, -1));

        jLabel2.setFont(new java.awt.Font("Counter-Strike", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Garotos de Programa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 290, 40));

        jLabel3.setFont(new java.awt.Font("Counter-Strike", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Caio Pompei Campos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 290, 20));

        jLabel4.setFont(new java.awt.Font("Counter-Strike", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Eduardo Henrique de Melo Deeke");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 290, 20));

        jLabel5.setFont(new java.awt.Font("Counter-Strike", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gustavo Heitmann Freire Figueiredo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 138, 290, 20));

        jLabel6.setFont(new java.awt.Font("Counter-Strike", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Leonardo Dallacorte Medeiros");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 168, 290, 20));

        jLabel7.setFont(new java.awt.Font("Counter-Strike", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Willemberg Roque Lima");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 258, 290, 20));

        jLabel8.setFont(new java.awt.Font("Counter-Strike", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Luiz Guilherme Modler dos Santos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 198, 290, 20));

        jLabel9.setFont(new java.awt.Font("Counter-Strike", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ryan Pereira Lima");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 228, 290, 20));

        esquerda.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout esquerdaLayout = new javax.swing.GroupLayout(esquerda);
        esquerda.setLayout(esquerdaLayout);
        esquerdaLayout.setHorizontalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        esquerdaLayout.setVerticalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(esquerda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 420));

        direita.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout direitaLayout = new javax.swing.GroupLayout(direita);
        direita.setLayout(direitaLayout);
        direitaLayout.setHorizontalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        direitaLayout.setVerticalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(direita, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 0, 5, 420));

        baixo.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout baixoLayout = new javax.swing.GroupLayout(baixo);
        baixo.setLayout(baixoLayout);
        baixoLayout.setHorizontalGroup(
            baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        baixoLayout.setVerticalGroup(
            baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(baixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 290, 5));

        cima.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout cimaLayout = new javax.swing.GroupLayout(cima);
        cima.setLayout(cimaLayout);
        cimaLayout.setHorizontalGroup(
            cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        cimaLayout.setVerticalGroup(
            cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(cima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 5));

        label_instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/instagram.png"))); // NOI18N
        label_instagram.setText("jLabel1");
        label_instagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_instagramMouseClicked(evt);
            }
        });
        jPanel1.add(label_instagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 30, 30));

        label_fundo_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png"))); // NOI18N
        jPanel1.add(label_fundo_sobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    private void b_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_voltarActionPerformed
        aberto = false;
        dispose();
    }//GEN-LAST:event_b_voltarActionPerformed

    //Ir para Link Instagram
    private void label_instagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_instagramMouseClicked
        try{
            URI link = new URI("www.instagram.com/garotosdeprograma_floripa/");
            Desktop.getDesktop().browse(link);
            aberto = false;
            dispose();
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_label_instagramMouseClicked

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_voltar;
    private javax.swing.JPanel baixo;
    private javax.swing.JPanel cima;
    private javax.swing.JPanel direita;
    private javax.swing.JPanel esquerda;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_fundo_sobre;
    private javax.swing.JLabel label_instagram;
    // End of variables declaration//GEN-END:variables
}

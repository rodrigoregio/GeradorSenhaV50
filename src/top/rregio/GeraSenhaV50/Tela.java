/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top.rregio.GeraSenhaV50;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import top.rregio.GeraSenhaV50.logica.AlteraTexto;
import top.rregio.GeraSenhaV50.logica.Save2File;

/**
 *
 * @author Rodrigo
 */
public class Tela extends javax.swing.JFrame {
    String texto;
    AlteraTexto txt;
    DefaultListModel modeloLista=new DefaultListModel();
    /**
     * Creates new form NewJFrame
     */
    public Tela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltxt = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnGerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lblAdvice1 = new javax.swing.JLabel();
        lblAdvice2 = new javax.swing.JLabel();
        add2Arq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerador de senhas V50");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbltxt.setText("Texto a gerar");

        btnGerar.setText("Gerar nova senha");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        area.setColumns(20);
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        jLabel1.setText("Texto selecionado:");

        lblAdvice1.setForeground(new java.awt.Color(255, 0, 0));
        lblAdvice1.setText("Antes de salvar no arquivo coloque uma descrição");
        lblAdvice1.setToolTipText("");
        lblAdvice1.setFocusable(false);

        lblAdvice2.setForeground(new java.awt.Color(255, 0, 0));
        lblAdvice2.setText("para saber do que se trata a senha.");

        add2Arq.setText("Adicionar ao arquivo");
        add2Arq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ArqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbltxt)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(lblAdvice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(add2Arq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdvice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltxt)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGerar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdvice1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdvice2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add2Arq)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        modeloLista.clear();
        area.setText("");
        // TODO add your handling code here:
        //Pega o texto do JTextField e o coloca na variavel texto
            texto=jTextField1.getText();

            //Mostrando o texto que foi obtido
            //JOptionPane.showMessageDialog(null,texto,"O texto digitado foi:"
            //    ,JOptionPane.INFORMATION_MESSAGE);//Somente para debug

            //instancia a classe responsável por alterar o texto de diversas formas
            txt=new AlteraTexto();

            //mostra o texto alterado no JTextArea, cada linha abaixo adiciona uma
            //linha no JTextArea, facilitando assim a demonstração da alteração
            //realizada.

            modeloLista.addElement(txt.L33TWithNumbers(texto));//alteração LEET
            modeloLista.addElement(txt.inverte(texto));//inversão do texto digitado
            modeloLista.addElement(txt.inverteMetade(texto));//inverte metade do texto digitado
            modeloLista.addElement(txt.minusculo(texto));//Torna todo o texto em minusculo
            modeloLista.addElement(txt.maiusculo(texto));//Torna todo o texto em maiusculo
            modeloLista.addElement(txt.camelTxt(texto));//Alterna o texto digitado nos dois metodos
            jList1.setModel(modeloLista);
            lblAdvice1.setVisible(false);
            lblAdvice2.setVisible(false);
            add2Arq.setEnabled(false);
    }//GEN-LAST:event_btnGerarActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(jList1.getSelectedValue());
        area.setText(jList1.getSelectedValue());
        lblAdvice1.setVisible(true);
        lblAdvice2.setVisible(true);
        add2Arq.setEnabled(true);
    }//GEN-LAST:event_jList1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lblAdvice1.setVisible(false);
        lblAdvice2.setVisible(false);
        add2Arq.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void add2ArqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ArqActionPerformed
        try {
            Save2File.append2File(area.getText()+"\r\n");
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add2ArqActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add2Arq;
    private javax.swing.JTextArea area;
    private javax.swing.JButton btnGerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAdvice1;
    private javax.swing.JLabel lblAdvice2;
    private javax.swing.JLabel lbltxt;
    // End of variables declaration//GEN-END:variables
}
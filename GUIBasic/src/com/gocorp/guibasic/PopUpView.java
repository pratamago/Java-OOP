/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gocorp.guibasic;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class PopUpView extends javax.swing.JFrame {

    /**
     * Creates new form PopUpView
     */
    public PopUpView() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Nilai1 = new javax.swing.JTextField();
        Nilai2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hitung");
        setResizable(false);

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Keluar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Bersih");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Nilai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nilai1ActionPerformed(evt);
            }
        });
        Nilai1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Nilai1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nilai1KeyTyped(evt);
            }
        });

        Nilai2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nilai2KeyTyped(evt);
            }
        });

        jLabel1.setText("Nilai 1");

        jLabel2.setText("Nilai 2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "+", "-", "/", "*" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nilai1)
                    .addComponent(Nilai2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(Nilai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(Nilai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void filterhuruf(KeyEvent a){  
        if(Character.isAlphabetic(a.getKeyChar())){  
            a.consume();  
            JOptionPane.showMessageDialog(null,"Pada Kolom Nilai Hanya Bisa Memasukan Karakter Angka");  
        }  
    }  
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String Operator = (String) jComboBox1.getSelectedItem(); //ambil item dari combo box
       double Nilai = Double.parseDouble(Nilai1.getText()); // casting string ke double
       double Nilaii = Double.parseDouble(Nilai2.getText()); // casting string ke double
       double Hasil; // deklarasi variabel Hasil ke double
       
       if(Operator.equals("+")){
          Hasil = Nilai + Nilaii;
          JOptionPane.showMessageDialog(null,"Hasil "+Nilai+" + "+Nilaii+" = "+Hasil);
       }
       else if(Operator.equals("-")){
           Hasil = Nilai - Nilaii;
           JOptionPane.showMessageDialog(null,"Hasil "+Nilai+" - "+Nilaii+" = "+Hasil);
       }
       else if(Operator.equals("*")){
           Hasil = Nilai * Nilaii;
           JOptionPane.showMessageDialog(null,"Hasil "+Nilai+" x "+Nilaii+" = "+Hasil);
       }
       else if(Operator.equals("/")){
           Hasil = Nilai / Nilaii;
           JOptionPane.showMessageDialog(null,"Hasil "+Nilai+" : "+Nilaii+" = "+Hasil);
       }
       else if(Operator.equals("None")){           
           JOptionPane.showMessageDialog(null,"Hanya Chuck Norris yang bisa mencari hasil tanpa operator");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ObjButtons[] = {"Bisa Jadi","Kagak"};
        int pilihan = JOptionPane.showOptionDialog(null, "Apakah Anda Ingin Keluar ?", "Message", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,ObjButtons,ObjButtons[1]);  
        if(pilihan == 0){   
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Nilai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nilai1ActionPerformed
        
    }//GEN-LAST:event_Nilai1ActionPerformed

    private void Nilai1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nilai1KeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_Nilai1KeyTyped

    private void Nilai2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nilai2KeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_Nilai2KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Nilai1.setText("");
        Nilai2.setText("");      
        Nilai1.requestFocus();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Nilai1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nilai1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Nilai2.requestFocus();
        }
    }//GEN-LAST:event_Nilai1KeyPressed

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
            java.util.logging.Logger.getLogger(PopUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nilai1;
    private javax.swing.JTextField Nilai2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
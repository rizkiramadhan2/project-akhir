/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 
 *
 * @author R-PC
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Scene1 extends javax.swing.JFrame {
    Koneksi koneksi = new Koneksi();
    Reguler reg = new Reguler();
    VIP vip1 = new VIP();
    VVIP vvip1 = new VVIP();
    int reguler2,vip2,vvip2;
    static Scene2 scene2;
    static Scene1 s;
    public Scene1() {
        
        try{
        s = this;
        initComponents();
        this.setLocationRelativeTo(null);
        koneksi.data();
        koneksi.statement = koneksi.connection.createStatement();
            String sq = "select * from tstatus";
            koneksi.result = koneksi.statement.executeQuery(sq);
            if(koneksi.result.next()){
                reguler2 = Integer.parseInt(koneksi.result.getString(1));
                vip2 = Integer.parseInt(koneksi.result.getString(2));
                vvip2 = Integer.parseInt(koneksi.result.getString(3));
            }
        tersedia1.setText("Tersedia : "+reguler2);
        tersedia2.setText("Tersedia : "+vip2);
        tersedia3.setText("Tersedia : "+vvip2);
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vip = new javax.swing.JButton();
        reguler = new javax.swing.JButton();
        vvip = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tersedia1 = new javax.swing.JLabel();
        tersedia2 = new javax.swing.JLabel();
        tersedia3 = new javax.swing.JLabel();
        penghuni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(237, 119, 58));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SELAMAT DATANG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DI KOST MALANG");

        vip.setText("VIP");
        vip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vipActionPerformed(evt);
            }
        });

        reguler.setText("Reguler");
        reguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regulerActionPerformed(evt);
            }
        });

        vvip.setText("VVIP");
        vvip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vvipActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("PILIH JENIS KAMAR");

        tersedia1.setText("Tersedia : ");

        tersedia2.setText("Tersedia : ");

        tersedia3.setText("Tersedia : ");

        penghuni.setText("LIST PENGHUNI");
        penghuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penghuniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(reguler)
                        .addGap(58, 58, 58)
                        .addComponent(vip)
                        .addGap(65, 65, 65)
                        .addComponent(vvip))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(tersedia1)
                        .addGap(59, 59, 59)
                        .addComponent(tersedia2)
                        .addGap(69, 69, 69)
                        .addComponent(tersedia3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(penghuni)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reguler)
                    .addComponent(vip)
                    .addComponent(vvip))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tersedia1)
                    .addComponent(tersedia2)
                    .addComponent(tersedia3))
                .addGap(35, 35, 35)
                .addComponent(penghuni)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regulerActionPerformed
       if(reguler2==0){
           JOptionPane.showMessageDialog(null, "Kamar sudah penuh!");
       }
       else{
        scene2 = new Scene2("REGULER");
        scene2.show();
        this.dispose();
       }
        
    }//GEN-LAST:event_regulerActionPerformed

    private void vipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vipActionPerformed
        if(vip2==0){
           JOptionPane.showMessageDialog(null, "Kamar sudah penuh!");
       }
       else{
        scene2 = new Scene2("VIP");
        scene2.show();
        this.dispose();
        }
    }//GEN-LAST:event_vipActionPerformed

    private void vvipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vvipActionPerformed
        if(vvip2==0){
           JOptionPane.showMessageDialog(null, "Kamar sudah penuh!");
       }
       else{
        scene2 = new Scene2("VVIP");
        scene2.show();
        this.dispose();
        }
    }//GEN-LAST:event_vvipActionPerformed

    private void penghuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penghuniActionPerformed
        // TODO add your handling code here:
        new ListPenghuni().show();
        this.dispose();
    }//GEN-LAST:event_penghuniActionPerformed

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
            java.util.logging.Logger.getLogger(Scene1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scene1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scene1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scene1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scene1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton penghuni;
    private javax.swing.JButton reguler;
    private javax.swing.JLabel tersedia1;
    private javax.swing.JLabel tersedia2;
    private javax.swing.JLabel tersedia3;
    private javax.swing.JButton vip;
    private javax.swing.JButton vvip;
    // End of variables declaration//GEN-END:variables
}
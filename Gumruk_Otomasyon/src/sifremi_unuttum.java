
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MyscherzoTR
 */
public class sifremi_unuttum extends javax.swing.JFrame {

    private Connection conn=null;
    private String url = "jdbc:sqlite";//veritabanının adresi ve portu
    private String dbName = ":db/gumruk_Otomasyon.db"; //veritabanının dosya yolu
    private String driver = "org.sqlite.JDBC";
    
    
    public sifremi_unuttum() {
        initComponents();
        
         try 
        {
            Class.forName(driver).newInstance();
            conn=DriverManager.getConnection(url+dbName);
            //JOptionPane.showConfirmDialog(null, "Bağlantı var","sqlite",JOptionPane.PLAIN_MESSAGE);
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unuttum_btn_cikis1 = new javax.swing.JButton();
        unuttum_label_kHesap = new javax.swing.JLabel();
        unuttum_text_kHesap = new javax.swing.JTextField();
        unuttum_btn_sifreGoster = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(622, 305, 0, 0));
        setResizable(false);

        unuttum_btn_cikis1.setText("Kapat");
        unuttum_btn_cikis1.setActionCommand("cikis");
        unuttum_btn_cikis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unuttum_btn_cikis1ActionPerformed(evt);
            }
        });

        unuttum_label_kHesap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unuttum_label_kHesap.setForeground(new java.awt.Color(153, 51, 255));
        unuttum_label_kHesap.setText("Kullanıcı Adı/E-Posta:");

        unuttum_btn_sifreGoster.setText("Şifreyi Göster");
        unuttum_btn_sifreGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unuttum_btn_sifreGosterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unuttum_btn_cikis1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unuttum_label_kHesap)
                        .addGap(31, 31, 31)
                        .addComponent(unuttum_text_kHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(unuttum_btn_sifreGoster)
                        .addGap(68, 68, 68)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(unuttum_btn_cikis1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unuttum_label_kHesap)
                    .addComponent(unuttum_text_kHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(unuttum_btn_sifreGoster)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unuttum_btn_cikis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unuttum_btn_cikis1ActionPerformed
        Gumruk_Main kapat = new Gumruk_Main();
        kapat.setVisible(false);
        dispose();
    }//GEN-LAST:event_unuttum_btn_cikis1ActionPerformed

    private void unuttum_btn_sifreGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unuttum_btn_sifreGosterActionPerformed
          try {
                    
                if (unuttum_text_kHesap.getText().equals("")) {

                    JOptionPane.showMessageDialog(this, "Lütfen E-Posta Adresinizi veya Kullanıcı Adınızı Giriniz!");

                } 
                
                else 
                {            

                    Statement st = null;
                    ResultSet rs = null;
                    st=conn.createStatement();
                    
                    rs = st.executeQuery("select * from users where users_kAdi='"+unuttum_text_kHesap.getText()+"'or users_kEposta='"+unuttum_text_kHesap.getText()+"'");
                    
                    if(rs.next()){
                       
                        JOptionPane.showMessageDialog(null, "Şifreniz: " + rs.getString("users_password"));
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Böyle Bir E-Posta veya Kullanıcı ado Sistemde Kayıtlı Değil!"); 
                    }
                }
            
            } 
            catch (Exception ex) {
        Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
    }

            
        
    }//GEN-LAST:event_unuttum_btn_sifreGosterActionPerformed

   
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
            java.util.logging.Logger.getLogger(sifremi_unuttum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sifremi_unuttum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sifremi_unuttum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sifremi_unuttum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sifremi_unuttum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton unuttum_btn_cikis1;
    private javax.swing.JButton unuttum_btn_sifreGoster;
    private javax.swing.JLabel unuttum_label_kHesap;
    private javax.swing.JTextField unuttum_text_kHesap;
    // End of variables declaration//GEN-END:variables
}

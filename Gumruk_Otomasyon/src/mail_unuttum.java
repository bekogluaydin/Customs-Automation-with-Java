import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class mail_unuttum extends javax.swing.JFrame {

    private Connection conn=null;
    private String url = "jdbc:sqlite";//veritabanının adresi ve portu
    private String dbName = ":db/gumruk_Otomasyon.db"; //veritabanının dosya yolu
    private String driver = "org.sqlite.JDBC";
    
    public mail_unuttum() {
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

        mailUnuttum_label_kHesap = new javax.swing.JLabel();
        mailUnuttum_btn_mailGoster = new javax.swing.JButton();
        mailUnuttum_text_kHesap = new javax.swing.JTextField();
        mailUnuttum_btn_cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(622, 305, 0, 0));
        setPreferredSize(new java.awt.Dimension(415, 210));
        setResizable(false);

        mailUnuttum_label_kHesap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mailUnuttum_label_kHesap.setForeground(new java.awt.Color(153, 51, 255));
        mailUnuttum_label_kHesap.setText("Kullanıcı Adı:");

        mailUnuttum_btn_mailGoster.setText("Mail Göster");
        mailUnuttum_btn_mailGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailUnuttum_btn_mailGosterActionPerformed(evt);
            }
        });

        mailUnuttum_btn_cikis.setText("Kapat");
        mailUnuttum_btn_cikis.setActionCommand("cikis");
        mailUnuttum_btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailUnuttum_btn_cikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mailUnuttum_btn_cikis)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mailUnuttum_label_kHesap)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailUnuttum_text_kHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mailUnuttum_btn_mailGoster)
                        .addGap(19, 19, 19)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mailUnuttum_btn_cikis)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailUnuttum_label_kHesap)
                    .addComponent(mailUnuttum_text_kHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(mailUnuttum_btn_mailGoster)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mailUnuttum_btn_mailGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailUnuttum_btn_mailGosterActionPerformed
        try {

            if (mailUnuttum_text_kHesap.getText().equals("")) {

                JOptionPane.showMessageDialog(this, "Lütfen Kullanıcı Adınızı Giriniz!");                      
            } 
            else 
            {
                Statement st = null;
                ResultSet rs = null;
                st=conn.createStatement();

                rs = st.executeQuery("select * from users where users_kAdi='"+mailUnuttum_text_kHesap.getText()+"'");

                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null, "Mail Adresiniz: " + rs.getString("users_kEposta"));
                    this.dispose();  
                }
                else{
                    JOptionPane.showMessageDialog(null, "Böyle Bir Kullanıcı adı Sistemde Kayıtlı Değil!");
                }
            }
        }
        catch (Exception ex) {
            Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mailUnuttum_btn_mailGosterActionPerformed

    private void mailUnuttum_btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailUnuttum_btn_cikisActionPerformed
        Gumruk_Main kapat = new Gumruk_Main();
        kapat.setVisible(false);
        dispose();
    }//GEN-LAST:event_mailUnuttum_btn_cikisActionPerformed

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
            java.util.logging.Logger.getLogger(mail_unuttum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mail_unuttum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mail_unuttum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mail_unuttum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mail_unuttum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mailUnuttum_btn_cikis;
    private javax.swing.JButton mailUnuttum_btn_mailGoster;
    private javax.swing.JLabel mailUnuttum_label_kHesap;
    private javax.swing.JTextField mailUnuttum_text_kHesap;
    // End of variables declaration//GEN-END:variables
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Gumruk_Main extends javax.swing.JFrame {

    private Connection conn=null;
    private String url = "jdbc:sqlite";//veritabanının adresi ve portu
    private String dbName = ":db/gumruk_Otomasyon.db"; //veritabanının dosya yolu
    private String driver = "org.sqlite.JDBC";
    static String acikKullanici = Gumruk_Main.acikOturum;
     static String acikOturum;
     static String tarihSaatGetir;
    
        Statement st=null;
        ResultSet res;
        
    public Gumruk_Main() {
        super("Gümrük Otomasyon");
        initComponents();
        
        SimpleDateFormat bicim2=new SimpleDateFormat("dd MMMM yyyy hh:mm:ss");
        Date tarihSaat=new Date();
        bicim2.format(tarihSaat); // 24-8-2014 02:17:02
        tarihSaatGetir = bicim2.format(tarihSaat);
       
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        kayitOl_label_kAdi = new javax.swing.JLabel();
        kayitOl_text_kAdi = new javax.swing.JTextField();
        kayitOl_label_kEposta = new javax.swing.JLabel();
        kayitOl_text_kEposta = new javax.swing.JTextField();
        kayitOl_btn_cikis = new javax.swing.JButton();
        kayitOl_label_kSifre = new javax.swing.JLabel();
        kayitOl_btn = new javax.swing.JButton();
        kayitOl_text_kAd = new javax.swing.JTextField();
        kayitOl_label_kAd = new javax.swing.JLabel();
        kayitOl_label_ksoyAd = new javax.swing.JLabel();
        kayitOl_text_ksoyAd = new javax.swing.JTextField();
        kayitOl_text_kSifre = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        girisYap_label_kAdi = new javax.swing.JLabel();
        girisYap_label_kSifre = new javax.swing.JLabel();
        girisYap_text_kAdi = new javax.swing.JTextField();
        girisYap_btn_cikis = new javax.swing.JButton();
        girisYap_btn = new javax.swing.JButton();
        girisYap_label_sifremiUnuttum = new javax.swing.JLabel();
        girisYap_label_epostaUnuttum = new javax.swing.JLabel();
        girisYap_text_ksifre = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gümrük Otomasyon Login");
        setBounds(new java.awt.Rectangle(560, 220, 0, 0));
        setPreferredSize(new java.awt.Dimension(800, 499));
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        kayitOl_label_kAdi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kayitOl_label_kAdi.setText("Kullanıcı Adı:");

        kayitOl_text_kAdi.setMinimumSize(new java.awt.Dimension(140, 25));
        kayitOl_text_kAdi.setPreferredSize(new java.awt.Dimension(140, 25));

        kayitOl_label_kEposta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kayitOl_label_kEposta.setText("E-Posta:");

        kayitOl_text_kEposta.setMinimumSize(new java.awt.Dimension(140, 25));
        kayitOl_text_kEposta.setPreferredSize(new java.awt.Dimension(140, 25));

        kayitOl_btn_cikis.setBackground(new java.awt.Color(255, 0, 0));
        kayitOl_btn_cikis.setForeground(new java.awt.Color(255, 255, 255));
        kayitOl_btn_cikis.setText("X");
        kayitOl_btn_cikis.setActionCommand("cikis");
        kayitOl_btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitOl_btn_cikisActionPerformed(evt);
            }
        });

        kayitOl_label_kSifre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kayitOl_label_kSifre.setText("Şifre:");

        kayitOl_btn.setBackground(new java.awt.Color(0, 204, 255));
        kayitOl_btn.setText("Kayıt Ol");
        kayitOl_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitOl_btnActionPerformed(evt);
            }
        });

        kayitOl_text_kAd.setMinimumSize(new java.awt.Dimension(140, 25));
        kayitOl_text_kAd.setPreferredSize(new java.awt.Dimension(140, 25));

        kayitOl_label_kAd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kayitOl_label_kAd.setText("Ad:");

        kayitOl_label_ksoyAd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kayitOl_label_ksoyAd.setText("Soyad:");

        kayitOl_text_ksoyAd.setMinimumSize(new java.awt.Dimension(140, 25));
        kayitOl_text_ksoyAd.setPreferredSize(new java.awt.Dimension(140, 25));

        kayitOl_text_kSifre.setMinimumSize(new java.awt.Dimension(140, 25));
        kayitOl_text_kSifre.setPreferredSize(new java.awt.Dimension(140, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kayitOl_btn_cikis))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kayitOl_label_kAdi)
                            .addComponent(kayitOl_label_ksoyAd)
                            .addComponent(kayitOl_label_kAd)
                            .addComponent(kayitOl_label_kEposta)
                            .addComponent(kayitOl_label_kSifre))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kayitOl_text_kEposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kayitOl_text_kAdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kayitOl_text_kAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kayitOl_text_ksoyAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kayitOl_text_kSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kayitOl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kayitOl_btn_cikis)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayitOl_label_kAdi)
                    .addComponent(kayitOl_text_kAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayitOl_label_kAd)
                    .addComponent(kayitOl_text_kAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayitOl_label_ksoyAd)
                    .addComponent(kayitOl_text_ksoyAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayitOl_text_kEposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kayitOl_label_kEposta))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayitOl_label_kSifre)
                    .addComponent(kayitOl_text_kSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kayitOl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kayıt Ol", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleParent(this);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        girisYap_label_kAdi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        girisYap_label_kAdi.setText("Kullanıcı Adı:");
        girisYap_label_kAdi.setToolTipText("");

        girisYap_label_kSifre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        girisYap_label_kSifre.setText("Şifre:");

        girisYap_text_kAdi.setMinimumSize(new java.awt.Dimension(140, 25));
        girisYap_text_kAdi.setPreferredSize(new java.awt.Dimension(140, 25));

        girisYap_btn_cikis.setBackground(new java.awt.Color(255, 51, 51));
        girisYap_btn_cikis.setForeground(new java.awt.Color(255, 255, 255));
        girisYap_btn_cikis.setText("X");
        girisYap_btn_cikis.setActionCommand("cikis");
        girisYap_btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYap_btn_cikisActionPerformed(evt);
            }
        });

        girisYap_btn.setBackground(new java.awt.Color(0, 204, 0));
        girisYap_btn.setText("Giriş Yap");
        girisYap_btn.setPreferredSize(new java.awt.Dimension(90, 25));
        girisYap_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYap_btnActionPerformed(evt);
            }
        });

        girisYap_label_sifremiUnuttum.setText("Şifremi Unuttum");
        girisYap_label_sifremiUnuttum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girisYap_label_sifremiUnuttumMouseClicked(evt);
            }
        });

        girisYap_label_epostaUnuttum.setText("E-Postamı Unuttum");
        girisYap_label_epostaUnuttum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girisYap_label_epostaUnuttumMouseClicked(evt);
            }
        });

        girisYap_text_ksifre.setMinimumSize(new java.awt.Dimension(140, 25));
        girisYap_text_ksifre.setPreferredSize(new java.awt.Dimension(140, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(girisYap_btn_cikis))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(girisYap_label_kAdi)
                                    .addComponent(girisYap_label_kSifre))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(girisYap_text_kAdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(girisYap_text_ksifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(girisYap_label_sifremiUnuttum)
                                .addGap(103, 103, 103)
                                .addComponent(girisYap_label_epostaUnuttum))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(girisYap_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(girisYap_btn_cikis)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(girisYap_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(girisYap_label_sifremiUnuttum)
                            .addComponent(girisYap_label_epostaUnuttum)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(girisYap_text_kAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(girisYap_label_kAdi))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(girisYap_text_ksifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(girisYap_label_kSifre))))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        girisYap_label_kAdi.getAccessibleContext().setAccessibleParent(this);
        girisYap_label_kSifre.getAccessibleContext().setAccessibleParent(this);
        girisYap_text_kAdi.getAccessibleContext().setAccessibleParent(this);
        girisYap_btn_cikis.getAccessibleContext().setAccessibleName("cikis");
        girisYap_btn_cikis.getAccessibleContext().setAccessibleParent(this);
        girisYap_btn.getAccessibleContext().setAccessibleParent(this);
        girisYap_label_sifremiUnuttum.getAccessibleContext().setAccessibleParent(this);

        jTabbedPane1.addTab("Giriş Yap", jPanel1);
        jPanel1.getAccessibleContext().setAccessibleParent(this);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(190, 90, 445, 360);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Renault.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 10, 80, 68);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 53, 68));
        jLabel2.setText("TechnoKantar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 20, 540, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gumruk_background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 470);
        jLabel1.getAccessibleContext().setAccessibleName("giris_background");

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void girisYap_btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYap_btn_cikisActionPerformed
    try {
        conn.close();
        System.exit(0);
    } catch (Exception ex) {
        Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_girisYap_btn_cikisActionPerformed

       
    private void girisYap_label_sifremiUnuttumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisYap_label_sifremiUnuttumMouseClicked
        sifremi_unuttum goster = new sifremi_unuttum();
        goster.setVisible(true);
    }//GEN-LAST:event_girisYap_label_sifremiUnuttumMouseClicked

    
    private void kayitOl_btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitOl_btn_cikisActionPerformed
        try {
        conn.close();
        System.exit(0);
    } catch (Exception ex) {
        Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_kayitOl_btn_cikisActionPerformed
 
    
    private void girisYap_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYap_btnActionPerformed
               
        if ((girisYap_text_kAdi.getText()).equals("")||(girisYap_text_ksifre.getText()).equals("")){
    JOptionPane.showConfirmDialog(null, "Kullanıcı adı veya parola boş bırakılmamalı!!!","Admin Giriş",JOptionPane.PLAIN_MESSAGE);
    
        } else {   
    try {        
        st=conn.createStatement();
        res=st.executeQuery("select * from users where users_kAdi='"+girisYap_text_kAdi.getText()+"'and users_password='"+String.valueOf(girisYap_text_ksifre.getText())+"'");
        String kadi=null;      
        String passw=null;
            while (res.next()){
                kadi=res.getString("users_kAdi");
                passw=res.getString("users_password");
                acikOturum=res.getString("users_Ad");
            }
                if ((girisYap_text_kAdi.getText().equals(kadi))&&(girisYap_text_ksifre.getText().equals(passw))){
        JOptionPane.showConfirmDialog(null, "Kullanıcı adı ve parola doğru...","Admin",JOptionPane.PLAIN_MESSAGE);
        
        new progressP().setVisible(true);
        conn.close();
        this.dispose();
                }else
        JOptionPane.showConfirmDialog(null, "Kullanıcı adı veya parola yanlış!!!","Admin",JOptionPane.PLAIN_MESSAGE);
            girisYap_text_kAdi.setText(null);
            girisYap_text_ksifre.setText(null);
            girisYap_text_kAdi.requestFocus();
            
    } catch (Exception ex) {
        Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
    }
        }                
    }//GEN-LAST:event_girisYap_btnActionPerformed

    
    private void kayitOl_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitOl_btnActionPerformed
               
        String ad=kayitOl_text_kAd.getText();
        String soyAd=kayitOl_text_ksoyAd.getText();
        String kadi=kayitOl_text_kAdi.getText();
        String email=kayitOl_text_kEposta.getText();
        String passw=kayitOl_text_kSifre.getText();
             
        String kadi1 = null;
        String email1 = null;
     
            
             
    try {        
        st=conn.createStatement();
        res=st.executeQuery("select * from users where users_kAdi='"+kayitOl_text_kAdi.getText()+"'or users_kEposta='"+String.valueOf(kayitOl_text_kEposta.getText())+"'");
             
            while(res.next())
            {
                kadi1=res.getString("users_kAdi");
                email1=res.getString("users_kEposta");
                               
            }

             if ((kayitOl_text_kAdi.getText()).equals("")||(kayitOl_text_kEposta.getText()).equals("")||(kayitOl_text_kSifre.getText()).equals(""))
             {  
                JOptionPane.showConfirmDialog(null, "Kullanıcı adı, E-Posta ve parola boş bırakılmamalı!!!","Admin Giriş",JOptionPane.PLAIN_MESSAGE);
             }
             
             else
             {
                 if ((kayitOl_text_kAdi.getText().equals(kadi1)) || (kayitOl_text_kEposta.getText().equals(email1)))
                {
                    JOptionPane.showConfirmDialog(null, "Sistemde kayıtlı E-Posta veya Kullanıcı Adı Mevcut, Lütfen Başka bilgilerle kayıt olmayı deneyin!!!","Admin",JOptionPane.PLAIN_MESSAGE);         
                }
                
                else
                 {
                    JOptionPane.showConfirmDialog(null, "Başarıyla Kayıt Olundu." + "Hoşgeldiniz: " + kadi,"Admin",JOptionPane.PLAIN_MESSAGE);
                    String sql = "INSERT INTO users (users_Ad,users_Soyad,users_kAdi,users_kEposta,users_password)" 
                            + " VALUES ('"+ad+"', '"+soyAd+"', '"+kadi+"', '"+email+"', '"+passw+"')";

                    st.executeUpdate(sql);                      
                }      
            }
                                                
    } catch (Exception ex) {
        Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
    }
                  
        
    }//GEN-LAST:event_kayitOl_btnActionPerformed

    private void girisYap_label_epostaUnuttumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisYap_label_epostaUnuttumMouseClicked
         mail_unuttum goster = new mail_unuttum();
         goster.setVisible(true);
    }//GEN-LAST:event_girisYap_label_epostaUnuttumMouseClicked
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gumruk_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton girisYap_btn;
    private javax.swing.JButton girisYap_btn_cikis;
    private javax.swing.JLabel girisYap_label_epostaUnuttum;
    private javax.swing.JLabel girisYap_label_kAdi;
    private javax.swing.JLabel girisYap_label_kSifre;
    private javax.swing.JLabel girisYap_label_sifremiUnuttum;
    private javax.swing.JTextField girisYap_text_kAdi;
    private javax.swing.JPasswordField girisYap_text_ksifre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kayitOl_btn;
    private javax.swing.JButton kayitOl_btn_cikis;
    private javax.swing.JLabel kayitOl_label_kAd;
    private javax.swing.JLabel kayitOl_label_kAdi;
    private javax.swing.JLabel kayitOl_label_kEposta;
    private javax.swing.JLabel kayitOl_label_kSifre;
    private javax.swing.JLabel kayitOl_label_ksoyAd;
    private javax.swing.JTextField kayitOl_text_kAd;
    private javax.swing.JTextField kayitOl_text_kAdi;
    private javax.swing.JTextField kayitOl_text_kEposta;
    private javax.swing.JPasswordField kayitOl_text_kSifre;
    private javax.swing.JTextField kayitOl_text_ksoyAd;
    // End of variables declaration//GEN-END:variables

    void setId(String valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

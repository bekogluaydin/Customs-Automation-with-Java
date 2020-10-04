import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Gumruk_Giris extends javax.swing.JFrame {

    private Connection conn=null;
    private Connection connIslem=null;
    private String url = "jdbc:sqlite";//veritabanının adresi ve portu
    private String dbName = ":db/gumruk_Otomasyon.db"; //veritabanının dosya yolu
    private String driver = "org.sqlite.JDBC";
    
    static String acikKullanici = Gumruk_Main.acikOturum;
 
    Statement st=null;
    Statement st2=null;
    ResultSet res;
    ResultSet res2;
    
    public Gumruk_Giris() {
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
        
        gumrukDepoGoster();
        soforGoster();
        sorguIstatistik();
        gumrukGecmisGoster();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        myButtonGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        anaTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_gumrukArac = new javax.swing.JLabel();
        label_yukAgirlik = new javax.swing.JLabel();
        label_sistemKayitSofor = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        gumrukGiris_label_tirMarka = new javax.swing.JLabel();
        gumrukGiris_label_tirModel = new javax.swing.JLabel();
        gumrukGiris_label_yukTur = new javax.swing.JLabel();
        gumrukGiris_label_yukAgirlik = new javax.swing.JLabel();
        gumrukGiris_label_girisTarih = new javax.swing.JLabel();
        gumrukGiris_combobox_yukTur = new javax.swing.JComboBox<>();
        gumrukGiris_dateChoose_girisTarih = new com.toedter.calendar.JDateChooser();
        gumrukGiris_text_tirMarka = new javax.swing.JTextField();
        gumrukGiris_text_tirModel = new javax.swing.JTextField();
        gumrukGiris_text_yukAgirlik = new javax.swing.JTextField();
        gumrukGiris_btn_kaydet = new javax.swing.JButton();
        gumrukGiris_btn_temizle = new javax.swing.JButton();
        gumrukGiris_label_soforNumber = new javax.swing.JLabel();
        gumrukGiris_text_soforNumber = new javax.swing.JTextField();
        GumrukGiris_LabelBorder = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        gumrukGiris_Table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        gumrukCikis_label_soforNumber = new javax.swing.JLabel();
        gumrukCikis_text_soforNumber = new javax.swing.JTextField();
        gumrukCikis_label_yukTur = new javax.swing.JLabel();
        gumrukCikis_combobox_yukTur = new javax.swing.JComboBox<>();
        gumrukCikis_label_yukAgirlik = new javax.swing.JLabel();
        gumrukCikis_text_yukAgirlik = new javax.swing.JTextField();
        gumrukCikis_label_cikisTarih = new javax.swing.JLabel();
        gumrukCikis_dateChoose_cikisTarih = new com.toedter.calendar.JDateChooser();
        gumrukCikis_btn_kaydet = new javax.swing.JButton();
        gumrukCikis_btn_temizle = new javax.swing.JButton();
        GumrukCikis_LabelBorder = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        gumrukCikis_Table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        gumrukSorgu_Table = new javax.swing.JTable();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        sorguBosalt = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        degerGir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tarihGir1 = new javax.swing.JTextField();
        sorguBosalt1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tarihGir2 = new javax.swing.JTextField();
        tarihSorgu = new javax.swing.JButton();
        girisTarihRadio = new javax.swing.JRadioButton();
        cikisTarihRadio = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        soforKayit_label_soforAd = new javax.swing.JLabel();
        soforKayit_text_soforAd = new javax.swing.JTextField();
        soforKayit_label_tercihTir = new javax.swing.JLabel();
        soforKayit_text_tercihTir = new javax.swing.JTextField();
        soforKayit_label_tercihYukTur = new javax.swing.JLabel();
        soforKayit_combobox_tercihYukTur = new javax.swing.JComboBox<>();
        soforKayit_label_soforYas = new javax.swing.JLabel();
        soforKayit_text_soforYas = new javax.swing.JTextField();
        soforKayit_btn_kaydet = new javax.swing.JButton();
        soforKayit_btn_temizle = new javax.swing.JButton();
        soforKayit_label_soforNumber = new javax.swing.JLabel();
        soforKayit_text_soforNumber = new javax.swing.JTextField();
        soforKayit_label_soforPlaka = new javax.swing.JLabel();
        soforKayit_text_soforPlaka = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        soforKayit_Table = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        soforBilgi_Table = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        soforBilgi_soforSayi = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        soforBilgi_yasOrtalama = new javax.swing.JLabel();
        jblNewLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jblNewLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gümrük Otomasyon Anasayfa");
        setBounds(new java.awt.Rectangle(410, 220, 0, 0));
        setPreferredSize(new java.awt.Dimension(1300, 700));
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(38, 49));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1270, 521));

        anaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Şoför Numara", "Şoför Plaka", "Şoför Ad", "Tır Marka", "Tır Model", "Yükün Türü", "Yükün Ağırlığı", "Giriş Tarihi", "Kayıt Eden"
            }
        ));
        jScrollPane2.setViewportView(anaTable);
        if (anaTable.getColumnModel().getColumnCount() > 0) {
            anaTable.getColumnModel().getColumn(0).setHeaderValue("Şoför Numara");
            anaTable.getColumnModel().getColumn(1).setHeaderValue("Şoför Plaka");
            anaTable.getColumnModel().getColumn(2).setHeaderValue("Şoför Ad");
            anaTable.getColumnModel().getColumn(3).setHeaderValue("Tır Marka");
            anaTable.getColumnModel().getColumn(4).setHeaderValue("Tır Model");
            anaTable.getColumnModel().getColumn(5).setHeaderValue("Yükün Türü");
            anaTable.getColumnModel().getColumn(6).setHeaderValue("Yükün Ağırlığı");
            anaTable.getColumnModel().getColumn(7).setHeaderValue("Giriş Tarihi");
            anaTable.getColumnModel().getColumn(8).setHeaderValue("Kayıt Eden");
        }

        jLabel2.setText("Gümrükteki Araç Sayısı:");

        jLabel3.setText("İçeride Bulunan Yük Ağırlığı:");

        label_gumrukArac.setBackground(new java.awt.Color(204, 102, 255));
        label_gumrukArac.setText("S");
        label_gumrukArac.setPreferredSize(new java.awt.Dimension(30, 20));

        label_yukAgirlik.setText("S");
        label_yukAgirlik.setPreferredSize(new java.awt.Dimension(70, 20));

        label_sistemKayitSofor.setBackground(new java.awt.Color(51, 255, 255));
        label_sistemKayitSofor.setText("S");
        label_sistemKayitSofor.setPreferredSize(new java.awt.Dimension(30, 20));

        jLabel11.setText("Sisteme Kayıtlı Şoför Sayısı:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_yukAgirlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(29, 29, 29)
                            .addComponent(label_gumrukArac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(label_sistemKayitSofor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(label_gumrukArac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(label_sistemKayitSofor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(label_yukAgirlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Anasayfa", jPanel8);
        jPanel8.getAccessibleContext().setAccessibleParent(this);

        jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(1269, 483));

        jPanel2.setPreferredSize(new java.awt.Dimension(1199, 465));
        jPanel2.setLayout(null);

        gumrukGiris_label_tirMarka.setText("Tır Marka:");
        gumrukGiris_label_tirMarka.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel2.add(gumrukGiris_label_tirMarka);
        gumrukGiris_label_tirMarka.setBounds(30, 150, 58, 14);

        gumrukGiris_label_tirModel.setText("Tır Model:");
        gumrukGiris_label_tirModel.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel2.add(gumrukGiris_label_tirModel);
        gumrukGiris_label_tirModel.setBounds(30, 190, 58, 14);

        gumrukGiris_label_yukTur.setText("Gelen Yükün Türü:");
        gumrukGiris_label_yukTur.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel2.add(gumrukGiris_label_yukTur);
        gumrukGiris_label_yukTur.setBounds(30, 230, 115, 14);

        gumrukGiris_label_yukAgirlik.setText("Giriş Ağırlığı:");
        gumrukGiris_label_yukAgirlik.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel2.add(gumrukGiris_label_yukAgirlik);
        gumrukGiris_label_yukAgirlik.setBounds(30, 270, 93, 14);

        gumrukGiris_label_girisTarih.setText("Gümrüğe Giriş Tarihi:");
        gumrukGiris_label_girisTarih.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel2.add(gumrukGiris_label_girisTarih);
        gumrukGiris_label_girisTarih.setBounds(30, 300, 121, 14);

        gumrukGiris_combobox_yukTur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçim Yapınız...", "Tehlikeli (ADR)", "Değerli", "Hassas(Kırılgan)", "Yemek" }));
        gumrukGiris_combobox_yukTur.setMinimumSize(new java.awt.Dimension(120, 20));
        gumrukGiris_combobox_yukTur.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel2.add(gumrukGiris_combobox_yukTur);
        gumrukGiris_combobox_yukTur.setBounds(150, 230, 120, 20);

        gumrukGiris_dateChoose_girisTarih.setDateFormatString("dd.MM.yyyy");
        gumrukGiris_dateChoose_girisTarih.setMaxSelectableDate(new java.util.Date(3471289264000L));
        gumrukGiris_dateChoose_girisTarih.setMinSelectableDate(new java.util.Date(946681264000L));
        gumrukGiris_dateChoose_girisTarih.setMinimumSize(new java.awt.Dimension(120, 20));
        gumrukGiris_dateChoose_girisTarih.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel2.add(gumrukGiris_dateChoose_girisTarih);
        gumrukGiris_dateChoose_girisTarih.setBounds(150, 300, 120, 20);

        gumrukGiris_text_tirMarka.setMinimumSize(new java.awt.Dimension(120, 20));
        gumrukGiris_text_tirMarka.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel2.add(gumrukGiris_text_tirMarka);
        gumrukGiris_text_tirMarka.setBounds(150, 150, 120, 20);

        gumrukGiris_text_tirModel.setMinimumSize(new java.awt.Dimension(120, 20));
        gumrukGiris_text_tirModel.setPreferredSize(new java.awt.Dimension(120, 20));
        gumrukGiris_text_tirModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumrukGiris_text_tirModelActionPerformed(evt);
            }
        });
        jPanel2.add(gumrukGiris_text_tirModel);
        gumrukGiris_text_tirModel.setBounds(150, 190, 120, 20);

        gumrukGiris_text_yukAgirlik.setMinimumSize(new java.awt.Dimension(120, 20));
        gumrukGiris_text_yukAgirlik.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel2.add(gumrukGiris_text_yukAgirlik);
        gumrukGiris_text_yukAgirlik.setBounds(150, 270, 120, 20);

        gumrukGiris_btn_kaydet.setText("KAYDET");
        gumrukGiris_btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumrukGiris_btn_kaydetActionPerformed(evt);
            }
        });
        jPanel2.add(gumrukGiris_btn_kaydet);
        gumrukGiris_btn_kaydet.setBounds(30, 350, 90, 23);

        gumrukGiris_btn_temizle.setText("TEMİZLE");
        gumrukGiris_btn_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumrukGiris_btn_temizleActionPerformed(evt);
            }
        });
        jPanel2.add(gumrukGiris_btn_temizle);
        gumrukGiris_btn_temizle.setBounds(180, 350, 90, 23);

        gumrukGiris_label_soforNumber.setText("Şofor Numara:");
        gumrukGiris_label_soforNumber.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel2.add(gumrukGiris_label_soforNumber);
        gumrukGiris_label_soforNumber.setBounds(30, 110, 93, 14);

        gumrukGiris_text_soforNumber.setMinimumSize(new java.awt.Dimension(120, 20));
        gumrukGiris_text_soforNumber.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel2.add(gumrukGiris_text_soforNumber);
        gumrukGiris_text_soforNumber.setBounds(150, 110, 120, 20);

        GumrukGiris_LabelBorder.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gümrük Giriş", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gabriola", 1, 24), new java.awt.Color(51, 204, 255))); // NOI18N
        jPanel2.add(GumrukGiris_LabelBorder);
        GumrukGiris_LabelBorder.setBounds(10, 60, 280, 350);

        gumrukGiris_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Şoför Numara", "Şoför Plaka", "Şoför Ad", "Tır Marka", "Tır Model", "Yükün Türü", "Yükün Ağırlığı", "Giriş Tarihi", "Kayıt Eden"
            }
        ));
        gumrukGiris_Table.setPreferredSize(new java.awt.Dimension(765, 380));
        jScrollPane4.setViewportView(gumrukGiris_Table);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(300, 40, 890, 380);

        jTabbedPane2.addTab("Gümrük Giriş", jPanel2);

        jPanel4.setPreferredSize(new java.awt.Dimension(1145, 500));
        jPanel4.setLayout(null);

        gumrukCikis_label_soforNumber.setText("Şofor Numara:");
        gumrukCikis_label_soforNumber.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel4.add(gumrukCikis_label_soforNumber);
        gumrukCikis_label_soforNumber.setBounds(20, 130, 93, 14);

        gumrukCikis_text_soforNumber.setMinimumSize(new java.awt.Dimension(120, 20));
        gumrukCikis_text_soforNumber.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(gumrukCikis_text_soforNumber);
        gumrukCikis_text_soforNumber.setBounds(160, 130, 120, 20);

        gumrukCikis_label_yukTur.setText("Giden Yükün Türü:");
        gumrukCikis_label_yukTur.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel4.add(gumrukCikis_label_yukTur);
        gumrukCikis_label_yukTur.setBounds(20, 170, 126, 14);

        gumrukCikis_combobox_yukTur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçim Yapınız...", "Tehlikeli (ADR)", "Değerli", "Hassas(Kırılgan)", "Yemek" }));
        gumrukCikis_combobox_yukTur.setMinimumSize(new java.awt.Dimension(120, 20));
        gumrukCikis_combobox_yukTur.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(gumrukCikis_combobox_yukTur);
        gumrukCikis_combobox_yukTur.setBounds(160, 160, 120, 20);

        gumrukCikis_label_yukAgirlik.setText("Çıkış Ağırlığı:");
        gumrukCikis_label_yukAgirlik.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel4.add(gumrukCikis_label_yukAgirlik);
        gumrukCikis_label_yukAgirlik.setBounds(20, 200, 93, 14);

        gumrukCikis_text_yukAgirlik.setMinimumSize(new java.awt.Dimension(120, 20));
        gumrukCikis_text_yukAgirlik.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(gumrukCikis_text_yukAgirlik);
        gumrukCikis_text_yukAgirlik.setBounds(160, 200, 120, 20);

        gumrukCikis_label_cikisTarih.setText("Gümrükten Çıkış Tarihi:");
        gumrukCikis_label_cikisTarih.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel4.add(gumrukCikis_label_cikisTarih);
        gumrukCikis_label_cikisTarih.setBounds(20, 240, 132, 14);

        gumrukCikis_dateChoose_cikisTarih.setDateFormatString("dd.MM.yyyy");
        gumrukCikis_dateChoose_cikisTarih.setMaxSelectableDate(new java.util.Date(3471289264000L));
        gumrukCikis_dateChoose_cikisTarih.setMinSelectableDate(new java.util.Date(946681264000L));
        gumrukCikis_dateChoose_cikisTarih.setMinimumSize(new java.awt.Dimension(120, 20));
        gumrukCikis_dateChoose_cikisTarih.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(gumrukCikis_dateChoose_cikisTarih);
        gumrukCikis_dateChoose_cikisTarih.setBounds(160, 240, 120, 20);

        gumrukCikis_btn_kaydet.setText("KAYDET");
        gumrukCikis_btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumrukCikis_btn_kaydetActionPerformed(evt);
            }
        });
        jPanel4.add(gumrukCikis_btn_kaydet);
        gumrukCikis_btn_kaydet.setBounds(20, 290, 90, 23);

        gumrukCikis_btn_temizle.setText("TEMİZLE");
        gumrukCikis_btn_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumrukCikis_btn_temizleActionPerformed(evt);
            }
        });
        jPanel4.add(gumrukCikis_btn_temizle);
        gumrukCikis_btn_temizle.setBounds(190, 290, 90, 23);

        GumrukCikis_LabelBorder.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gümrük Çıkış", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gabriola", 1, 24), new java.awt.Color(51, 204, 255))); // NOI18N
        jPanel4.add(GumrukCikis_LabelBorder);
        GumrukCikis_LabelBorder.setBounds(10, 80, 280, 250);

        jScrollPane3.setToolTipText("");

        gumrukCikis_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Şoför Numara", "Şoför Plaka", "Şoför Ad", "Tır Marka", "Tır Model", "Yükün Türü", "Yükün Ağırlığı", "Giriş Tarihi", "Kayıt Eden"
            }
        ));
        gumrukCikis_Table.setPreferredSize(new java.awt.Dimension(765, 380));
        jScrollPane3.setViewportView(gumrukCikis_Table);
        if (gumrukCikis_Table.getColumnModel().getColumnCount() > 0) {
            gumrukCikis_Table.getColumnModel().getColumn(0).setHeaderValue("Şoför Numara");
            gumrukCikis_Table.getColumnModel().getColumn(1).setHeaderValue("Şoför Plaka");
            gumrukCikis_Table.getColumnModel().getColumn(2).setHeaderValue("Şoför Ad");
            gumrukCikis_Table.getColumnModel().getColumn(3).setHeaderValue("Tır Marka");
            gumrukCikis_Table.getColumnModel().getColumn(4).setHeaderValue("Tır Model");
            gumrukCikis_Table.getColumnModel().getColumn(5).setHeaderValue("Yükün Türü");
            gumrukCikis_Table.getColumnModel().getColumn(6).setHeaderValue("Yükün Ağırlığı");
            gumrukCikis_Table.getColumnModel().getColumn(7).setHeaderValue("Giriş Tarihi");
            gumrukCikis_Table.getColumnModel().getColumn(8).setHeaderValue("Kayıt Eden");
        }

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(300, 40, 890, 380);

        jTabbedPane2.addTab("Gümrük Çıkış", jPanel4);

        gumrukSorgu_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Şoför Numara", "Şoför Plaka", "Şoför Ad", "Tır Marka", "Tır Model", "Yükün Türü", "Yükün Ağırlığı", "Giriş Tarihi", "Çıkış Tarihi", "Kayıt Eden"
            }
        ));
        jScrollPane6.setViewportView(gumrukSorgu_Table);

        sorguBosalt.setText("Sorgu Boşalt");
        sorguBosalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorguBosaltActionPerformed(evt);
            }
        });

        jButton4.setText("Şoför Ad Göre");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Numara Göre");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Yük Türe Göre");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        degerGir.setPreferredSize(new java.awt.Dimension(100, 20));

        jLabel8.setText("Değer Gir:");

        jButton5.setText("Plaka Göre");
        jButton5.setPreferredSize(new java.awt.Dimension(126, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(degerGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(sorguBosalt))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(degerGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(138, 138, 138)
                .addComponent(sorguBosalt)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Normal Sorgu", jPanel9);

        jLabel9.setText("İlk Tarih Gir:");

        tarihGir1.setPreferredSize(new java.awt.Dimension(100, 20));

        sorguBosalt1.setText("Sorgu Boşalt");
        sorguBosalt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorguBosalt1ActionPerformed(evt);
            }
        });

        jLabel10.setText("İkinci Tarih Gir:");

        tarihGir2.setPreferredSize(new java.awt.Dimension(100, 20));

        tarihSorgu.setText("Tarihe Göre");
        tarihSorgu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarihSorguActionPerformed(evt);
            }
        });

        myButtonGroup.add(girisTarihRadio);
        girisTarihRadio.setText("Giriş Tarih Göre");

        myButtonGroup.add(cikisTarihRadio);
        cikisTarihRadio.setText("Çıkış Tarih Göre");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(tarihGir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tarihSorgu)
                            .addComponent(tarihGir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(girisTarihRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cikisTarihRadio))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 126, Short.MAX_VALUE)
                        .addComponent(sorguBosalt1)))
                .addGap(23, 23, 23))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(girisTarihRadio)
                    .addComponent(cikisTarihRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tarihGir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tarihGir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tarihSorgu)
                .addGap(63, 63, 63)
                .addComponent(sorguBosalt1)
                .addGap(27, 27, 27))
        );

        jTabbedPane4.addTab("Tarihe Göre", jPanel10);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Gümrük Sorgu", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Gümrük Islemleri");

        jTabbedPane1.addTab("Gümrük İşlemleri", jPanel1);

        jTabbedPane3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTabbedPane3.setPreferredSize(new java.awt.Dimension(1269, 483));
        jTabbedPane3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabbedPane3KeyPressed(evt);
            }
        });

        jPanel6.setLayout(null);

        soforKayit_label_soforAd.setText("Şofor Ad:");
        soforKayit_label_soforAd.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel6.add(soforKayit_label_soforAd);
        soforKayit_label_soforAd.setBounds(29, 179, 58, 14);

        soforKayit_text_soforAd.setMinimumSize(new java.awt.Dimension(120, 20));
        soforKayit_text_soforAd.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel6.add(soforKayit_text_soforAd);
        soforKayit_text_soforAd.setBounds(210, 170, 120, 20);

        soforKayit_label_tercihTir.setText("Tercih Edilen Tır Markası:");
        soforKayit_label_tercihTir.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel6.add(soforKayit_label_tercihTir);
        soforKayit_label_tercihTir.setBounds(29, 241, 150, 14);

        soforKayit_text_tercihTir.setMinimumSize(new java.awt.Dimension(120, 20));
        soforKayit_text_tercihTir.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel6.add(soforKayit_text_tercihTir);
        soforKayit_text_tercihTir.setBounds(210, 240, 120, 20);

        soforKayit_label_tercihYukTur.setText("Terich Ettiği Yük Türü:");
        soforKayit_label_tercihYukTur.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel6.add(soforKayit_label_tercihYukTur);
        soforKayit_label_tercihYukTur.setBounds(29, 272, 130, 14);

        soforKayit_combobox_tercihYukTur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçim Yapınız...", "Tehlikeli (ADR)", "Değerli", "Hassas(Kırılgan)", "Yemek" }));
        soforKayit_combobox_tercihYukTur.setMinimumSize(new java.awt.Dimension(120, 20));
        soforKayit_combobox_tercihYukTur.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel6.add(soforKayit_combobox_tercihYukTur);
        soforKayit_combobox_tercihYukTur.setBounds(210, 270, 120, 20);

        soforKayit_label_soforYas.setText("Şofor Yaş:");
        soforKayit_label_soforYas.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel6.add(soforKayit_label_soforYas);
        soforKayit_label_soforYas.setBounds(29, 210, 58, 14);

        soforKayit_text_soforYas.setMinimumSize(new java.awt.Dimension(120, 20));
        soforKayit_text_soforYas.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel6.add(soforKayit_text_soforYas);
        soforKayit_text_soforYas.setBounds(210, 210, 120, 20);

        soforKayit_btn_kaydet.setText("KAYDET");
        soforKayit_btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soforKayit_btn_kaydetActionPerformed(evt);
            }
        });
        jPanel6.add(soforKayit_btn_kaydet);
        soforKayit_btn_kaydet.setBounds(80, 320, 90, 23);

        soforKayit_btn_temizle.setText("TEMİZLE");
        soforKayit_btn_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soforKayit_btn_temizleActionPerformed(evt);
            }
        });
        jPanel6.add(soforKayit_btn_temizle);
        soforKayit_btn_temizle.setBounds(230, 320, 90, 23);

        soforKayit_label_soforNumber.setText("Şofor Numara:");
        soforKayit_label_soforNumber.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel6.add(soforKayit_label_soforNumber);
        soforKayit_label_soforNumber.setBounds(29, 117, 120, 14);

        soforKayit_text_soforNumber.setMinimumSize(new java.awt.Dimension(120, 20));
        soforKayit_text_soforNumber.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel6.add(soforKayit_text_soforNumber);
        soforKayit_text_soforNumber.setBounds(210, 110, 120, 20);

        soforKayit_label_soforPlaka.setText("Şofor Plaka:");
        soforKayit_label_soforPlaka.setPreferredSize(new java.awt.Dimension(49, 14));
        jPanel6.add(soforKayit_label_soforPlaka);
        soforKayit_label_soforPlaka.setBounds(29, 148, 82, 14);

        soforKayit_text_soforPlaka.setMinimumSize(new java.awt.Dimension(120, 20));
        soforKayit_text_soforPlaka.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel6.add(soforKayit_text_soforPlaka);
        soforKayit_text_soforPlaka.setBounds(210, 140, 120, 20);

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Şoför Kayıt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gabriola", 1, 24), new java.awt.Color(51, 204, 255))); // NOI18N
        jPanel6.add(jLabel4);
        jLabel4.setBounds(10, 80, 340, 280);

        soforKayit_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Plaka", "Ad", "Yaş", "Tercih Edilen Tır", "Tercih Eldilen Yük", "Kullandığı Tır", "Taşıdığı Yük"
            }
        ));
        jScrollPane1.setViewportView(soforKayit_Table);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(370, 20, 800, 402);

        jTabbedPane3.addTab("Şoför Kayıt", jPanel6);

        soforBilgi_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Plaka", "Ad", "Yaş", "Tercih Edilen Tır", "Tercih Eldilen Yük", "Kullandığı Tır", "Taşıdığı Yük"
            }
        ));
        jScrollPane5.setViewportView(soforBilgi_Table);

        jLabel12.setText("Sisteme Kayıtlı Şoför Sayısı: ");

        soforBilgi_soforSayi.setText("S");
        soforBilgi_soforSayi.setPreferredSize(new java.awt.Dimension(30, 20));

        jLabel14.setText("Şoför Yaş Ortalama: ");

        soforBilgi_yasOrtalama.setText("S");
        soforBilgi_yasOrtalama.setPreferredSize(new java.awt.Dimension(30, 20));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(soforBilgi_soforSayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(soforBilgi_yasOrtalama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(soforBilgi_soforSayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(soforBilgi_yasOrtalama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Şoför Bilgileri", jPanel7);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane3.getAccessibleContext().setAccessibleName("Sofor İslemleri");

        jTabbedPane1.addTab("Şoför İşlemleri", jPanel3);

        jblNewLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jblNewLabel.setForeground(new java.awt.Color(255, 51, 102));
        jblNewLabel.setText(Gumruk_Main.acikOturum);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Oturumda Olan Kullanıcı:");

        jblNewLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblNewLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jblNewLabel1.setText(Gumruk_Main.tarihSaatGetir);
        jblNewLabel1.setAlignmentY(0.0F);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/çıkış.png"))); // NOI18N
        jButton1.setAlignmentY(0.0F);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(34, 53, 68));
        jLabel5.setText("TechnoKantar");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Renault.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Sistem Tarih Saat:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jblNewLabel)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblNewLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNewLabel)
                            .addComponent(jLabel1))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(2, 2, 2))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNewLabel1)
                            .addComponent(jLabel7))
                        .addGap(22, 22, 22))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Gumruk_Islemleri");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabbedPane3KeyPressed

    }//GEN-LAST:event_jTabbedPane3KeyPressed

    private void soforKayit_btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soforKayit_btn_temizleActionPerformed
        soforKayit_text_soforNumber.setText(null);
        soforKayit_text_soforAd.setText(null);
        soforKayit_text_soforYas.setText(null);
        soforKayit_text_tercihTir.setText(null);
        soforKayit_combobox_tercihYukTur.setSelectedIndex(0);
        soforKayit_text_soforPlaka.setText(null);
    }//GEN-LAST:event_soforKayit_btn_temizleActionPerformed

    private void soforKayit_btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soforKayit_btn_kaydetActionPerformed

        Statement st=null;
        ResultSet res;
        String soforNumara=soforKayit_text_soforNumber.getText();
        String soforPlaka=soforKayit_text_soforPlaka.getText();
        String soforAd=soforKayit_text_soforAd.getText();
        String soforYas=soforKayit_text_soforYas.getText();
        String soforTercihTir=soforKayit_text_tercihTir.getText();
        Object soforYukTercih=soforKayit_combobox_tercihYukTur.getSelectedItem();

        String soforNumara1 = null;

        try {
            st=conn.createStatement();
            res=st.executeQuery("select * from sofor where sofor_id='"+soforNumara+"'");

            while(res.next())
            {
                soforNumara1=res.getString("sofor_id");

            }

            if (soforNumara.equals("") || soforAd.equals("") || soforYas.equals("") || soforTercihTir.equals("") || soforYukTercih.equals("Seçim Yapınız..."))
            {
                JOptionPane.showConfirmDialog(null, "Boş Alan Olmamalı...","Admin Giriş",JOptionPane.PLAIN_MESSAGE);
            }

            else
            {
                if ((soforNumara.equals(soforNumara1)))
                {
                    JOptionPane.showConfirmDialog(null, "Bu Numaraya ait Şoför Zaten Şuanda Sistemde Mevcut !!!","Admin",JOptionPane.PLAIN_MESSAGE);
                }

                else
                {
                    JOptionPane.showConfirmDialog(null, "Şoför Sisteme Başarılı Bir Şekilde Kayıt Edildi." + "Hoşgeldiniz: " + soforAd,"Admin",JOptionPane.PLAIN_MESSAGE);
                    String sql = "INSERT INTO sofor (sofor_id, sofor_plaka, sofor_ad, sofor_yas, sofor_tercihYukTur, sofor_tercihTirMarka)"
                    + " VALUES ('"+soforNumara+"', '"+soforPlaka+"', '"+soforAd+"', '"+soforYas+"', '"+soforYukTercih+"', '"+soforTercihTir+"')";

                    st.executeUpdate(sql);
                    soforGoster();
                    sorguIstatistik();
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_soforKayit_btn_kaydetActionPerformed

    private void gumrukCikis_btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gumrukCikis_btn_temizleActionPerformed
        gumrukCikis_text_soforNumber.setText(null);
        gumrukCikis_text_yukAgirlik.setText(null);
        gumrukCikis_combobox_yukTur.setSelectedIndex(0);
    }//GEN-LAST:event_gumrukCikis_btn_temizleActionPerformed

    private void gumrukCikis_btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gumrukCikis_btn_kaydetActionPerformed
        Statement st=null;
        ResultSet res;
        String soforNumara=gumrukCikis_text_soforNumber.getText();
        String agirlikYuk= gumrukCikis_text_yukAgirlik.getText();
        Object yukTur= gumrukCikis_combobox_yukTur.getSelectedItem();

        String soforNumara1 = null;
        String soforNumara2 = null;
        String soforAd=null;
        String soforPlaka=null;

        try {
            st=conn.createStatement();
            res=st.executeQuery("select * from sofor where sofor_id='"+soforNumara+"'");

            while(res.next())
            {
                soforNumara1=res.getString("sofor_id");
                soforAd=res.getString("sofor_Ad");
                soforPlaka=res.getString("sofor_plaka");
            }

            if (soforNumara.equals("") || agirlikYuk.equals("") || yukTur.equals("Seçim Yapınız..."))
            {
                JOptionPane.showConfirmDialog(null, "Boş Alan Olmamalı...","Admin Giriş",JOptionPane.PLAIN_MESSAGE);
            }

            else
            {
                if ((soforNumara.equals(soforNumara1)))
                {
                    //String gumrukdepoSoforNumara = null;
                    String gumrukdepoSoforAd    = null;
                    String gumrukdepoTirMarka = null;
                    String gumrukdepoTirModel  = null;

                    res=st.executeQuery("select * from gumrukDepo where gumrukDepo_soforNumara='"+soforNumara+"'");
                    while(res.next())
                    {
                        soforNumara2=res.getString("gumrukDepo_soforNumara");
                        gumrukdepoSoforAd=res.getString("gumrukDepo_soforAd");
                        gumrukdepoTirMarka=res.getString("gumrukDepo_tirMarka");
                        gumrukdepoTirModel=res.getString("gumrukDepo_tirModel");
                    }

                    if((gumrukCikis_text_soforNumber.getText().equals(soforNumara2)))
                    {
                        String sql1 = "INSERT INTO gumrukGecmis (gumrukGecmis_soforPlaka, gumrukGecmis_soforAd,gumrukGecmis_soforNumara,gumrukGecmis_tirMarka,"
                        + "gumrukGecmis_tirModel,gumrukGecmis_turYuk,gumrukGecmis_agirlikYuk,gumrukGecmis_gumrukCikis, gumrukGecmis_kayitEden)"
                        + " VALUES ('"+soforPlaka+"', '"+gumrukdepoSoforAd+"', '"+soforNumara2+"', '"+gumrukdepoTirMarka+"', '"+gumrukdepoTirModel+"', '"+yukTur+"', "
                        + "'"+agirlikYuk+"', '"+((JTextField)gumrukCikis_dateChoose_cikisTarih.getDateEditor().getUiComponent()).getText()+"', '"+acikKullanici+"')";

                        st.executeUpdate(sql1);

                        JOptionPane.showConfirmDialog(null, "Gümrükten Çıkış Yaptı..." + "Güle Güle: " + soforAd,"Admin",JOptionPane.PLAIN_MESSAGE);

                        Statement stSil=(Statement) conn.createStatement();
                        stSil.executeUpdate("delete from gumrukDepo where gumrukDepo_soforNumara='"+soforNumara+"'");
                        st.executeUpdate("update sofor set sofor_tasidigiYukTur='"+yukTur+"' where sofor_id='"+soforNumara+"'");
                        gumrukDepoGoster();
                        sorguIstatistik();
                        gumrukGecmisGoster();
                        soforGoster();
                    }

                    else
                    {
                        JOptionPane.showConfirmDialog(null, "Şöfor Giriş Yapmamış...","Admin",JOptionPane.PLAIN_MESSAGE);
                    }
                }

                else
                {
                    JOptionPane.showConfirmDialog(null, "Sistemde bu numaralı bir Şoför yok. Lütfen numarayı doğru yazın.","Admin",JOptionPane.PLAIN_MESSAGE);
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gumrukCikis_btn_kaydetActionPerformed

    private void gumrukGiris_btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gumrukGiris_btn_temizleActionPerformed

        gumrukGiris_text_soforNumber.setText(null);
        gumrukGiris_text_tirMarka.setText(null);
        gumrukGiris_text_tirModel.setText(null);
        gumrukGiris_text_yukAgirlik.setText(null);
        gumrukGiris_combobox_yukTur.setSelectedIndex(0);
    }//GEN-LAST:event_gumrukGiris_btn_temizleActionPerformed

    private void gumrukGiris_btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gumrukGiris_btn_kaydetActionPerformed
        Statement st=null;
        ResultSet res;
        String soforNumara=gumrukGiris_text_soforNumber.getText();
        String tirMarka=gumrukGiris_text_tirMarka.getText();
        String tirModel=gumrukGiris_text_tirModel.getText();
        String agirlikYuk= gumrukGiris_text_yukAgirlik.getText();
        Object yukTur= gumrukGiris_combobox_yukTur.getSelectedItem();

        String soforNumara1 = null;
        String soforNumara2 = null;
        String soforAd=null;
        String soforPlaka=null;
        

        try {
            st=conn.createStatement();
            res=st.executeQuery("select * from sofor where sofor_id='"+gumrukGiris_text_soforNumber.getText()+"'");
              
            while(res.next())
            {
                soforNumara1=res.getString("sofor_id");
                soforAd=res.getString("sofor_Ad");
                soforPlaka=res.getString("sofor_plaka");                 
            }

            if (soforNumara.equals("") || tirMarka.equals("") || tirModel.equals("") || agirlikYuk.equals("") || yukTur.equals("Seçim Yapınız..."))
            {
                JOptionPane.showConfirmDialog(null, "Boş Alan Olmamalı...","Admin Giriş",JOptionPane.PLAIN_MESSAGE);
            }

            else
            {
                if ((soforNumara.equals(soforNumara1)))
                {
                    res=st.executeQuery("select * from gumrukDepo where gumrukDepo_soforNumara='"+soforNumara+"'");
                    while(res.next())
                    {
                        soforNumara2=res.getString("gumrukDepo_soforNumara");

                    }

                    if((soforNumara.equals(soforNumara2)))
                    {
                        JOptionPane.showConfirmDialog(null, "Bu Şoför zaten Giriş Yapmış.","Admin",JOptionPane.PLAIN_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showConfirmDialog(null, "Gümrüğe Başarıyla Giriş Yapıldı." + "Hoşgeldiniz: " + soforAd, "Admin",JOptionPane.PLAIN_MESSAGE);

                        String sql = "INSERT INTO gumrukDepo (gumrukDepo_soforPlaka, gumrukDepo_soforAd, gumrukDepo_soforNumara, gumrukDepo_tirMarka,"
                        + "gumrukDepo_tirModel, gumrukDepo_turYuk, gumrukDepo_agirlikYuk, gumrukDepo_girisTarih, gumrukDepo_kayitEden)"
                        + " VALUES ('"+soforPlaka+"', '"+soforAd+"', '"+soforNumara+"', '"+tirMarka+"', '"+tirModel+"', '"+yukTur+"', "
                        + "'"+agirlikYuk+"', '"+((JTextField)gumrukGiris_dateChoose_girisTarih.getDateEditor().getUiComponent()).getText()+"', '"+acikKullanici+"')";

                        String sql1 = "INSERT INTO gumrukGecmis (gumrukGecmis_soforPlaka, gumrukGecmis_soforAd,gumrukGecmis_soforNumara,gumrukGecmis_tirMarka,"
                        + "gumrukGecmis_tirModel,gumrukGecmis_turYuk,gumrukGecmis_agirlikYuk,gumrukGecmis_gumrukGiris, gumrukGecmis_kayitEden)"
                        + " VALUES ('"+soforPlaka+"', '"+soforAd+"', '"+soforNumara+"', '"+tirMarka+"', '"+tirModel+"', '"+yukTur+"', "
                        + "'"+agirlikYuk+"', '"+((JTextField)gumrukGiris_dateChoose_girisTarih.getDateEditor().getUiComponent()).getText()+"', '"+acikKullanici+"')";

                        st.executeUpdate(sql1);
                        st.executeUpdate(sql);

                        st.executeUpdate("update sofor set sofor_KullanilanTirMarka='"+tirMarka+"',sofor_tasidigiYukTur='"+yukTur+"' where sofor_id='"+soforNumara+"'");
                        gumrukDepoGoster();
                        sorguIstatistik();
                        gumrukGecmisGoster();
                         soforGoster();
                    }
                }

                else
                {
                    JOptionPane.showConfirmDialog(null, "Sistemde bu numaralı bir Şoför yok. Lütfen numarayı doğru yazın.","Admin",JOptionPane.PLAIN_MESSAGE);
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gumrukGiris_btn_kaydetActionPerformed

    private void gumrukGiris_text_tirModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gumrukGiris_text_tirModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gumrukGiris_text_tirModelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            conn.close();
            System.exit(0);
        } catch (Exception ex) {
            Logger.getLogger(Gumruk_Giris.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if ((degerGir.getText()).equals(""))
         {
            JOptionPane.showConfirmDialog(null, "Bir Değer Girin!","Admin Giriş",JOptionPane.PLAIN_MESSAGE);    
         } 
         
         else 
         {   
            try {        
                 st=conn.createStatement();
                 res=st.executeQuery("select * from gumrukGecmis where gumrukGecmis_turYuk='"+degerGir.getText()+"'");
                 String gelenDeger=null;              
                       
                 while (res.next())
                 {
                    gelenDeger=res.getString("gumrukGecmis_turYuk");                        
                 }
                 
                if ((degerGir.getText().equals(gelenDeger)))
                    {                 
                     try 
                        {
                            Statement st=null;
                            ResultSet res;
                            st=conn.createStatement();
                            res = st.executeQuery("Select * from gumrukGecmis where gumrukGecmis_turYuk = '"+degerGir.getText()+"'"); 
                            gumrukCikis_TableModel model = new  gumrukCikis_TableModel(res);    
                            gumrukSorgu_Table.setModel(model.getModel());      
                        } 
                     
                     catch (Exception e) 
                        {
                            JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
                        }        
                    }
                
                else
                    {
                        JOptionPane.showConfirmDialog(null, "Girilen Değer Mevcut Değil!","Admin",JOptionPane.PLAIN_MESSAGE);                       
                    }            
                } 
            catch (Exception ex) 
                {
                    Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
        }                          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         if ((degerGir.getText()).equals(""))
         {
            JOptionPane.showConfirmDialog(null, "Bir Değer Girin!","Admin Giriş",JOptionPane.PLAIN_MESSAGE);    
         } 
         
         else 
         {   
            try {        
                 st=conn.createStatement();
                 res=st.executeQuery("select * from gumrukGecmis where gumrukGecmis_soforNumara='"+degerGir.getText()+"'");
                 String gelenDeger=null;              
                       
                 while (res.next())
                 {
                    gelenDeger=res.getString("gumrukGecmis_soforNumara");                        
                 }
                 
                if ((degerGir.getText().equals(gelenDeger)))
                    {                 
                     try 
                        {
                            Statement st=null;
                            ResultSet res;
                            st=conn.createStatement();
                            res = st.executeQuery("Select * from gumrukGecmis where gumrukGecmis_soforNumara = '"+degerGir.getText()+"'"); 
                            gumrukCikis_TableModel model = new  gumrukCikis_TableModel(res);    
                            gumrukSorgu_Table.setModel(model.getModel());      
                        } 
                     
                     catch (Exception e) 
                        {
                            JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
                        }        
                    }
                
                else
                    {
                        JOptionPane.showConfirmDialog(null, "Girilen Değer Mevcut Değil!","Admin",JOptionPane.PLAIN_MESSAGE);                       
                    }            
                } 
            catch (Exception ex) 
                {
                    Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sorguBosaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorguBosaltActionPerformed
          gumrukGecmisGoster();
    }//GEN-LAST:event_sorguBosaltActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
               if ((degerGir.getText()).equals(""))
         {
            JOptionPane.showConfirmDialog(null, "Bir Değer Girin!","Admin Giriş",JOptionPane.PLAIN_MESSAGE);    
         } 
         
         else 
         {   
            try {        
                 st=conn.createStatement();
                 res=st.executeQuery("select * from gumrukGecmis where gumrukGecmis_soforPlaka='"+degerGir.getText()+"'");
                 String gelenDeger=null;              
                       
                 while (res.next())
                 {
                    gelenDeger=res.getString("gumrukGecmis_soforPlaka");                        
                 }
                 
                if ((degerGir.getText().equals(gelenDeger)))
                    {                 
                     try 
                        {
                            Statement st=null;
                            ResultSet res;
                            st=conn.createStatement();
                            res = st.executeQuery("Select * from gumrukGecmis where gumrukGecmis_soforPlaka = '"+degerGir.getText()+"'"); 
                            gumrukCikis_TableModel model = new  gumrukCikis_TableModel(res);    
                            gumrukSorgu_Table.setModel(model.getModel());      
                        } 
                     
                     catch (Exception e) 
                        {
                            JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
                        }        
                    }
                
                else
                    {
                        JOptionPane.showConfirmDialog(null, "Girilen Değer Mevcut Değil!","Admin",JOptionPane.PLAIN_MESSAGE);                       
                    }            
                } 
            catch (Exception ex) 
                {
                    Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
        }                    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                           if ((degerGir.getText()).equals(""))
         {
            JOptionPane.showConfirmDialog(null, "Bir Değer Girin!","Admin Giriş",JOptionPane.PLAIN_MESSAGE);    
         } 
         
         else 
         {   
            try {        
                 st=conn.createStatement();
                 res=st.executeQuery("select * from gumrukGecmis where gumrukGecmis_soforAd='"+degerGir.getText()+"'");
                 String gelenDeger=null;              
                       
                 while (res.next())
                 {
                    gelenDeger=res.getString("gumrukGecmis_soforAd");                        
                 }
                 
                if ((degerGir.getText().equals(gelenDeger)))
                    {                 
                     try 
                        {
                            Statement st=null;
                            ResultSet res;
                            st=conn.createStatement();
                            res = st.executeQuery("Select * from gumrukGecmis where gumrukGecmis_soforAd = '"+degerGir.getText()+"'"); 
                            gumrukCikis_TableModel model = new  gumrukCikis_TableModel(res);    
                            gumrukSorgu_Table.setModel(model.getModel());      
                        } 
                     
                     catch (Exception e) 
                        {
                            JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
                        }        
                    }
                
                else
                    {
                        JOptionPane.showConfirmDialog(null, "Girilen Değer Mevcut Değil!","Admin",JOptionPane.PLAIN_MESSAGE);                       
                    }            
                } 
            catch (Exception ex) 
                {
                    Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
        }  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void sorguBosalt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorguBosalt1ActionPerformed
         gumrukGecmisGoster();
    }//GEN-LAST:event_sorguBosalt1ActionPerformed

    private void tarihSorguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarihSorguActionPerformed
        if ((tarihGir1.getText()).equals("") || (tarihGir2.getText()).equals(""))
         {
            JOptionPane.showConfirmDialog(null, "Bir Değer Girin!","Admin Giriş",JOptionPane.PLAIN_MESSAGE);    
         } 
         
         else 
         {   
             
             if (girisTarihRadio.isSelected()== true)
             {
                      try {        
                 st=conn.createStatement();
                 st2=conn.createStatement();
                 res=st.executeQuery("select * from gumrukGecmis where gumrukGecmis_gumrukGiris='"+tarihGir1.getText()+"'");
                 res2 = st2.executeQuery("select * from gumrukGecmis where gumrukGecmis_gumrukGiris='"+tarihGir2.getText()+"'");
                 
                 //select * from sofor where sofor_id between input1 AND input2
                
                 String gelenDeger=null;              
                 String gelenDeger2=null; 
                 
                 while (res.next())
                 {
                    gelenDeger=res.getString("gumrukGecmis_gumrukGiris");  
                    
                 }
                
                 while (res2.next())
                 {
                    
                    gelenDeger2=res2.getString("gumrukGecmis_gumrukGiris"); 
                 }
                 
                if ((tarihGir1.getText().equals(gelenDeger)) && (tarihGir2.getText().equals(gelenDeger2)))
                    {                 
                     try 
                        {
                            Statement st=null;
                            ResultSet res;
                            st=conn.createStatement();
                            res = st.executeQuery("Select * from gumrukGecmis where gumrukGecmis_gumrukGiris between '"+tarihGir1.getText()+"' and '"+tarihGir2.getText()+"'"); 
                            gumrukCikis_TableModel model = new  gumrukCikis_TableModel(res);    
                            gumrukSorgu_Table.setModel(model.getModel());      
                        } 
                     
                     catch (Exception e) 
                        {
                            JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
                        }        
                    }
                
                else
                    {
                        JOptionPane.showConfirmDialog(null, "Girilen Tarihlerden Biri Mevcut Değil!","Admin",JOptionPane.PLAIN_MESSAGE);                       
                    }            
                } 
            catch (Exception ex) 
                {
                    Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
             }
             
             else {
                 try {        
                 st=conn.createStatement();
                 st2=conn.createStatement();
                 res=st.executeQuery("select * from gumrukGecmis where gumrukGecmis_gumrukCikis='"+tarihGir1.getText()+"'");
                 res2 = st2.executeQuery("select * from gumrukGecmis where gumrukGecmis_gumrukCikis='"+tarihGir2.getText()+"'");
                 
                 //select * from sofor where sofor_id between input1 AND input2
                
                 String gelenDeger=null;              
                 String gelenDeger2=null; 
                 
                 while (res.next())
                 {
                    gelenDeger=res.getString("gumrukGecmis_gumrukCikis");  
                    
                 }
                
                 while (res2.next())
                 {
                    
                    gelenDeger2=res2.getString("gumrukGecmis_gumrukCikis"); 
                 }
                 
                if ((tarihGir1.getText().equals(gelenDeger)) && (tarihGir2.getText().equals(gelenDeger2)))
                    {                 
                     try 
                        {
                            Statement st=null;
                            ResultSet res;
                            st=conn.createStatement();
                            res = st.executeQuery("Select * from gumrukGecmis where gumrukGecmis_gumrukCikis between '"+tarihGir1.getText()+"' and '"+tarihGir2.getText()+"'"); 
                            gumrukCikis_TableModel model = new  gumrukCikis_TableModel(res);    
                            gumrukSorgu_Table.setModel(model.getModel());      
                        } 
                     
                     catch (Exception e) 
                        {
                            JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
                        }        
                    }
                
                else
                    {
                        JOptionPane.showConfirmDialog(null, "Girilen Tarihlerden Biri Mevcut Değil!","Admin",JOptionPane.PLAIN_MESSAGE);                       
                    }            
                } 
            catch (Exception ex) 
                {
                    Logger.getLogger(Gumruk_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
             }                        
        }  
    }//GEN-LAST:event_tarihSorguActionPerformed

     private void gumrukDepoGoster()
     {   //------------------------------gumrukDepo Veritbanı Kayıları Gösterir------------- 
      try {
        Statement st=null;
        ResultSet res;
        st=conn.createStatement();
    res = st.executeQuery("SELECT * FROM gumrukDepo"); 
    gumrukDepo_TableModel model = new gumrukDepo_TableModel(res); 
    anaTable.setModel(model.getModel());
    gumrukCikis_Table.setModel(model.getModel());
    gumrukGiris_Table.setModel(model.getModel()); 
} 
    catch (Exception e) 
    {
        JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
    }        
}
     
      private void soforGoster()
     {   //------------------------------sofor Veritbanı Kayıları Gösterir------------- 
      try {
        Statement st=null;
        ResultSet res;
        st=conn.createStatement();
    res = st.executeQuery("SELECT * FROM sofor"); 
    sofor_TableModel model = new sofor_TableModel(res);    
    soforKayit_Table.setModel(model.getModel());
    soforBilgi_Table.setModel(model.getModel());  
} 
    catch (Exception e) 
    {
        JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
    }        
}
      
         private void gumrukGecmisGoster()
     {   //------------------------------Gümrük Geçmiş Veritbanı Kayıları Gösterir------------- 
      try {
        Statement st=null;
        ResultSet res;
        st=conn.createStatement();
    res = st.executeQuery("SELECT * FROM gumrukGecmis"); 
    gumrukCikis_TableModel model = new  gumrukCikis_TableModel(res);    
    gumrukSorgu_Table.setModel(model.getModel());
      
} 
    catch (Exception e) 
    {
        JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
    }        
}
      
    
      private void sorguIstatistik()
      {
            try
       {
            Statement pst=null;
            Statement pst2=null;
            Statement pst3=null;
            Statement pst4=null;
            
            
            

            
            ResultSet depo_bulunanSofor;
            ResultSet sistem_kayitSofor;
            ResultSet depo_toplamAgirlik;
            ResultSet soforYasOrtalama;
            
           
            

           pst = conn.createStatement();
           pst2 = conn.createStatement();
           pst3 = conn.createStatement();
           pst4 = conn.createStatement();
           
           
           depo_bulunanSofor=pst.executeQuery("select count(gumrukDepo_soforNumara) from gumrukDepo");   
           sistem_kayitSofor=pst2.executeQuery("select count(sofor_id) from sofor");
           soforYasOrtalama=pst4.executeQuery("select avg(sofor_yas) from sofor");
           depo_toplamAgirlik=pst3.executeQuery("select sum(gumrukDepo_agirlikYuk) from gumrukDepo");
           
          
           
           
           while(depo_toplamAgirlik.next())
           {
               String depoSofor = depo_bulunanSofor.getString("count(gumrukDepo_soforNumara)");
               label_gumrukArac.setText(depoSofor);   
               
               String kayitSofor = sistem_kayitSofor.getString("count(sofor_id)");
               label_sistemKayitSofor.setText(kayitSofor);
               soforBilgi_soforSayi.setText(kayitSofor);
               
               String yukAgirlik = depo_toplamAgirlik.getString("sum(gumrukDepo_agirlikYuk)");
               label_yukAgirlik.setText(yukAgirlik);
               
               String yasOrtalama = soforYasOrtalama.getString("avg(sofor_yas)");
               soforBilgi_yasOrtalama.setText(yasOrtalama);
           }
           
           
       } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Gumruk_Giris.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
      
    
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
            java.util.logging.Logger.getLogger(Gumruk_Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gumruk_Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gumruk_Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gumruk_Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gumruk_Giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GumrukCikis_LabelBorder;
    private javax.swing.JLabel GumrukGiris_LabelBorder;
    private javax.swing.JTable anaTable;
    private javax.swing.JRadioButton cikisTarihRadio;
    private javax.swing.JTextField degerGir;
    private javax.swing.JRadioButton girisTarihRadio;
    private javax.swing.JTable gumrukCikis_Table;
    private javax.swing.JButton gumrukCikis_btn_kaydet;
    private javax.swing.JButton gumrukCikis_btn_temizle;
    private javax.swing.JComboBox<String> gumrukCikis_combobox_yukTur;
    private com.toedter.calendar.JDateChooser gumrukCikis_dateChoose_cikisTarih;
    private javax.swing.JLabel gumrukCikis_label_cikisTarih;
    private javax.swing.JLabel gumrukCikis_label_soforNumber;
    private javax.swing.JLabel gumrukCikis_label_yukAgirlik;
    private javax.swing.JLabel gumrukCikis_label_yukTur;
    private javax.swing.JTextField gumrukCikis_text_soforNumber;
    private javax.swing.JTextField gumrukCikis_text_yukAgirlik;
    private javax.swing.JTable gumrukGiris_Table;
    private javax.swing.JButton gumrukGiris_btn_kaydet;
    private javax.swing.JButton gumrukGiris_btn_temizle;
    private javax.swing.JComboBox<String> gumrukGiris_combobox_yukTur;
    private com.toedter.calendar.JDateChooser gumrukGiris_dateChoose_girisTarih;
    private javax.swing.JLabel gumrukGiris_label_girisTarih;
    private javax.swing.JLabel gumrukGiris_label_soforNumber;
    private javax.swing.JLabel gumrukGiris_label_tirMarka;
    private javax.swing.JLabel gumrukGiris_label_tirModel;
    private javax.swing.JLabel gumrukGiris_label_yukAgirlik;
    private javax.swing.JLabel gumrukGiris_label_yukTur;
    private javax.swing.JTextField gumrukGiris_text_soforNumber;
    private javax.swing.JTextField gumrukGiris_text_tirMarka;
    private javax.swing.JTextField gumrukGiris_text_tirModel;
    private javax.swing.JTextField gumrukGiris_text_yukAgirlik;
    private javax.swing.JTable gumrukSorgu_Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel jblNewLabel;
    public javax.swing.JLabel jblNewLabel1;
    private javax.swing.JLabel label_gumrukArac;
    private javax.swing.JLabel label_sistemKayitSofor;
    private javax.swing.JLabel label_yukAgirlik;
    private javax.swing.ButtonGroup myButtonGroup;
    private javax.swing.JTable soforBilgi_Table;
    private javax.swing.JLabel soforBilgi_soforSayi;
    private javax.swing.JLabel soforBilgi_yasOrtalama;
    private javax.swing.JTable soforKayit_Table;
    private javax.swing.JButton soforKayit_btn_kaydet;
    private javax.swing.JButton soforKayit_btn_temizle;
    private javax.swing.JComboBox<String> soforKayit_combobox_tercihYukTur;
    private javax.swing.JLabel soforKayit_label_soforAd;
    private javax.swing.JLabel soforKayit_label_soforNumber;
    private javax.swing.JLabel soforKayit_label_soforPlaka;
    private javax.swing.JLabel soforKayit_label_soforYas;
    private javax.swing.JLabel soforKayit_label_tercihTir;
    private javax.swing.JLabel soforKayit_label_tercihYukTur;
    private javax.swing.JTextField soforKayit_text_soforAd;
    private javax.swing.JTextField soforKayit_text_soforNumber;
    private javax.swing.JTextField soforKayit_text_soforPlaka;
    private javax.swing.JTextField soforKayit_text_soforYas;
    private javax.swing.JTextField soforKayit_text_tercihTir;
    private javax.swing.JButton sorguBosalt;
    private javax.swing.JButton sorguBosalt1;
    private javax.swing.JTextField tarihGir1;
    private javax.swing.JTextField tarihGir2;
    private javax.swing.JButton tarihSorgu;
    // End of variables declaration//GEN-END:variables
}

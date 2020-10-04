import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class gumrukCikis_TableModel {
    
    private int satirSayisi; 
  	private int kolonSayisi; 
  	private ResultSet resultSet; 
  	private ArrayList veri = new ArrayList(); 
  	 
  	private DefaultTableModel model = new DefaultTableModel(); 
  	Object kolonlar[] = {"Şoför Numara", "Şoför Plaka", "Şoför Ad", "Tır Marka", "Tır Model", "Yükün Türü", "Yükün Ağırlığı", "Giriş Tarihi", "Çıkış Tarihi", "Kayıt Eden"}; 
   
  	public gumrukCikis_TableModel(ResultSet resultSet) throws Exception
        { 
            setResultSet(resultSet); 
  	} 
   
  	public void setResultSet(ResultSet resultSet) throws Exception 
        { 
            this.resultSet = resultSet; 
            ResultSetMetaData metaData = resultSet.getMetaData(); 
            satirSayisi = 0; 
            kolonSayisi = metaData.getColumnCount(); 	 
            model.setColumnIdentifiers(kolonlar); 
  		 
  		while (resultSet.next()) 
                { 
                    Object[] row = new Object[kolonSayisi]; 
                    for (int j = 0; j < kolonSayisi; j++) 
                    { 
                        row[j] = resultSet.getObject(j + 1); 
                    }  
                    model.addRow(row); 	 
                    veri.add(row); 
                    satirSayisi++; 
  		}  		 
  	} 
   
  	// Tablodaki satır sayısını döndüren metod 
  	public int getRowCount() 
        { 
            return satirSayisi; 
  	} 
   
  	// Tablodaki kolon sayısını döndüren metod 
  	public int getColumnCount() 
        { 
            return kolonSayisi; 
  	} 
  	 
  	// Bir hücredeki değeri döndüren metod 
  	public Object getValueAt(int rowIndex, int columnIndex) 
        { 
            Object[] row = (Object[]) veri.get(rowIndex); 
            return row[columnIndex]; 
  	} 
   
  	// index'i verilen kolonun adını döndüren fonksiyon. 
   
  	public String getColumnName(int columnIndex) 
        { 
            try { 
                    ResultSetMetaData metaData = resultSet.getMetaData(); 
                    return metaData.getColumnName(columnIndex + 1); 	 
  		} catch (Exception e) 
                { 
                    e.printStackTrace(); 
                    return ""; 
  		}
  	} 
  	 
  	public DefaultTableModel getModel() 
        { 
            return model; 
  	}      
    
}

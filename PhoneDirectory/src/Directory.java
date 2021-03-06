
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
public class Directory extends javax.swing.JFrame {

    
    static JTable table;
    static JScrollPane scroll;
    // header is Vector contains table Column
    static Vector headers = new Vector(); 
    // Model is used to construct JTable
    static DefaultTableModel model = null; // data is Vector contains Data from Excel File 
    static Vector data = new Vector();
    //  static JButton jbClick; static JFileChooser jChooser; 
    static int tableWidth = 0; // set the tableWidth 
    static int tableHeight = 0; // set the tableHeight


    /**
     * Creates new form Directory
     */
    public Directory() {
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

        jPanel1 = new javax.swing.JPanel();
        addBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        viewBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        searchResult = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        searchNameBox = new javax.swing.JTextField();
        searchNameBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), null), "Phone Directory"));

        addBTN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addBTN.setText("Add ");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        updateBTN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updateBTN.setText("Update");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        viewBTN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viewBTN.setText("View");
        viewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBTNActionPerformed(evt);
            }
        });

        deleteBTN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        searchResult.setText("Search By Place Name:");

        jSeparator1.setBackground(new java.awt.Color(51, 51, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Search By Name:");

        searchNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameBoxActionPerformed(evt);
            }
        });

        searchNameBtn.setText("Search");
        searchNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(viewBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(deleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(searchBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(searchBox, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addComponent(searchResult)
                        .addComponent(jLabel1)
                        .addComponent(searchNameBox))
                    .addComponent(searchNameBtn))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchResult)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addBTN)
                                .addGap(21, 21, 21)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBtn)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchNameBtn)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(updateBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewBTN)
                                .addGap(49, 49, 49)))
                        .addComponent(deleteBTN)
                        .addGap(24, 24, 24))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        UpdateNumber un = new UpdateNumber();
        un.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_updateBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
           AddNumber an = new AddNumber();
           an.setVisible(true);
           setVisible(false);
    }//GEN-LAST:event_addBTNActionPerformed

    private void viewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBTNActionPerformed
        //String excelFilePath = "D:\\JavaBooks.xls";
        
       //Vector data = new Vector();
       File myFile = new File("D:\\JavaBooks.xlsx");
       FileInputStream fis;
        try {
            fis = new FileInputStream(myFile);
            // Finds the workbook instance for XLSX file
       XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
       // Return first sheet from the XLSX workbook 
       XSSFSheet mySheet = myWorkBook.getSheetAt(0); 
           // sortSheet(myWorkBook, mySheet);
    // Get iterator to all the rows in current sheet 
       Iterator<Row> rowIterator = mySheet.iterator(); 
    // Traversing over each row of XLSX file
       Vector data = new Vector();
       int rowCount=0;
       while (rowIterator.hasNext()) { 
            Row row = rowIterator.next(); // For each row, iterate through each columns 
            Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = row.cellIterator();
            Vector d = new Vector();
            
            d.add(rowCount);
            rowCount++;
            
            while (cellIterator.hasNext()) { 
                Cell cell = cellIterator.next(); 
                //System.out.println("Hii");
            //System.out.print(cell.getStringCellValue() + "\t"); 
               
                switch (cell.getCellType()) { 
                    case STRING: 
                        System.out.print(cell.getStringCellValue() + "\t");
                        d.add(cell.getStringCellValue());
                        break; 
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t"); 
                        d.add(cell.getNumericCellValue());
                        break; 
                    default :
                  // System.out.print(cell.getBooleanCellValue() + "\t");
                    }    
                } 
            data.add(d);
            System.out.println(""); 
         }
   
        Vector headers = new Vector();
        headers.add("Row No.");
        headers.add("Serial No.");
        headers.add("Name");
        headers.add("Mobile No.");
        headers.add("Place");
    
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel(data,headers);
        table.setModel(model);
        table.setAutoCreateRowSorter(true);
        model = new DefaultTableModel(data, headers);
        table.setModel(model);
        JScrollPane scroll = new JScrollPane(table);
        JFrame f=new JFrame();
        f.add(scroll,BorderLayout.CENTER);
        JButton button = new JButton("Print");
        ActionListener printAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    table.print();
                } catch (PrinterException pe) {
                    //System.err.println("Error printing: " + pe.getMessage());
                    JOptionPane.showMessageDialog(Directory.this,pe.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }   
            }
        };
        button.addActionListener(printAction);
        f.add(button, BorderLayout.SOUTH);
        f.setSize(500, 220);
        f.setResizable(true);
        f.setVisible(true);
        } 
       catch (FileNotFoundException ex) {
            //Logger.getLogger(Directory.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            //Logger.getLogger(Directory.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        DeleteNumber dn = new DeleteNumber();
        dn.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String searchName = searchBox.getText();
        
        HashMap<Integer,ArrayList> st;
        try {
            st = findAddressByPlace(searchName);
            
            JTable t=new JTable(toTableModel(st));
            t.setAutoCreateRowSorter(true);
            JScrollPane scroll = new JScrollPane(t);
            JFrame f=new JFrame();
            Label l1 = new Label(searchBox.getText());
            l1.setFont(new java.awt.Font("Tahoma", 1, 14));
            f.add(l1,BorderLayout.NORTH);
            f.add(scroll,BorderLayout.CENTER);
            JButton button = new JButton("Print");
            MessageFormat h = new MessageFormat(searchBox.getText());
            ActionListener printAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    t.print(JTable.PrintMode.FIT_WIDTH,h, null);
                    
                } catch (PrinterException pe) {
                    JOptionPane.showMessageDialog(Directory.this,pe.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            };
            button.addActionListener(printAction);
            f.add(button, BorderLayout.SOUTH);
            f.setResizable(true);
            f.setSize(500,200);
            f.setVisible(true);
            searchBox.setText("");
            } catch (IOException ex) {
            //Logger.getLogger(Directory.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            } catch (InvalidFormatException ex) {
            //Logger.getLogger(Directory.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNameBoxActionPerformed

    private void searchNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameBtnActionPerformed
        // TODO add your handling code here:
        String searchName = searchNameBox.getText();
        try {
            String value = findAddressByName(searchName);
            JOptionPane.showMessageDialog(this,value,"Result",JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            //Logger.getLogger(Directory.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        } catch (InvalidFormatException ex) {
            //Logger.getLogger(Directory.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        searchNameBox.setText("");
        
        
    }//GEN-LAST:event_searchNameBtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(Directory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Directory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Directory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Directory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Directory().setVisible(true);
            }
        });
    }
    
    public static HashMap<Integer,ArrayList> findAddressByPlace(String nameToSearch) throws IOException, InvalidFormatException {
        String fileLocation = "D:\\JavaBooks.xlsx";
        XSSFWorkbook wb = new XSSFWorkbook(new File(fileLocation));
        //for (int sheetIndex = 0; sheetIndex < wb.getNumberOfSheets(); sheetIndex++) {
            XSSFSheet sheet = wb.getSheetAt(0);
            //String a="";
            int count=0;
            HashMap<Integer,ArrayList> hm = new HashMap<Integer,ArrayList>();
            for (int rowIndex = 0; rowIndex < sheet.getLastRowNum()+1; rowIndex++) {
                XSSFRow row = sheet.getRow(rowIndex);
                ArrayList<String> ls = new ArrayList<>();
                if (row != null && row.getCell(3).getStringCellValue().equals(nameToSearch)) {
                    //a+=row.getCell(1).getStringCellValue()+" "+row.getCell(2).getStringCellValue()+" "+row.getCell(3).getStringCellValue()+"\n";
                    count++;
                    ls.add(row.getCell(1).getStringCellValue());
                    ls.add(row.getCell(2).getStringCellValue());
                    hm.put(count, ls);
                    
                }   
            }
        return hm;
    }

     public static String findAddressByName(String nameToSearch) throws IOException, InvalidFormatException {
        String fileLocation = "D:\\JavaBooks.xlsx";
        XSSFWorkbook wb = new XSSFWorkbook(new File(fileLocation));
        //for (int sheetIndex = 0; sheetIndex < wb.getNumberOfSheets(); sheetIndex++) {
            XSSFSheet sheet = wb.getSheetAt(0);
            String a="";
            for (int rowIndex = 0; rowIndex < sheet.getLastRowNum()+1; rowIndex++) {
                XSSFRow row = sheet.getRow(rowIndex);
                if (row != null && row.getCell(1).getStringCellValue().equals(nameToSearch)) {
                    a+=row.getCell(1).getStringCellValue()+" "+row.getCell(2).getStringCellValue()+" "+row.getCell(3).getStringCellValue()+"\n";  
                    //count++;
                }
            }
            System.out.print(a);
        return a;
    }
     
    public static TableModel toTableModel(HashMap<?,?> map) {
        DefaultTableModel model = new DefaultTableModel(
         new Object[] { "Serial No.", "Name","Mobile No." }, 0
        );
        for (HashMap.Entry<?,?> entry : map.entrySet()) {
            Integer a = (Integer) entry.getKey();
            ArrayList<String> ls = (ArrayList<String>) entry.getValue();
            model.addRow(new Object[] { a, ls.get(0),ls.get(1) });
        }
    return model;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchNameBox;
    private javax.swing.JButton searchNameBtn;
    private javax.swing.JLabel searchResult;
    private javax.swing.JButton updateBTN;
    private javax.swing.JButton viewBTN;
    // End of variables declaration//GEN-END:variables
}


import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zephyr
 */
public class Fram extends javax.swing.JFrame {
public static int size;
public static DefaultTableModel table;
public static String pdc,actName,actPredecessor,estimateWeek,actPredecessor1,actPredecessor2;
static Fram mainf;
Step2Frame f2=new Step2Frame();
int setbit=0;
    /**
     * Creates new form Fram
     */
    public Fram() {
        setTitle("Project Schedling Model:      Step 1");
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        activityName = new javax.swing.JTextField();
        predecessor1 = new javax.swing.JTextField();
        estimated_Week = new javax.swing.JTextField();
        jButton1_Complete = new javax.swing.JButton();
        jButton1_submit1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        predecessor2 = new javax.swing.JTextField();
        note_jLabel1 = new javax.swing.JLabel();
        note_jLabel2 = new javax.swing.JLabel();
        actNameError_jLabel1 = new javax.swing.JLabel();
        pdError_jLabel1 = new javax.swing.JLabel();
        actDurtionError_jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        note_jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Activity Name", "Predecessor", "Estmated Week"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1_Complete.setBackground(new java.awt.Color(51, 255, 51));
        jButton1_Complete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1_Complete.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_Complete.setText("Complete!");
        jButton1_Complete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_CompleteActionPerformed(evt);
            }
        });

        jButton1_submit1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1_submit1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1_submit1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_submit1.setText("Submit");
        jButton1_submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_submit1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 0));
        jButton1.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Activity Name");

        jButton2.setBackground(new java.awt.Color(51, 51, 0));
        jButton2.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Predecessor");

        jButton3.setBackground(new java.awt.Color(51, 51, 0));
        jButton3.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Activity Duration");

        note_jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        note_jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        note_jLabel1.setText("1.Number Of Activity Must be Less Than 15.     ");

        note_jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        note_jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        note_jLabel2.setText("2.Every Activity will be  Predecessor to 2 other Activity");

        actNameError_jLabel1.setForeground(new java.awt.Color(255, 51, 51));

        pdError_jLabel1.setForeground(new java.awt.Color(255, 51, 51));

        actDurtionError_jLabel1.setForeground(new java.awt.Color(255, 51, 51));

        jTextField1.setBackground(new java.awt.Color(0, 0, 255));
        jTextField1.setText("       ES");

        jTextField2.setBackground(new java.awt.Color(0, 255, 255));
        jTextField2.setText("     LS");

        jTextField3.setBackground(new java.awt.Color(255, 51, 51));
        jTextField3.setText("Act_Dura");

        jTextField4.setBackground(new java.awt.Color(255, 51, 51));
        jTextField4.setText("Act_Name");

        jTextField5.setBackground(new java.awt.Color(255, 204, 51));
        jTextField5.setText("      EF");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(0, 102, 102));
        jTextField6.setText("      LF");

        jTextField7.setBackground(new java.awt.Color(255, 255, 0));
        jTextField7.setText("Predecessor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jTextField4)
                    .addComponent(jTextField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jTextField6))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        note_jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        note_jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        note_jLabel3.setText("3.Every Activity Has Less or Equal to 2 Predecessor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1_Complete, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(412, 412, 412))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(note_jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(note_jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(note_jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(predecessor1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(predecessor2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(actNameError_jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                            .addComponent(pdError_jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(activityName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estimated_Week, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actDurtionError_jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1_submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(413, 413, 413))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(note_jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(note_jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(note_jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(activityName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actNameError_jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(predecessor1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(predecessor2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pdError_jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estimated_Week, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(actDurtionError_jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1_submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1_Complete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_CompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_CompleteActionPerformed
        // TODO add your handling code here:
        if(setbit==1 && table.getRowCount()!=0)
        {   
            f2.initiaize();
        }

    }//GEN-LAST:event_jButton1_CompleteActionPerformed
    public void createTable()
    {
         table.addRow(new Object[]{actName,actPredecessor,estimateWeek});
         size=table.getRowCount();
    }
    public static void getValuesFromTable(int i)
    {
         Data.actName1=table.getValueAt(i, 0).toString();
         Data.pd=table.getValueAt(i, 1).toString();
         Data.ad=Integer.parseInt(table.getValueAt(i, 2).toString());
    }
    public void getPredecessor()
    {
        if(predecessor2.getText().isEmpty())
                actPredecessor=predecessor1.getText();
        else if(predecessor1.getText().isEmpty())
                actPredecessor=predecessor2.getText();
        else if(predecessor1.getText().isEmpty() && predecessor2.getText().isEmpty())
                actPredecessor="";
        else
        {
            actPredecessor=predecessor1.getText()+","+predecessor2.getText();
        }
    }
    public boolean  ifPdExist(String s)
    {
        
        for(int i=0;i<table.getRowCount();i++)
        {
            if(s.equalsIgnoreCase(table.getValueAt(i, 0).toString()))
            return true;

        }
        return false;
    }
    public boolean  ifActExist(String s)
    {
        boolean status=true;
      if(s==null) 
      {
          status= true;
      }
      else
      { for(int i=0;i<table.getRowCount();i++)
        {
            if(s.equalsIgnoreCase(table.getValueAt(i, 0).toString()))
            status= false;

        }
      }
        return status;
      
    }
    private void jButton1_submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_submit1ActionPerformed
        // TODO add your handling code here:
        table =(DefaultTableModel) jTable1.getModel();
         setbit=1;
        try {
                if( activityName.getText().isEmpty())
                  throw new IllegalArgumentException(); 
                else
                {    
                    actNameError_jLabel1.setText("");
                }
                if(ifActExist(activityName.getText()))
                {
                    actNameError_jLabel1.setText("");
                }
                else
                    throw new IOException();
                
                actName=activityName.getText();
                estimateWeek=estimated_Week.getText();
                Integer.parseInt(estimateWeek);
                actDurtionError_jLabel1.setText("");
                if(predecessor1.getText().isEmpty() && predecessor2.getText().isEmpty())
                {
                    getPredecessor();
                    pdError_jLabel1.setText("");
                    
                }
                else
                {   
                    if(predecessor1.getText().isEmpty())
                    {    
                        if(ifPdExist(predecessor2.getText()))
                        {
                            getPredecessor();
                            pdError_jLabel1.setText("");
                        }
                        else
                            throw new ArrayIndexOutOfBoundsException();

                    }
                    else
                    {
                        if(ifPdExist(predecessor1.getText()))
                        {
                            getPredecessor();
                            pdError_jLabel1.setText("");
                        }
                        else
                            throw new ArrayIndexOutOfBoundsException();
                        
                    }
                   
                
                }
                createTable();
            }
            catch (NumberFormatException e) {
                    actDurtionError_jLabel1.setText("*Activity Duration must be integer!");
            }
            catch(IllegalArgumentException e) {
              actNameError_jLabel1.setText("*Activity Name can't be left empty!");

            }
            catch(ArrayIndexOutOfBoundsException e) {
              pdError_jLabel1.setText("*Prdecessor Must be Exist in Table as Activity!");

            } 
            catch (IOException e)
            {
              actNameError_jLabel1.setText("*Prdecessor Name Must Not be Repeated!");
                            
            }
    }//GEN-LAST:event_jButton1_submit1ActionPerformed
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(Fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         mainf=new Fram();
         mainf.setVisible(true);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actDurtionError_jLabel1;
    private javax.swing.JLabel actNameError_jLabel1;
    private javax.swing.JTextField activityName;
    private javax.swing.JTextField estimated_Week;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_Complete;
    private javax.swing.JButton jButton1_submit1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel note_jLabel1;
    private javax.swing.JLabel note_jLabel2;
    private javax.swing.JLabel note_jLabel3;
    private javax.swing.JLabel pdError_jLabel1;
    private javax.swing.JTextField predecessor1;
    private javax.swing.JTextField predecessor2;
    // End of variables declaration//GEN-END:variables
    
}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sylvester Roshan
 */
public class dirhome extends javax.swing.JFrame {
    Connection con;

    /**
     * Creates new form dirhome
     */
    public dirhome() {
        initComponents();
        
         String url="jdbc:mysql://localhost/wildlife_conservation_management";
        String user="root";
        String pass="";
        
        try{
            con=DriverManager.getConnection(url,user,pass);
        }catch(Exception ex){
            System.out.println("Error:" +ex.getMessage());
            
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

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmig = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpop = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Logout");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 690, 66, -1));

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButton1.setText("Population");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, -1, -1));

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButton2.setText("Migration");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 600, -1, -1));

        tblmig.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "WPA", "Migration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblmig);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 370, 360));

        tblpop.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblpop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "No of Elephants"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblpop);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 370, 360));

        btnClear.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, -1, -1));

        btnClear1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnClear1.setText("Clear");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 600, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 48)); // NOI18N
        jLabel1.setText("Population And Migration Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/walpaper0.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1150, -530, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -14, 1430, 990));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do You Want To Logout?","Select",JOptionPane.YES_NO_OPTION);
        if (a==0)
        new directorlogin().setVisible(true);
        setVisible(false);
        if(a==1)
        new dirhome().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sql="SELECT * FROM elephant";
        try{
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)tblpop.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(4), rs.getString(3)});
            }

        }catch(Exception ex){
            System.out.println("Error:" +ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String sql="SELECT * FROM elephant";
        try{
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)tblmig.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(5), rs.getString(6)});
            }

        }catch(Exception ex){
            System.out.println("Error:" +ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)tblpop.getModel();
        model.setRowCount(0);
        model.setRowCount(5);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)tblmig.getModel();
        model.setRowCount(0);
        model.setRowCount(5);
    }//GEN-LAST:event_btnClear1ActionPerformed

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
            java.util.logging.Logger.getLogger(dirhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dirhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dirhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dirhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dirhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblmig;
    private javax.swing.JTable tblpop;
    // End of variables declaration//GEN-END:variables
}

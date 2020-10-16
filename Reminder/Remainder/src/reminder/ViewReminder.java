package reminder;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MILU
 */
public class ViewReminder extends javax.swing.JFrame {

    /**
     * ViewRemainder Form we can view edit and delete data
     */
    Connection con = dbcon.dbConnector();

    public void refresh() {
        // This fuction refreshes jtable
        try {
            Connection conn = dbcon.dbConnector();
            String query = "select * from rem";
            PreparedStatement pst;
            pst = conn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException a) {
            System.err.println(a);
        }
    }

    public ViewReminder() {
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
	        jButton4 = new javax.swing.JButton();	
	        jLabel4 = new javax.swing.JLabel();	
	        jButton3 = new javax.swing.JButton();	
	        jLabel3 = new javax.swing.JLabel();	
	        jScrollPane1 = new javax.swing.JScrollPane();	
	        table = new javax.swing.JTable();	
	        t2 = new javax.swing.JTextField();	
	        t3 = new javax.swing.JTextField();	
	        t4 = new javax.swing.JTextField();	
	        jButton5 = new javax.swing.JButton();	
	        jLabel1 = new javax.swing.JLabel();	
	        t1 = new javax.swing.JLabel();	
	        jLabel2 = new javax.swing.JLabel();

        setTitle("View Reminder");
        setBackground(new java.awt.Color(116, 208, 253));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(116, 208, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
	        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 87, 82));	
		
	        jLabel4.setText("Edit Remainder");	
	        jLabel4.setForeground(new java.awt.Color(255, 255, 255));	
	        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));	
		
	        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(139, 115));
        jButton3.setMinimumSize(new java.awt.Dimension(139, 115));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
      jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 86, 77));	
		
	        jLabel3.setText("Delete Remainder");	
	        jLabel3.setForeground(new java.awt.Color(255, 255, 255));	
	        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));	
	

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Remainder", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setColumnSelectionAllowed(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
	        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 61, -1, 380));	
	        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 110, -1));	
	        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 100, -1));	
		
	        t4.addKeyListener(new java.awt.event.KeyAdapter() {	
	            public void keyPressed(java.awt.event.KeyEvent evt) {	
	                t4KeyPressed(evt);	
	            }	
	        });	
	        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 100, -1));	
		
	        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N	
	        jButton5.addActionListener(new java.awt.event.ActionListener() {	
	            public void actionPerformed(java.awt.event.ActionEvent evt) {	
	                jButton5ActionPerformed(evt);	
	            }	
	        });	
	        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 87, 82));	
		
	        jLabel1.setText("Home");	
	        jLabel1.setForeground(new java.awt.Color(255, 255, 255));	
	        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 40, -1));	
		
	        t1.setForeground(new java.awt.Color(0, 204, 204));	
	        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 70, -1));	
		
	        jLabel2.setText("Select the reminder you want to delete or edit");	
	        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 46, 350, 10));	
		
	        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));	
	

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Fuction to reminder from table
        try {
            String id_v = t1.getText();
            int id = Integer.parseInt(id_v);
            String query = "DELETE FROM `rem`  WHERE `id`=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Reminder Deleted");
            this.dispose();
            new ViewReminder().setVisible(true);

        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        refresh();  // Fuction to refresh table
    }//GEN-LAST:event_formWindowOpened

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        // Fuction that populates the table on mouse click
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int selectedRowIndex = table.getSelectedRow();

        t1.setText(model.getValueAt(selectedRowIndex, 0).toString());
        t2.setText(model.getValueAt(selectedRowIndex, 1).toString());
        t4.setText(model.getValueAt(selectedRowIndex, 2).toString());
        t3.setText(model.getValueAt(selectedRowIndex, 3).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Fuction that updates data
        try {
            String r = t2.getText();
            String t = t3.getText();
            String d = t4.getText();
            boolean flag = DateTimeValidator.validator(d, t,r);// calling date time validator fuction
            String id_v = t1.getText();
            int id = Integer.parseInt(id_v);
            if (flag == true) {
                String query = "UPDATE `rem` SET `Reminder`=?,`Reminder_date`=?,`Reminder_time`=? WHERE `id`=?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, r);
                pst.setString(2, d);
                pst.setString(3, t);
                pst.setInt(4, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reminder Edited");
                this.dispose();
                new ViewReminder().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Enter Valid Remainder");
                this.dispose();
                new ViewReminder().setVisible(true);
            }

        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void t4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4KeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReminder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

package payrollsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import payrollsystem.Database;

public class PayrollSystemView extends javax.swing.JFrame {

    
    public PayrollSystemView() {
        initComponents();
    }

    private void table() {
    try {
        Connection conn = Database.getConnection();
        String sql = "SELECT * FROM tblpayroll";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        // Update JTable with ResultSet
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        while (rs.next()) {
            Vector<String> vec = new Vector<>();
            vec.add(rs.getString(1)); 
            vec.add(rs.getString(2)); 
            vec.add(rs.getString(3)); 
            vec.add(rs.getString(4)); 
            vec.add(rs.getString(5)); 
            vec.add(rs.getString(6));
            vec.add(rs.getString(7));
            vec.add(rs.getString(8));
            model.addRow(vec);
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
}

    public void clear(){
        txtID.setText("");
        txtName.setText("");
        txtUser.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtAddress.setText("");
        txtBalance.setText("");
        txtEmployee.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        txtEmployee = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        showbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();

        txtID4.setBackground(new java.awt.Color(0, 153, 153));
        txtID4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIMPLE PAYROLL SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(123, 123, 123))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        txtID.setBackground(new java.awt.Color(0, 153, 153));
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        txtName.setBackground(new java.awt.Color(0, 153, 153));
        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "EMPLOYEE NAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        txtUser.setBackground(new java.awt.Color(0, 153, 153));
        txtUser.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        txtAge.setBackground(new java.awt.Color(0, 153, 153));
        txtAge.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "AGE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        txtGender.setBackground(new java.awt.Color(0, 153, 153));
        txtGender.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "GENDER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        txtAddress.setBackground(new java.awt.Color(0, 153, 153));
        txtAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "ADDRESS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        txtBalance.setBackground(new java.awt.Color(0, 153, 153));
        txtBalance.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "BALANCE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        txtEmployee.setBackground(new java.awt.Color(0, 153, 153));
        txtEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "EMPLOYEE POSITION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        addbtn.setBackground(new java.awt.Color(0, 153, 153));
        addbtn.setText("ADD");
        addbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(0, 153, 153));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "EMPLOYEE ", "USERNAME", "AGE", "GENDER", "ADDRESS", "BALANCE", "POSITION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        showbtn.setBackground(new java.awt.Color(0, 153, 153));
        showbtn.setText("SHOW");
        showbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(0, 153, 153));
        deletebtn.setText("DELETE");
        deletebtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(0, 153, 153));
        updateBtn.setText("UPDATE");
        updateBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(showbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
       
        String employee = txtName.getText();
        String user = txtUser.getText();
        int age = Integer.parseInt(txtAge.getText());
        String gender = txtGender.getText();
        String address = txtAddress.getText();
        int balance = Integer.parseInt(txtBalance.getText());
        String position = txtEmployee.getText();
        
        Connection conn;
        PreparedStatement stmt;
        PayrollMethods p = new PayrollMethods(employee, user, age, gender, address, balance, position);

if (txtName.getText().isEmpty() || txtUser.getText().isEmpty() || 
    txtAge.getText().isEmpty() || txtGender.getText().isEmpty() || txtAddress.getText().isEmpty() || 
    txtBalance.getText().isEmpty() || txtEmployee.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
    clear();
    return;
}

try {
conn = Database.getConnection();
String sql = "INSERT INTO tblpayroll (employeeName, userName, age, gender, address, balance, position) VALUES (?, ?, ?, ?, ?, ?, ?)";
stmt = conn.prepareStatement(sql);

// No need to set the ID, it's auto-incremented
stmt.setString(1, p.getEmployee()); // Employee name
stmt.setString(2, p.getUsername()); // Username
stmt.setInt(3, Integer.parseInt(txtAge.getText())); // Age
stmt.setString(4, p.getGender()); // Gender
stmt.setString(5, p.getAddress()); // Address
stmt.setDouble(6, Double.parseDouble(txtBalance.getText())); // Balance as a double
stmt.setString(7, p.getPosition()); // Position

stmt.execute();

JOptionPane.showMessageDialog(null, "Employee added successfully!");

//clear the fields
clear();

    // Refresh table data
    table();

} catch (SQLException s) {
    if (s.getErrorCode() == 1062) {
        JOptionPane.showMessageDialog(null, "Employee ID Already Exists", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (Exception ex) {
    Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
}

    }//GEN-LAST:event_addbtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try {
    if (txtID.getText().isEmpty() || txtName.getText().isEmpty() || txtUser.getText().isEmpty() || 
        txtAge.getText().isEmpty() || txtGender.getText().isEmpty() || txtAddress.getText().isEmpty() || 
        txtBalance.getText().isEmpty() || txtEmployee.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Connection conn = Database.getConnection();
    String sql = "UPDATE tblpayroll SET employeeName = ?, userName = ?, age = ?, gender = ?, address = ?, balance = ?, position = ? WHERE id = ?";
    PreparedStatement stmt = conn.prepareStatement(sql);

    // Set parameters for the update statement
    stmt.setString(1, txtName.getText()); // Employee name
    stmt.setString(2, txtUser.getText()); // Username
    stmt.setInt(3, Integer.parseInt(txtAge.getText())); // Age
    stmt.setString(4, txtGender.getText()); // Gender
    stmt.setString(5, txtAddress.getText()); // Address
    stmt.setDouble(6, Double.parseDouble(txtBalance.getText())); // Balance as a double
    stmt.setString(7, txtEmployee.getText()); // Position
    stmt.setInt(8, Integer.parseInt(txtID.getText())); // ID (primary key)

    // Execute the update
    int rowsUpdated = stmt.executeUpdate();
    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(null, "Employee updated successfully!");
    } else {
        JOptionPane.showMessageDialog(null, "No Employee found with the given ID.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Clear input fields
    clear();

    // Refresh table data
    table();

} catch (NumberFormatException nfe) {
    JOptionPane.showMessageDialog(null, "Please enter valid numeric values for Age, Balance, and ID.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException s) {
    JOptionPane.showMessageDialog(null, "Database Error: " + s.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
} catch (Exception ex) {
    Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
}

    }//GEN-LAST:event_updateBtnActionPerformed

    private void showbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtnActionPerformed
        table();
    }//GEN-LAST:event_showbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        int row = table.getSelectedRow();

if (row >= 0) {
    String id = table.getValueAt(row, 0).toString(); // Assuming column 0 contains the ID
    int confirm = JOptionPane.showConfirmDialog(
            null,
            "Are you sure you want to delete record with ID: " + id + "?",
            "Confirm Delete",
            JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            Connection conn = Database.getConnection();
            String sql = "DELETE FROM tblpayroll WHERE id = ?"; // Adjust your table name
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Record deleted successfully!");

                // Refresh table data
                String fetchSql = "SELECT * FROM tblpayroll"; // Adjust query based on your table
                PreparedStatement fetchStmt = conn.prepareStatement(fetchSql);
                ResultSet rs = fetchStmt.executeQuery();

                // Assuming 'tableModel' is your table's model
                DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        while (rs.next()) {
            Vector<String> vec = new Vector<>();
            vec.add(rs.getString(1)); 
            vec.add(rs.getString(2)); 
            vec.add(rs.getString(3)); 
            vec.add(rs.getString(4)); 
            vec.add(rs.getString(5)); 
            vec.add(rs.getString(6));
            vec.add(rs.getString(7));
            vec.add(rs.getString(8));
            model.addRow(vec);
        }

                rs.close();
                fetchStmt.close();
            } else {
                JOptionPane.showMessageDialog(null, "No record found with ID: " + id);
            }

            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
} else {
    JOptionPane.showMessageDialog(null, "Please select a record to delete.");
}

    }//GEN-LAST:event_deletebtnActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton showbtn;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtEmployee;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID4;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUser;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}

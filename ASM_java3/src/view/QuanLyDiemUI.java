/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Diem;
import service.DiemService;
import service.impl.DiemServiceIMPL;

/**
 *
 * @author nguye
 */
public class QuanLyDiemUI extends javax.swing.JFrame {
   private DefaultTableModel defaultTableModel;
   private DiemService diemService = new DiemServiceIMPL();
   
    public QuanLyDiemUI() {
        initComponents();
        ArrayList<Diem> list = diemService.getList();
        
        loadData(list);
    }
public void loadData(ArrayList<Diem> list) {
        defaultTableModel = (DefaultTableModel) tblDiem.getModel();
        defaultTableModel.setRowCount(0);
        for (Diem diem : list) {
            defaultTableModel.addRow(new Object[]{
                
                diem.getSV().getHoten(),
                diem.getMaSV(),
                diem.getTienganh(),
                diem.getTinhoc(),
                diem.getGDTC(),
                diem.diemTb()
            });
        }
    }
    public void clearForm() {
        txtmASV.setText("");
        txtTA.setText("");
        txtth.setText("");
        txtGDTC.setText("");
        lbldiemTB.setText("");
        txtenSV.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTKsv = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtenSV = new javax.swing.JTextField();
        txtmASV = new javax.swing.JTextField();
        txtTA = new javax.swing.JTextField();
        txtth = new javax.swing.JTextField();
        txtGDTC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblDiemTB = new javax.swing.JLabel();
        lbldiemTB = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDiem = new javax.swing.JTable();
        lblTop3 = new javax.swing.JLabel();
        BTNnEW = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÝ ĐIỂM SINH VIÊN");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Mã SV");

        btnTimKiem.setText("SEARCH");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTKsv, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnTimKiem)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTKsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnTimKiem))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setText("Tìm kiếm");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Họ tên SV");

        jLabel5.setText("Mã SV");

        jLabel6.setText("Tiếng anh");

        jLabel7.setText("Tin học");

        jLabel8.setText("Giáo dục TC");

        txtenSV.setEditable(false);

        txtTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTAActionPerformed(evt);
            }
        });

        txtGDTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGDTCActionPerformed(evt);
            }
        });

        jLabel9.setText("Điểm TB");

        lbldiemTB.setBackground(new java.awt.Color(204, 0, 102));
        lbldiemTB.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbldiemTB.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtth, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(txtTA, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txtmASV)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblDiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbldiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGDTC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(txtenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtmASV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbldiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblDiemTB))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtGDTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Họ tên ", "Tiếng anh", "Tin học", "GDTC", "Điểm TB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDiem);

        lblTop3.setText("3 sinh viên có điểm cao nhất");
        lblTop3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblTop3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lblTop3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTop3MouseClicked(evt);
            }
        });

        BTNnEW.setText("New");
        BTNnEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnEWActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnXoa.setText("Delete");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Update");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTNnEW, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(44, 44, 44))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTop3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(BTNnEW)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109)
                .addComponent(lblTop3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiemMouseClicked
        int row = tblDiem.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtenSV.setText(tblDiem.getValueAt(row, 1).toString());
        txtmASV.setText(tblDiem.getValueAt(row, 0).toString());
        txtTA.setText(tblDiem.getValueAt(row, 2).toString());
        txtth.setText(tblDiem.getValueAt(row, 3).toString());
        txtGDTC.setText(tblDiem.getValueAt(row, 4).toString());
        lbldiemTB.setText(tblDiem.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tblDiemMouseClicked

    private void BTNnEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNnEWActionPerformed
        txtmASV.setText("");
        txtTA.setText("");
        txtth.setText("");
        txtGDTC.setText("");
        lbldiemTB.setText("");
        txtenSV.setText("");
        
    }//GEN-LAST:event_BTNnEWActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String tim = txtTKsv.getText();
        ArrayList<Diem> list = diemService.timKiem(tim);
        loadData(list);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        Diem diem = new Diem();
        String maSV = txtmASV.getText();
        String TA = String.valueOf(txtTA.getText());
        String th = String.valueOf(txtth.getText());
        String gdtc = String.valueOf(txtGDTC.getText());
        
          if (maSV.isEmpty() || String.valueOf(TA).isEmpty() || String.valueOf(th).isEmpty() || String.valueOf(gdtc).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống");
            return;
        }
        
        try {
            Float.parseFloat(txtTA.getText());
            Float.parseFloat(txtth.getText());
            Float.parseFloat(txtGDTC.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Điểm phải là số");
            return;
        }
        if (Float.parseFloat(txtTA.getText()) < 0 || Float.parseFloat(txtth.getText()) < 0 || Float.parseFloat(txtGDTC.getText()) < 0) {
            JOptionPane.showMessageDialog(this, "Điểm phải lớn hơn hoặc bằng 0");
            return;
        } else if (Float.parseFloat(txtTA.getText()) > 10 || Float.parseFloat(txtth.getText()) > 10 || Float.parseFloat(txtGDTC.getText()) > 10) {
            JOptionPane.showMessageDialog(this, "Điểm không được lớn hơn 10");
            return;
        }
        
        diem.setMaSV(maSV);
        diem.setTienganh(Float.parseFloat(TA));
        diem.setTinhoc(Float.parseFloat(th));
        diem.setGDTC(Float.parseFloat(gdtc));
        
       if (diemService.update(maSV, diem)){
            loadData(diemService.getList());
            clearForm();
            JOptionPane.showMessageDialog(this, "sua thanh cong");
        }else {
            JOptionPane.showMessageDialog(this, "sua that bai");
        }
     
    }//GEN-LAST:event_btnSuaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Diem diem = new Diem();
        String maSV = txtmASV.getText();
        String TA = String.valueOf(txtTA.getText());
        String th = String.valueOf(txtth.getText());
        String gdtc = String.valueOf(txtGDTC.getText());
        
          if (maSV.isEmpty() || String.valueOf(TA).isEmpty() || String.valueOf(th).isEmpty() || String.valueOf(gdtc).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống");
            return;
        }
        
        try {
            Float.parseFloat(txtTA.getText());
            Float.parseFloat(txtth.getText());
            Float.parseFloat(txtGDTC.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Điểm phải là số");
            return;
        }
        if (Float.parseFloat(txtTA.getText()) < 0 || Float.parseFloat(txtth.getText()) < 0 || Float.parseFloat(txtGDTC.getText()) < 0) {
            JOptionPane.showMessageDialog(this, "Điểm phải lớn hơn hoặc bằng 0");
            return;
        } else if (Float.parseFloat(txtTA.getText()) > 10 || Float.parseFloat(txtth.getText()) > 10 || Float.parseFloat(txtGDTC.getText()) > 10) {
            JOptionPane.showMessageDialog(this, "Điểm không được lớn hơn 10");
            return;
        }
        
        diem.setMaSV(maSV);
        diem.setTienganh(Float.parseFloat(TA));
        diem.setTinhoc(Float.parseFloat(th));
        diem.setGDTC(Float.parseFloat(gdtc));
        
        if (diemService.them(diem)){
            loadData(diemService.getList());
            clearForm();
            JOptionPane.showMessageDialog(this, "them thanh cong");
        }else {
            JOptionPane.showMessageDialog(this, "them that bai");
        }
        clearForm();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String index = txtmASV.getText();
        if (diemService.xoa(index)){
            loadData(diemService.getList());
            JOptionPane.showMessageDialog(this, "xoa thanh cong");
        }else {
            JOptionPane.showMessageDialog(this, "xoa that bai");
        }
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void lblTop3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblTop3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTop3AncestorAdded

    private void lblTop3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTop3MouseClicked
        
    }//GEN-LAST:event_lblTop3MouseClicked

    private void txtGDTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGDTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGDTCActionPerformed

    private void txtTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTAActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyDiemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyDiemUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNnEW;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiemTB;
    private javax.swing.JLabel lblTop3;
    private javax.swing.JLabel lbldiemTB;
    private javax.swing.JTable tblDiem;
    private javax.swing.JTextField txtGDTC;
    private javax.swing.JTextField txtTA;
    private javax.swing.JTextField txtTKsv;
    private javax.swing.JTextField txtenSV;
    private javax.swing.JTextField txtmASV;
    private javax.swing.JTextField txtth;
    // End of variables declaration//GEN-END:variables
}

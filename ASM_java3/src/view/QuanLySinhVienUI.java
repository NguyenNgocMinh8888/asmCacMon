/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;
import service.SinhVienService;
import service.impl.SinhVienServiceIMPL;

/**
 *
 * @author nguye
 */
public class QuanLySinhVienUI extends javax.swing.JFrame {

   private DefaultTableModel defaultTableModel;
   private SinhVienService sinhvienService = new SinhVienServiceIMPL();
    public QuanLySinhVienUI() {
        initComponents();
        ArrayList<SinhVien> list = sinhvienService.getList();
        loadData(list);
    }
public void loadData(ArrayList<SinhVien> list) {
        defaultTableModel = (DefaultTableModel) tblSV.getModel();
        defaultTableModel.setRowCount(0);
        for (SinhVien sinhVien : list) {
            defaultTableModel.addRow(new Object[]{
                sinhVien.getMaSV(), sinhVien.getHoten(),
                sinhVien.getEmail(), sinhVien.getSoDT(),sinhVien.hienThiGioiTinh(), sinhVien.getDiachi()
            });
        }
    }
public void clearForm(){
txtMaSV.setText("");
        txtHoTen.setText("");
        txtEmail.setText("");
        txtsdt.setText("");
        txtDiachi.setText("");
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        txthinhanh = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        bthThem = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel2.setText("Mã SV");

        jLabel3.setText("Họ tên");

        jLabel4.setText("Email");

        jLabel5.setText("Số DT");

        jLabel6.setText("Giới tính");

        jLabel7.setText("Địa chỉ");

        txtDiachi.setColumns(20);
        txtDiachi.setRows(5);
        jScrollPane1.setViewportView(txtDiachi);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txthinhanh.setText("đây là ảnh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txthinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(txthinhanh)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        bthThem.setText("New");
        bthThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthThemActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnXoa.setText("Delete");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnsua.setText("Update");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Họ tên", "Email", "Số ĐT", "Giới tính", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(rdoNam)
                        .addGap(33, 33, 33)
                        .addComponent(rdoNu)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(txtMaSV)
                                    .addComponent(txtEmail)
                                    .addComponent(txtsdt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bthThem)
                                    .addComponent(btnXoa))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnsua)
                                    .addComponent(btnsave))
                                .addGap(24, 24, 24))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(279, 279, 279))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsave)
                            .addComponent(bthThem))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa)
                            .addComponent(btnsua))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        int row = tblSV.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtMaSV.setText(tblSV.getValueAt(row, 0).toString());
        txtHoTen.setText(tblSV.getValueAt(row, 1).toString());
        txtEmail.setText(tblSV.getValueAt(row, 2).toString());
        txtsdt.setText(tblSV.getValueAt(row, 3).toString());
        if (tblSV.getValueAt(row, 4).toString().equals("Nam")){
            rdoNam.setSelected(true);
        }else {
            rdoNu.setSelected(true);
        }
        txtDiachi.setText(tblSV.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tblSVMouseClicked

    private void bthThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthThemActionPerformed
//        txtMaSV.setText("");
//        txtHoTen.setText("");
//        txtEmail.setText("");
//        txtsdt.setText("");
//        txtDiachi.setText("");
clearForm();
    }//GEN-LAST:event_bthThemActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        SinhVien sinhVien = new SinhVien();
        String masv = txtMaSV.getText();
        String ten = txtHoTen.getText();
        String email = txtEmail.getText();
        String SDT = txtsdt.getText();
        Boolean gioitinh = false;
        if (rdoNam.isSelected()) {
            gioitinh = true;
        }
        String diachi = txtDiachi.getText();
        
        sinhVien.setMaSV(masv);
        sinhVien.setHoten(ten);
        sinhVien.setEmail(email);
        sinhVien.setSoDT(SDT);
        sinhVien.setGioitinh(gioitinh);
        sinhVien.setDiachi(diachi);
        
        if (masv.isEmpty() || ten.isEmpty() || email.isEmpty() || SDT.isEmpty() || diachi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return;
        } 
        else if (txtEmail.getText().matches("[a-zA-Z0-9]*[@]{1}[a-zA-Z]+[.]{1}[a-zA-Z]+") == false) {
            JOptionPane.showMessageDialog(this, "sai định dạng email");
            return;
        } else if (txtsdt.getText().matches("[0-9]{10}") == false) {
            JOptionPane.showMessageDialog(this, "sai định dạng sdt");
            return;
        }
        try {
            if (txtsdt.getText().trim().length() != 10) {
                JOptionPane.showMessageDialog(this, "so dien thoai phai 10 so");
            }
            if(txtsdt.getText().charAt(0)!='0'){
                JOptionPane.showMessageDialog(this, "so dien thoai phai bat dau bang 0");
                return ;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "So dt phai la so");
            e.printStackTrace();
        }
        if (sinhvienService.them(sinhVien)) {
            loadData(sinhvienService.getList());
            JOptionPane.showMessageDialog(this, "Them thanh cong ");
            clearForm();
            
        } else {
            JOptionPane.showMessageDialog(this, "Ma da ton tai");
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        
        String viTri = txtMaSV.getText();
        if (sinhvienService.xoa(viTri)){
            loadData(sinhvienService.getList());
            JOptionPane.showMessageDialog(this, "xoa thanh cong");
        }else {
            JOptionPane.showMessageDialog(this, "xoa that bai");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        SinhVien sinhVien = new SinhVien();
        String masv = txtMaSV.getText();
        String ten = txtHoTen.getText();
        String email = txtEmail.getText();
        String SDT = txtsdt.getText();
        Boolean gioitinh = false;
        if (rdoNam.isSelected()) {
            gioitinh = true;
        }
        String diachi = txtDiachi.getText();
        
        sinhVien.setMaSV(masv);
        sinhVien.setHoten(ten);
        sinhVien.setEmail(email);
        sinhVien.setSoDT(SDT);
        sinhVien.setGioitinh(gioitinh);
        sinhVien.setDiachi(diachi);
        
        if (masv.isEmpty() || ten.isEmpty() || email.isEmpty() || SDT.isEmpty() || diachi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return;
        } 
        else if (txtEmail.getText().matches("[a-zA-Z0-9]*[@]{1}[a-zA-Z]+[.]{1}[a-zA-Z]+") == false) {
            JOptionPane.showMessageDialog(this, "sai định dạng email");
            return;
        } else if (txtsdt.getText().matches("[0-9]{10}") == false) {
            JOptionPane.showMessageDialog(this, "sai định dạng sdt");
            return;
        }
        try {
            if (txtsdt.getText().trim().length() != 10) {
                JOptionPane.showMessageDialog(this, "so dien thoai phai 10 so");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "So dt phai la so");
            e.printStackTrace();
        }
        
        if (sinhvienService.update(masv, sinhVien)) {
            JOptionPane.showMessageDialog(this, "sua thanh cong ");
            loadData(sinhvienService.getList());
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "sua that Bai");
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    
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
            java.util.logging.Logger.getLogger(QuanLySinhVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySinhVienUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsua;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextArea txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JLabel txthinhanh;
    private javax.swing.JTextField txtsdt;
    // End of variables declaration//GEN-END:variables
}

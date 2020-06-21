/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbclpm.view.cauhinh;

import com.mycompany.dbclpm.DAO.CHMucLuongBHXHDAO;
import com.mycompany.dbclpm.model.CHMucLuongBHXH;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author v
 */
public class MucLuongFrm extends javax.swing.JFrame {

    /**
     * Creates new form MucLuongfrm
     */
    private DefaultTableModel model;
    private CHMucLuongBHXHDAO chDAO;
    private static int luongCB, sua;
    private ArrayList<CHMucLuongBHXH> list;
    
    public MucLuongFrm() {
        initComponents();
        luongCB = 1600000;
        sua = 0;
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) jTable.getModel();
        chDAO = new CHMucLuongBHXHDAO();
        list = chDAO.getList();
        filltblNguyenLieu(list);
    }

    private void filltblNguyenLieu(ArrayList<CHMucLuongBHXH> list){
        model.setNumRows(0);
        for(CHMucLuongBHXH x: list){
//            System.out.println(x.toString());
            model.addRow(new Object[]{
                x.getVung(),
                x.getLuongMin(),
                x.getLuongMax(),
                x.getTiLeLD(),
                x.getLdQuaDT(),
            });
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

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtLuongMax = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVung = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        txtLuongMin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTileLD = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Xoá");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtLuongMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLuongMaxActionPerformed(evt);
            }
        });

        jButton4.setText("Huỷ bỏ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Vùng :");

        jLabel3.setText("Mức lương tối thiểu :");

        jLabel4.setText("Mức lương tối đa :");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vùng", "Mức lương tối thiếu", "Mức lương tối đa", "Tỉ lệ LĐ qua đào tạo", "LĐ qua đào tạo"
            }
        ));
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Cấu hình mức lương");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tỉ lệ LĐ qua đào tạo :");

        jButton5.setText("Cập nhật");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setText("%");

        jLabel7.setText("VNĐ");

        jLabel8.setText("VNĐ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVung, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(txtLuongMin)
                    .addComponent(txtLuongMax)
                    .addComponent(txtTileLD, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jLabel2)
                    .addContainerGap(485, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtVung, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLuongMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLuongMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTileLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(376, 376, 376)
                    .addComponent(jLabel2)
                    .addContainerGap(161, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CHMucLuongBHXH mucluong = new CHMucLuongBHXH();
        try {
            mucluong.setLuongCB(luongCB);
            String vung = txtVung.getText(); mucluong.setVung(vung);
            int luongMin = Integer.parseInt(txtLuongMin.getText()); mucluong.setLuongMin(luongMin);
            int luongMax = Integer.parseInt(txtLuongMax.getText()); mucluong.setLuongMax(luongMax);
            
            float tiLeLD = Float.parseFloat(txtTileLD.getText()); mucluong.setTiLeLD(tiLeLD);
            mucluong.setLdQuaDT((int) (luongMin*(100+tiLeLD)/100));
            if(tiLeLD >= 100) {
                JOptionPane.showMessageDialog(this, "Tỉ lệ lao động qua đào tạo phải nhỏ hơn 100%.");
               return;
            }
            
            if(luongMin > luongMax) {
               JOptionPane.showMessageDialog(this, "Lương tối đa phải lớn hơn hoặc bằng lương tối thiểu.");
               return;
            }
            if(luongMin < 0 ) {
                JOptionPane.showMessageDialog(this, "Lương tối thiểu phải lớn hơn 0.");
                return;
            }
            if(luongMax < 0 ) {
                JOptionPane.showMessageDialog(this, "Lương tối đa phải lớn hơn 0.");
                return;
            }
            
            mucluong = chDAO.addML(mucluong);
            list.add(mucluong);
            System.out.println(mucluong.toString());
            filltblNguyenLieu(list);
            clearData();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Dữ liệu nhập sai định dạng.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearData() {
        txtVung.setText("");
        txtLuongMin.setText("");
        txtLuongMax.setText("");
        txtTileLD.setText("");
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clearData();
        try {
            int i = jTable.getSelectedRow();
            if( i < 0) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn vị trí xoá !!!");
                return;
            }
            CHMucLuongBHXH mucluong = list.get(i);
            chDAO.deleteML(mucluong.getId());
            JOptionPane.showMessageDialog(this, "Xoá thành công !!!");
            list.remove(i);
            filltblNguyenLieu(list);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi : " + e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int i = jTable.getSelectedRow();
        if (i == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn vùng cần sửa ");
            return;
        }
        CHMucLuongBHXH mucluong = list.get(i);
        txtVung.setText(mucluong.getVung());
        txtLuongMin.setText(String.valueOf(mucluong.getLuongMin()));
        txtLuongMax.setText(String.valueOf(mucluong.getLuongMax()));
        txtTileLD.setText(String.valueOf(mucluong.getTiLeLD()));
        sua = 1;
    }//GEN-LAST:event_jButton3ActionPerformed

    private Boolean checkMucLuong(int a, int b) {
        if(a > b) {
            return true;
        }
        return false;
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int i = jTable.getSelectedRow();
        if (i == -1 || sua != 1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn vùng cần sửa hoặc nhập dữ liệu sửa");
            return;
        }
        CHMucLuongBHXH mucluong = list.get(i);
        try {
            mucluong.setLuongCB(luongCB);
            String vung = txtVung.getText(); mucluong.setVung(vung);
            int luongMin = Integer.parseInt(txtLuongMin.getText()); mucluong.setLuongMin(luongMin);
            int luongMax = Integer.parseInt(txtLuongMax.getText()); mucluong.setLuongMax(luongMax);
            float tiLeLD = (float) 0.07; mucluong.setTiLeLD(tiLeLD);
            float tile = Float.parseFloat(txtTileLD.getText()); mucluong.setTiLeLD(tile);
            mucluong.setLdQuaDT((int) (luongMin*(100+tile)/100));
            
            if(tiLeLD >= 100) {
                JOptionPane.showMessageDialog(this, "Tỉ lệ lao động qua đào tạo phải nhỏ hơn 100%.");
               return;
            }
            if(luongMin > luongMax) {
               JOptionPane.showMessageDialog(this, "Lương tối đa phải lớn hơn hoặc bằng lương tối thiểu.");
               return;
            }
            if(luongMin < 0 ) {
                JOptionPane.showMessageDialog(this, "Lương tối thiểu phải lớn hơn 0.");
                return;
            }
            if(luongMax < 0 ) {
                JOptionPane.showMessageDialog(this, "Lương tối đa phải lớn hơn 0.");
                return;
            }
            chDAO.updateML(mucluong);
            list.set(i, mucluong);
            filltblNguyenLieu(list);
            clearData(); sua = 0;
            JOptionPane.showMessageDialog(this, "Sửa thành công !!!");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Dữ liệu nhập sai định dạng : " + e.getMessage());
        }
        clearData();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CauHinhFrm cauHinhFrm = new CauHinhFrm();
        cauHinhFrm.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtLuongMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLuongMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLuongMaxActionPerformed

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
            java.util.logging.Logger.getLogger(MucLuongFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MucLuongFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MucLuongFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MucLuongFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MucLuongFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtLuongMax;
    private javax.swing.JTextField txtLuongMin;
    private javax.swing.JTextField txtTileLD;
    private javax.swing.JTextField txtVung;
    // End of variables declaration//GEN-END:variables
}

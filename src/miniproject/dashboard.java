package miniproject;

public class dashboard extends javax.swing.JFrame {

    public dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        backDashboard = new javax.swing.JLabel();
        detailProduk = new javax.swing.JLabel();
        tambahProduk = new javax.swing.JLabel();
        keranjang = new javax.swing.JLabel();
        btnDetailProduk = new javax.swing.JButton();
        btnTambahProduk = new javax.swing.JButton();
        btnKeranjang = new javax.swing.JButton();
        laporan = new javax.swing.JLabel();
        btnLaporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnpengaturan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("dashboard");

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 102, 0), new java.awt.Color(0, 51, 0), null, new java.awt.Color(51, 204, 0)));

        backDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/back.jpeg"))); // NOI18N
        backDashboard.setText("jLabel1");
        backDashboard.setPreferredSize(new java.awt.Dimension(38, 26));
        backDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backDashboardMouseClicked(evt);
            }
        });

        detailProduk.setForeground(new java.awt.Color(0, 51, 19));
        detailProduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/detailproduk.jpeg"))); // NOI18N
        detailProduk.setText("jLabel1");
        detailProduk.setPreferredSize(new java.awt.Dimension(119, 57));
        detailProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailProdukMouseClicked(evt);
            }
        });

        tambahProduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/tambahproduk.jpeg"))); // NOI18N
        tambahProduk.setText("jLabel1");
        tambahProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahProdukMouseClicked(evt);
            }
        });

        keranjang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/keranjang.jpeg"))); // NOI18N
        keranjang.setText("jLabel2");
        keranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keranjangMouseClicked(evt);
            }
        });

        btnDetailProduk.setBackground(new java.awt.Color(208, 208, 151));
        btnDetailProduk.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btnDetailProduk.setForeground(new java.awt.Color(0, 51, 19));
        btnDetailProduk.setText("Detail Produk");
        btnDetailProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailProdukActionPerformed(evt);
            }
        });

        btnTambahProduk.setBackground(new java.awt.Color(208, 208, 151));
        btnTambahProduk.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btnTambahProduk.setForeground(new java.awt.Color(0, 51, 19));
        btnTambahProduk.setText("Tambah Produk");
        btnTambahProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahProdukMouseClicked(evt);
            }
        });
        btnTambahProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahProdukActionPerformed(evt);
            }
        });

        btnKeranjang.setBackground(new java.awt.Color(208, 208, 151));
        btnKeranjang.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btnKeranjang.setForeground(new java.awt.Color(0, 51, 19));
        btnKeranjang.setText("Keranjang");
        btnKeranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeranjangMouseClicked(evt);
            }
        });

        laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/laporan.jpeg"))); // NOI18N
        laporan.setText("jLabel1");
        laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laporanMouseClicked(evt);
            }
        });

        btnLaporan.setBackground(new java.awt.Color(208, 208, 151));
        btnLaporan.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btnLaporan.setForeground(new java.awt.Color(0, 51, 19));
        btnLaporan.setText("Laporan");
        btnLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setText("Dashboard");

        btnpengaturan.setBackground(new java.awt.Color(208, 208, 151));
        btnpengaturan.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        btnpengaturan.setForeground(new java.awt.Color(0, 51, 19));
        btnpengaturan.setText("Pengaturan");
        btnpengaturan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpengaturanMouseClicked(evt);
            }
        });
        btnpengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpengaturanActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/pengaturan.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(157, 57));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(keranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(btnKeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(detailProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(147, 147, 147)
                                        .addComponent(tambahProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(149, 149, 149)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnDetailProduk)
                                        .addGap(131, 131, 131)
                                        .addComponent(btnTambahProduk)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                                        .addComponent(btnpengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahProduk)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetailProduk)
                    .addComponent(btnTambahProduk)
                    .addComponent(btnpengaturan))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laporan)
                    .addComponent(keranjang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaporan)
                    .addComponent(btnKeranjang))
                .addGap(0, 106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnpengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpengaturanActionPerformed
        this.dispose();
        pengaturan a = new pengaturan();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnpengaturanActionPerformed

    private void btnpengaturanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpengaturanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpengaturanMouseClicked

    private void btnLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanActionPerformed
        new laporan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLaporanActionPerformed

    private void laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanMouseClicked
        new laporan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_laporanMouseClicked

    private void btnKeranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeranjangMouseClicked
        // TODO add your handling code here:
        new keranjang().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKeranjangMouseClicked

    private void btnTambahProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahProdukActionPerformed

    private void btnTambahProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahProdukMouseClicked
        new produk().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTambahProdukMouseClicked

    private void btnDetailProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailProdukActionPerformed
        new detail_produk().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDetailProdukActionPerformed

    private void keranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keranjangMouseClicked
        new keranjang().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_keranjangMouseClicked

    private void tambahProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahProdukMouseClicked
        new produk().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tambahProdukMouseClicked

    private void detailProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailProdukMouseClicked
        new detail_produk().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_detailProdukMouseClicked

    private void backDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backDashboardMouseClicked
        new login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backDashboardMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new pengaturan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backDashboard;
    private javax.swing.JButton btnDetailProduk;
    private javax.swing.JButton btnKeranjang;
    private javax.swing.JButton btnLaporan;
    private javax.swing.JButton btnTambahProduk;
    private javax.swing.JButton btnpengaturan;
    private javax.swing.JLabel detailProduk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel keranjang;
    private javax.swing.JLabel laporan;
    private javax.swing.JLabel tambahProduk;
    // End of variables declaration//GEN-END:variables
}

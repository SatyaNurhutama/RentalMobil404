package rentalmobil404;

import database.KoneksiDatabase;
import java.awt.Color;
import javax.swing.JPanel;
import database.QueryDatabase;
import database.TableData;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DaftarMobil extends javax.swing.JInternalFrame {
    
    ResultSet rs;
    QueryDatabase query;

    public DaftarMobil() {
        query = new QueryDatabase(KoneksiDatabase.HOST_DB,KoneksiDatabase.USERNAME_DB,KoneksiDatabase.PASSWORD_DB);
        initComponents();
        loadTabel();
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
        tabelMobil = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldType = new javax.swing.JTextField();
        fieldMerk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldHarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboxTahun = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboxStatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        fieldNopol = new javax.swing.JTextField();
        buttonTambah = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buttonEdit = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        buttonHapus = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(224, 234, 245));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Merek Mobil", "Type Mobil", "Tahun Produksi", "No. Polisi", "Harga Sewa", "Status"
            }
        ));
        tabelMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMobilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMobil);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 920, 190));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Daftar Mobil");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Merk Mobil");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Type Mobil");

        fieldType.setBackground(new java.awt.Color(232, 232, 232));
        fieldType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTypeActionPerformed(evt);
            }
        });

        fieldMerk.setBackground(new java.awt.Color(232, 232, 232));
        fieldMerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMerkActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Tahun Produksi");

        fieldHarga.setBackground(new java.awt.Color(232, 232, 232));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nomor Polisi");

        cboxTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));
        cboxTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTahunActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Status");

        cboxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Keluar" }));
        cboxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxStatusActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Harga");

        fieldNopol.setBackground(new java.awt.Color(232, 232, 232));
        fieldNopol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNopolActionPerformed(evt);
            }
        });

        buttonTambah.setBackground(new java.awt.Color(255, 181, 0));
        buttonTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTambahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonTambahMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_add.png"))); // NOI18N

        javax.swing.GroupLayout buttonTambahLayout = new javax.swing.GroupLayout(buttonTambah);
        buttonTambah.setLayout(buttonTambahLayout);
        buttonTambahLayout.setHorizontalGroup(
            buttonTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonTambahLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        buttonTambahLayout.setVerticalGroup(
            buttonTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(buttonTambahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonEdit.setBackground(new java.awt.Color(255, 135, 25));
        buttonEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonEditMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Edit");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_edit.png"))); // NOI18N

        javax.swing.GroupLayout buttonEditLayout = new javax.swing.GroupLayout(buttonEdit);
        buttonEdit.setLayout(buttonEditLayout);
        buttonEditLayout.setHorizontalGroup(
            buttonEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonEditLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        buttonEditLayout.setVerticalGroup(
            buttonEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(buttonEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonHapus.setBackground(new java.awt.Color(249, 48, 48));
        buttonHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonHapusMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Delete");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_delete.png"))); // NOI18N

        javax.swing.GroupLayout buttonHapusLayout = new javax.swing.GroupLayout(buttonHapus);
        buttonHapus.setLayout(buttonHapusLayout);
        buttonHapusLayout.setHorizontalGroup(
            buttonHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonHapusLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        buttonHapusLayout.setVerticalGroup(
            buttonHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(buttonHapusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo_1.png"))); // NOI18N
        jLabel15.setText("jLabel15");

        jLabel16.setText(":");

        jLabel17.setText(":");

        jLabel18.setText(":");

        jLabel19.setText(":");

        jLabel20.setText(":");

        jLabel21.setText(":");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNopol, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldType, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fieldMerk, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(jLabel16))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldType, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel17))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldNopol, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel18))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboxTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel19))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel20))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel21))
                        .addGap(29, 29, 29)
                        .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(376, 376, 376))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 910, 400));

        jLabel8.setBackground(new java.awt.Color(224, 234, 245));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background2.jpg"))); // NOI18N
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxTahunActionPerformed

    private void cboxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxStatusActionPerformed

    private void tabelMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMobilMouseClicked
        pilihTabel();
    }//GEN-LAST:event_tabelMobilMouseClicked

    private void buttonTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTambahMouseEntered
        setColor(buttonTambah);
    }//GEN-LAST:event_buttonTambahMouseEntered

    private void buttonTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTambahMouseExited
        resetColor(buttonTambah);
    }//GEN-LAST:event_buttonTambahMouseExited

    private void buttonTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTambahMouseClicked
        clickColor(buttonTambah);
        tambahMobil();
    }//GEN-LAST:event_buttonTambahMouseClicked

    private void buttonEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditMouseEntered
        setColor(buttonEdit);
    }//GEN-LAST:event_buttonEditMouseEntered

    private void buttonEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditMouseExited
        resetColor(buttonEdit);
    }//GEN-LAST:event_buttonEditMouseExited

    private void buttonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditMouseClicked
        clickColor(buttonEdit);
        editMobil();
        loadTabel();
        clear();
    }//GEN-LAST:event_buttonEditMouseClicked

    private void buttonHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHapusMouseEntered
        buttonHapus.setBackground(new Color(223, 7, 7)); 
    }//GEN-LAST:event_buttonHapusMouseEntered

    private void buttonHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHapusMouseExited
        buttonHapus.setBackground(new Color(249,48,48)); 
    }//GEN-LAST:event_buttonHapusMouseExited

    private void buttonHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHapusMouseClicked
        buttonHapus.setBackground(new Color(188, 6, 6));
        hapusMobil();
        loadTabel();
        clear();
    }//GEN-LAST:event_buttonHapusMouseClicked

    private void fieldMerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMerkActionPerformed

    private void fieldNopolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNopolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNopolActionPerformed

    private void fieldTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTypeActionPerformed

    void setColor(JPanel panel){
        panel.setBackground(new Color(214, 154, 0)); 
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(255,181,0)); 
    }
    
    void clickColor(JPanel panel){
        panel.setBackground(new Color(173, 124, 0));
    }
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
            java.util.logging.Logger.getLogger(DaftarMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarMobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonEdit;
    private javax.swing.JPanel buttonHapus;
    private javax.swing.JPanel buttonTambah;
    private javax.swing.JComboBox<String> cboxStatus;
    private javax.swing.JComboBox<String> cboxTahun;
    private javax.swing.JTextField fieldHarga;
    private javax.swing.JTextField fieldMerk;
    private javax.swing.JTextField fieldNopol;
    private javax.swing.JTextField fieldType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelMobil;
    // End of variables declaration//GEN-END:variables

    private void loadTabel(){
        String namaKolom[] = {"id_mobil","merek","tipe","tahun","nopol","harga","status"};
        rs = query.querySelect(namaKolom,"mobil");
        tabelMobil.setModel(new TableData(rs));
    }
    
    private void clear() {
        fieldMerk.setText("");
        fieldType.setText("");
        cboxTahun.setSelectedItem("2012");
        fieldNopol.setText("");
        fieldHarga.setText("");
    }
    
    public void pilihTabel(){
        fieldMerk.setText(String.valueOf(tabelMobil.getValueAt(tabelMobil.getSelectedRow(),1)));
        fieldType.setText(String.valueOf( tabelMobil.getValueAt(tabelMobil.getSelectedRow(),2)));
        cboxTahun.setSelectedItem(String.valueOf(tabelMobil.getValueAt(tabelMobil.getSelectedRow(),3)));
        fieldNopol.setText(String.valueOf( tabelMobil.getValueAt(tabelMobil.getSelectedRow(),4)));
        fieldHarga.setText(String.valueOf( tabelMobil.getValueAt(tabelMobil.getSelectedRow(),5)));
        cboxStatus.setSelectedItem(String.valueOf(tabelMobil.getValueAt(tabelMobil.getSelectedRow(),6)));
    }

    private void tambahMobil() {
        try { 
            if( !fieldMerk.getText().isEmpty() && !fieldType.getText().isEmpty() && !fieldNopol.getText().isEmpty() && !fieldHarga.getText().isEmpty()){
                String kolom[] = {"merek","tipe","tahun","nopol","harga","status"};
                String isi[] = { fieldMerk.getText(),fieldType.getText(),cboxTahun.getSelectedItem().toString(),fieldNopol.getText(),fieldHarga.getText(),cboxStatus.getSelectedItem().toString()};                
                System.out.println( query.eksekusiQueryInsert("mobil",kolom,isi));
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
            }else{
                JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
            } 
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error input data");
        }
        loadTabel();
        clear();
    }
    
    private void editMobil(){
        try {
            if( !fieldMerk.getText().isEmpty() && !fieldType.getText().isEmpty() && !fieldNopol.getText().isEmpty() && !fieldHarga.getText().isEmpty()){
                String kolom[] = {"merek","tipe","tahun","nopol","harga","status"};
                String isi[] = { fieldMerk.getText(),fieldType.getText(),cboxTahun.getSelectedItem().toString(),fieldNopol.getText(),fieldHarga.getText(),cboxStatus.getSelectedItem().toString()};
                query.queryUpdate("mobil", kolom, isi,"id_mobil='"+String.valueOf(tabelMobil.getValueAt(tabelMobil.getSelectedRow(),0))+"'");
                JOptionPane.showMessageDialog(this, "Data mobil berhasil ditambahkan");
            }else{
                JOptionPane.showMessageDialog(this, "Tidak boleh ada data yang kosong");
            }
        }catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error edit data");
        }
    }
    
    private void hapusMobil(){
        try {
            String id=String.valueOf(tabelMobil.getValueAt(tabelMobil.getSelectedRow(),0));
            if (JOptionPane.showConfirmDialog(this, "Yakin menghapus data", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                query.queryDeleteWhere("mobil","id_mobil="+id);
            }else{
                JOptionPane.showMessageDialog(this, "Pilih id terlebih dahulu");
            }
        } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Error");
        }
    }
}

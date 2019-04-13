/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.administrasi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//import java.awt.Toolkit;

/**
 *
 * @author ASUS R.O.G
 */
public class Home extends javax.swing.JFrame {
    private Connection konek;
    private Statement stat;
    private ResultSet rs;
    private ButtonModel rbPria;
    private ButtonModel rbPerempuan;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        updateTabel();
        rbJenisKelaminGroup.add(inputJK1);
        rbJenisKelaminGroup.add(inputJK2);
        this.rbPria = inputJK1.getModel();
        this.rbPerempuan = inputJK2.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbJenisKelaminGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelEmail = new javax.swing.JLabel();
        labelNamaDepan = new javax.swing.JLabel();
        labelNamaBelakang = new javax.swing.JLabel();
        labelUmur = new javax.swing.JLabel();
        labelJenisKelamin = new javax.swing.JLabel();
        labelAgama = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        inputNamaDepan = new javax.swing.JTextField();
        inputNamaBelakang = new javax.swing.JTextField();
        inputUmur = new javax.swing.JTextField();
        cbAgama = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        btnDataBaru = new javax.swing.JButton();
        btnUpdateData = new javax.swing.JButton();
        btnHapusData = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        inputJK1 = new javax.swing.JRadioButton();
        inputJK2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1400, 650));

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("biodata pengguna");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelEmail.setText("Email");

        labelNamaDepan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelNamaDepan.setText("Nama Depan");

        labelNamaBelakang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelNamaBelakang.setText("Nama Belakang");

        labelUmur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelUmur.setText("Umur");

        labelJenisKelamin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelJenisKelamin.setText("Jenis Kelamin");

        labelAgama.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelAgama.setText("Agama");

        labelStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelStatus.setText("Status");

        inputEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        inputNamaDepan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        inputNamaBelakang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        inputUmur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cbAgama.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Agama", "Islam", "Hindu", "Budha", "Kristen", "Katolik" }));

        cbStatus.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Status", "Menikah", "Belum Menikah" }));

        btnDataBaru.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDataBaru.setText("Tambah Data");
        btnDataBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataBaruActionPerformed(evt);
            }
        });

        btnUpdateData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdateData.setText("Update Data");
        btnUpdateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDataActionPerformed(evt);
            }
        });

        btnHapusData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHapusData.setText("Hapus Data");
        btnHapusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDataActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("data mahasiswa");

        inputJK1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        inputJK1.setText("Laki-Laki");
        inputJK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJK1ActionPerformed(evt);
            }
        });

        inputJK2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        inputJK2.setText("Perempuan");
        inputJK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJK2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(inputEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNamaDepan)
                        .addGap(37, 37, 37)
                        .addComponent(inputNamaDepan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelJenisKelamin)
                            .addComponent(labelAgama)
                            .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputUmur)
                            .addComponent(cbAgama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputJK1)
                                .addGap(18, 18, 18)
                                .addComponent(inputJK2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelNamaBelakang)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(inputNamaBelakang))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnDataBaru)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpdateData)
                            .addGap(18, 18, 18)
                            .addComponent(btnHapusData))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaDepan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNamaDepan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaBelakang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNamaBelakang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelJenisKelamin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputJK1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputJK2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAgama)
                    .addComponent(labelAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataBaru)
                    .addComponent(btnUpdateData)
                    .addComponent(btnHapusData))
                .addContainerGap())
        );

        tabelData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Email", "Nama Lengkap", "Umur", "Jenis Kelamin", "Agama", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelData);
        if (tabelData.getColumnModel().getColumnCount() > 0) {
            tabelData.getColumnModel().getColumn(0).setResizable(false);
            tabelData.getColumnModel().getColumn(1).setResizable(false);
            tabelData.getColumnModel().getColumn(2).setResizable(false);
            tabelData.getColumnModel().getColumn(3).setResizable(false);
            tabelData.getColumnModel().getColumn(4).setResizable(false);
            tabelData.getColumnModel().getColumn(5).setResizable(false);
            tabelData.getColumnModel().getColumn(6).setResizable(false);
        }
        tabelData.setAutoResizeMode(tabelData.AUTO_RESIZE_OFF);
        tabelData.getColumnModel().getColumn(0).setPreferredWidth(33);
        tabelData.getColumnModel().getColumn(1).setPreferredWidth(250);
        tabelData.getColumnModel().getColumn(2).setPreferredWidth(225);
        tabelData.getColumnModel().getColumn(3).setPreferredWidth(75);
        tabelData.getColumnModel().getColumn(4).setPreferredWidth(125);
        tabelData.getColumnModel().getColumn(6).setPreferredWidth(135);
        tabelData.setRowHeight(30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eksekusiUpdateSQL(String sql){
        try {
            konek = new Koneksi().koneksi();
            stat = konek.createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Proses berhasil");
            this.updateTabel();
            konek.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Proses gagal");
            
        }
    }
    
    private int eksekusiAmbilSQL(String sql){
        int data;
        try {
            konek = new Koneksi().koneksi();
            stat = konek.createStatement();
            rs = stat.executeQuery(sql);
            data = stat.getUpdateCount();
            return data;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
    
    private void updateTabel(){
        //membersihkan data tabel
        DefaultTableModel model = (DefaultTableModel) tabelData.getModel();
        model.setRowCount(0);
        
        //membuat data tabel
        String sql = "SELECT * FROM akun";
        String email, namaLengkap, umur, jenisKelamin, agama, status;
        int data = this.eksekusiAmbilSQL(sql);
        int id = 0;
        try {
            while(rs.next()){
                Object[] rowData = null;
                ((DefaultTableModel) tabelData.getModel()).addRow(rowData);
                
                //mengambil data dari database
                email = rs.getString("email");
                namaLengkap = rs.getString("nama-depan")+" "+rs.getString("nama-belakang");
                umur = rs.getString("umur")+" Thn";
                jenisKelamin = rs.getString("jenis-kelamin");
                agama = rs.getString("agama");
                status = rs.getString("status");
                
                //set data pada tabel
                tabelData.setValueAt(id+1, id, 0);
                tabelData.setValueAt(email, id, 1);
                tabelData.setValueAt(namaLengkap, id, 2);
                tabelData.setValueAt(umur, id, 3);
                tabelData.setValueAt(jenisKelamin, id, 4);
                tabelData.setValueAt(agama, id, 5);
                tabelData.setValueAt(status, id, 6);
                id++;
            }
            konek.close();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void resetPanelInput(){
        inputEmail.setText("");
        inputEmail.setEditable(true);
        inputNamaBelakang.setText("");
        inputNamaDepan.setText("");
        inputUmur.setText("");
        
        //input jenis kelamin
        rbJenisKelaminGroup.clearSelection();
        
        cbAgama.setSelectedIndex(0);
        cbStatus.setSelectedIndex(0);
    }
    
    private void btnHapusDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDataActionPerformed
        String email = inputEmail.getText();
        String sql = "DELETE FROM akun WHERE email='%s'";
        sql = String.format(sql, email);
        
        //proses menghapus data di database
        this.eksekusiUpdateSQL(sql);
        
        //membersihkan panel input data
        this.resetPanelInput();
    }//GEN-LAST:event_btnHapusDataActionPerformed

    private void btnDataBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataBaruActionPerformed
        String email, namaDepan, namaBelakang, jenisKelamin="", agama="", status="";
        int umur;
        
        //mengambil data baru
        email = inputEmail.getText();
        namaDepan = inputNamaDepan.getText();
        namaBelakang = inputNamaBelakang.getText();
        umur = Integer.parseInt(inputUmur.getText());
        
        //jenis Kelamin
        if (rbPria.isSelected()) {
            jenisKelamin="Laki-Laki";
        }
        else if (rbPerempuan.isSelected()) {
            jenisKelamin="perempuan";
        }
        
        //agama
        switch (cbAgama.getSelectedIndex()) {
            case 1:
                agama="Islam";
                break;
            case 2:
                agama="Hindu";
                break;
            case 3:
                agama="Budha";
                break; 
            case 4:
                agama="Kristen";
                break;
            case 5:
                agama="Katolik";
                break;
            default:
                break;
        }
        //status
        switch (cbStatus.getSelectedIndex()) {
            case 1:
                status="Menikah";
                break;
            case 2:
                status="Belum Menikah";
                break;
            default:
                status="";
                break;
        }
        String sql = "INSERT INTO akun VALUES ('%s', '%s', '%s', %d, '%s', '%s', '%s')";
        sql = String.format(sql, email, namaDepan, namaBelakang, umur, jenisKelamin, agama, status);
        this.eksekusiUpdateSQL(sql);
        
        //membersihkan panel input data
        this.resetPanelInput();
    }//GEN-LAST:event_btnDataBaruActionPerformed

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        int baris = tabelData.getSelectedRow();
        String email = tabelData.getModel().getValueAt(baris, 1).toString();
        String sql = "SELECT * FROM akun WHERE email ='%s'";
        sql = String.format(sql, email);
        this.eksekusiAmbilSQL(sql);
        try {
            if (rs.next()) {
                inputEmail.setText(rs.getString("email"));
                inputEmail.setEditable(false);
                inputNamaDepan.setText(rs.getString("nama-depan"));
                inputNamaBelakang.setText(rs.getString("nama-belakang"));
                inputUmur.setText(rs.getString("umur"));
                
                //set jenis kelamin
                String jenisKelamin = rs.getString("jenis-kelamin");
                if ("Laki-Laki".equals(jenisKelamin)) {
                    rbJenisKelaminGroup.setSelected(rbPria, true);
                }
                else if ("Perempuan".equals(jenisKelamin)) {
                    rbJenisKelaminGroup.setSelected(rbPerempuan, true);
                }
                
                //set combo box agama
                String agama = rs.getString("agama");
                switch (agama) {
                    case "Islam":
                        cbAgama.setSelectedIndex(1);
                        break;
                    case "Hindu":
                        cbAgama.setSelectedIndex(2);
                        break;
                    case "Budha":
                        cbAgama.setSelectedIndex(3);
                        break;
                    case "Kristen":
                        cbAgama.setSelectedIndex(4);
                        break;
                    case "Katolik":
                        cbAgama.setSelectedIndex(5);
                        break;
                    default:
                        cbAgama.setSelectedIndex(0);
                        break;
                }
                
                //set combo box status
                String status = rs.getString("status");
                switch (status) {
                    case "Menikah":
                        cbStatus.setSelectedIndex(1);
                        break;
                    case "Belum Menikah":
                        cbStatus.setSelectedIndex(2);
                        break;
                    default:
                        cbStatus.setSelectedIndex(0);
                        break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tabelDataMouseClicked

    private void btnUpdateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDataActionPerformed
        String email, namaDepan, namaBelakang, jenisKelamin="", agama="", status="";
        int umur;
        //mengambil data baru
        email = inputEmail.getText();
        namaDepan = inputNamaDepan.getText();
        namaBelakang = inputNamaBelakang.getText();
        umur = Integer.parseInt(inputUmur.getText());
        
        //jenis Kelamin
        if (rbPria.isSelected()) {
            jenisKelamin="Laki-Laki";
        }
        else if (rbPerempuan.isSelected()) {
            jenisKelamin="perempuan";
        }
        
        //agama
        switch (cbAgama.getSelectedIndex()) {
            case 1:
                agama="Islam";
                break;
            case 2:
                agama="Hindu";
                break;
            case 3:
                agama="Budha";
                break; 
            case 4:
                agama="Kristen";
                break;
            case 5:
                agama="Katolik";
                break;
            default:
                agama="";
                break;
        }
        //status
        switch (cbStatus.getSelectedIndex()) {
            case 1:
                status="Menikah";
                break;
            case 2:
                status="Belum Menikah";
                break;
            default:
                status="";
                break;
        }
        String sql = "UPDATE `akun` SET `nama-depan`='%s',`nama-belakang`='%s',`umur`=%d,`jenis-kelamin`='%s',`agama`='%s',`status`='%s' WHERE `email`='%s'";
        sql = String.format(sql, namaDepan, namaBelakang, umur, jenisKelamin, agama, status, email);
        this.eksekusiUpdateSQL(sql);
        
        //membersihkan panel input data
        this.resetPanelInput();
    }//GEN-LAST:event_btnUpdateDataActionPerformed

    private void inputJK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJK1ActionPerformed
        rbPria = rbJenisKelaminGroup.getSelection();
    }//GEN-LAST:event_inputJK1ActionPerformed

    private void inputJK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJK2ActionPerformed
        rbPerempuan = rbJenisKelaminGroup.getSelection();
    }//GEN-LAST:event_inputJK2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataBaru;
    private javax.swing.JButton btnHapusData;
    private javax.swing.JButton btnUpdateData;
    private javax.swing.JComboBox<String> cbAgama;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JRadioButton inputJK1;
    private javax.swing.JRadioButton inputJK2;
    private javax.swing.JTextField inputNamaBelakang;
    private javax.swing.JTextField inputNamaDepan;
    private javax.swing.JTextField inputUmur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAgama;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelJenisKelamin;
    private javax.swing.JLabel labelNamaBelakang;
    private javax.swing.JLabel labelNamaDepan;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelUmur;
    private javax.swing.ButtonGroup rbJenisKelaminGroup;
    private javax.swing.JTable tabelData;
    // End of variables declaration//GEN-END:variables
}

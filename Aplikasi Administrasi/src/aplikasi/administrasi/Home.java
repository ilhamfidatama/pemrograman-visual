/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.administrasi;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

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
        jLabel2 = new javax.swing.JLabel();
        refreshData = new javax.swing.JLabel();
        inputJK1 = new javax.swing.JRadioButton();
        inputJK2 = new javax.swing.JRadioButton();
        btnDataBaru = new javax.swing.JButton();
        btnHapusData = new javax.swing.JButton();
        btnUpdateData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ARSIP DATA MAHASISWA");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1500, 650));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\KULIAH\\SEMESTER 6\\Pemrograman Visual\\pemrograman-visual\\Aplikasi Administrasi\\image\\bgHeader.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 70);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEmail.setBackground(new java.awt.Color(39, 129, 191));
        labelEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(39, 129, 191));
        labelEmail.setText("Email");
        jPanel1.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 77, 55, 35));

        labelNamaDepan.setBackground(new java.awt.Color(39, 129, 191));
        labelNamaDepan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelNamaDepan.setForeground(new java.awt.Color(39, 129, 191));
        labelNamaDepan.setText("Nama Depan");
        jPanel1.add(labelNamaDepan, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 132, -1, 30));

        labelNamaBelakang.setBackground(new java.awt.Color(39, 129, 191));
        labelNamaBelakang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelNamaBelakang.setForeground(new java.awt.Color(39, 129, 191));
        labelNamaBelakang.setText("Nama Belakang");
        jPanel1.add(labelNamaBelakang, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 185, -1, 30));

        labelUmur.setBackground(new java.awt.Color(39, 129, 191));
        labelUmur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelUmur.setForeground(new java.awt.Color(39, 129, 191));
        labelUmur.setText("Umur");
        jPanel1.add(labelUmur, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 238, 55, 30));

        labelJenisKelamin.setBackground(new java.awt.Color(39, 129, 191));
        labelJenisKelamin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelJenisKelamin.setForeground(new java.awt.Color(39, 129, 191));
        labelJenisKelamin.setText("Jenis Kelamin");
        jPanel1.add(labelJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 289, -1, 29));

        labelAgama.setBackground(new java.awt.Color(39, 129, 191));
        labelAgama.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelAgama.setForeground(new java.awt.Color(39, 129, 191));
        labelAgama.setText("Agama");
        jPanel1.add(labelAgama, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 337, -1, 30));

        labelStatus.setBackground(new java.awt.Color(39, 129, 191));
        labelStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(39, 129, 191));
        labelStatus.setText("Status");
        jPanel1.add(labelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 388, 62, 30));

        inputEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputEmail.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                inputEmailCaretUpdate(evt);
            }
        });
        jPanel1.add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 77, 275, 35));

        inputNamaDepan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(inputNamaDepan, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 130, 275, 35));

        inputNamaBelakang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(inputNamaBelakang, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 183, 275, 35));

        inputUmur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(inputUmur, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 236, 275, 35));

        cbAgama.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Agama", "Islam", "Hindu", "Budha", "Kristen", "Katolik" }));
        jPanel1.add(cbAgama, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 336, 275, 34));

        cbStatus.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Status", "Menikah", "Belum Menikah" }));
        jPanel1.add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 389, 275, 30));

        jLabel2.setBackground(new java.awt.Color(39, 129, 191));
        jLabel2.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(39, 129, 191));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("biodata mahasiswa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 13, 240, 46));

        refreshData.setIcon(new javax.swing.ImageIcon("E:\\KULIAH\\SEMESTER 6\\Pemrograman Visual\\pemrograman-visual\\Aplikasi Administrasi\\image\\refresh-35.png")); // NOI18N
        refreshData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshDataMouseClicked(evt);
            }
        });
        jPanel1.add(refreshData, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 5, 35, 35));

        inputJK1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        inputJK1.setText("Laki-Laki");
        inputJK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJK1ActionPerformed(evt);
            }
        });
        jPanel1.add(inputJK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 289, -1, -1));

        inputJK2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        inputJK2.setText("Perempuan");
        inputJK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJK2ActionPerformed(evt);
            }
        });
        jPanel1.add(inputJK2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 289, -1, -1));

        btnDataBaru.setBackground(new java.awt.Color(9, 90, 146));
        btnDataBaru.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDataBaru.setForeground(new java.awt.Color(255, 255, 255));
        btnDataBaru.setText("Tambah Data");
        btnDataBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataBaruActionPerformed(evt);
            }
        });
        jPanel1.add(btnDataBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 437, -1, 40));

        btnHapusData.setBackground(new java.awt.Color(9, 90, 146));
        btnHapusData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHapusData.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusData.setText("Hapus Data");
        btnHapusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDataActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapusData, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 437, -1, 40));

        btnUpdateData.setBackground(new java.awt.Color(9, 90, 146));
        btnUpdateData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdateData.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateData.setText("Update Data");
        btnUpdateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDataActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 437, -1, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 90, 450, 490);

        tabelData.setFont(new java.awt.Font("Bebas Neue", 0, 24));
        JTableHeader header = tabelData.getTableHeader();
        header.setFont(new java.awt.Font("Bebas Neue", 0, 28));
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
        tabelData.setGridColor(new java.awt.Color(240, 240, 240));
        tabelData.setOpaque(false);
        tabelData.setRowMargin(2);
        tabelData.setSelectionBackground(new java.awt.Color(0, 255, 51));
        tabelData.setSelectionForeground(new java.awt.Color(0, 0, 0));
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
        tabelData.getColumnModel().getColumn(0).setPreferredWidth(43);
        tabelData.getColumnModel().getColumn(1).setPreferredWidth(250);
        tabelData.getColumnModel().getColumn(2).setPreferredWidth(225);
        tabelData.getColumnModel().getColumn(3).setPreferredWidth(75);
        tabelData.getColumnModel().getColumn(4).setPreferredWidth(140);
        tabelData.getColumnModel().getColumn(6).setPreferredWidth(135);
        tabelData.setRowHeight(40);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(480, 90, 949, 472);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\KULIAH\\SEMESTER 6\\Pemrograman Visual\\pemrograman-visual\\Aplikasi Administrasi\\image\\bgAbu.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1500, 650);

        pack();
        setLocationRelativeTo(null);
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
    
    private void eksekusiAmbilSQL(String sql){
        try {
            konek = new Koneksi().koneksi();
            stat = konek.createStatement();
            rs = stat.executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void updateTabel(){
        
        //membersihkan data tabel
        DefaultTableModel model = (DefaultTableModel) tabelData.getModel();
        model.setRowCount(0);
        
        //membuat data tabel
        String sql = "SELECT * FROM akun";
        String email, namaLengkap, umur, jenisKelamin, agama, status;
        this.eksekusiAmbilSQL(sql);
        
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
    
    private void falseEditForm(){
        inputNamaDepan.setEditable(false);
        inputNamaBelakang.setEditable(false);
        inputUmur.setEditable(false);
        inputJK1.setEnabled(false);
        inputJK2.setEnabled(false);
        cbAgama.setEditable(false);
        cbStatus.setEditable(false);
    }
    
    private void trueEditForm(){
        inputEmail.setEditable(true);
        inputNamaDepan.setEditable(true);
        inputNamaBelakang.setEditable(true);
        inputUmur.setEditable(true);
        inputJK1.setEnabled(true);
        inputJK2.setEnabled(true);
        cbAgama.setEditable(true);
        cbStatus.setEditable(true);
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
            jenisKelamin="Perempuan";
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
            rbJenisKelaminGroup.clearSelection();
            if (rs.next()) {
                inputEmail.setEditable(false);
                inputEmail.setText(rs.getString("email"));
                inputNamaDepan.setText(rs.getString("nama-depan"));
                inputNamaBelakang.setText(rs.getString("nama-belakang"));
                inputUmur.setText(rs.getString("umur"));
                
                //set jenis kelamin
                String jenisKelamin = rs.getString("jenis-kelamin");
                if ("Laki-Laki".equals(jenisKelamin)) {
                    rbJenisKelaminGroup.setSelected(rbPria, true);
                    rbJenisKelaminGroup.setSelected(rbPerempuan, false);
                }
                else if ("Perempuan".equals(jenisKelamin)) {
                    rbJenisKelaminGroup.setSelected(rbPria, false);
                    rbJenisKelaminGroup.setSelected(rbPerempuan, true);
                    System.out.println(rbPerempuan.isSelected());
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
            jenisKelamin="Perempuan";
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

    private void refreshDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshDataMouseClicked
        resetPanelInput();
        updateTabel();
        trueEditForm();
    }//GEN-LAST:event_refreshDataMouseClicked

    private void inputEmailCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_inputEmailCaretUpdate
        if (inputEmail.isEditable()) {
            String email = inputEmail.getText();
            String sql = "SELECT * FROM akun WHERE `email`='%s'";
            sql = String.format(sql, email);
            System.out.println(sql);
            eksekusiAmbilSQL(sql);
        
            try {
                if (rs.next()) {
                    falseEditForm();
                }else{
                    trueEditForm();
                }
            } catch (SQLException ex) {
                
            }
        }
        
    }//GEN-LAST:event_inputEmailCaretUpdate
    
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel refreshData;
    private javax.swing.JTable tabelData;
    // End of variables declaration//GEN-END:variables
}

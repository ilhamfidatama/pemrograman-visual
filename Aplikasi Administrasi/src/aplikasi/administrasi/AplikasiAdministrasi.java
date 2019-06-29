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

/**
 *
 * @author ASUS R.O.G
 */
public class AplikasiAdministrasi {
    
    private Connection konek;
    private Statement stat;
    private ResultSet rs;
    private int data;
    
    private void eksekusiAmbilSQL(String sql){
        try {
            konek = new Koneksi().koneksi();
            stat = konek.createStatement();
            rs = stat.executeQuery(sql);
            rs.last();
            this.data = rs.getRow();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        AplikasiAdministrasi aa = new AplikasiAdministrasi();
        Progress pr = new Progress();
        pr.setVisible(true);
        
        aa.eksekusiAmbilSQL("SELECT * FROM akun");
        int delay = aa.data * 1;
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(delay);
                pr.progressBar.setValue(i);
                pr.progressBar.setString(String.valueOf(i)+"%");
                pr.progressBar.setStringPainted(true);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        pr.setVisible(false);
        pr.dispose();
        Home hm = new Home();
        hm.setVisible(true);
    }
    
}

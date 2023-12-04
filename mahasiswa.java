/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Riza Luthfi
 */
public class mahasiswa {
    
    private String nama;
    private String npm;
    private String alamat;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getNama() {
        return nama;
    }
        
    public String getNpm() {
        return npm;
    }
    
    public String getAlamat() {
        return alamat;    
    }
}

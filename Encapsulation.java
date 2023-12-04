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
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        mahasiswa obj = new mahasiswa();
        obj.setNama("Riza Luthfi Baihaqi");
        obj.setNpm("51420118");
        obj.setAlamat("Jakarta");
        System.out.println("Nama : " + obj.getNama());
        System.out.println("Npm : " + obj.getNpm());
        System.out.println("Alamat : " + obj.getAlamat());
    }
}

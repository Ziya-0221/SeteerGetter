/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settergetter;

/**
 *
 * @author indi
 */
public class SetterGetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("**Data Pengunjung Perpustakaan**");
        
        //membuat object io untuk data 1
        example io = new example();
        io.setNama("Ziya");
        io.setKelas("X RPL 2");
        io.setTanggal("13/4/2021");
       
        //membaut object oi untuk data 2
        example oi = new example();
        oi.setNama("Indi");
        oi.setKelas("X TKJ 1");
        oi.setTanggal("13/4/2021");
        
        //menampilkan data 1
        io.line();
        System.out.println("Nama   : "+io.getNama());
        System.out.println("Kelas  : "+io.getKelas());
        System.out.println("Tanggal: "+io.getTanggal());
        
        io.line();
        
        //menampilkan data 2
        System.out.println("Nama   : "+oi.getNama());
        System.out.println("Kelas  : "+oi.getKelas());
        System.out.println("Tanggal: "+io.getTanggal());
    }
    
}

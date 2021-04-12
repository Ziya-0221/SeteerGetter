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
public class example {
    //membuat variabel
    protected String nama;
    protected String kelas;
    protected String tanggal;
    
    //meethod setter
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void setTanggal(String tanggal){
        this.tanggal=tanggal;
    }
    
    //method getter
    String getNama(){
        return nama;
    }
    
    String getKelas(){
        return kelas;
    }
    String getTanggal(){
        return tanggal;
    }
    
    //menampilakan garis
    public void line(){
        System.out.println("-------------------------------");
    }
}

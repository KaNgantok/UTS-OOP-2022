package uts;
import java.util.Scanner;

/**
 *
 * @author DANI PRATAMA_20103320
 */
public class KB {
    
    public String nama;
    private int jml;
    
    Scanner input = new Scanner(System.in);
   
    public void dataPengunjung(){
        System.out.println("==============Data Pengunjung Kebun Binatang================");
        System.out.print("Masukkan Nama Pengunjuntg :");
        nama = input.next();
        System.out.print("Pengunjung Ke :");
        jml = input.nextInt();
        
    }
    
    public void setnama(String Nama){
        this.nama = Nama;
        
    }
    
    public void setjml(String Jumlah){
        this.nama = Jumlah;
    }
    
    public String getnama(){
        return this.nama;
        
    }
    
    public int getjml(){
       return this.jml;
    }
    
    
    public void listPengunjung(){
        System.out.println("===========Daftar Pengunjung Kebun Binatang==============");
        System.out.println("Masukkan Nama Pengunjung :"+this.nama);
        System.out.println("Pengunjung Ke :"+this.jml);
       
    }
    
}

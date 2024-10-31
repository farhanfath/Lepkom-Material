/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act1;

/**
 *
 * @author farha
 */
public class Buku { 
    
    private String judulBuku;
    private String pengarang;
    private String kodeBuku;
    private String tahunTerbitBuku;
    
    public void setJudulBuku(String ajudulBuku) {
        this.judulBuku = ajudulBuku;
    }
    
    public String getJudulBuku() {
        return judulBuku;
    }

    public void setPengarangBuku(String apengarangBuku) {
        this.pengarang = apengarangBuku;
    }
    
    public String getPengarangBuku() {
        return pengarang;
    }
    
    public void setKodeBuku(String akodeBuku) {
        this.kodeBuku = akodeBuku;
    }
    
    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setTahunTerbitBuku(String atahunTerbitBuku) {
        this.tahunTerbitBuku = atahunTerbitBuku;
    }
    
    public String getTahunTerbitBuku() {
        return tahunTerbitBuku;
    }
}

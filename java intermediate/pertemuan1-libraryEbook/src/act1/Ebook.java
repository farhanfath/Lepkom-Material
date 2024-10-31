/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act1;

/**
 *
 * @author farha
 */
public class Ebook extends Buku {

    private String jenisEbook;
    private String statusEbook;
    private String namaRatingEbook;
    private int ratingEbook;
    private int hargaEbook;
    
    public Ebook(
            String judulBuku,
            String pengarangBuku,
            String tahunTerbitBuku,
            String kodeBuku,
            String jenisEbook,
            String statusEbook,
            int hargaEbook,
            int ratingEbook,
            String namaRatingEbook
            ) {
        
        setJudulBuku(judulBuku);
        setKodeBuku(kodeBuku);
        setTahunTerbitBuku(tahunTerbitBuku);
        setPengarangBuku(pengarangBuku);
        
        this.jenisEbook = jenisEbook;
        this.statusEbook = statusEbook;
        this.hargaEbook = hargaEbook;
        this.ratingEbook = ratingEbook;
        this.namaRatingEbook = namaRatingEbook;
    }
    public Ebook() {}
    
    public void setjenisEbook(String ajenisEbook) {
        this.jenisEbook = ajenisEbook;
    }
    
    public String getjenisEbook() {
        return jenisEbook;
    }
    
    public void setstatusEbook(String astatusEbook) {
        this.statusEbook = astatusEbook;
    }
    
    public String getstatusEbook() {
        return statusEbook;
    }
    
    public void sethargaEbook(int ahargaEbook) {
        this.hargaEbook = ahargaEbook;
    }
    
    public int gethargaEbook() {
        return hargaEbook;
    }
    
    public void setratingEbook(int aratingEbook) {
        this.ratingEbook = aratingEbook;
    }
    
    public int getratingEbook() {
        return ratingEbook;
    }
    
    public void setnamaRatingEbook(String anamaRatingEbook) {
        this.namaRatingEbook = anamaRatingEbook;
    }
    
    public String getnamaRatingEbook() {
        if (getratingEbook() <= 10 && getratingEbook() >= 8) {
            this.namaRatingEbook = "Excelent";
        } else if (getratingEbook() < 8 && getratingEbook() >= 7) {
            this.namaRatingEbook = "Nice";            
        } else if (getratingEbook() < 7 && getratingEbook() >= 6) {
            this.namaRatingEbook = "Cool";            
        } else {
            this.namaRatingEbook = "normal";
        }
        return namaRatingEbook;
    }
}

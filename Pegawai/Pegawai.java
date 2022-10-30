public class Pegawai {
    private String nama;
    private Double gajiPokok;
    
    //setter
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setgajiPokok(Double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
  

    //getter
    public String getnama(){
        return this.nama;
    }
    public Double gajiPokok(){
        return this.gajiPokok;
    }

    public void cetakInfo() {
       
        System.out.println("Nama        : " + this.nama);
        System.out.println("Gaji Pokok  : " + this.gajiPokok);
     
    }
}

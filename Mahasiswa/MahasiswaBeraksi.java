public class MahasiswaBeraksi {
    public static void main(String[] args){
    // Membuat object
        Mahasiswa anton = new Mahasiswa();
    /* memanggil atribut dan memberi nilai */
        anton.setnama("Anton Santoso");
        anton.setjenisKelamin("Laki Laki");
        anton.setumur(20);
        anton.setalamat("Cikarang Utara");

        anton.setnim(101020202);
        anton.setjurusan("Teknik Informatika");
        anton.cetakInfo();
    }
 }
public class Mahasiswa extends Manusia{
    int nim;
    String jurusan;

    //setter
    public void setnim(int nim){
        this.nim = nim;
    }
    public void setjurusan(String jurusan){
        this.jurusan = jurusan;
    }

    //getter
    public int getnim(){
        return this.nim;
    }
    public String getjurusan(){
        return this.jurusan;
    }
    
    public void cetakInfo() {
       super.cetakInfo();

        System.out.println("Nim           : "+ this.nim);
        System.out.println("Jurusan       : "+this.jurusan);
    }
}

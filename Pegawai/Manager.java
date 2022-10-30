public class Manager extends Pegawai {
    private Double tunjangan;

    public void settunjangan(Double tunjangan){
        this.tunjangan = tunjangan;
    }

    public Double tunjangan(){
        return this.tunjangan;
    }
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Tunjangan       : " +this.tunjangan);
    }

}

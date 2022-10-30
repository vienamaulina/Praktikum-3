public class Programmer extends Pegawai {
    private Double bonus;

    public void setbonus(Double bonus){
        this.bonus = bonus;
    }
    
    public Double getbonus(){
        return this.bonus;
    }
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus       : " + this.bonus);
     
    }
}

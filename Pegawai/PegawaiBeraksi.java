public class PegawaiBeraksi {
    public static void main(String[] args) {
        //membuat object
        Manager a = new Manager();
        Programmer b = new Programmer();
        a.setnama("Anton Santoso");
        a.setgajiPokok(4791000.0);
        a.settunjangan(1000000.0);
        a.cetakInfo();
        
        b.setnama("Riko Ardian");
        b.setgajiPokok(5000000.0);
        b.setbonus(2500000.0);
        b.cetakInfo();
    }
}

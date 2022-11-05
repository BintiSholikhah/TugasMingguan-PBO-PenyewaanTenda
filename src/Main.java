public class Main {

    Main(){
        System.out.println("Program Dibuat oleh Binti Sholikhah");
    }
    static void aplikasi(){
        System.out.println("        APLIKASI PENYEWAAN TENDA");
    }
    static void garis(){
        System.out.println("=========================================");
    }
    static void ucapin(String ucapan){
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        Main binti = new Main();
        Petugas petugas1 = new Petugas();
        petugas1.setId_petugas(1900089701);
        petugas1.setNama_petugas("Bambang Iriyanto");
        garis();
        // pemanggilan prosedur aplikasi
        aplikasi();
        // pemanggilan
        ucapin("=========================================");
        System.out.println();
        Penyewa penyewa = new Penyewa();
        penyewa.input_data();
        System.out.println();
        Tenda tenda1 = new Tenda();
        tenda1.view_data();
        Penyewaan penyewaan1 = new Penyewaan();
        penyewaan1.input_data();
        penyewaan1.pilih_tenda();
        System.out.println("ID Petugas        : " + petugas1.getId_petugas());
        System.out.println("Nama Petugas      : " + petugas1.getNama_petugas());
        System.out.println("======================================");
    }
}
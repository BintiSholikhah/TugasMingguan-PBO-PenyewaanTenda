import java.util.Scanner;

public class Penyewaan {
    public int kode;
    public String tanggal_sewa;
    public int lama_sewa;
    public int jumlah;
    public int bayar;
    public int pilihan;
    static int total_bayar(int a, int b, int c){
        int total = a*b*c;
        return total;
    }
    void input_data(){
        Scanner input = new Scanner(System.in);
        Tenda tenda = new Tenda();
        System.out.println();
        System.out.print("Kode Sewa    : ");
        kode = input.nextInt();
        System.out.print("Tanggal sewa : ");
        tanggal_sewa = input.next();
        System.out.print("Lama Sewa    : ");
        lama_sewa = input.nextInt();
        System.out.print("jumlah       : ");
        jumlah = input.nextInt();
    }
    void cetak_data(){
        System.out.println("Kode Sewa         : "+kode);
        System.out.println("Tanggal sewa      : "+tanggal_sewa);
        System.out.println("Lama Sewa         : " +lama_sewa+" hari");
        System.out.println("jumlah            : "+jumlah+ " tenda");
    }
    void pilih_tenda(){
        Scanner input = new Scanner(System.in);
        Tenda tenda1 = new Tenda();
        System.out.print("ID tenda pilihan anda : ");
        pilihan = input.nextInt();
        if(pilihan==10){
            tenda1.no_tenda=11;
            tenda1.jenis="Eiger Shira";
            tenda1.harga=400000;
        } else if(pilihan==11){
            tenda1.no_tenda=12;
            tenda1.jenis="Consina Magnum";
            tenda1.harga=600000;
        } else if(pilihan==12){
            tenda1.no_tenda=13;
            tenda1.jenis="Naturehike";
            tenda1.harga=800000;

        } else if(pilihan==20){
            tenda1.no_tenda=21;
            tenda1.jenis="Tipe A";
            tenda1.harga=8000000;
        } else if(pilihan==21){
            tenda1.no_tenda=22;
            tenda1.jenis="Tipe B";
            tenda1.harga=10000000;
        }
        else if(pilihan==22){
            tenda1.no_tenda=23;
            tenda1.jenis="Tipe C";
            tenda1.harga=12000000;
        }else{
            System.out.println("Maaf pilihan menu sewa tidak tersedia.");
        }
        // fungsi total_bayar()
        bayar = total_bayar(tenda1.harga, lama_sewa, jumlah);
        //tenda1.harga, lama_sewa, jumlah : merupakan argumen
        System.out.println("======================================");
        System.out.println("       NOTA Penyewaan Tenda");
        System.out.println("--------------------------------------");
        cetak_data();
        System.out.println("No Tenda          : "+tenda1.no_tenda);
        System.out.println("Jenis/Merk        : "+tenda1.jenis);
        System.out.println("Harga             : "+tenda1.harga);
        System.out.println("Total Bayar       : "+bayar);
        System.out.println("--------------------------------------");
    }
}

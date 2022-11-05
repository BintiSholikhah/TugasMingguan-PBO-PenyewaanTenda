public class TendaNikah extends Tenda{
    String[] dekorasi = {"Tipe A", "Tipe B", "Tipe C"};
    void view_data(){
        harga= 8000000;
        System.out.println("--------------------------------------");
        System.out.println("       LIST DEKORASI TENDA NIKAH");
        System.out.println("--------------------------------------");
        System.out.println("NO           DEKORASI         HARGA");
        for(int i=0; i< dekorasi.length; i++){
            System.out.println("2"+i+"            "+dekorasi[i]+"          "+harga);
            harga=harga+2000000;
        }
    }
    @Override
    public final void ukuran() {
        System.out.println("Seluruh ukuran tenda nikah adaalh 12x7");
    }
}


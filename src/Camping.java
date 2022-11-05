public class Camping extends Tenda{
    String[] merek = {"Eiger Shira", "Consina Magn", "Naturehikee"};
    void view_data(){
        harga= 400000;
        System.out.println("--------------------------------------");
        System.out.println("       LIST TENDA CAMPING");
        System.out.println("--------------------------------------");
        System.out.println("NO           MEREK            HARGA");
        for(int i=0; i< merek.length; i++){
            System.out.println("1"+i+"        "+merek[i]+"        "+harga);
            harga=harga+200000;
        }
    }

    @Override
     public final void ukuran() {
        System.out.println("Seluruh ukuran Tenda Camping 3x4");
    }
}



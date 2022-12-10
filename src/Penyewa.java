import java.util.Scanner;
public class Penyewa extends Data {

    @Override
    void tampil() { // DARI CLASS ABSTRACT
        System.out.println("## MASUKKAN DATA PENYEWA ##");
    }

    int id_anggota;
        String nama_anggota;
        long telepon;

        void input_data(){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan ID Penyewa    : ");
            id_anggota = input.nextInt();
            System.out.print("Masukkan NAMA Penyewa  : ");
            nama_anggota = input.next();
            System.out.print("Masukkan no Hp Penyewa : ");
            telepon = input.nextLong();
        }
}

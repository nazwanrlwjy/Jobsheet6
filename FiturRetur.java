import java.util.Scanner;
public class FiturRetur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, kondisi;
        int jmlStok, jmlBarang;

        System.out.println("Masukkan nama stok: ");
        nama = input.next();
        System.out.println("Masukkan jumlah stok: ");
        jmlStok = input.nextInt();
        System.out.println("Apakah kondisi stok baik ? (y/t)");
        kondisi = input.next();
        System.out.println("Masukkan jumlah barang: ");
        jmlBarang = input.nextInt();
        
        if (jmlStok==jmlBarang) {
            if (kondisi.equals("y")) {
                System.out.println("Pasang di etalase");
            } else {
                System.out.println("Lakukan retur");
            }
        } else {
            System.out.println("Laporkan");
        }

    }
}
import java.util.Scanner;
public class FiturDiskon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total, bayar, diskon;
        String kartu;
        
        System.out.println("Masukkan total belanja: ");
        total = input.nextInt();
        System.out.println("Apakah pelanggan memiliki kartu member? (y/t)");
        kartu = input.next();

        if (kartu.equals("y")) {
            if (total > 250000) {
                diskon = 50000;
            } else {
                diskon = 45000;
            }

        } else {
            if (total>100000) {
                diskon = 5000;
            }else{
                diskon = 0;
            }
        }

        bayar = total-diskon;
        System.out.println("Total yang harus dibayar adalah "+bayar);

    }
}
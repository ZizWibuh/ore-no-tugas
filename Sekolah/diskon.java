import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        
        Scanner jumlah = new Scanner(System.in);

        // System.out.println("Masukkan jumlah belanjaan: ");
        // double total = jumlah.nextDouble();
        // double diskon = 0;

        // if(total >= 500000) {
        //     diskon = 0.1 * total;}

        // total -= diskon;
        // System.out.println("Total belanja: " + total);
        // System.out.println("Total diskon: " + diskon);

        System.out.println("Input Nilai: ");
        int nilai = jumlah.nextInt();

        if (nilai >= 75) {
            System.out.println("Kamu lulus! SELAMAT!!!");}
        else {    
            System.out.println("Nice Try, Kamu tidak lulus (Kecewa Berat)");}

        jumlah.close();
    }
}

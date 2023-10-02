import java.util.Scanner;

public class tampilAngka {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah nilai: ");
        int jumlahNilai = input.nextInt();

        int nilai = 0;
        int total = 0;

        for (int angka = 1; angka <= jumlahNilai; angka++) {
            System.out.println("Nilai ulangan: " + angka);
            nilai = input.nextInt();
            total += nilai;
        }
        int rata = total / jumlahNilai;
        System.out.println("Rata-rata: " + rata);
    }
}
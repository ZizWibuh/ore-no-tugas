import java.util.Scanner;

public class ulanganHarian1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("==Program Menitung Gaji Guru==");

        System.out.println("Masukkan jumlah jam mengajar: ");
        double jamAjar = input.nextInt();
        System.out.println("Masukkan jumlah anak: ");
        int anak = input.nextInt();
        System.out.println("Masukkan nilai cicilan koperasi: ");
        double cicilan = input.nextInt();

        double gajiPokok = jamAjar * 30000;
        double tunjanganAnak = anak * 100000;
        double tunjanganKesehatan = gajiPokok * 10/100;
        double totalGaji = gajiPokok + tunjanganAnak + tunjanganKesehatan - cicilan;

        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan Anak: Rp " + tunjanganAnak);
        System.out.println("Tunjangan Kesehatan: Rp " + tunjanganKesehatan);
        System.out.println("Cicilan Koperasi: Rp " + cicilan);
        System.out.println("---------------------------");
        System.out.println("Total Gaji: Rp " + totalGaji);
    }
}

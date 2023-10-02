import java.util.Scanner;
 
public class scannerSklh {
public static void main(String[] args) {

    Scanner persegi = new Scanner(System.in);

    System.out.println("Input Nilai sisi: ");
    int sisi = persegi.nextInt();

    int luas = sisi*sisi;

    System.out.println("Luas Persegi dengan " + "sisi: " + sisi + "adalah " + luas);

    persegi.close();
   }
}
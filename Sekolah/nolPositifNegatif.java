import java.util.Scanner;

public class nolPositifNegatif {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int bilangan;

        System.out.println("Masukkan angka sembarang");
        bilangan = input.nextInt();

        if (bilangan == 0) {
            System.out.println("Bilangan NOL");
        }
        else if (bilangan > 0) {
            System.out.println("Bilangan POSITIF");
        }
        else {
            System.out.println("Bilangan NEGATIF");
        }
        input.close();
    }
}
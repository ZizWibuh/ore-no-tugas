import java.util.Scanner;

public class perihalJam {
    public static void main(String[] args) {
        
            Scanner jam = new Scanner(System.in);
            
            System.out.println("Sekarang jam berapa? ");
            
            int pukul = jam.nextInt();
            System.out.println("Sekarang jam: " + pukul);
            if (pukul <= 11) {
                System.out.println("Sekarang masih PAGII!");}
            else if (pukul <= 14) {   
                System.out.println("Sekarang sudah SIANGG!!");}
            else if (pukul <= 17) {   
                System.out.println("Sekarang sudah SORE!!");}
            else {   
                System.out.println("Sekarang sudah MALAM! Tidur Gblk");}

            jam.close();
    }
}

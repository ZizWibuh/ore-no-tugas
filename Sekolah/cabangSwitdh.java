import java.util.Scanner;

public class cabangSwitdh {
    public static void main(String[] args) {
        
        
        String ulang = null;

        do {
            Scanner input = new Scanner(System.in);
           System.out.println("--Perihal Balok--");

           //System.out.println("1. Luas Permukaan \n2. Volume");
           //int pilihan = input.nextInt();
           System.out.println("PIlihan Volume/LuasPermukaan");
           String pilihan = input.next();

          System.out.println("Masukkan panjang");
          int p = input.nextInt();
          System.out.println("Masukkan lebar");
          int l = input.nextInt();
          System.out.println("Masukkan tinggi");
          int t = input.nextInt();

          p = 0;
          l = 0;
          t = 0;

          double rumus = 0;
          String satuan = null;

        //   switch (pilihan) {
        //       case 1 :
        //       rumus = 2 * (p * l) + (l * t) + (t * p);
        //       satuan = " Cm\u00B2";
        //       break;
        //       case 2 :
        //       rumus = p * l * t;
        //       satuan = " Cm\u00B3";
        //       break;
        //       default : 
        //       System.out.println("Pilihan tidak faldi");
        //   }
        if (pilihan.equalsIgnoreCase("Luas permukaan")) {
            rumus = 2 * (p * l) + (l * t) + (l * t);
            satuan = " Cm\u00B2";
        } 
        else if (pilihan.equalsIgnoreCase("Volume")) {
            rumus = p * l * t;
            satuan = " Cm\u00B3";
        }

          System.out.println("Hasil: " + rumus + satuan);

          System.out.println("Ulang? Y/N");
          ulang = input.next().toUpperCase();

        } while (ulang.equals("Y"));
          
          //while (ulang == "Y");
    }
}

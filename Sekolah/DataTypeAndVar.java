import javax.swing.JOptionPane;

public class DataTypeAndVar {
    public static void main(String args[]) {
        String Perkenalan = "Hai! Nama gw " ;
        String Nama = "Aziz";
               System.out.println(Perkenalan + Nama);
        
         int umur = 15;
              System.out.println("umur gw " + umur);

        //String namaMakanan;
        String namaMakanan1 = "Soto Ayam";
        int hargaMakanan = 15000;
        double kandunganKalori = 2.5;
        char kodeMakanan = 'K';
        float kandunganLemak = 3.5f;
        //float kandunganLenak1 = 3/5;
        boolean halal = true;
              System.out.println("Nama Makanan: " + namaMakanan1);
              System.out.println("Harga: " + hargaMakanan);
              System.out.println("Kalori: " + kandunganKalori);
              System.out.println("Kode makanan: " + kodeMakanan);
              System.out.println("Kandungan lemak: " + kandunganLemak);
              System.out.println("Halal: " + halal);

        int angka1 = 14;
        int angka2 = 20;
        int hasilJumlah = angka1 + angka2;
        int hasilKurang = angka1 - angka2;
        int hasilKali = angka1 * angka2;
        int hasilBagi = angka1 / angka2;
        int hasilModulus = angka1 % angka2;
        System.out.println("Hasil Penjumlahan: " + hasilJumlah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Perkalian: " + hasilKali);
        System.out.println("Hasil Pembagian: " + hasilBagi);
        System.out.println("Hasil Modulus: " + hasilModulus);
  
        String pw = JOptionPane.showInputDialog("Input Password: ");
        JOptionPane.showMessageDialog(null, "Successfuly Logged In!"); 
        //System.out.println(angka1 == angka2);
        //System.out.println(angka1 += angka2);
        //System.out.println(angka1 != angka2);
        //String password = JOptionPane.showInputDialog("Input Password: ");
        //String password = JOptionPane.showInputDialog("Input Password: ");
        //String password = JOptionPane.showInputDialog("Input Password: ");
        //JOptionPane.showMessageDialog(null, "Successfuly Logged In!");

    }
}

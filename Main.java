import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Input 1
      System.out.println("User 1");
      System.out.print("Masukkan jumlah panjang: ");
      double panjang1 = input.nextDouble();
      System.out.print("Masukkan jumlah lebar: ");
      double lebar1 = input.nextDouble();
      System.out.print("Masukkan jumlah tinggi: ");
      double tinggi1 = input.nextDouble();

      System.out.print("Pilih Luas Permukaan Balok atau Keliling Balok (L/K): ");
      char pilihan1 = input.next().charAt(0);

      if (pilihan1 == 'L' || pilihan1 == 'l') {
          LuasBalok luas1 = new LuasBalok(panjang1, lebar1, tinggi1);
          System.out.println("Luas Permukaan Balok adalah = " + luas1.hitungLuas());
      } else if (pilihan1 == 'K' || pilihan1 == 'k') {
          KelilingBalok keliling1 = new KelilingBalok(panjang1, lebar1, tinggi1);
          System.out.println("Keliling Balok adalah = " + keliling1.hitungKeliling());
      }

      // Input 2
      System.out.println("\nUser 2");
      System.out.print("Masukkan jumlah panjang: ");
      double panjang2 = input.nextDouble();
      System.out.print("Masukkan jumlah lebar: ");
      double lebar2 = input.nextDouble();
      System.out.print("Masukkan jumlah tinggi: ");
      double tinggi2 = input.nextDouble();

      System.out.print("Pilih Luas Permukaan Balok atau Keliling Balok (L/K): ");
      char pilihan2 = input.next().charAt(0);

      if (pilihan2 == 'L' || pilihan2 == 'l') {
          LuasBalok luas2 = new LuasBalok(panjang2, lebar2, tinggi2);
          System.out.println("Luas Permukaan Balok adalah = " + luas2.hitungLuas());
      } else if (pilihan2 == 'K' || pilihan2 == 'k') {
          KelilingBalok keliling2 = new KelilingBalok(panjang2, lebar2, tinggi2);
          System.out.println("Keliling Balok adalah = " + keliling2.hitungKeliling());
      }

      input.close();
  }
}
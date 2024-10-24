import java.io.*;
public class Utama2 {
  public static void main(String[] kri)throws IOException {
    BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
  Manusia2[] mns = new Manusia2[2];
  int a=0;
  do{
    System.out.println("User "+(a+1));
    System.out.println("Masukkan tinggi badan anda(cm)= ");
    double tb = Double.parseDouble(k.readLine());
    System.out.println("Masukkan jenis kelamin(L/P)= ");
    String jenkel=k.readLine();

    if(jenkel.toUpperCase().equals("L")){
      mns[a]= new laki(tb);
      System.out.println("Berat badan ideal seorang laki-laki seperti anda adalah: "+mns[a].HtgBB());
      System.out.println("");
    }
    else{
      mns[a]=new perempuan(tb);
      System.out.println("Berat badan ideal seorang perempuan seperti anda adalah: "+mns[a].HtgBB());
      System.out.println("");
    }a++;
  }while(a<2);
  }
}

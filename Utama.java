public class Utama {
    public static void main(String[] args) {
      Manusia [] mns = new Manusia [3];
      mns[0] = new Mahasiswa();
      mns[1] = new Dosen();
      mns[2] = new Programmer();
  
      for(int i=0;i<mns.length;i++){
        mns[i].aktivitas();
        System.out.println("");
      }
    }
  }


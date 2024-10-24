public class KelilingBalok extends RumusBalok {
  public KelilingBalok(double p, double l, double t) {
      super(p, l, t);
  }
  public double hitungKeliling() {
      return 4 * (panjang + lebar + tinggi);
  }
}
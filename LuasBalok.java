public class LuasBalok extends RumusBalok {
  public LuasBalok(double p, double l, double t) {
      super(p, l, t);
  }
  public double hitungLuas() {
      return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
  }
}
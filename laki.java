public class laki extends Manusia2 {
  public laki (double tb){
    super(tb);
  }
  public double HtgBB(){
    return (super.getTinggiBadan()-100)*0.9;
  }
}

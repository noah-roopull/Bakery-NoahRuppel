public class Donut extends Bread {
  private boolean isGlazed;
  public Donut(double flour,double water,double salt,double sugar,double bakingPowder,double yeast,boolean isGlazed,String breadName) {
    super(flour,water,salt,sugar,bakingPowder,yeast,breadName);
    this.isGlazed=isGlazed;
  }
  public boolean isGlazed() {
    return isGlazed;
  }
  public void setGlazed(boolean isGlazed) {
    this.isGlazed = isGlazed;
  }
  public String toString() {
    return super.toString()+"\n  Glazed: "+(isGlazed?"Yes":"No");
  }
  public void getIngredients() {
    super.getIngredients();
    System.out.println("- Glazed: "+(isGlazed?"Yes":"No"));
  }
}

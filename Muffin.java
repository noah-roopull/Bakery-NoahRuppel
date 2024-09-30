public class Muffin extends Bread {
  private String flavor;
  public Muffin(double flour,double water,double salt,double sugar,double bakingPowder,double yeast,String flavor,String breadName) {
    super(flour,water,salt,sugar,bakingPowder,yeast,breadName);
    this.flavor=flavor;
  }
  public String getFlavor() {
    return flavor;
  }
  public void setFlavor(String flavor) {
    this.flavor=flavor;
  }
  public String toString() {
    return super.toString()+"\n  Flavor: "+flavor;
  }
  public void getIngredients() {
    super.getIngredients();
    System.out.println("- Flavor: "+flavor);
  }
}

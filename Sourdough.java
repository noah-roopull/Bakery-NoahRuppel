public class Sourdough extends Bread {
  private double starter;
  public Sourdough(double flour, double water, double salt, double sugar,double bakingPowder, double yeast, double starter, String breadName) {
    super(flour, water, salt, sugar, bakingPowder, yeast, breadName);
    this.starter=starter;
  }
  public double getStarter() {
    return starter;
  }
  public void setStarter(double starter) {
    this.starter=starter;
  }
  public String toString() {
    return super.toString()+"\n  Starter: "+starter+" tsps";
  }
  public void getIngredients() {
    super.getIngredients();
    System.out.println("- Starter: "+starter+" tsps");
  }
}

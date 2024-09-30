public class Pastry extends Bread {
  private String fillingType;
  public Pastry(double flour,double water,double salt,double sugar,double bakingPowder,double yeast,String fillingType,String breadName) {
    super(flour,water,salt,sugar,bakingPowder,yeast,breadName);
    this.fillingType=fillingType;
  }
  public String getFillingType() {
    return fillingType;
  }

  public void setFillingType(String fillingType) {
    this.fillingType=fillingType;
  }
  public String toString() {
    return super.toString()+"\n  Filling Type: "+fillingType;
  }
  public void getIngredients() {
    super.getIngredients();
    System.out.println("- Filling Type: "+fillingType);
  }
}

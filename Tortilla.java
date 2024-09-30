public class Tortilla extends Bread {
  private String cornType;
  public Tortilla(double flour,double water,double salt,double sugar,double bakingPowder,double yeast,String cornType,String breadName) {
    super(flour,water,salt,sugar,bakingPowder,yeast,breadName);
    this.cornType=cornType;
  }
  public String getCornType() {
    return cornType;
  }
  public void setCornType(String cornType) {
    this.cornType=cornType;
  }
  public String toString() {
    return super.toString()+"\n  Corn Type: "+cornType;
  }
  public void getIngredients() {
    super.getIngredients();
    System.out.println("- Corn Type: "+cornType);
  }
}

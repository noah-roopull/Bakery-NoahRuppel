public class Bread {
  private double flour,water,salt,sugar,bakingPowder,yeast;
  private String breadName;
  private boolean state;
  public Bread(double flour,double water,double salt,double sugar,double bakingPowder,double yeast,String breadName) {
    this.flour=flour;
    this.water=water;
    this.salt=salt;
    this.sugar=sugar;
    this.bakingPowder=bakingPowder;
    this.yeast=yeast;
    this.breadName=breadName;
    this.state=false;
  }

  // Accessors and Mutators
  public double getFlour() {
    return flour;
  }
  public void setFlour(double flour) {
    this.flour=flour;
  }
  public double getWater() {
    return water;
  }
  public void setWater(double water) {
    this.water=water;
  }
  public double getSalt() {
    return salt;
  }
  public void setSalt(double salt) {
    this.salt=salt;
  }
  public double getSugar() {
    return sugar;
  }
  public void setSugar(double sugar) {
    this.sugar=sugar;
  }
  public double getBakingPowder() {
    return bakingPowder;
  }
  public void setBakingPowder(double bakingPowder) {
    this.bakingPowder=bakingPowder;
  }
  public double getYeast() {
    return yeast;
  }
  public void setYeast(double yeast) {
    this.yeast=yeast;
  }
  public String getBreadName() {
    return breadName;
  }
  public void setBreadName(String breadName) {
    this.breadName=breadName;
  }

  public boolean isBaked() {
    return state;
  }
  public String toString() {
    return "Bread Name: "+breadName+"\n"+
      "  Flour: "+flour+" cups\n"+
      "  Water: "+water+" cups\n"+
      "  Salt: "+salt+" tsps\n"+
      "  Sugar: "+sugar+" tsps\n"+
      "  Baking Powder: "+bakingPowder+" cups\n"+
      "  Yeast: "+yeast+" tsps\n"+
      "  State: "+(state?"Baked":"Not Baked");
  }
  public void getIngredients() {
    System.out.println("Ingredients for "+breadName+":");
    System.out.println("- Flour: "+flour+" cups");
    System.out.println("- Water: "+water+" cups");
    System.out.println("- Salt: "+salt+" tsps");
    System.out.println("- Sugar: "+sugar+" tsps");
    System.out.println("- Baking Powder: "+bakingPowder+" tsps");
    System.out.println("- Yeast: "+yeast+" tsps");
  }
  public void bake() {
    if (!state) {
      state=true;
      System.out.println(breadName+" is now baked.");
    } else {
      System.out.println(breadName+" is already baked.");
    }
  }
}
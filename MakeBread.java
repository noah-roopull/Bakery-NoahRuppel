public class MakeBread {
  public static void main(String[] args) {
    // Creating instances of each bread type
    Bread plainBread=new Bread(5,1.5,2.5,1,1.5,2,"Plain Bread");
    Sourdough sourdough=new Sourdough(5,1.5,2.5,1,1.5,2,1,"Classic Sourdough");
    Tortilla tortilla=new Tortilla(5,1.5,2.5,1,1.5,2,"White Corn","Classic Tortilla");
    Pastry pastry=new Pastry(5,1.5,2.5,1,1.5,2,"Blueberry","Blueberry Danish");
    Donut donut=new Donut(5,1.5,2.5,1,1.5,2,true,"Glazed Donut");
    Muffin muffin=new Muffin(5,1.5,2.5,1,1.5,2,"Blueberry","Blueberry Muffin");
    plainBread.getIngredients();
    plainBread.bake();
    System.out.println();
    System.out.println(plainBread);
    System.out.println();

    sourdough.getIngredients();
    sourdough.bake();
    System.out.println();
    System.out.println(sourdough);
    System.out.println();

    tortilla.getIngredients();
    tortilla.bake();
    System.out.println();
    System.out.println(tortilla);
    System.out.println();

    pastry.getIngredients();
    pastry.bake();
    System.out.println();
    System.out.println(pastry);
    System.out.println();

    donut.getIngredients();
    donut.bake();
    System.out.println();
    System.out.println(donut);
    System.out.println();

    muffin.getIngredients();
    muffin.bake();
    System.out.println();
    System.out.println(muffin);
    System.out.println();
  }
}



public class Horse {
  private String name;
  private String colour;
  private int age;
  private int prices;

  public Horse(String name, String colour, int age, int prices) {
    this.name = name;
    this.colour = colour;
    this.age = age;
    this.prices = prices;
  }


  public void information() {
    System.out
        .println("Name: " + name + "\nColour: " + colour + "\nAge: " + age + "\nPrices: " + prices);
  }

  public void jump() {
    System.out.println("JUMPING!");
  }
}

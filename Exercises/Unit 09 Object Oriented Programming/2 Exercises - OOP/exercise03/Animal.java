
public abstract class Animal {

  private String name;
  
  public Animal (String name) {
    this.name = name;
  }
  
  public void greet () {
    System.out.println("Hello my name is " + name);
  }
  
  public void sleep () {
    System.out.println("ZzZzZzZzzz");
  }
  
  public void move () {
    System.out.println("I'm moving");
  }
  
  
  



}


public class Main {
  public static void main(String[] args) {
    Canary tweety = new Canary("Tweety");
    Cat garfield = new Cat("Garfield");
    Lizard juancho = new Lizard("Juancho");
    Dog pluto = new Dog("Pluto");
    Penguin wheezy = new Penguin("Wheezy");
    
    tweety.fly();
    tweety.layEggs();
    tweety.sing();
    
    garfield.greet();
    garfield.meow();
    
    juancho.takeSunBath();
    
    pluto.bark();
    
    wheezy.fly();
  }
}

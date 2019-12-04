
public class Main {
  public static void main(String[] args) {
    Fraction f1 = new Fraction(6, 3);
    Fraction f2 = new Fraction(5, 6);
    
    
    System.out.println(f1.multiply(f2));
    System.out.println(f1.division(f2));
    
    f1.simplifly(3);
    f2.simplifly(4);
    
    f1.invert();
    f2.invert();
  }
}

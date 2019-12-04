
public class Fraction {
  private double numerator;
  private double denominator;

  public Fraction(double numerator, double denominator) {
    if (denominator == 0) {
      System.out.println("Denominator cannot be 0");
    } else {
      this.numerator = numerator;
      this.denominator = denominator;
    }
    
  }

  public void invert() {
    double temp = numerator;
    numerator = denominator;
    denominator = temp;
    System.out.println("Fraction inverted: " + numerator + "/" + denominator);

  }

  public void simplifly(int n) {
    if (numerator % n == 0 && denominator % n == 0) {
      numerator /= n;
      denominator /= n;
    } else {
      System.out.println("Can't simplify");
    }
  }

  public double multiply(Fraction f) {
   
    double multiplication = (f.numerator * this.numerator) / (f.denominator * this.denominator);
    return multiplication;

  }

  public double division(Fraction f1) {
    double division = (this.numerator * f1.denominator) / (this.denominator * f1.numerator);
    return division;

  }
}

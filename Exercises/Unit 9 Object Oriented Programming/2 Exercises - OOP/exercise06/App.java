public class App {

  public static void main(String[] args) {
    Time t1 = new Time(0,30,40);
    Time t2 = new Time(0,35,20);
    System.out.println(t1 + " + " + t2 + " = " + t1.sum(t2));
    Time t3 = new Time(3,20,10);
    Time t4 = new Time(1,30,20);
    System.out.println(t3 + " - " + t4 + " = " + t3.subtract(t4));
  }
}

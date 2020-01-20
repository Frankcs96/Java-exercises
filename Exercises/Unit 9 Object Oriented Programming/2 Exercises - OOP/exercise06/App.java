public class App {

  public static void main(String[] args) {
    Time t1 = new Time(3,30,40);
    Time t2 = new Time(1,42,50);
    System.out.println(t1);
    System.out.println(t2);

    System.out.println(t1.sum(t2));
  }
}

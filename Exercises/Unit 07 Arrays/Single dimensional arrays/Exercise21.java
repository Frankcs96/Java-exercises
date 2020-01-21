
public class Exercise21 {
  public static void main(String[] args) {

    int[] numbers = new int[15];
    
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int)(Math.random() * ((500 - 0) + 1)) + 0; 

    }
    System.out.println("Original array");
    
    for (int i : numbers) {
      System.out.print(i + " ");
    }
    System.out.println("\nResult array");
    for (int i : numbers) {
      while (i % 5 != 0) {
        i++;
      }
      System.out.print(i + " ");
    }

  }
}

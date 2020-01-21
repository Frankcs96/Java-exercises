import java.util.Scanner;

public class Exercise28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int randomNumber;
    System.out.print("Enter array lenght: ");
    int arrayLenght = sc.nextInt();
    int array1[] = new int[arrayLenght];
    int array2[] = new int[arrayLenght];
    System.out.println("Original array:");
    System.out.print("Index");
    
    for (int i = 0; i < array1.length; i++) {
      randomNumber = (int)(Math.random() * ((200 - 0) + 1)) + 0;
      array1[i] = randomNumber;
      
      System.out.printf("   %5d ", i);
      
    }
    
    System.out.print("\nValue");
    
    for (int i = 0; i < array1.length; i++) {
      System.out.printf("   %5d ", array1[i]);
    }
    
    int counter = 1;
    for (int i = 0; i < array1.length; i++) {
      if (i == 0) {
        array2[i] = array1[i];
      }
      
      if (i % 2 == 0) {
        array2[i / 2] = array1[i];
      } else {
        array2[arrayLenght-counter] = array1[i];
        counter++;
      }
      
    }
    System.out.print("\n\nResult array");
    System.out.print("\nIndex");
    for (int i = 0; i < array2.length; i++) {
      System.out.printf("   %5d ", i);
    }
    System.out.print("\nValue");
    for (int i = 0; i < array2.length; i++) {
      System.out.printf("   %5d ", array2[i]);
    }
    
  }
}

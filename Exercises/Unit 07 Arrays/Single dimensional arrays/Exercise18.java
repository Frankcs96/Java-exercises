
public class Exercise18 {
  public static void main(String[] args) {

    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * ((200 - 0) + 1)) + 0;
    }

    System.out.println(
        "\n┌─────────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┐");
    System.out.print("|Index    ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│ %4d ", i);
    }
    System.out.println(
        "│\n├─────────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┤");
    System.out.print("|Value    ");
    for (int t : numbers) {
      System.out.printf("│  %3d ", t);
    }
    System.out.println(
        "│\n└─────────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┘");


    int[] greater = new int[10];
    int[] lesser = new int [10];
    int greaterCounter = 0;
    int lesserCounter = 0;
    
    for (int i : numbers) {
      if (i <= 100) {
        greater[greaterCounter] = i;
        greaterCounter++;
      } else {
        lesser[lesserCounter] = i;
        lesserCounter++;
      }
    }
    int greaterCounter2 = 0;
    int lesserCounter2 = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (i == 0 || i % 2 == 0) {
        if (greaterCounter2 < greaterCounter) {
          numbers[i] = greater[greaterCounter2];
          greaterCounter2++;
        } else {
          numbers[i] = lesser[lesserCounter2];
          lesserCounter2++;
        }
        
      } else {
        if (lesserCounter2 < lesserCounter) {
          numbers[i] = lesser[lesserCounter2];
          lesserCounter2++;
        } else {
          numbers[i] = greater[greaterCounter2];
          greaterCounter2++;
        }
        
        
      }
    }
    
    System.out.println(
        "\n┌─────────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┐");
    System.out.print("|Index    ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│ %4d ", i);
    }
    System.out.println(
        "│\n├─────────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┤");
    System.out.print("|Value    ");
    for (int t : numbers) {
      System.out.printf("│  %3d ", t);
    }
    System.out.println(
        "│\n└─────────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┘");


  }
}

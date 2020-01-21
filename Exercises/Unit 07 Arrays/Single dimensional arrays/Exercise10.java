
public class Exercise10 {
  public static void main(String[] args) {

    int[] numbers = new int[20];
    int counterEven = 0;
    int counterOdd = 0;

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * ((100 - 0) + 1)) + 0;
      if (numbers[i] % 2 == 0) {
        counterEven++;
      } else {
        counterOdd++;
      }
    }
    System.out.println("Original Array: ");
    for (int i : numbers) {
      System.out.print(i + " ");
    }
    
    System.out.println();

    int[] evenNumbers = new int[counterEven];
    int[] oddNumbers = new int [counterOdd];
    int counterPosEven = 0;
    int counterPosOdd = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        evenNumbers[counterPosEven] = numbers[i];
        counterPosEven++;
        
      } else {
        oddNumbers[counterPosOdd] = numbers[i];
        counterPosOdd++;
      }
    }
    
    for (int i = 0; i < evenNumbers.length; i++) {
      numbers[i] = evenNumbers[i];
    }
    
    for (int i = 0; i < oddNumbers.length; i++) {
      numbers[i + counterEven] = oddNumbers[i];
    }
    System.out.println("Sort array even/odd numbers");
    for (int i : numbers) {
      System.out.print(i + " ");
    }

  }

}

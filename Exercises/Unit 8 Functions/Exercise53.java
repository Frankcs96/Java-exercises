
public class Exercise53 {
  public static void main(String[] args) {
    int[][] a = arrays.TwoDimensions.generateArrayBiInt(5, 5, 1, 9);

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    
    System.out.println("nEsimo (a,0) returns " + arrays.TwoDimensions.nEsimo(a, 0));
    System.out.println("nEsimo (a,5) returns " + arrays.TwoDimensions.nEsimo(a, 5));
    System.out.println("nEsimo (a,25) returns " + arrays.TwoDimensions.nEsimo(a, 25));
  }


}

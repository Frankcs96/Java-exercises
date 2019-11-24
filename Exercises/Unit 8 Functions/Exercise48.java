
public class Exercise48 {
  public static void main(String[] args) {
    int[] a = {8,9,0};
    int[] b = {1,2,3};
    System.out.println("Array a = {8, 9, 0}");
    System.out.println("Array b = {1, 2, 3}");
    System.out.println("Array a and b concatenated:");
    int[] concatenation = arrays.OneDimension.concatenate(a, b);
    
    for (int i = 0; i < concatenation.length; i++) {
      System.out.print(concatenation[i] + " ");
    }
  }
}

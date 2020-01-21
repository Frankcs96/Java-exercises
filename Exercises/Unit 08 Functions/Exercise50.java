
public class Exercise50 {
  public static void main(String[] args) {
    int[] a = {3,1,2,7};
    int[] b = {3};
    System.out.println("Array a: {3,1,2,7}");
    System.out.println("Array b: {3}");
    System.out.print("Array mixed: ");
    int[] mixed = arrays.OneDimension.mix(a, b);

    for (int i : mixed) {
      System.out.print(i + " ");
    }
  }

  
}


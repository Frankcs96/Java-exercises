


public class Exercise08 {

	public static void main (String[] args) {
		char myChar1 = 'a';
		char myChar2 = 'b';
		char myChar3 = 'c';
		char myChar4 = 'd';
		char myChar5 = 'e';
		
		String myString = "" + myChar1 + myChar2 + myChar3 + myChar4 + myChar5;
    
		// We have an exception because the sum of the chars is equal to an Integer.
		// We have to concatenate an empty string to the chars in order to solve the problem.
    
		System.out.println(myString);
  }
}


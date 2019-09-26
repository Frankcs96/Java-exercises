import java.util.Scanner;


public class Exercise12 {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the Grade of your first exam");
    double firstExam = sc.nextDouble();
    
    
    System.out.println("What grade do you want to get in the trimester?"); 
    double trimesterGrade = sc.nextDouble();
      
    
    // trimesterGrade = firstExam *0.4 + secondExam * 0.6
    // trimesterGrade - firstExam*0.4 /0.6 = secondExam
    
    double secondExam = ((trimesterGrade - firstExam * 0.4) / 0.6);
    
    
    
    
  
    System.out.println("In order to get a " + trimesterGrade + " you have to get a " + secondExam +
    " in the second exam");
    
    
    
    
    
    
  
    
  }
}


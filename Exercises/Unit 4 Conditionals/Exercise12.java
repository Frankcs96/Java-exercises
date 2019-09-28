import java.util.Scanner;

public class Exercise12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to my quiz game about software development");
    System.out.println("Each correct answer gives you 1 point...");

    int score = 0;

    System.out.println("Question number 1: which of these technologies are not markup languages?");
    System.out.println("1. HTML");
    System.out.println("2. XML");
    System.out.println("3. SGML");
    System.out.println("4. XULM");
    int answer = sc.nextInt();
    if(answer == 4) {
      System.out.println("Correct answer!");
      score++;
    } else {
      System.out.println("Wrong answer");
    }
    
    System.out.println("Question number 2: Choose the correct main method in java");
    System.out.println("1. public static void main(String[] args)");
    System.out.println("2. public static void main(String arg)");
    System.out.println("3. public static void main(String{} args)");
    System.out.println("4. public static void main(String[args])");
    
    answer = sc.nextInt();
    if(answer == 1) {
      System.out.println("Correct answer!");
      score++;
    } else {
      System.out.println("Wrong answer");
    }
    
    System.out.println("Question number 3: Which variable is written in lower camel case?");
    System.out.println("1. boolean iscomplete");
    System.out.println("2. boolean Iscomplete");
    System.out.println("3. boolean isComplete");
    System.out.println("4. boolean IsComplete");
    
    answer = sc.nextInt();
    if(answer == 3) {
      System.out.println("Correct answer!");
      score++;
    } else {
      System.out.println("Wrong answer");
    }
    
    System.out.println("Question number 4: What does the term the cloud refer to? ");
    System.out.println("1. A meteorology term to describe water vapor");
    System.out.println("2. Things that you can access remotely over the internet");
    System.out.println("3. A way to access your hard rive");
    System.out.println("4. an app");
    
    answer = sc.nextInt();
    if(answer == 2) {
      System.out.println("Correct answer!");
      score++;
    } else {
      System.out.println("Wrong answer");
    }
    
    System.out.println("Question number 5: Choose the correct type of variable for 424543423");
    System.out.println("1. int");
    System.out.println("2. float");
    System.out.println("3. short");
    System.out.println("4. long");
    
    answer = sc.nextInt();
    if(answer == 4) {
      System.out.println("Correct answer!");
      score++;
    } else {
      System.out.println("Wrong answer");
    }
    
    System.out.println("Question number 6: char 'a' + char 'b' equals to...");
    System.out.println("1. ab");
    System.out.println("2. a b");
    System.out.println("3. 120");
    System.out.println("4. 195");
    
    answer = sc.nextInt();
    if(answer == 4) {
      System.out.println("Correct answer!");
      score++;
    } else {
      System.out.println("Wrong answer");
    }
    
    System.out.println("Question number 7: which db is not a relational one.");
    System.out.println("1. MongoDB");
    System.out.println("2. SQL server");
    System.out.println("3. MySQL");
    System.out.println("4. Oracle Database");
    
    answer = sc.nextInt();
    if(answer == 1) {
      System.out.println("Correct answer!");
      score++;
    } else {
      System.out.println("Wrong answer");
    }
    
    System.out.println("Question number 8: what is the meaning of <i> in html? ");
    System.out.println("1. Image");
    System.out.println("2. Italic");
    System.out.println("3. Insert");
    System.out.println("4. Bold");
    
    answer = sc.nextInt();
    if(answer == 2) {
      System.out.println("Correct answer!");
      score++;
    } else {
      System.out.println("Wrong answer");
    }
    

    System.out.println("Question number 9: What is the meaning of CRUD?");
    System.out.println("1. Create,Read,Update,Delete");
    System.out.println("2. Create,Read,Upload,Delete");
    System.out.println("3. Create,Read,Uninstall,Delete");
    System.out.println("4. Create,Reach,update,Delete");
    
    answer = sc.nextInt();
    if(answer == 1) {
      System.out.println("Correct answer!");
      score++;
    } else {
      System.out.println("Wrong answer");
    }
    

    System.out.println("Question number 10: is javascript a compiled language?");
    System.out.println("1. Yes");
    System.out.println("2. No");
    answer = sc.nextInt();
    if(answer == 2) {
      System.out.println("Correct answer!");
      score++;
    } else {
      System.out.println("Wrong answer");
    }
    
    
    System.out.println("-------------------------------");
    System.out.println("Your score is: " + score);
    System.out.println("Thanks for playing");
    
    
    
    
  }
}

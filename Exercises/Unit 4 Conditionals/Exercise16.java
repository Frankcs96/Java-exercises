import java.util.Scanner;

public class Exercise16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int score = 0;
    String option="";
    System.out.println("****Test infidelidad****");
    System.out.println("Debes contestar verdadero o falso (V o F)");
    
    System.out.println("1. Tu pareja parece estar m�s inquieta de lo normal sin ning�n motivo"
        + "aparente.");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("2. Ha aumentado sus gastos de vestuario");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("3. Ha perdido el inter�s que mostraba anteriormente por ti");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("4. Ahora se afeita y se asea con m�s frecuencia (si es hombre) o ahora se "
        + "arregla el pelo y se asea con m�s frecuencia (si es mujer)");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("5. No te deja que mires la agenda de su tel�fono m�vil");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando est�s t� "
        + "delante");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("7. �ltimamente se preocupa m�s en cuidar la l�nea y/o estar bronceado/a");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("8. Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho m�s"
        + " trabajo");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("9. Has notado que �ltimamente se perfuma m�s");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("Tu puntuaci�n es: " + score);
    if ((score >= 0) && (score <= 10)) {
      System.out.println("Puntuaci�n entre 0 y 10:");
      System.out.println("�Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    
    if ((score >= 11) && (score <= 22)) {
      System.out.println("Puntuaci�n entre 11 y 22:");
      System.out.println("Quiz�s exista el peligro de otra persona en su vida o en su mente, aunque"
          + " seguramente ser� algo sin importancia. No bajes la guardia.");
          
    }
    
    if ((score >= 22) && (score <= 30)) {
      System.out.println("Puntuaci�n entre 22 y 30:");
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con"
          + " otra persona. Te aconsejamos que indagues un poco m�s y averig�es que es lo que est�"
          + " pasando por su cabeza.");
    }
    
  }
}

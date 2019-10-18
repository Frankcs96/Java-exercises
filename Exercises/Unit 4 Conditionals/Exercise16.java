import java.util.Scanner;

public class Exercise16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int score = 0;
    String option="";
    System.out.println("****Test infidelidad****");
    System.out.println("Debes contestar verdadero o falso (V o F)");
    
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo"
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
    
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se "
        + "arregla el pelo y se asea con más frecuencia (si es mujer)");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú "
        + "delante");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más"
        + " trabajo");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("9. Has notado que últimamente se perfuma más");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    option = sc.nextLine().toLowerCase();
    if (option.equals("v")) {
      score+=3;
    }
    
    System.out.println("Tu puntuación es: " + score);
    if ((score >= 0) && (score <= 10)) {
      System.out.println("Puntuación entre 0 y 10:");
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    
    if ((score >= 11) && (score <= 22)) {
      System.out.println("Puntuación entre 11 y 22:");
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque"
          + " seguramente será algo sin importancia. No bajes la guardia.");
          
    }
    
    if ((score >= 22) && (score <= 30)) {
      System.out.println("Puntuación entre 22 y 30:");
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con"
          + " otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está"
          + " pasando por su cabeza.");
    }
    
  }
}

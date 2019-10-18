
public class Exercise11 {
  public static void main(String[] args) {
    int grade;
    int counterSuspenso = 0;
    int counterSuficiente = 0;
    int counterBien = 0;
    int counterNotable = 0;
    int counterSobresaliente = 0;
    
    System.out.println("Grades: ");
    System.out.println("-----------------");
    for (int i = 1; i <= 20; i++) {
      grade = (int)(Math.random() * ((10 - 0) + 1)) + 0;
      
      System.out.print("Student " + i + " --> ");
      
      if (grade < 5) {
        System.out.println(grade + " Suspenso");
        counterSuspenso++;
      } else if (grade == 5) {
        System.out.println(grade + " Suficiente");
        counterSuficiente++;
      } else if (grade == 6) {
        System.out.println(grade + " Bien");
        counterBien++;
      } else if (grade < 9) {
        System.out.println(grade + " Notable");
        counterNotable++;
      } else if (grade < 11) {
        System.out.println(grade + " Sobresaliente");
        counterSobresaliente++;
      }
       
    }
    System.out.println("--------------------\nTotal: ");
    
    System.out.println("Suspensos: " + counterSuspenso);
    System.out.println("Suficientes: " + counterSuficiente);
    System.out.println("Bienes: " + counterBien);
    System.out.println("Notables: " + counterNotable);
    System.out.println("Sobresalientes: " + counterSobresaliente);
  }
}

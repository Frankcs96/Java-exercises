import java.util.Scanner;

public class Exercise26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("****CodeCinema Buy your ticket.****");
    
    System.out.println("Number of tickets");
    int numberOfTickets = sc.nextInt();
    sc.nextLine();
    
    System.out.println("Day of the week");
    String dayOfTheWeek = sc.nextLine();
    
    double ticketPrice = 8;
    double couplePrice = 11;
    int numberOfCoupleTickets = 0;
    
    if (dayOfTheWeek.equalsIgnoreCase("Wednesday")) {
      ticketPrice = 5;
    }
    
    if (dayOfTheWeek.equalsIgnoreCase("Thursday")) {
      if (numberOfTickets % 2 == 0) {
        numberOfCoupleTickets = numberOfTickets / 2;
        numberOfTickets = 0;
      } else {
        numberOfCoupleTickets = numberOfTickets / 2;
        numberOfTickets = numberOfTickets % 2;
      }
       
      
    }
    
    double price = (ticketPrice * numberOfTickets) + (numberOfCoupleTickets * couplePrice);
    
    System.out.println("Do you have CodeCinema Card? (y/n)");
    String option = sc.nextLine();
    double discount = 0;
    
    if (option.equalsIgnoreCase("y")) {
      discount = price * 10 / 100;
    }
    
    double totalPrice = price - discount;
    
    System.out.println("Purchase completed. Thank you");
    if (dayOfTheWeek.equalsIgnoreCase("Thursday") && numberOfTickets == 0) {
      System.out.printf("Couples tickets:       %5d\n" , numberOfCoupleTickets);
      System.out.printf("Price per couples ticket  %5.2f€\n", couplePrice);
      System.out.printf("Total:                    %5.2f€\n", price);
      System.out.printf("Discount:                 %5.2f€\n", discount);
      System.out.printf("Total price               %5.2f€\n", totalPrice);
     
    }  
    
    if (dayOfTheWeek.equalsIgnoreCase("Thursday") && numberOfTickets != 0) {
      System.out.printf("Couples tickets:           %5d\n" , numberOfCoupleTickets);
      System.out.printf("Price per couples ticket:     %5.2f€\n", couplePrice);
      System.out.printf("Individual tickets:        %5d\n" , numberOfTickets);
      System.out.printf("Price per individual ticket:  %5.2f€\n" , ticketPrice);
      System.out.printf("Total:                        %5.2f€\n", price);
      System.out.printf("Discount:                     %5.2f€\n", discount);
      System.out.printf("Total price                   %5.2f€\n", totalPrice);
      
    }
    
    if (!dayOfTheWeek.equalsIgnoreCase("Thursday")) {
      System.out.printf("Individual tickets:        %5d\n" , numberOfTickets);
      System.out.printf("Price per individual ticket:  %5.2f€\n" , ticketPrice);    
      System.out.printf("Total:                        %5.2f€\n", price);
      System.out.printf("Discount:                     %5.2f€\n", discount);
      System.out.printf("Total price:                  %5.2f€\n", totalPrice);
    
    }
      
  }
    
    
}


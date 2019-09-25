public class Exercise05 {
	
	public static void main (String[] args) {

    String red = "\033[31m";
    String green = "\033[32m";
    String orange = "\033[33m";
    String blue = "\033[34m";
    String purple = "\033[35m";
    String white = "\033[37m";    
    

		System.out.printf(orange +"%-10s %-10s %-10s %-10s %-10s\n","Monday","Tuesday","Wednesday","Thursday","Friday");
    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    System.out.printf("\033[31m%-10s \033[32m%-10s \033[31m%-10s \033[31m%-10s \033[34m%-10s\n","PRO","EDD","PRO","PRO","SINF");
    System.out.println(orange + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    System.out.printf("\033[31m%-10s \033[35m%-10s \033[31m%-10s \033[31m%-10s \033[34m%-10s\n","PRO","LM","PRO","PRO","SINF");
    System.out.println(orange+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    System.out.printf("\033[31m%-10s \033[35m%-10s \033[31m%-10s \033[32m%-10s \033[34m%-10s\n","PRO","LM","PRO","EDD","SINF");
    System.out.println(orange+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    System.out.printf("\033[37m%-10s \033[34m%-10s \033[37m%-10s \033[32m%-10s \u001B[33m%-10s\n","BBDD","SINF","BBDD","EDD","FOL");
    System.out.println(orange+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    System.out.printf("\033[37m%-10s \033[34m%-10s \033[37m%-10s \033[35m%-10s \u001B[33m%-10s\n","BBDD","SINF","BBDD","LM","FOL");
    System.out.println(orange+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    System.out.printf("\033[37m%-10s \033[34m%-10s \033[37m%-10s \033[35m%-10s \u001B[33m%-10s\n","BBDD","SINF","BBDD","LM","FOL");
    System.out.println(orange+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	}
}



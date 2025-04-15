package ShpeBasedGame;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Game is started======");
		System.out.println("press 1 for CIRCLE");
		System.out.println("press 2 for Triangle");
		int a= sc.nextInt();
		Game g= new Game();
         Shape s= g.pressButton(a);
         s.getName();
		
		
		
		
		
	
		
	
	}
 
  

}

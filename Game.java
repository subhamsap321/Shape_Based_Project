package ShpeBasedGame;
import java.util.*;

public class Game {
	public  Shape pressButton(int n) {
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
	int choice = sc.nextInt();
	if(choice==1) {
		System.out.println("you select triangle");
		return new Circle();
		
	}else if(choice ==1) {
		System.out.println("you select Triangle");
		return new Triangle();
	}
	else 
	{
		System.out.println("this is wrong input");
		return pressButton(n);
	}}
}

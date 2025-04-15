package ShpeBasedGame;

public class Triangle implements Shape{
	int a;
	int b;
	int c;
	Triangle(){
		
	}
	Triangle(int a,int b,int c)
	{
		if(validate()) {
			this.a=a;
			this.b=b;
			this.c=c;
			
		}
	}
public Boolean validate() {
	return a+b>c&& b+c>a&& c+a>b;
	
}
public String getName() {
	return "Triangle";
}
public void getArea() {
	if(validate()) {
		int s=a*b*c;
		
		System.out.println("the area is"+2*(s-a)*(s-b)*(s-c)+"square unit");
		
	}
	else {
		System.out.println("is it not possible");
		
	}
    
}

public void getPerimeter() {
	if(validate()) {
		System.out.println("the perimeter is"+a+b+c+"square unit");
		
	}
	else {
		System.out.println("is it not possible");
		
	
	
}
}

}

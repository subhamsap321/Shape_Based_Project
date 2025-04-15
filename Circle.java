   package ShpeBasedGame;

   public class Circle implements TwoDshape {
	
	double radius;
	Circle(){
		
	}
	Circle(double radius){
		if(radius>0) {
			this.radius=radius;
			
		}
		else {
			System.out.println("you have entered wrong radius is it not possible");
			
		}
	}
	public Boolean validate() {
		return radius>0;
		
	}
	public String getName() {
		return "circle";
	}
    public void getArea() {
    	if(validate()) {
    		System.out.println("the area is"+Math.PI*radius*radius+"square unit");
    		
    	}
    	else {
    		System.out.println("is it not possible");
    		
    	}
        
    }
    
    public void getPerimeter() {
    	if(validate()) {
    		System.out.println("the perimeter is"+2*Math.PI*radius+"square unit");
    		
    	}
    	else {
    		System.out.println("is it not possible");
    		
    	
    	
    }
    }}

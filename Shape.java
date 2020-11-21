public class Shape {
	private String color;
	private boolean filled;
	public Shape() {
		color = "green";
		filled = true;   
	}
	public Shape(String c,boolean f) {
		color = c;
	    filled = f;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		 if (filled == true)
	     {
	         return true;
	     }
	     else
	     {
	         return false;
	     }
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString()
	   {
	       String isNot = "";
	       if(isFilled() == false)
	       {
	           isNot = "not ";
	        }
	           return "A Shape with color of " + color + " and is " + isNot + " filled. ";
	   }
}

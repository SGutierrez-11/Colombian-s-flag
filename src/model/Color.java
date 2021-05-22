package model;

public class Color {
	
	public static final String YELLOW = "\u001B[43m";
    public static final String BLUE= "\u001B[44m";
    public static final String RED= "\u001B[41m";
	
	public Color() {
		
	}
	
	public String color(String color) {
		if(color=="yellow") {
			return YELLOW+" ";
		}else if(color=="blue") {
			return BLUE+" ";
		}else {
			return RED+" ";
		}
	}
	
}

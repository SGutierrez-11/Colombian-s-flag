package ui;

import threads.Thread_Flag;

public class Main {
	
	public static final String ESC = "\u001B[";
    public static final String EMPTY= "\u001B[0m";
    
    private static Thread_Flag flagY;
    private static Thread_Flag flagB;
    private static Thread_Flag flagR;
    
	public static void main(String[] args) throws InterruptedException {
		
		flagY = new Thread_Flag(0, 60, 0, 8, 30, "yellow");
		flagB = new Thread_Flag(0, 60, 8, 12, 100, "blue");
		flagR = new Thread_Flag(0, 60, 12, 16, 110, "red");
		
		
		flagY.start();
		flagB.start();
		flagR.start();
		
	}
}

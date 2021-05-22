package ui;

import threads.Thread_Flag;

public class Main {
	
	public static final String ESC = "\u001B[";
	public static final String YELLOW = "\u001B[43m";
    public static final String BLUE= "\u001B[44m";
    public static final String RED= "\u001B[41m";
    public static final String EMPTY= "\u001B[0m";
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread_Flag flagY = new Thread_Flag(0, 60, 0, 8, 30, YELLOW+" ");
		Thread_Flag flagB = new Thread_Flag(0, 60, 8, 12, 100, BLUE+" ");
		Thread_Flag flagR = new Thread_Flag(0, 60, 12, 16, 110, RED+" ");
		
		
		flagY.start();
		flagB.start();
		flagR.start();
		System.out.print(" "+EMPTY);
	}
}

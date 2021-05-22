package threads;

import model.Color;

public class Thread_Flag extends Thread{
		
	public static final String ESC = "\u001B[";
		
	private int x;
	private int y;
	private int z;
	private int w;
	private int sleep;
	private String option;
	private Color color;
		
	public Thread_Flag(int x, int y,int z,int w, int sleep, String option) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.w=w;
		this.sleep=sleep;
		this.option=option;
		color = new Color();
	}
		
	@Override
	public void run() {
		paintFlag();
	}
		
	public synchronized void paintFlag() {
		for(int i=x;i<y;i++) {
			for(int j=z;j<w;j++) {
				System.out.print(ESC+i+"G"+ESC+j+"d"+color.color(option));
				try {
					Thread.sleep(sleep);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


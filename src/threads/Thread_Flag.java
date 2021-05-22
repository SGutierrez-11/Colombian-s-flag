package threads;

	public class Thread_Flag extends Thread{
		
	public static final String ESC = "\u001B[";
		
	private int x;
	private int y;
	private int z;
	private int w;
	private int sleep;
	private String color;
		
	public Thread_Flag(int x, int y,int z,int w, int sleep, String color) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.w=w;
		this.sleep=sleep;
		this.color=color;
	}
		
	@Override
	public void run() {
		paintFlag();
	}
		
	public synchronized void paintFlag() {
		for(int i=x;i<y;i++) {
			for(int j=z;j<w;j++) {
				System.out.print(ESC+i+"G"+ESC+j+"d"+color);
				try {
					Thread.sleep(sleep);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


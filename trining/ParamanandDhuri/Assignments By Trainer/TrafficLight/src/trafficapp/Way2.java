package trafficapp;

public class Way2 extends Thread {
	Signal sg;

	public Way2(Signal sg) {
		super();
		this.sg = sg;
	}

	@Override
	public void run() {
		while (true) {
			if (sg.isRed()) {
				System.out.println("Way2 Is Open");
			} else {
				System.out.println("Way2 is Stopped");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

package trafficapp;

public class Way1 extends Thread {
	Signal sg;

	public Way1(Signal sg) {
		super();
		this.sg = sg;
	}

	@Override
	public void run() {
		while (true) {
			if (sg.isGreen()) {
				System.out.println("Way1 Is Open");
			} else {
				System.out.println("Way1 is Stopped");
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

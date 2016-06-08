package trafficapp;

public class TrafficApp {

	public static void main(String[] args) {
	
		Signal sg=new Signal(false, true);
		Way1 w1=new Way1(sg);
		Way2 w2=new Way2(sg);
		sg.start();
		w1.start();
		w2.start();

	}

}

package trafficapp;

public class Signal extends Thread
{
boolean red;
boolean green;


public Signal(boolean red, boolean green) 
{
	super();
	this.red = red;
	this.green = green;
}



public boolean isRed() {
	return red;
}



public void setRed(boolean red) {
	this.red = red;
}



public boolean isGreen() {
	return green;
}



public void setGreen(boolean green) {
	this.green = green;
}



public void glowGreen()
{
 red=false;
 green=true;
}

public void glowRed()
{
red=true;
green=false;
}

@Override
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(2000);
				glowRed();
				System.out.println("Signal red");
				Thread.sleep(2000);
				glowGreen();
				System.out.println("Signal GREEN");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}

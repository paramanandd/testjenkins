import org.junit.Before;

class Counter
{
	
	static int count;
	public int inc()
	{
		return ++count;
	}
	
	public int dec()
	{
		return --count;
	}
	public int getcnt()
	{
		return count;
	}
}
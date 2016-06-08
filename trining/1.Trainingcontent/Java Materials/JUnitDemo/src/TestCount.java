import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert.*;

public class TestCount {

	Counter c;
	@Before
	public void set()
	{
		c=new Counter();
	}
	
	@Test
	public void testInc()
	{
		assertTrue(c.inc()==1);
		assertTrue(c.inc()==2);
	}
	
	@Test
	public void testDec()
	{
		assertTrue(c.dec()==1);
		assertTrue(c.dec()==0);
	}
	
}

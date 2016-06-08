import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ArithmeticTest {
	@Test
	public void testMutiply()
	{
	    assertEquals(4, Arithmetic.multiply(2, 2));
	    assertEquals(15, Arithmetic.multiply(3, -5));

		
	}
	
	@Test
	public void testisPositive()
	{
		assertEquals(true, Arithmetic.isPositive(5));
	}
	@BeforeClass
	public void show()
	{
		
	}
}

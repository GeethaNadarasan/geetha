import org.junit.Before;
import org.junit.Test;

import com.sectionApartB.Bird;

/**
 * Unit test 
 */
public class AnimalTest 

{

	private Bird bird;

	@Before
	public void setUp() throws Exception {
		bird = new Bird();
	}
	
	@Test
	public void testFly()
	{
		bird.fly();
	}

	@Test
	public void tesWalk()
	{
		bird.walk();
	}
}

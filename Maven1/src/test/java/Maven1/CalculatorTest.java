package Maven1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import mockitoTest.Calculator;
import mockitoTest.CalculatorService;

public class CalculatorTest {
Calculator c=null;
@Mock
CalculatorService service;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c=new Calculator(service);
	}

	@After
	public void tearDown() throws Exception {
	}

	/*public void testCalculator() {
		fail("not yet implemented")
	}*/
	
	@Test
	/*public void testAdd() {
		//fail("Not yet implemented");
	}
*/
	
	public void testPerform() {
		c.add(2, 3);
	
		when(service.add(2, 3)).thenReturn(10);
		verify(c).add(2, 3);
		//assertEquals(10,c.add(2, 3));
	}
}

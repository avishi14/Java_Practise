package mytestcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junitTest.TestExample;

public class TestExampleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddInts() {
		int a=1; int b=2;
		TestExample test1=new TestExample();
		int result = test1.AddInts(a, b);
		assertEquals(3,result);
	}
	
	@Test
	public void AddString() {
		
	 TestExample test2 =new TestExample();
	 String result1 =test2.AddString("Avishi", " Aggarwal");
		assertEquals("Avishi Aggarwal",result1);
	}

}

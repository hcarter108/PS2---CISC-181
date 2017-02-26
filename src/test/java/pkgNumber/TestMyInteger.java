package pkgNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {

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
	public void TestMyInt()
	{
		MyInteger int1 = new MyInteger(13);
		
		assertEquals(int1.isEven(),false);
		
		assertEquals(MyInteger.isEven(2),true);
		
		assertEquals(MyInteger.isEven(int1),false);
		
		assertEquals(int1.isOdd(),true);
		
		assertEquals(MyInteger.isOdd(3),true);
		
		assertEquals(MyInteger.isOdd(4),false);
		
		assertEquals(MyInteger.isOdd(int1),true);
		
		assertEquals(int1.isPrime(),true);
		
		assertEquals(MyInteger.isPrime(997),true);
		
		assertEquals(MyInteger.isPrime(998),false);
		
		assertEquals(MyInteger.isPrime(int1),true);
		
		assertEquals(int1.equals(2),false);
		
		assertEquals(int1.equals(int1),true);
	
	}

}

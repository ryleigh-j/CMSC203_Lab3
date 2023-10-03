import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {
	private GradeBook g1;
	private GradeBook g2;

	
	@Before
	public void setUp() throws Exception {
		//task 3
		g1= new GradeBook(5);
		g2= new GradeBook(5);
		g1.addScore(15.0);
		g1.addScore(37.5);
		g2.addScore(90.0);
		g2.addScore(78.0);
	}

	@After
	public void tearDown() throws Exception {
		//task 3
		g1= null;
		g2= null;
		
	}
	

	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals("15.0 37.5 "));
		assertTrue(g2.toString().equals("90.0 78.0 "));
		assertEquals(2,g1.getScoreSize(),.0001);
		assertEquals(2, g2.getScoreSize(),.0001);
		//fail("Not yet implemented");
	}

	@Test
	public void testSum() {
		assertEquals(52.5,g1.sum(),.0001);
		assertEquals(168,g2.sum(),.0001);
		
	}

	@Test
	public void testMinimum() {
		assertEquals(15.0,g1.minimum(),.001);
		assertEquals(78.0,g2.minimum(),.001);

	}

	@Test
	public void testFinalScore() {
		assertEquals(37.5,g1.finalScore(),.001);
		assertEquals(90.0,g2.finalScore(),.001);
	}



}

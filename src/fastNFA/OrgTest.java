package fastNFA;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrgTest {

	Org testOrg;

	@Test
	public void testFirstPartOneName() {
		testOrg = new Org("BlackRock");
		String firstPart = testOrg.getFirstNamePart();
		assertEquals("first part", "BlackRock", firstPart);
	}
	
	@Test
	public void testSecondPartOneName() {
		testOrg = new Org("BlackRock");
		String secondPart = testOrg.getSecondNamePart();
		assertEquals("second part", null, secondPart);
	}
	
	
	@Test
	public void testFirstPartTwoNames() {
		testOrg = new Org("BlackRock Advisors");
		String firstPart = testOrg.getFirstNamePart();
		assertEquals("first part", "BlackRock",  firstPart);
	}
	
	@Test
	public void testSecondPartTwoNames() {
		testOrg = new Org("BlackRock Advisors");
		String secondPart = testOrg.getSecondNamePart();
		assertEquals("second part",  "Advisors", secondPart);
	}
	
	@Test
	public void testFirstPartThreeNames() {
		testOrg = new Org("BlackRock  Advisors Management");
		String firstPart = testOrg.getFirstNamePart();
		assertEquals("first part",  "BlackRock", firstPart );
	}
	
	@Test
	public void testSecondPartThreeNames() {
		testOrg = new Org("BlackRock  Advisors Management");
		String secondPart = testOrg.getSecondNamePart();
		assertEquals("second part", "Advisors", secondPart);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNoName() {
		testOrg = new Org("");	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNumName() {
		testOrg = new Org("5:15");	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNullName() {
		testOrg = new Org(null);	
	}

	
}

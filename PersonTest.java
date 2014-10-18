package fastNFA;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
	Person testPerson;

	@Test
	public void testLastName() {
		testPerson = new Person("Thorup", "Sara");
		assertEquals("normal last name", "Thorup", testPerson.getLname());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testBlankLastName() {
		testPerson = new Person("", "Sara");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNullLastName() {
		testPerson = new Person("", "Sara");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSymbolLastName() {
		testPerson = new Person("H@m", "Sara");
	}
	
	@Test
	public void testMultipleLastName() {
		testPerson = new Person("Thorup Martinez", "Sara");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testHyphenatedLastName() {
		testPerson = new Person("Thorup-Martinez", "Sara");
	}
	
	@Test
	public void testFirstName() {
		testPerson = new Person("Thorup", "Sara");
		assertEquals("normal first name", "Sara", testPerson.getFname());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSymbolFirstName() {
		testPerson = new Person("Thorup", "C!J!");
	}
	
	@Test
	public void testMultipleFirstName() {
		testPerson = new Person("Thorup", "Sara Jessica");
		assertEquals("multiple first name", "Sara Jessica", testPerson.getFname());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNumFirstName() {
		testPerson = new Person("Thorup", "Sara 3rd");
		assertEquals("num in first name", "Sara",  testPerson.getFname());
	}
	
	@Test
	public void testNullFirstName() {
		testPerson = new Person("Thorup", null);
		assertEquals("null first name", null, testPerson.getFname());
	}
	
	@Test
	public void testBlankFirstName() {
		testPerson = new Person("Thorup", "");
		assertEquals("blank first name", null, testPerson.getFname() );
	}
	
	@Test
	public void testFirstInitialBlankFirst() {
		testPerson = new Person("Thorup", "");
		assertEquals("first inital blank name", null, testPerson.getFirstNameInitial());
	}
	
	@Test
	public void testFirstTwoInitialsBlankFirst() {
		testPerson = new Person("Thorup", "");
		assertEquals("first two inital blank name",  null, testPerson.getFirstNameFirstTwoChars());
	}
	
	@Test
	public void testFirstInitialNullFirst() {
		testPerson = new Person("Thorup", null);
		assertEquals("first inital null name", null, testPerson.getFirstNameInitial());
	}
	
	@Test
	public void testFirstTwoInitialsNullFirst() {
		testPerson = new Person("Thorup", null);
		assertEquals("first two inital null name", null, testPerson.getFirstNameFirstTwoChars());
	}
	
	@Test
	public void testFirstInitialNormalFirst() {
		testPerson = new Person("Thorup", "Sara");
		assertEquals("first inital normal name", "S", testPerson.getFirstNameInitial());
	}
	
	@Test
	public void testFirstTwoInitialsNormalFirst() {
		testPerson = new Person("Thorup", "Sara");
		assertEquals("first two inital normal name", "Sa", testPerson.getFirstNameFirstTwoChars());
	}
	
	@Test
	public void testFirstInitialOneCharFirst() {
		testPerson = new Person("Thorup", "S");
		assertEquals("first inital normal name", "S", testPerson.getFirstNameInitial());
	}
	
	@Test
	public void testFirstTwoInitialsOneCharFirst() {
		testPerson = new Person("Thorup", "S");
		assertEquals("first two inital normal name", null, testPerson.getFirstNameFirstTwoChars());
	}

	@Test 
	public void testNormalNickname() {
		testPerson = new Person ("Thorup", "Sara");
		testPerson.setNickName("Jean");
		assertEquals("normal nickname", "Jean", testPerson.getNickName());
	}
	
	@Test 
	public void testSymbolNickname() {
		testPerson = new Person ("Thorup", "Sara");
		testPerson.setNickName("Jean`");
		assertEquals("symbol nickname", null, testPerson.getNickName());
	}
	
	@Test 
	public void testMultipleNicknames() {
		testPerson = new Person ("Thorup", "Sara");
		testPerson.setNickName("Joan Rose");
		assertEquals("two part nickname", "Joan Rose", testPerson.getNickName());
		
	}
	
	@Test
	public void testLastNamePeriod() {
		testPerson = new Person ("Thorup.Mart", "Sara");
		assertEquals("last name no period", "ThorupMart", testPerson.getLname());
		
	}
	
	@Test
	public void testFirstNamePeriod() {
		testPerson = new Person("Thorup", "J.R.");
		assertEquals("first name no period", "JR", testPerson.getFname());
	}
	
	@Test
	public void testNickNamePeriod() {
		testPerson = new Person("Thorup", "Sara");
		testPerson.setNickName("J.R.");
		assertEquals("nickname no period", "JR", testPerson.getNickName());
	}
}

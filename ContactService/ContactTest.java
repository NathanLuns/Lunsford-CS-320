package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
	@Test
	void createContactTest() { //makes sure that the constructor works as intended if no illegal argument exceptions are thrown here, then this contact meets all requirements for a valid contact
		Contact contact1 = new Contact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		assertNotNull(contact1);
	}
	
	@Test
	void testGetID() {
		Contact contact1 = new Contact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		assertEquals(contact1.getContactID(), "123");
	}
	
	@Test
	void testGetFirst() {
		Contact contact1 = new Contact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		assertEquals(contact1.getFirstName(), "Nathan");
	}
	
	@Test
	void testGetLast() {
		Contact contact1 = new Contact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		assertEquals(contact1.getLastName(), "Lunsford");
	}
	
	@Test
	void testGetPhone() {
		Contact contact1 = new Contact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		assertEquals(contact1.getPhoneNumber(), "1234567890");
	}
	
	@Test
	void testGetAddress() {
		Contact contact1 = new Contact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		assertEquals(contact1.getAddress(), "1234 North Street");
	}
	
	@Test
	void testContactIDNull() {//checks if the illegalArgumentExceptions are thrown for when contactID is null or too long
		assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Nathan", "Lunsford", "1234567890", "1234 North Street"));
	}
	@Test
	void testContactIDlong() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("1234567891011", "Nathan", "Lunsford", "1234567890", "1234 North Street"));
	}
	
	@Test
	void testFirstNameNull() {//checks if the illegalArgumentExceptions are thrown for when firstName is null or too long
		assertThrows(IllegalArgumentException.class, () -> new Contact("123", null, "Lunsford", "1234567890", "1234 North Street"));
	}
	@Test
	void testFirstNameLong() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("123", "asdfghjklqwerty", "Lunsford", "1234567890", "1234 North Street"));
	}
	
	@Test
	void testLastNameNull() {//checks if the illegalArgumentExceptions are thrown for when LastName is null or too long
		assertThrows(IllegalArgumentException.class, () -> new Contact("123", "Nathan", null, "1234567890", "1234 North Street"));
	}
	@Test
	void testLastNameLong() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("123", "Nathan", "Lunsfordasdfq", "1234567890", "1234 North Street"));
	}
	
	@Test
	void testPhoneNumberNull() {//checks if the illegalArgumentExceptions are thrown for when phoneNumber is null or not 10 digits
		assertThrows(IllegalArgumentException.class, () -> new Contact("123", "Nathan", "Lunsford", null, "1234 North Street"));
	}
	@Test
	void testPhoneNumberLong() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("123", "Nathan", "Lunsford", "12345678901", "1234 North Street"));
	}
	@Test 
	void testPhoneNumberShort(){
		assertThrows(IllegalArgumentException.class, () -> new Contact("123", "Nathan", "Lunsford", "123456789", "1234 North Street"));
	}
	
	@Test
	void testAddressNull() {//checks if the illegalArgumentExceptions are thrown for when address is null or too long
		assertThrows(IllegalArgumentException.class, () -> new Contact("123", "Nathan", "Lunsford", "1234567890", null));
	}
	@Test
	void testAddressLong() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("123", "Nathan", "Lunsford", "1234567890", "I will try to make this be more than 30 characters I think this is long enough"));
	}

}

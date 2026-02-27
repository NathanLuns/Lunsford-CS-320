package contact;  

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	@Test
	void testAddContact() {
		ContactService service = new ContactService();
		service.addContact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		assertNotNull(service.contactMap.get("123"));//asserts that there is a contact in the HashMap at the specified key
	}
	
	@Test
	void testSameID() {
		ContactService service = new ContactService();
		service.addContact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		assertThrows(IllegalArgumentException.class, () -> service.addContact("123", "Gomez", "Landry", "0987654321", "4321 North Street"));//asserts that the illegal argument exception is thrown when a new contactID is the same as one already in the HashMap
	}

	@Test
	void testRemoveContact() {
		ContactService service = new ContactService();
		service.addContact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		service.removeContact("123");
		assertNull(service.contactMap.get("123"));//asserts that the removed contact is no longer in the HashMap
	}
	
	@Test
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		service.updateFirstName("123", "Grant");
		assertEquals(service.contactMap.get("123").getFirstName(), "Grant");//shows that the updateFirstName method changes the first name attribute of the contact
	}
	@Test
	void testUpdateFirstNullID() {
		ContactService service = new ContactService();
		assertThrows(IllegalArgumentException.class, () -> service.updateFirstName("123", "Grant"));
	}
	
	@Test
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		service.updateLastName("123", "Mitchell");
		assertEquals(service.contactMap.get("123").getLastName(), "Mitchell");//shows that the updateLastName method changes the last name attribute of the contact
	}
	@Test
	void testUpdateLastNullID() {
		ContactService service = new ContactService();
		assertThrows(IllegalArgumentException.class, () -> service.updateLastName("123", "Mitchell"));
	}
	
	@Test
	void testUpdatePhoneNumber() {
		ContactService service = new ContactService();
		service.addContact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		service.updatePhoneNumber("123", "0987654321");
		assertEquals(service.contactMap.get("123").getPhoneNumber(), "0987654321");//shows that the updatePhoneNumber method changes the phone number attribute of the contact
	}
	@Test
	void testUpdatePhoneNullID() {
		ContactService service = new ContactService();
		assertThrows(IllegalArgumentException.class, () -> service.updatePhoneNumber("123", "0987654321"));
	}
	
	@Test
	void testUpdateAdress() {
		ContactService service = new ContactService();
		service.addContact("123", "Nathan", "Lunsford", "1234567890", "1234 North Street");
		service.updateAddress("123", "4321 South Street");
		assertEquals(service.contactMap.get("123").getAddress(), "4321 South Street");//shows that the updateAddress method changes the address attribute of the contact
	}
	@Test
	void testUpdateAddress() {
		ContactService service = new ContactService();
		assertThrows(IllegalArgumentException.class, () -> service.updateAddress("123", "4321 South Street"));
	}

}

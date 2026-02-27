package contact;

import java.util.HashMap;

public class ContactService {
	
	HashMap<String, Contact> contactMap = new HashMap<>(); // HashMap allows for easier searching for the contacts by contactID
	
	public void addContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {//calls the Contact Constructor
		if (contactMap.containsKey(contactID)) { // Checks whether the contactID already exists since requirements state that each contactID must be unique
			throw new IllegalArgumentException("Contact ID already exists.");
		}
		contactMap.put(contactID, new Contact(contactID, firstName, lastName, phoneNumber, address));
	}
	
	public void removeContact(String contactID) { //removes the requested contact from the hashMap
		contactMap.remove(contactID);
	}
	
	public void updateFirstName(String contactID, String newFirstName) { // calls the setFirstName method to update first name
		checkNullID(contactID);
		contactMap.get(contactID).setFirstName(newFirstName);
	}
	
	public void updateLastName(String contactID, String newLastName) { //calls the setLastName method to update the last name
		checkNullID(contactID);
		contactMap.get(contactID).setLastName(newLastName);
	}
	
	public void updatePhoneNumber(String contactID, String newPhoneNumber) {//calls the setPhoneNumber method to update the phone number
		checkNullID(contactID);
		contactMap.get(contactID).setPhoneNumber(newPhoneNumber);
	}
	
	public void updateAddress(String contactID, String newAddress) {//calls the setAddress method to update the address
		checkNullID(contactID);
		contactMap.get(contactID).setAddress(newAddress);
	}
	
	public void checkNullID(String newID) {
		if (contactMap.get(newID) == null) {
			throw new IllegalArgumentException("A contact with this ID does not exist.");
		}
	}

}

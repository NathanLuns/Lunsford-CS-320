package contact;

public class Contact {
	
	String contactID;
	String firstName;
	String lastName;
	String phoneNumber;
	String address;
	
	//constructor for making a new Contact
	public Contact(String newContactID, String newFirstName, String newLastName, String newPhoneNumber, String newAddress) {
		setContactID(newContactID);
		setFirstName(newFirstName);
		setLastName(newLastName);
		setPhoneNumber(newPhoneNumber);
		setAddress(newAddress);
		
	}
	//Below this line are all of the getters and setters for the various attributes in the Contact class
	//Each attribute has a getter and a setter
	
	public String getContactID() {
		return contactID;
	}
	public void setContactID(String newContactID) {
		checkNullLong(newContactID, 10);
		contactID = newContactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String newFirstName) {
		checkNullLong(newFirstName, 10);
		firstName = newFirstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String newLastName) {
		checkNullLong(newLastName, 10);
		lastName = newLastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String newPhoneNumber) {
		if (newPhoneNumber == null || newPhoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number.");
		}
		phoneNumber = newPhoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String newAddress) {
		checkNullLong(newAddress, 30);
		address = newAddress;
	}
	
	public void checkNullLong(String input, int maxLength) {
		if (input == null || input.length() > maxLength) {
			throw new IllegalArgumentException("Invalid input");
		}
	}
}

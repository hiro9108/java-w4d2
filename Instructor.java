
public class Instructor {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int experienceYear;
	
	public Instructor(String firstName, String lastName, String phoneNumber, int experienceYear) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setExperienceYear(experienceYear);
	}
	
	/*
	 * @getters
	 */
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public int getExperienceYear() {
		return experienceYear;
	}
	
	public String getStatus() {
		if (experienceYear < 2) {
			return "we have Junior Instructor";
		} else if (experienceYear >= 2 && experienceYear <= 4) {
			return "we have Intermediate Instructor ";
		} else {
			return "we have Senior Instructor ";
		}
	}
	
	
	/*
	 * @setters
	 */
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}
}

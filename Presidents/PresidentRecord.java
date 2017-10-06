/* Sorting hat, presidential edition

Joshua Ferguson
*/
import java.util.Comparator;

public class PresidentRecord
{
	private String firstName;
	private String lastName;
	private String middleName;
	private String yearsInOffice;
	
	public PresidentRecord(String firstName, String lastName,
	String middleName, String yearsInOffice) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.middleName=middleName;
		this.yearsInOffice=yearsInOffice;
	}
	
	//this begins the accessor and mutator methods
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName=middleName;
	}
	public String getYearsInOffice() {
		return yearsInOffice;
	}
	public void setYearsInOffice(String yearsInOffice) {
		this.yearsInOffice=yearsInOffice;
	}
	
	
	//the toString method
	public String toString() {
		return lastName + ", " + firstName + ", "+ yearsInOffice;
	}
	
	
	//this begins the comparator methods
	public static Comparator<PresidentRecord> FirstNameComparator =  
			new Comparator<PresidentRecord>()

	{

	 public int compare(PresidentRecord presidentFirstName1, PresidentRecord presidentFirstName2)

	 {

	  String firstName1 = presidentFirstName1.getFirstName().toUpperCase();

	  String firstName2 = presidentFirstName2.getFirstName().toUpperCase();

	  //ascending order

	  return firstName1.compareTo(firstName2);

	  //descending order
	  //return firstName2.compareTo(firstName1);

	

	 }

	};
	public static Comparator<PresidentRecord> LastNameComparator =  
			new Comparator<PresidentRecord>()

	{

	 public int compare(PresidentRecord presidentLastName1, PresidentRecord presidentLastName2)

	 {

	  String lastName1 = presidentLastName1.getLastName().toUpperCase();

	  String lastName2 = presidentLastName2.getLastName().toUpperCase();

	  //ascending order

	  return lastName1.compareTo(lastName2);

	  //descending order
	  //return lastName2.compareTo(lastName1);

	

	 }

	};
	public static Comparator<PresidentRecord> YIOComparator =  
			new Comparator<PresidentRecord>()

	{

	 public int compare(PresidentRecord yearsInOffice1, PresidentRecord yearsInOffice2)

	 {

	  String years1 = yearsInOffice1.getYearsInOffice().toUpperCase();

	  String years2 = yearsInOffice2.getYearsInOffice().toUpperCase();

	  //ascending order

	  return years1.compareTo(years2);

	  //descending order
	  //return yearsInOffice2.compareTo(yearsInOffice1);

	

	 }

	};//This concludes the program
}
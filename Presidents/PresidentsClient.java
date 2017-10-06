/*Uses the PresidentRecord class in order to allow the user
to parse through our presidential history by first name, last name
and years in office

Joshua Ferguson
*/
import java.util.Collections;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresidentsClient
{
	public static void main(String args[]) {
		ArrayList<PresidentRecord> Presidents= new ArrayList<PresidentRecord>();
		Scanner scan = new Scanner(System.in);
		int useCase = 4;
		// This begins the process of gathering input from the file, if it exists
		try {
		Scanner file = new Scanner(new File("presidents.txt"));
		
		while (file.hasNext())
		{
			String stringRead = file.nextLine();
			
			Scanner parse = new Scanner(stringRead);
			parse.useDelimiter(",");
			String lastName= parse.next();
			String firstName= parse.next();
			String middleName= parse.next();
			String yearsInOffice= parse.next();
			
			PresidentRecord temporaryTerm= new PresidentRecord(
					firstName, lastName, middleName, yearsInOffice);
			
			Presidents.add(temporaryTerm);
		}
		file.close();
		
		while (useCase!=0) {
			System.out.print("Please enter 1 to sort the list of presidents by"+
		    " First name, 2 by last name, or 3 by their years in office, or 0 to quit: ");
			useCase=scan.nextInt();
			
			//this begins gathering input from user data
			if (useCase >3 || useCase < 0) {
				System.out.println("Sorry, didn't quite catch that. please try again.");
			}
			else if(useCase==1){
				System.out.println("Sorting via First Name: ");
				Collections.sort(Presidents, PresidentRecord.FirstNameComparator);
				}
			else if(useCase==2){
					System.out.println("Sorting via Last Name: ");
					Collections.sort(Presidents, PresidentRecord.LastNameComparator);
				}
			else if(useCase==3){
				System.out.println("Sorting via Years in Office: ");
				Collections.sort(Presidents, PresidentRecord.YIOComparator);
				}
			else {
				System.out.println("well, I guess that's it. See you later.");
				System.exit(0);
			}
			//this prints out the sorted lists
			if (useCase < 4 || useCase > 0) {
				for (PresidentRecord str: Presidents) {
					System.out.println(str);
				}
			}
		}
		}
		//catch the exception if the file isn't found
		catch (FileNotFoundException ex) {
			System.out.println("well that sucks, file not found.");
		}
	}
}
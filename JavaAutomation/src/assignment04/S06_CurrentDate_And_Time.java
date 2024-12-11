//6. Write a Java program to print the current date and time in the specified format. Example
//Current Date and Time :
//December 25, 2013
//9:13 pm
//The current date and time will change according to your system date and time.

package assignment04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class S06_CurrentDate_And_Time {

	public static void main(String[] args) {

		// Get the current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();

		// Format for date (e.g., December 25, 2013)
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");		
		String formattedDate=currentDateTime.format(dateFormatter);

		// Format for time (e.g., 9:13 pm)
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
		String formattedTime=currentDateTime.format(timeFormatter);

		// Print the current date and time
		System.out.println("Current Date and Time: ");
		System.out.println(formattedDate);
		System.out.println(formattedTime);

	}

}

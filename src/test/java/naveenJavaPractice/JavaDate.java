package naveenJavaPractice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {

	public static void main(String[] args) {
		LocalDateTime localDateTime =LocalDateTime.now();
		System.out.println(localDateTime);
		//DateTimeFormatter dateTimeFormatterObj = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		DateTimeFormatter dateTimeFormatterObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		
		String formattedDateAndTime = localDateTime.format(dateTimeFormatterObj);
		System.out.println("Formatted Date Time "   +  formattedDateAndTime);
		
		
	}

}

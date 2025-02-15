package Day5.JUnit.Advance.TestingDateFormatte;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
    public String formatDate(String inputDate){
         try{
             LocalDate date= LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
             return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
         }
         catch(DateTimeParseException e){
             throw new IllegalArgumentException("Invalid date format. expected yyyy-MM-dd.");
         }
    }

}

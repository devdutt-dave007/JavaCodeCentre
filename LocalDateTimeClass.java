import java.time.*;
public class LocalDateTimeClass
{
    public static void main(String[] args)
    {
        /*
    LocalDateTime class is part of the java.time package and is used to represent a date and time without time zone information
    LocalDateTime class provides various methods to create, manipulate, and format date and time values
    LocalDateTime class is immutable, which means that once a LocalDateTime object is created, it cannot be modified.
    Instead, you can create new LocalDateTime objects based on existing ones.
    LocalDateTime class provides methods to perform various operations on date and time values, such as getting the current date and
    time, creating specific date and time values, parsing date and time strings, and performing date and time arithmetic.
    LocalDateTime class is commonly used in applications that require date and time manipulation, such as scheduling,
    calendar applications, and date and time calculations.
*/
// Get the current date and time
    // (1) now() method of LocalDateTime class is used to get the current date and time
                LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

    //(2) of() method of LocalDateTime class is used to create a specific date and time
    //LocalDateTime specificDateTime = LocalDateTime.of(year, month, day, hour,minute);
    //LocalDateTime specificDateTime = LocalDateTime.of(year, month, day, hour, minute,second);
    //LocalDateTime specificDateTime = LocalDateTime.of(year, month, day, hour, minute,second, nanosecond);
        LocalDateTime specificDateTime = LocalDateTime.of(2022, 12, 25, 14, 30);
        System.out.println("Specific Date and Time: " + specificDateTime);

    //Exception in of() method
    // If you try to create a date and time with invalid values, it will throw a DateTimeException
        LocalDateTime invalidDateTime = LocalDateTime.of(2021, 02, 29, 14, 30);
    //Exception in thread "main" java.time.DateTimeException: Invalid date 'February 29' as '2021' is not a leap year

    // (3) parse() method of LocalDateTime class is used to parse a date and time string and convert it into a LocalDateTime object
    //parse() method expects the date and time string to be in the format "yyyy-MM- ddTHH:mm" or "yyyy-MM-ddTHH:mm:ss" or
    //"yyyy-MM-ddTHH:mm:ss.nnnnnnnnn"
    //parse() method will throw a DateTimeParseException if the date and time string is not in the correct format or
    //if it contains invalid date and time values
    //parse() method will works only in ISO_LOCAL_DATE_TIME format which is "yyyy-MM-ddTHH:mm" or "yyyy-MM-ddTHH:mm:ss" or
    //"yyyy-MM-ddTHH:mm:ss.nnnnnnnnn"
        LocalDateTime parsedDateTime = LocalDateTime.parse("2023-02-28T14:30");
        System.out.println("Parsed Date and Time: " + parsedDateTime);

//Exception in parse() method
// If you try to parse a date and time string that is not in the correct format, it will throw a DateTimeParseException
        LocalDateTime invalidParsedDateTime = LocalDateTime.parse("2023-02-28 14:30");
//Exception in thread "main" java.time.format.DateTimeParseException: Text '2023-02-28 14:30' could not be parsed at index 10

// (4) toLocalDate() method of LocalDateTime class is used to convert a LocalDateTime object to a LocalDate object
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate date = dateTime.toLocalDate();
        System.out.println("Date: " + date);

// (5) toLocalTime() method of LocalDateTime class is used to convert a LocalDateTime object to a LocalTime object
        LocalTime time = dateTime.toLocalTime();
        System.out.println("Time: " + time);

// (6) plusDays(long days) method of LocalDateTime class is used to add a specified number of days to a LocalDateTime object
        LocalDateTime futureDateTime = currentDateTime.plusDays(10);
        System.out.println("Current Date and Time: " + currentDateTime);
        System.out.println("Future Date and Time (after adding 10 days): " + futureDateTime);

// (7) minusHours(long hours) method of LocalDateTime class is used to subtract a specified number of hours from a LocalDateTime object
        LocalDateTime pastDateTime = currentDateTime.minusHours(5);
        System.out.println("Current Date and Time: " + currentDateTime);
        System.out.println("Past Date and Time (after subtracting 5 hours): " + pastDateTime);

    }
}

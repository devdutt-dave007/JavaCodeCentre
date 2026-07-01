import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatClass
{
    public static void main(String[] args)
    {
/*
    DateTimeFormatter class is part of the java.time.format package and is used to format and parse date and time values
    DateTimeFormatter class provides various methods to create custom date and time formats, format date and time values,
    and parse date and time strings.
    DateTimeFormatter class is immutable, which means that once a DateTimeFormattervobject is created, it cannot be modified.
    Instead, you can create new DateTimeFormatter objects based on existing ones.
    DateTimeFormatter class is commonly used in applications that require custom date and time formatting,
    such as displaying dates in a specific format or parsing user input.
*/

    //(1) ofPattern() method of DateTimeFormatter class is used to create a custom date and time format based on a specified pattern
    // The pattern can include various symbols to represent different components of the date and time, such as day, month,
    // year, hour, minute, second, etc.
    // For example, "dd-MM-yyyy" represents a date format with day, month, and year separated by hyphens,
    // while "HH:mm:ss" represents a time format with hours, minutes, and seconds separated by colons.
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate currentDate = LocalDate.now();

    //(2) format() method of LocalDate class is used to format a LocalDate object using a specified DateTimeFormatter
    // format() method returns a string representation of the date formatted according to the specified formatter
        String formattedDate = currentDate.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    // If the formatter is not compatible with the type of date or time being formatted, it will throw an UnsupportedTemporalTypeException
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String invalidFormattedDate = currentDate.format(formatter1);
    //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException:Unsupported field
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime currentTime = LocalTime.now();
        String formattedTime = currentTime.format(timeFormatter);
        System.out.println("Formatted Time: " + formattedTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime currentDateTime = LocalDateTime.now();
        String formattedDateTime = currentDateTime.format(dateTimeFormatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

    // (3) parse() method of DateTimeFormatter class is used to parse a date and time string using a specified DateTimeFormatter
    // and convert it into a LocalDate, LocalTime, or LocalDateTime object
    // parse() method will throw a DateTimeParseException if the date and time string is not in the correct format or
    // if it contains invalid date and time values
    // parse() method will works only if the date and time string is in the format specified by the DateTimeFormatter
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateString = "28-02-2023";
        LocalDate parsedDate = LocalDate.parse(dateString, formatter2);
        System.out.println("Parsed Date: " + parsedDate);

    // (4) format(DateTimeFormatter.ISO_LOCAL_DATE)

        LocalDate ld=LocalDate.of(2023, 2, 20);
        String result=ld.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted Date in ISO_LOCAL_DATE format: " + result);

    // (5) format(DateTimeFormatter.ISO_LOCAL_TIME)

        LocalTime lt=LocalTime.of(14, 30, 45);
        String result1=lt.format(DateTimeFormatter.ISO_LOCAL_TIME);

        System.out.println("Formatted Time in ISO_LOCAL_TIME format: " + result1);

    // (6) format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        LocalDateTime ldt=LocalDateTime.of(2023, 2, 28, 14, 30, 45);
        String result2=ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("Formatted Date and Time in ISO_LOCAL_DATE_TIME format: " + result2);

    }
}

import java.time.*;
public class LocalDateClass
{
    public static void main(String[] args)
    {
    /*
      LocalDate class is part of the java.time package and is used to represent a date without time information
      LocalDate class provides various methods to create, manipulate, and format dates LocalDate class is immutable,
      which means that once a LocalDate object is created, it cannot be modified. Instead, you can create new LocalDate
      objects based on existing ones.
      LocalDate class provides methods to perform various operations on dates, such as getting the current date,
      creating specific dates, parsing date strings, and performing date arithmetic.
      LocalDate class is commonly used in applications that require date manipulation, such as scheduling, calendar
      applications, and date calculations.
    */

    // Get the current date
    //(1) now() method of LocalDate class is used to get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
    //(2) of(int year, int month, int dayOfMonth) method of LocalDate class is used to create a specific date
    //LocalDate specificDate = LocalDate.of(yyyy, mm, dd);
        LocalDate specificDate = LocalDate.of(2022, 12, 25);
        System.out.println("Specific Date: " + specificDate);

    //Exception in of() method
    // If you try to create a date with invalid values, it will throw a DateTimeException
        LocalDate invalidDate = LocalDate.of(2021, 02, 29);
    //Exception in thread "main" java.time.DateTimeException: Invalid date 'February29' as '2021' is not a leap year

    //(3) parse() method of LocalDate class is used to parse a date string and convert it into a LocalDate object
    //parse() method expects the date string to be in the format "yyyy-MM-dd"
    //parse() method will throw a DateTimeParseException if the date string is not in the correct format or
    // if it contains invalid date values
    //parse() method will works only in ISO_LOCAL_DATE format which is "yyyy-MM-dd"
    // LocalDate parsedDate = LocalDate.parse("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse("2023-02-28");
        System.out.println("Parsed Date: " + parsedDate);
    //Exception in parse() method
    // If you try to parse a date string not in the correct format, it will throw a DateTimeParseException
    //LocalDate invalidParsedDate = LocalDate.parse("15-05-2023");
    //Exception in thread "main" java.time.format.DateTimeParseException: Text '15-05-2023' could not be parsed at index 0

    //(4) getting year, month, and day from a LocalDate object
    // getYear(),getMonthValue(),getDayOfMonth() methods
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();

        System.out.printf("Year: %d, Month: %d, Day: %d%n", year, month, day);
        System.out.printf("Current Date: %02d-%02d-%04d%n", day, month, year);

    //(5)getMonth() method of LocalDate class is used to get the month as a Month enum value
        Month m=currentDate.getMonth(); // Output: FEBRUARY
        System.out.println("Month: " + m);
        LocalDate myBirthday = LocalDate.of(2000, 3, 19);

    // (6) getDayOfWeek() method to Check Day of Week
        System.out.println("Day of Week: " + myBirthday.getDayOfWeek());

    // (7) isLeapYear() method to Check if the year is a leap year
        System.out.println("Is Leap Year: " + myBirthday.isLeapYear());

    // (8) plusDays(long daysToAdd) to Add days to a date
        LocalDate futureDate = currentDate.plusDays(10);
        System.out.println("Current Date: " + currentDate);
        System.out.println("Future Date: " + futureDate);

    // (9) plusMonths(long daysToAdd) to Add months to a date
        LocalDate futureMonth = currentDate.plusMonths(2);
        System.out.println("Current Date: " + currentDate);
        System.out.println("Future Month: " + futureMonth);

    // (10) plusYears(long yearsToAdd) to Add years to a date
        LocalDate futureYear = currentDate.plusYears(1);
        System.out.println("Current Date: " + currentDate);
        System.out.println("Future Year: " + futureYear);

    // (11) minusDays(long daysToSubtract) to Subtract days from a date
        LocalDate pastDate = currentDate.minusDays(10);
        System.out.println("Current Date: " + currentDate);
        System.out.println("Past Date: " + pastDate);

    // (12) minusMonths(long monthsToSubtract) to Subtract months from a date
        LocalDate pastMonth = currentDate.minusMonths(2);
        System.out.println("Current Date: " + currentDate);
        System.out.println("Past Month: " + pastMonth);

    // (13) minusYears(long yearsToSubtract) to Subtract years from a date
        LocalDate pastYear = currentDate.minusYears(1);
        System.out.println("Current Date: " + currentDate);
        System.out.println("Past Year: " + pastYear);
    }
}
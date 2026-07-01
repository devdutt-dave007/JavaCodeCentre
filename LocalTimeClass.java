import java.time.*;
public class LocalTimeClass
{
    public static void main(String[] args)
    {
    /*
    LocalTime class is part of the java.time package and is used to represent a time without date information
    LocalTime class provides various methods to create, manipulate, and format time values
    LocalTime class is immutable, which means that once a LocalTime object is created, it cannot be modified.
    Instead, you can create new LocalTime objects based on existing ones.
    LocalTime class provides methods to perform various operations on time values, such as getting the current time,
    creating specific times, parsing time strings, and performing time arithmetic.
    LocalTime class is commonly used in applications that require time manipulation, such as scheduling, clock applications,
    and time calculations.
    */

    // Get the current time
    // (1) now() method of LocalTime class is used to get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

    // (2) of() method of LocalTime class is used to create a specific time
    //LocalTime specificTime = LocalTime.of(hour, minute);
    //LocalTime specificTime = LocalTime.of(hour, minute, second);
    //LocalTime specificTime = LocalTime.of(hour, minute, second, nanosecond);
        LocalTime specificTime = LocalTime.of(14, 30);
        System.out.println("Specific Time: " + specificTime);
    //Exception in of() method
    // If you try to create a time with invalid values, it will throw a DateTimeException
        LocalTime invalidTime = LocalTime.of(25, 0); // Invalid hour value
    //Exception in thread "main" java.time.DateTimeException: Invalid value for HourOfDay (valid values 0 - 23): 25

    // (3) parse() method of LocalTime class is used to parse a time string and convert it into a LocalTime object
    //parse() method expects the time string to be in the format "HH:mm" or "HH:mm:ss" or "HH:mm:ss.nnnnnnnnn"
    //parse() method will throw a DateTimeParseException if the time string is not in the correct format or
    //if it contains invalid time values
    //parse() method will works only in ISO_LOCAL_TIME format which is "HH:mm" or "HH:mm:ss" or "HH:mm:ss.nnnnnnnnn"
    // LocalTime parsedTime = LocalTime.parse("HH:mm");
        LocalTime parsedTime = LocalTime.parse("14:30");
        System.out.println("Parsed Time: " + parsedTime);

    //Exception in parse() method
    // If you try to parse a time string is not in the correct format, it will throw a DateTimeParseException
        LocalTime invalidParsedTime = LocalTime.parse("2:30 PM");
    //Exception in thread "main" java.time.format.DateTimeParseException: Text '2:30 PM' could not be parsed at index 0
    // getting hour, minute, second, and nanosecond from a LocalTime object

    // (4) getHour(),getMinute(),getSecond(),getNano()
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        int nano = currentTime.getNano();
        System.out.printf("Hour: %d, Minute: %d, Second: %d, Nanosecond: %d%n", hour, minute, second, nano);
        System.out.printf("Current Time: %02d:%02d:%02d.%09d%n", hour, minute, second, nano);

    // (5) plusHours(long hoursToAdd) Add hours to a time
        LocalTime futureTime = currentTime.plusHours(2);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Future Time (after adding 2 hours): " + futureTime);

    // (6) plusMinutes(long minutesToAdd) Add minutes to a time
        LocalTime futureMinute = currentTime.plusMinutes(30);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Future Time (after adding 30 minutes): " +
                futureMinute);

    // (7) plusSeconds(long secondstoAdd) Add seconds to a time
        LocalTime futureSecond = currentTime.plusSeconds(45);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Future Time (after adding 45 seconds): " +
                futureSecond);

    // (8) plusNanos(long nanosToAdd) Add nanoseconds to a time

        LocalTime futureNano = currentTime.plusNanos(500000000); // Add 500 million nanoseconds (0.5 seconds)
        System.out.println("Current Time: " + currentTime);
        System.out.println("Future Time (after adding 500 million nanoseconds): "
                + futureNano);

    // (9) minusHours(long hoursToSubtract) Subtract hours from time
        LocalTime pastTime = currentTime.minusHours(1);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Past Time (after subtracting 1 hour): " + pastTime);

    // (10) minusMinutes(long minutesToSubtract) Subtract minutes from a time
        LocalTime pastMinute = currentTime.minusMinutes(15);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Past Time (after subtracting 15 minutes): " +
                pastMinute);

    // (11) minusSeconds(long secondsToSubtract)Subtract seconds from a time
        LocalTime pastSecond = currentTime.minusSeconds(30);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Past Time (after subtracting 30 seconds): " +
                pastSecond);

    // (12) minusNanos(long nanosToSubtract)Subtract nanoseconds from a time
        LocalTime pastNano = currentTime.minusNanos(200000000); // Subtract 200 million nanoseconds (0.2 seconds)
        System.out.println("Current Time: " + currentTime);
        System.out.println("Past Time (after subtracting 200 million nanoseconds): " + pastNano);

    }
}
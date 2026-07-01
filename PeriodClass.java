import java.time.*;
public class PeriodClass {
    public static void main(String[] args) {
//Period class is part of the java.time package and is used to represent a period of time in terms of years, months, and days
//Period class provides various methods to create, manipulate, and format periods of time
//Period class is immutable, which means that once a Period object is created, it cannot be modified.
// Instead, you can create new Period objects based on existing ones.
//Period class provides methods to perform various operations on periods of time, such as creating specific periods, parsing period strings, and performing period arithmetic.
//Period class is commonly used in applications that require manipulation of periods of time, such as calculating age, determining the difference between two dates, and adding or subtracting periods from dates.

// (1) of() method of Period class is used to create a specific period of time
// Period period = Period.of(years, months, days);
        Period period = Period.of(2, 3, 10);
        System.out.println("Period: " + period);//P2Y3M10D
        Period yearAndMonth = Period.of(1, 6, 0);
        System.out.println("Year and Month: " + yearAndMonth);//P1Y6M
//Example
        LocalDate joiningDate = LocalDate.of(2024, 8, 1);
        Period probationPeriod = Period.of(1, 6, 0);
        LocalDate confirmationDate = joiningDate.plus(probationPeriod);
        System.out.println("Employee Confirmation Date: " + confirmationDate);

//(2) ofDays() method of Period class is used to create a period of time based on a specified number of days
        Period daysPeriod = Period.ofDays(15);
        System.out.println("Days Period: " + daysPeriod);//P15D
//Example
        LocalDate issueDate = LocalDate.now();
        Period allowedDays = Period.ofDays(14);
        LocalDate dueDate = issueDate.plus(allowedDays);
        System.out.println("Book Issue Date: " + issueDate);
        System.out.println("Book Due Date: " + dueDate);

// (3) ofMonths() method of Period class is used to create a period of time based on a specified number of months
        Period monthsPeriod = Period.ofMonths(6);
        System.out.println("Months Period: " + monthsPeriod);//P6M
//Example
        LocalDate subscriptionStartDate = LocalDate.of(2024, 1, 1);
        Period subscriptionDuration = Period.ofMonths(6);
        LocalDate subscriptionEndDate = subscriptionStartDate.plus(subscriptionDuration);
        System.out.println("Subscription End Date: " + subscriptionEndDate);

// (4) ofYears() method of Period class is used to create a period of time based on a specified number of years
        Period yearsPeriod = Period.ofYears(3);
        System.out.println("Years Period: " + yearsPeriod);//P3Y

// (5) between() method of Period class is used to calculate the period between two LocalDate objects
//Example with dateOfBirth and current date
        LocalDate dateOfBirth = LocalDate.of(1990, 5, 15);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);
        System.out.println("Age: " + age);//P33Y3M13D

// (6) getYears() method of Period class is used to get the number of years in a Period object
        int years = age.getYears();
        System.out.println("Years: " + years);//33

// (7) getMonths() method of Period class is used to get the number of months in a Period object
        int months = age.getMonths();
        System.out.println("Months: " + months);//3

// (8) getDays() method of Period class is used to get the number of days in a Period object
        int days = age.getDays();
        System.out.println("Days: " + days);//13

    }
}

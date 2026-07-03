import java.util.*;//importing util package
public class Strings
{
    public static void main(String[] args)
    {
//Here we'll cover String, StringBuilder, StringBuffer and their respective methods
//1. String: String is a class in java that represents a sequence of characters.
//It is immutable, which means that once a String object is created, it cannot be modified.

    //Ways to create a String
        String str = "Hello World";//Directly creating a String
        String str1 = new String("Hello World");//Creating a String using new keyword
        String str2 = str + str1;//Creating a String using concatenation

    //Methods of String class

        //string.length() : returns the length of the string
        System.out.println(str.length());

        //string.charAt(index) : returns the character at the specified index
        System.out.println(str.charAt(0));

        //string.toUpperCase() : returns the string in uppercase
        System.out.println(str.toUpperCase());

        //string.toLowerCase() : returns the string in lowercase
        System.out.println(str.toLowerCase());

        //string.substring(startIndex, endIndex) : returns the substring starting from the specified startIndex and ending at the specified endIndex
        System.out.println(str.substring(0, 5));

        //string.replace(oldString, newString) : replaces the oldString with the newString in the string
        System.out.println(str.replace("World", "Java"));

        //string.contains(substring) : checks if the string contains the specified substring
        System.out.println(str.contains("World"));

        //string.startsWith(substring) : checks if the string starts with the specified substring
        System.out.println(str.startsWith("Hello"));

        //string.endsWith(substring) : checks if the string ends with the specified substring
        System.out.println(str.endsWith("!"));

        //string.equals(str) : checks if the string is equal to str or not
        //Note that unlike int, string '==' compares their reference addresses, not their values.
        //So to compare the values, we need to use equals()
        System.out.println(str.equals("Hello World"));

        //string.trim() : removes leading and trailing whitespace from the string
        System.out.println(str.trim());

        //string.split(delimiter) : splits the string into an array of substrings based on the specified delimiter
        String[] strArray = str.split(" ");
        //here we are splitting the string into an array of substrings based on the ' ' character
        for(int i=0; i<strArray.length; i++)
        {
            System.out.println(strArray[i]);
        }

        //string.concat(str) : concatenates the string with the specified string
        System.out.println(str.concat("!"));//adds ! to the end of the string

        // isEmpty() : checks whether the string is empty
        System.out.println(str.isEmpty());

        // indexOf() : first occurrence
        System.out.println(str.indexOf("o"));

        // lastIndexOf() : last occurrence
        System.out.println(str.lastIndexOf("o"));

        // equalsIgnoreCase() : ignores the case of the characters
        System.out.println(str.equalsIgnoreCase("hello world"));

        // compareTo() : compares the string with another string. Note that it is case sensitive
        System.out.println(str.compareTo("Hello"));

        // compareToIgnoreCase() : ignores the case of the characters
        System.out.println(str.compareToIgnoreCase("hello world"));

        // isBlank() : checks whether the string is blank or not
        String blank = "   ";
        System.out.println(blank.isBlank());

        // toCharArray() : converts the string to a character array
        char[] ch = str.toCharArray();
        for(char c : ch)
        {
            System.out.print(c + ", ");
        }

        // valueOf() : converts the object to a string
        int num = 123;
        String s = String.valueOf(num);
        System.out.println(s);

        // parseInt() : converts a string to an integer
        int number = Integer.parseInt("456");
        System.out.println(number);

//2.StringBuilder: StringBuilder is a class in java that represents a mutable sequence of characters.
//It is similar to String, but it is mutable.
//It is used to create a string and then modify it.
//It is faster than String for repeated modifications because it modifies the same object instead of creating a new object every time.
//It is not thread-safe, so it should not be used in multithreaded applications.

    //Ways to create a StringBuilder

        StringBuilder sb = new StringBuilder("Hello World");//Creating a StringBuilder using new keyword
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello World");//Creating a StringBuilder using append() method
        StringBuilder sb2 = new StringBuilder(str);//Creating a StringBuilder using a string
        StringBuilder sb3 = new StringBuilder(sb);//Creating a StringBuilder using another StringBuilder
        StringBuilder sb4 = new StringBuilder().append("Hello World");//Creating a StringBuilder using a chain of append() method
        //Note we cannot directly create a StringBuilder using a string literal like StringBuilder str = "Hello World";
        //We need to use the StringBuilder constructor or the append() method.

    //Methods of StringBuilder class

        //append(String str) : appends a string to the end of the StringBuilder
        sb.append("!");

        //insert(int index,String str) : inserts a string at the specified index
        sb.insert(0, "Hi ");

        //delete(int startIndex,int endIndex): deletes a substring from the specified index
        sb.delete(0, 2);

        //replace(int startIndex, int endIndex, String str): replaces a substring with a new string
        sb.replace(0, 2, "Goodbye ");

        //reverse(): reverses the order of the characters in the StringBuilder
        sb.reverse();

        //setCharAt(int index, char ch): sets the character at the specified index
        sb.setCharAt(0, 'H');

        //deleteCharAt(int index): deletes the character at the specified index
        sb.deleteCharAt(0);

        //length(): returns the length of the StringBuilder
        sb.length();

        //capacity(): returns the capacity of the StringBuilder
        //Default capacity is 16 characters.
        //When the current capacity is exceeded, Java automatically allocates a larger internal buffer using:
        //newCapacity = oldCapacity * 2 + 2
        StringBuilder a=new StringBuilder();
        System.out.println(a.capacity());//16
        StringBuilder b=new StringBuilder("Hello");
        System.out.println(b.capacity());//21 because default(16) + 5(Hello) = 21
        b.append(" World this is a test");
        System.out.println(b.capacity());//44
        // because the addition exceeds the original capacity of 21, so capacity = capacity * 2 + 2

        //charAt(int index): returns the character at the specified index
        System.out.println(sb.charAt(0));//H

        //substring(int startIndex, int endIndex): returns a substring from the specified index
        System.out.println(sb1.substring(0, 5));//Hello

        //toString(): returns the string representation of the StringBuilder
        String Str=sb.toString();
        System.out.println(Str);//Hello World! but as String not StringBuilder

        //indexOf(String str): returns the index of the first occurrence of the specified string
        System.out.println(sb1.indexOf("o"));//4

        //lastIndexOf(String str): returns the index of the last occurrence of the specified string
        System.out.println(sb1.lastIndexOf("o"));//7

        //ensureCapacity(int capacity): ensures that the StringBuilder has at least the specified capacity
        StringBuilder temp=new StringBuilder();
        temp.ensureCapacity(100);
        System.out.println(temp.capacity());//100

        //trimToSize(): reduces the capacity of the StringBuilder to the current length
        temp.append("Hello World");
        System.out.println(temp.capacity());//100
        temp.trimToSize();
        System.out.println(temp.capacity());//11

        //setLength(int length): sets the length of the StringBuilder to the specified length
        temp.setLength(5);
        System.out.println(temp);//Hello
        System.out.println(temp.length());//5


//3. StringBuffer
// StringBuffer is similar to StringBuilder but it is thread-safe.
// It uses synchronization, making it safe for multithreaded applications.
// Due to synchronization, it is slower than StringBuilder.
// Methods of StringBuffer are almost identical to StringBuilder.

    //Ways to create a StringBuffer

        StringBuffer sbf = new StringBuffer("Hello");

    //StringBuffer methods

        // append() : adds a string to the end of the StringBuffer
        sbf.append(" World");
        System.out.println(sbf);

        // insert() : inserts a string at the specified index
        sbf.insert(5, " Java");
        System.out.println(sbf);

        // reverse() : reverses the order of the characters in the StringBuffer
        sbf.reverse();
        System.out.println(sbf);

        // capacity() : returns the capacity of the StringBuffer
        System.out.println(sbf.capacity());

//4. Comparison between String, StringBuilder and StringBuffer
/*
-------------------------------------------------------------
Feature          String      StringBuilder     StringBuffer
-------------------------------------------------------------
Mutable             No             Yes              Yes
Thread Safe         Yes(Immutable)  No              Yes
Performance         Slow           Fast           Moderate
Synchronization     Not applicable  No              Yes
Best Used For       Fixed text   Single thread   Multiple threads
-------------------------------------------------------------

*String is immutable, so it is inherently thread-safe.
*/
    }
}

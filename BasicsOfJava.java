import java.util.*;//This statement is used to import all the classes from the java.util package
public class BasicsOfJava //this is the syntax to create a class
{
    //Any variable declared inside a class is called instance variable
    int a;//can be accessed by any class. Note that the default value of 'a' is 0.
    public static void main(String[] args) //This is the syntax to create a method
    {
        //Data types
        //1.Integer (int): ranges from -2,147,483,648 to 2,147,483,647
        int x = 0; // syntax to declare a variable as integer and assign a value(0) to it.

        //2.Long (long): ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long y = 1000000000000000000L;

        //3.Float (float): ranges from 1.4E-45 to 3.4028235E38
        float z = 1.23456789f;

        //4.Double (double): ranges from 4.9E-324 to 1.7976931348623157E308
        double a = 1.23456789;

        //5.Boolean (boolean): true or false
        boolean b = true;

        //6.Character (char): a single character
        char c = 'A';

        //7.String (String): a sequence of characters
        String s = "Hello World!";

        //8.Object (Object): a reference to an object
        Object o = new Object();

        //printing statements
        System.out.println("Hello World!");//prints Hello World! on the console
        System.out.println(x);//prints the value of x on the console

        //Type casting
        //1.Implicit type casting
        int num1 = 10;
        double num2 = num1;
        System.out.println(num1);//prints 10 on the console 10 is an integer
        System.out.println(num2);//prints 10.0 on the console 10 is a double

        //2.Explicit type casting
        double num3 = 10.5;
        int num4 = (int)num3;
        System.out.println(num3);//prints 10.5 on the console 10.5 is a double
        System.out.println(num4);//prints 10 on the console 10.5 is a double and 10 is the integer representation of 10.5

        //Operators
        //Arithmetic operators
        //1.Addition (+)
        int sum = 10 + 20;
        System.out.println(sum);
        //2.Subtraction (-)
        int difference = 10 - 20;
        System.out.println(difference);
        //3.Multiplication (*)
        int product = 10 * 20;
        System.out.println(product);
        //4.Division (/)
        int quotient = 10 / 20;
        System.out.println(quotient);//prints 0 cause 10/20=0.5 and 0.5 is not an integer, hence it is rounded down to 0
        //5.Modulus (%)
        int remainder = 10 % 20;
        System.out.println(remainder);

        //Logical operators
        //1.AND (&&)
        System.out.println(true && true);//prints true
        System.out.println(true && false);//prints false
        //2.OR (||)
        System.out.println(true || false);//prints true
        System.out.println(false || false);//prints false
        //3.NOT (!)
        System.out.println(!true);//prints false

        //Math functions
        //1.Math.abs()
        System.out.println(Math.abs(-10));//prints 10
        //2.Math.sqrt()
        System.out.println(Math.sqrt(9));//prints square root of 9
        //3.Math.pow()
        System.out.println(Math.pow(2, 3));//prints 2 to the power of 3
        //4.Math.max()
        System.out.println(Math.max(10, 20));//prints the maximum of 10 and 20
        //5.Math.min()
        System.out.println(Math.min(10, 20));//prints the minimum of 10 and 20
        //6.Math.random()
        System.out.println(Math.random());//prints a random number between 0.0 and 1.0
        //7.Math.round()
        System.out.println(Math.round(10.5));//prints the nearest integer to 10.5

        //Increment and decrement operators
        int num5 = 10;
        //post-increment
        System.out.println(num5);//prints 10
        System.out.println(num5++);//prints 10 and then increments num5 by 1
        System.out.println(num5);//prints 11
        //pre-increment
        System.out.println(++num5);//increments num5 by 1 and then prints the new value
        System.out.println(num5);//prints 12

        //post-decrement
        System.out.println(num5);//prints 12
        System.out.println(num5--);//prints 12 and then decrements num5 by 1
        System.out.println(num5);//prints 11
        //pre-decrement
        System.out.println(--num5);//decrements num5 by 1 and then prints the new value
        System.out.println(num5);//prints 10

        //conditional statements
        //1, if,else-if,else statements
        if(x > 0)//checks whether x is greater than 0
        {
            System.out.println("x is positive");
        }
        else if(x == 0)
        {
            System.out.println("x is zero");
        }
        else //if x is not greater than 0, then this block of code will be executed
        {
            System.out.println("x is negative");
        }

        //2.Ternary operator (_?_:_)
        String answer = x>0?"Positive":"Negative"; //If x is greater than 0, then the value of answer will be "Positive", otherwise it will be "Negative"
        System.out.println(answer);

        //3.Switch statement
        int num = 5;
        switch(num){
            case 1://executes the code inside the block if num1 is equal to 1
                System.out.println("num is 1");
                break;//breaks out of the switch statement after executing the code inside the block
            case 2:
                System.out.println("num is 2");
                break;
            case 3:
                System.out.println("num is 3");
                break;
            case 4:
                System.out.println("num is 4");
                break;
            case 5:
                System.out.println("num is 5");
                break;
            default: System.out.println("num1 is not 1,2,3,4,5");
        }

        //Loops
        //1.for loop
        for(int i=0;i<10;i++)//prints 0,1,2,3,4,5,6,7,8,9 on the console
        {
            System.out.println(i);
        }

        //2.while loop
        int j=0;
        while(j<10)
        {
            System.out.println(j);
            j++;
        }

        //3.do-while loop
        int k=0;
        do
        {
            System.out.println(k);
            k++;
        }
        while(k<10);

        //4.break and continue statements
        for(int l=0;l<10;l++)//prints 0,1,2,3,4 on the console
        {
            if(l==5)
            {
                break;//breaks out of the loop when l is equal to 5
            }
            System.out.println(l);
        }

        for(int m=0;m<10;m++)//prints 0,1,2,3,4,6,7,8,9 on the console
        {
            if(m==5){
                continue;//skips the current iteration when m is equal to 5 and continues with the next iteration
            }
            System.out.println(m);
        }

        //Arrays and their methods
        int[] arr = new int[5];//declares an array of size 5 and initializes all its elements to 0
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for(int n=0;n<5;n++)
        {
            System.out.println(arr[n]);
        }

        //few Methods of Arrays
        Arrays.sort(arr);//sorts the elements of the array in ascending order
        System.out.println(Arrays.toString(arr));//prints the elements of the array in a string format
        System.out.println(Arrays.binarySearch(arr, 30));//searches for the index of the specified element in the array(here 30)
        System.out.println(Arrays.equals(arr, new int[]{10,20,30,40,50}));//checks whether two arrays are equal
        System.out.println(arr.length);//returns the length of the array

        //Input statements and Scanner class
        Scanner sc = new Scanner(System.in);//creates a Scanner object to read input from the console
        System.out.println("Enter a number: ");
        int number = sc.nextInt();//reads an integer from the console
        System.out.println("You entered: " + number);
    }
}

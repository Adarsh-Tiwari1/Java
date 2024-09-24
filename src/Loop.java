/*
import java.util.Scanner;

public class Do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            System.out.println("press 1 to continue");
            System.out.println("press 0 to exit");
            option = sc.nextInt();
        }while (option !=0);
    }
}
*/

// wap to sum all the entered value until user enter 0 to stop.

/*
import java.util.Scanner;

public class Do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int userInput;
        int count = 0;
        int uerInputCounter = 0;
        do{
            System.out.println("enter an integer");
            userInput = scanner.nextInt();
            uerInputCounter++;
            if(userInput<=100) {
                sum = sum + userInput;
            }else {
                count++;
            }
        }while (userInput !=0);
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);
        System.out.println("uerInputCounter = " + uerInputCounter);
    }
}
*/


/*
import java.util.Random;

public class Do {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            System.out.print(random.nextInt(1000) + " " );
            if(i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
 */

// wap to accept parameter of the circle on the user and print the radius of hte circle.
/*
import java.util.Scanner;

public class Do {
    public static void main(String[] args) {
        System.out.println("enter circumference of circle");
        Scanner sc = new Scanner(System.in);
        double circumference = sc.nextDouble();
        // 2 * pi * r
        // r = c / 2 (2 * 3.14)
        double redius = circumference / (2 * 3.14);
        System.out.println("radius = " + redius);
    }
}
*/
// wap to print the maximum value from all the given input, util user enter 0 to stop.

/*
import java.util.Scanner;

public class Do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int userInput;
        do{
            System.out.println("enter an ingeger , enter 0 to stop");
            userInput = sc.nextInt();
            if(userInput > max){
                max = userInput;
            }
        }while (userInput !=0);
        System.out.println("max value= " + max);
    }
}
 */

// //  WHILE

// wap to accept a number from user and print no digit of number .
/*
import java.util.Scanner;

public class Do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an ingeger number");
        int number = sc.nextInt();
        int coutn = 0;
        while (number > 0){
            number = number / 10;
            coutn++;
        }
        System.out.println("digit count = " + coutn);
    }
}
 */



// digit extraction
/*
import java.util.Scanner;

public class Do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        int number  = sc.nextInt();
        while (number !=0){
            int digit = number % 10;
            number = number / 10;
           // System.out.println("digit =" +
           // System.out.print(digit + ",");
            System.out.println(digit + ",");
            if(number >10){
                System.out.println(",");
            }
        }
    }
}
 */

// coutn even digit number given by user
// sum of power of digit 1234  1^2+2^3+3^4+4^0    : math.pow(x,y);
/*
import java.util.Scanner;
public class Do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        int digitCount = 0;
        int sum = 0;
        while(number != 0){
            // digit nikalni hai
            int digit = number % 10;
            // discarded the last digit
            number = number /10;
            //check if the digit is even
            if(digit % 2 != 0){
                digitCount++;
                sum = sum + digit;
            }
        }
        System.out.println("digitCount = " + digitCount);
        System.out.println("sum = " + sum);
    }
}
 */




/*
public class Pattern {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

/*
public class Pattern {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

/*
public class Pattern {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

// prime number
/*
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an ingeger");
        int num = sc.nextInt();
        int count = 0;

        // prime - those number which are divisible by itself and one .
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            // check count if 2 prime , more than not prime
            if (count == 2) {
                System.out.println("prime number");
            } else {
                System.out.println("not a prime number");
            }

        }
    }
 */



/*
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=5 && num<=11){
            System.out.println("good morning");
        }else if(num>=12 && num<=17){
            System.out.println("good ofternoon");
        }else if(num>=18 && num<=21){
            System.out.println("good evening");
        }else if(num>=22 && num<=24){
            System.out.println("good night");
        }else{
            System.out.println("thank you sir");
        }
    }
}
 */
/*
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = 0;
        String name = null;
        for(int i=0;i<5;i++){
            num=sc.nextInt();
            name = sc.nextLine();

        }
        System.out.println(num);
        System.out.println(name);
    }
}

 */

/*
import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = 0;
        String name = null;
        for(int i=0;i<5;i++){
            num=sc.nextInt();
            sc.nextLine();
            name = sc.nextLine();

        }
        System.out.println(num);
        System.out.println(name);
    }
}
 */

/*
public class Pattern {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

/*
public class Pattern {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

/*
public class Pattern {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

// prime number
/*
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an ingeger");
        int num = sc.nextInt();
        int count = 0;

        // prime - those number which are divisible by itself and one .
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            // check count if 2 prime , more than not prime
            if (count == 2) {
                System.out.println("prime number");
            } else {
                System.out.println("not a prime number");
            }

        }
    }
 */

/*
import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int atten,total;
        System.out.println("enter total class");
        atten = sc.nextInt();
        System.out.println("enter atten class");
        total=sc.nextInt();
        float attenPer = atten*total/100;
        if(attenPer>=75){
            System.out.println("you sit in exam");
        }else{
            System.out.println("you are not sit in exam");
        }
    }
}
 */

/*
import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        int Totaldays;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total daya");
        Totaldays=sc.nextInt();
        int year = Totaldays/365; // 400
        int temp = Totaldays%365; // 35
        int month = temp/30; // 1
        int days = temp%30; // 5
        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("days = " + days);
    }
}
 */

/*
import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        int TotalDays;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter totalDays");
        TotalDays = sc.nextInt(); // 500
        int year = TotalDays/365; // 1
        int month = (TotalDays%365)/30; // 4
        int week = ((TotalDays%365)%30)/7;
        int days = ((TotalDays%365)%30)%7;
        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("week = " + week);
        System.out.println("days = " + days);
    }
}
 */

/*
import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        if(num%5==0 && num%7==0){
            System.out.println("this number devide by 5 and 7");
        }else{
            System.out.println("Can't devide by 5 and 7 this number");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int num = sc.nextInt();

    }
}
 */

/*
import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        int year=0;
        year=sc.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("leap year");
        }else{
            System.out.println("not leap year");
        }
    }
}
 */

/*
import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your password");
        int password = sc.nextInt();
        if(password==0){
            System.out.println("enter your otp");
            int otp = sc.nextInt();
            System.out.println("enter your opt");
            if(otp==00){
                System.out.println("congrulation");
            }else {
                System.out.println("wrong opt , please enter corrent otp");
            }
        }else {
            System.out.println("wrong password");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        int Number , count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        Number = sc.nextInt();
        for(int i=2;i<Number/2;i++){
            if(Number%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
*/


/*
public class Logic {
    public static void main(String[] args) {
        int a = 2;
        if(0){
            System.out.println("hello");
        }else{
            System.out.println("hii");
        }
    }
}
 */

/*
public class Logic {
    public static void main(String[] args) {
        int a = 2;
        if(true){
            System.out.println("hello");
        }else{
            System.out.println("hii");
        }
    }
}
 */

/*
public class Logic {
    public static void main(String[] args) {
        int a = 2;
        if(false){
            System.out.println("hello");
        }else{
            System.out.println("hii");
        }
    }
}
 */

/*
public class Logic {
    public static void main(String[] args) {
        while(1){
            System.out.println("hello");
        }
    }
}
 */

/*
public class Logic {
    public static void main(String[] args) {
        while(true){
            System.out.println("hello");
        }
    }
}
 */

/*
public class Logic {
    public static void main(String[] args) {
        while(false){
            System.out.println("hello");
        }
    }
}
 */

/*
public class Logic {
    public static void main(String[] args) {
        long a = 10;
        float b = 20;
        double c = 30;
        float f = 50.1234f;
        double d = 40.12345678912345;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
    }
}
 */

/*
public class Logic {
    public static void main(String[] args) {
        char ch = 97;
        System.out.println(ch);
    }
}
 */

/*
public class Logic {
    public static void main(String[] args) {
        char ch = 19710;
        System.out.println(ch);
    }
}
 */

/*
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        System.out.println("select the month from the given list");
        System.out.println("1 for january");
        System.out.println("2 for february");
        System.out.println("3 for march");
        System.out.println("4 for april");
        System.out.println("5 for may");
        System.out.println("6 for june");
        System.out.println("7 for july");
        System.out.println("8 for august");
        System.out.println("9 for sepeember");
        System.out.println("10 for october");
        System.out.println("11 for november");
        System.out.println("12 for december");

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:  // swith fal through

                System.out.println("31 days");
                break;
            case 6:
                System.out.println("30 days");
                break;
            case 11:
                System.out.println("31 days");
                break;
            case 12:
                System.out.println("30 days");
        }
    }
}
 */


import java.util.Scanner;
public class Switch {
    public static  void main(String[] args){
        // WAP to print nameof the day, when user entered the week day
        System.out.println("Select from the below choices:");
        System.out.println("Press 1 for 1st day of the week");
        System.out.println("Press 2 for 2nd day of the week");
        System.out.println("Press 3 for 3rd day of the week");
        System.out.println("Press 4 for 4th day of the week");
        System.out.println("Press 5 for 5th day of the week");
        System.out.println("Press 6 for 6th day of the week");
        System.out.println("Press 7 for 7th day of the week");
        System.out.println("Press 0 to exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Exiting......");
                break;
        }
    }
}


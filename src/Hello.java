/*
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello java");
    }
}
 */

/*
public class Hello {
    public static void main(String[] args){
        System.out.println(""+10+20+1);
    }
}
*/

/*
public class Hello{
    public static void main(String[] args) {
        System.out.println('a'+1+2);
    }
}
 */


/*
public class Hello{
    public static void main(String[] args) {
        System.out.println(''+1+2);
    }
}
 */

/*
public class Hello{
    public static void main(String[] args){
        System.out.println(10+20+1);
    }
}
 */

/*
public class Hello{
    public static void main(String[] args){
        double marks;    // declare variable
        int age;
        char section;
        marks = 40.5;    // initilaize
        age = 40;
        section = 'c';
        String name = "adarsh tiwari";
        System.out.println("marks =" + marks);
        System.out.println("age = " + age);
        System.out.println(("section = " + section));
        System.out.println("name =" + name);
    }
}
*/

/*
public class Hello{
    public static void main(String[] args){
        String name = "adarsh tiwari";
        String email = "adarshrewa46@gmail.com";
        String num = "7805930416";
        long number = 7805930416L;
        System.out.println("my name is :" + name);
        System.out.println("email :" + email);
        System.out.println("mobile number is :" + num);
        System.out.println("mob. nu. is :" + number);
    }
}
*/

/*
public class Hello{
    public static void main(String[] args){
        int n = 41661;
        short s = 3276;
        long l = 123456456123L;
        byte b = 127;
        double d = 1235685;
        System.out.println(n);
        System.out.println(s);
        System.out.println(l);
        System.out.println(b);
        System.out.println(d);
    }
}
 */

/*
public class Hello{
    public static void main(String[] args){
        boolean bo = true;
        byte by = -128;
        char ch = 'a';
        short so = 32767;
        int in = 123456789;
        long lo = 1234567891234567L;
        float fo = 12.123f;
        double dou = 1234123456789123d;
        System.out.println(bo);
        System.out.println(by);
        System.out.println(ch);
        System.out.println(so);
        System.out.println(in);
        System.out.println(lo);
        System.out.println(fo);
    }
}
*/

/*
    public class Hello{
        public static void main(String[] args){
            float fo = 12.1234567f;
            System.out.println(fo);
        }
    }
 */

/*
import java.util.Scanner;
public class Hello{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //  // create Scanner class object
        int number1 = scanner.nextInt();    // store integer number
        float temp = scanner.nextFloat();  // store float number
        System.out.println(number1);
        System.out.println(temp);
    }
}
 */

/*
import java.util.Scanner;
public class Hello {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next(); //  //next();
        System.out.println("name = " + name);
    }
}
 */

/*
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();  //  // nextLine();
        System.out.println("name = " + name);
    }
}
 */

/*
public class Hello {
    public static void main(String[]args){
      int num = 0; // initialize will be must  .
        num = num + 10;
        System.out.println(num);
    }
}
 */

/*
import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        int num  = sc.nextInt();      // object create
        if(num>100){
            System.out.println("number = "+ num);
        }
        System.out.println("Thank you");
    }
}
 */

/*
import java.util.Scanner;
public class Hello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the withdrawal amount");
        int amo = sc.nextInt();
        int balance = 5000;
        if(amo <= balance){
            System.out.println("withdrawal permitted");
        }
        System.out.println("thank you ");
    }
}
 */

/*
import java.util.Scanner;
class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the withdrawal amount");
        int withdrawalAm = sc.nextInt();
        int balance = 5000;
        if(withdrawalAm <= balance){
            System.out.println("withdrawal permitted");
        }else{
            System.out.println("withdrawal not permitted");
        }
        System.out.println("thank you");
    }
}
 */

/*
public class Hello {
    public static void main(String[]args){
        byte a = 10;
        byte b = 20;
        int c = a+b;
        System.out.print(c);
    }
}
 */

/*
public class Hello {
    public static void main(String args[]){
       int x = 0786; // octal range
        System.out.println(x);
    }
}
 */

/*
public class Hello {
    public static void main(String...args){
        System.out.print("a"+"a"+'a');
    }
}
 */

/*
import java.util.Scanner;
public class Hello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number");
        int intNumber = sc.nextInt();

        System.out.println("Enter float number");
        float floatNumber = sc.nextFloat();

        System.out.println("Enter String");
        String string = sc.nextLine();  // why this program not input string value

        System.out.println(intNumber);
        System.out.println(floatNumber);
        System.out.println(string);
    }
}
 */


/*
import java.util.Scanner;
public class Hello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number");
        int intNumber = sc.nextInt();

        System.out.println("Enter float number");
        float floatNumber = sc.nextFloat();

        sc.nextLine();   // Consuming the leftover newline
        System.out.println("Enter String");
        String string = sc.nextLine();

        System.out.println(intNumber);
        System.out.println(floatNumber);
        System.out.println(string);
    }
}
 */

/*
public class Hello {
    public static void main(String args[]){
        System.out.print('a'<'b');
    }
}
 */

/*
public class Hello{
    public static void main(String args[]){
        int num = 5;
        num++;
        System.out.println(num);
    }
}
 */

/*
public class Hello{
    public static void main(String args[]){
        int num = 5++;
        // 5 is a literal, not a variable, and literals are immutable,
        // meaning you cannot apply the ++ operator directly to a literal.
        System.out.println(num);
    }
}
 */

/*
public class Hello{
    public static void main(String args[]){
        int num = 5;
        num++;
        int num2 = num++;
        System.out.println(num);
        System.out.println(num2);
    }
}
 */

/*
public class Hello{
    public static void main(String args[]){
        int num = 5;
        num++;
        int num2 = num--;
        System.out.println(num);
        System.out.println(num2);
    }
}
 */

/*
public class Hello{
    public static void main(String args[]){
        int num = 5;
        num++;
        int num2 = --num;
        System.out.println(num);
        System.out.println(num2);
    }
}
 */

/*
public class Hello{
    public static void main(String args[]){
        float num = 5;
        num++;
        float num2 = --num;
        System.out.println(num);
        System.out.println(num2);
    }
}
 */

/*
public class Hello{
    public static void main(String args[]){
        float num = 5;
        num++;
        float num2 = --num;
        char c ='z';
        char a ='a';
        c++;
        a++;
        System.out.println(num);
        System.out.println(num2);
        System.out.println(c);
        System.out.println(a);
    }
}
 */

/*
public class Hello {
    public static void main(String args[]){
        float num = 5;
        num++;
        float num2 = --num;
        char c ='c';
        char a ='a';
        c++;
        a++;
        System.out.println(num);
        System.out.println(num2);
        System.out.println((int)c);
        System.out.println(a);
    }
}
 */

/*
public class Hello {
    public static void main(String args[]){
        float num = 5;
        //num++;
        float num2 = --num;
        char c ='c';
        char a ='a';
        char A ='A';
        c++;
        a++;
        System.out.println(num);
        System.out.println(num2);
        System.out.println((int)c);
        System.out.println(a);
        System.out.println((int)A);
    }
}
 */

/*
public class Hello {
    public static void main(String args[]){
        int max = Integer.MAX_VALUE;   /// Integer is a class , MAX_VALUE constant
        System.out.println(max+1);
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(max);
        System.out.println(max+max);
    }
}
 */

/*
public class Hello {
    public static void main(String[] args) {
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;

        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;

        long lognMax = Long.MAX_VALUE;
        long longMin = Long.MAX_VALUE;


        System.out.println("ingeger max value = " + intMax);
        System.out.println("ingeger min value = " + intMin);

        System.out.println("float max value = " + floatMax);
        System.out.println("float min value = " + floatMin);

    }
}
 */

/*
import java.util.Scanner;
public class Hello {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
       int a = sc.nextInt();
       int b = sc.nextInt();
        System.out.println(a + b);
    }
}
 */

/*
public class Hello{
    public static void main(String args[]){
        byte b = 127;
        byte b1 = -128;
        short s = 32767;
        short s1 = -32768;
        int i = 2147483647;
        int i1 = -2147483648;
        long l = 1234567891234567891L;
        float f = 12345.123456f;
        double d = 123456.1234567891234565f;
        System.out.println(b);
        System.out.println(b1);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(i);
        System.out.println(i1);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
 */

/*
public class Hello {
    public static void main(String args[]){
        System.out.print("adarsh" + " tiwari");
    }
}
 */

/*
import java.util.*;
public class Hello {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();
    String name = sc.next();
    int num = sc.nextInt();
    System.out.print(no+name+num);
    }
}
 */

 /*
public class Hello {
    public static void main(String args[]){
        if a = 10;                             // if is reserved word
        System.out.print(a);
    }
}
  */

/*
public class Hello {
    public static void main(String...args){
        short a =(byte)129;
        short b =(byte)128;
        System.out.println(a);
        System.out.println(b);
    }
}
 */

/*
public class Hello {
    public static void main(String...args){
      //  boolean a = 0; // boolean accept only true and false value
        boolean b = false;
        System.out.print(b);
    }
}
 */

/*
public class Hello {
    public static void main(String args[]){
        System.out.println("Int max size in bit = " + Integer.SIZE);  // 32 bit  // 4 byte
        System.out.println("float max size in bit = " + Float.SIZE);
        System.out.println("char size in bit = " + Character.SIZE); // 16 bit  // 2 byte
    }
}
 */

/*
public class Hello {
    public static void main(String args[]) {
        System.out.print('a' + 'a' + "a"+'a'+"adarsh");
    }
}
 */

/*
public class Hello {
    public static void main(String args[]){
        System.out.print('b'-'a'+'a'+"a"+'a'+'a');
    }
}
 */

/*
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter indian rupee");
        int ch = sc.nextInt();
        System.out.println(ch*82); // convert dollar to indian rupees
    }
}
 */

/*
public class Hello {
    public static void main(String[] args) {
        for(char i=0;i<=255;i++){
            System.out.println(i + "\t = " + (int)(i)); // print ascii value

        }
    }
}
 */

/*
public class Hello {
    public static void main(String[] args) {
        System.out.println("we will not use 'basic , word'");
        System.out.println("basic 'java' with me");
        System.out.println(); // allowed

    }
}
 */

/*
public class Hello {
    public static void main(String[] args) {
        int String = 10;
        System.out.println(String);
    }
}
 */

/*
public class Hello {
    public static void main(String[] args) {
        int Array = 10;
        System.out.println(Array);
    }
}
 */

/*
public class Hello {
    public static void main(String[] args) {
        boolean String = true;
        boolean string = false;
        System.out.println(String);
        System.out.println(string);
    }
}
 */

/*
public class Hello {
    public static void main(String[] args) {
        char String = 'a';
       // char string = 'aa'; // char only stored single character
        char ch = 10000;
        System.out.println(String);
        System.out.println(ch);
    }
}
 */

/*
public class Hello {
    public static void main(String[] args) {
        boolean a = (true || false);
        boolean b = (true && false);
        boolean c = (true != false);
        boolean d = (true == false);
        boolean e = true;
        boolean f = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
 */





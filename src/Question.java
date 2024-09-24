
/*
import java.util.Scanner;
public class Question{ // can be improved, right now considered
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc can't be considered
        System.out.println("enter subject 1 number");
        int sub1 = sc.nextInt(); // non meaningful name
        System.out.println("enter subject 2 number");
        int sub2 = sc.nextInt();
        System.out.println("enter subject 3 number");
        int sub3 = sc.nextInt();
        int totalMarkSsubject = sub1 + sub2 + sub3;
        double result = totalMarkSsubject / 3; // wrong calculation int / int will result in int
        // this is not a result, it is percentage
        if(result >= 90){
            System.out.println("A gread");
        }else if(result >= 80 && result <= 89){
            System.out.println("B gread");
        }else if(result >= 70 && result <= 79){
            System.out.println("C gread");
        }else if(result >= 60 && result <= 69){
            System.out.println("D gread");
        }else{
            System.out.println("no gread allocated");
        }
    }
}

 */


// correct rule
   /*
import java.util.Scanner;
class red{ // can be improved, right now considered
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter subject 1 number");
        double physice = scanner.nextDouble();
        System.out.println("enter subject 2 number");
        double chemistry = scanner.nextDouble();
        System.out.println("enter subject 3 number");
        double math = scanner.nextDouble();
        double totalMarkSsubject = physice + chemistry + math;
        double result = totalMarkSsubject / 3;
        if(result >= 90){
            System.out.println("A gread");
        }else if(result >= 80 && result <= 89){
            System.out.println("B gread");
        }else if(result >= 70 && result <= 79){
            System.out.println("C gread");
        }else if(result >= 60 && result <= 69){
            System.out.println("D gread");
        }else{
            System.out.println("no gread allocated");
        }
    }
}
   */


// calculator using if else statenmet ..
/*
import java.util.Scanner;
class red{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 for addition , 2 for substraction , 3 for multiplaction , 4 for division , and press 5 to exit");
        int ch = sc.nextInt();
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        if(ch == 1){
            System.out.println(a+b);
        }else if(ch == 2){
            System.out.println(a-b);
        }else if(ch == 3){
            System.out.println(a*b);
        }else if(ch==4){
            System.out.println(a/b);
        }else if(ch==5){
            System.out.println("exit");
        }else{
            System.out.println("thank you");
        }
    }
}
  */


//import java.io.InputStream;


//import java.io.InputStream;

/*
import java.util.Scanner;
class switc{
    public static void main(String[] args) {
    System.out.println("select form the blow choices");
    System.out.println("press 1 for 1st day of the week");
    System.out.println("press 2 for 1st day of the week");
    System.out.println("press 3 for 1st day of the week");
    System.out.println("press 4 for 1st day of the week");
    System.out.println("press 5 for 1st day of the week");
    System.out.println("press 6 for 1st day of the week");
    System.out.println("press 7 for 1st day of the week");
    System.out.println("press 0 to exit");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    switch(choice){
        case 1:
        System.out.println("sunday");
        break;
        case 2:
        System.out.println("mon");
        break;
        case 3:
        System.out.println("tues");
        break;
        case 4:
        System.out.println("wed");
        break;
        case 5:
        System.out.println("thu");
        break;
        case 6:
        System.out.println("fri");
        break;
        case 7:
        System.out.println("sat");
        break;
        case 0:
        System.out.println("exit...");
        break;
        default:
        System.out.print("byy");
    }
 }
}
 */

// finding weather the given month is having 31 or 30 or 29/28 days
//import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;
/*
import java.util.Scanner;

class switc {

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
class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if(ch%2==0){
            System.out.println(ch+" number is even");
        }else{
            System.out.println(ch+" number is odd");
        }
    }
}

/*
class hello{
    public static void main(String[] args) {
        if(8){
            System.out.println("hello");
        }else{
            System.out.println("byy");
        }
    }
}
    */

// find greatest number in 3 value
/*
  import java.util.Scanner;
  class  hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a + "is greater");
        }else if(b>a && b>c){
            System.out.println(b + "is greager");
        }else{
            System.out.println(c + "is greater");
        }
    }
  }
    */


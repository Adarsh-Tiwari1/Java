//1
/*
public class ArrayQuestion{
    public static void main(String[] args){
        int[] arrayData = {10,20,30,40,50};
        for(int i = 0; i<arrayData.length; i++){
            System.out.print(arrayData[i]);
            if(i != arrayData.length-1){
                System.out.print(", ");
            }
        }
    }
}
 */
//1
/*
import java.util.Scanner;

public class ArrayQuestion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Stored element");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
    }
}
*/
//2
/*
public class ArrayQuestion {
    public static void main(String[] args) {
        int sum = 0;
        int[] sumNumber = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<sumNumber.length;i++){
            sum = sum + sumNumber[i];
        }
        System.out.println("total sum = " + sum);
    }
}
 */
//2
/*
import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[10];
        System.out.println("Enter number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Total sum = " + sum);
    }
}
 */
//3
/*
public class ArrayQuestion {
    public static void main(String[] args) {
        float sum = 0;
        float[] arr = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f};
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // calculate the average
        float average = sum / arr.length;
        System.out.println("Total average = " + average);
    }
}
 */
//3
/*
import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[7];
        System.out.println("Enter float element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextFloat();
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // cal. average
        float average = sum / arr.length;
        System.out.println("Total average = " + average);
    }
}
 */
//4
/*
public class ArrayQuestion {
    public static void main(String[] args) {
        float[] arr = {2.5f, 3.8f, 1.9f, 5.6f, 4.3f};
        float minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        System.out.println("minimun float number = " + minimum);
    }
}
 */
//4
/*
import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[5];
        System.out.println("enter emement");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextFloat();
        }
        float min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min value = " + min);
    }
}
 */
//5
/*
public class ArrayQuestion {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 19, 7, 26, 14};
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        System.out.println("minimun  number = " + maximum);
    }
}
*/
//5
/*
import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter emement");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > min){
                min = arr[i];
            }
        }
        System.out.println("min value = " + min);
    }
}
*/
//6
/*
public class ArrayQuestion {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Original Element");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();  // new line after the first loop

        System.out.println("reverse element");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
    }
}
 */
// 6
/*
import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = new char[5];
        System.out.println("enter element");
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0); // input from user
            System.out.println("original element = " + ch[i]);
        }
        for (int i = ch.length-1; i >= 0 ; i--) {
            System.out.println("reverse element = " + ch[i]);
        }
    }
}
 */

//7
/*
import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 8, 15, 16, 23, 42};

        System.out.println("search element");
       int searchElement = sc.nextInt();
       int index = -1;

       for(int i = 0;i<arr.length;i++){
           if(arr[i]==searchElement){
               index = i;
           }
       }
       if(index !=-1){
           System.out.println("Element " + searchElement + " found at index " + index);
       }else {
           System.out.println("Element" + searchElement + "found at index " + index);
       }
    }
}
 */

// 8

/*
public class ArrayQuestion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {arr.length};
        for (int i = 0; i < arr.length; i++) { // copy all element one array to another array
            arr1 = arr;
        }
        System.out.println("element of original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("double cate array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
 */

// 9
/*
public class ArrayQuestion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
        }
        System.out.println("Total even element sum  = " + sum);
    }
}
 */
//9
/*
import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        System.out.println("enter element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
        }
        System.out.println("total even sum = " + sum);
    }
}
 */


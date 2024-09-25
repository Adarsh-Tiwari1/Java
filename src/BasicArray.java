/*
public class BasicArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
 */

/*
public class BasicArray {
    public static void main(String[] args) {
        boolean[] arr = new boolean[3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
*/

/*
public class BasicArray {
    public static void main(String[] args) {
        double[] arr = new double[3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
 */

/*
public class BasicArray {
    public static void main(String[] args) {
        char[] arr = new char[3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
 */

/*
public class BasicArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=0;
        arr[2]='a';
        arr[3]=100;
        arr[3]=50;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[3]);
    }
}
*/

/*
public class BasicArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
 */

/*
public class BasicArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length-2;i++){
            System.out.println(arr[i]);
        }
    }
}
 */

/*
import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("enter value");
            arr[i]=sc.nextInt();
        }
        System.out.println("my data");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
 */

/*
import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks:");
            marks[i] = sc.nextInt();
        }
        System.out.println("Marks at even indices:");
        for (int i = 0; i < marks.length; i++) {
            if (i % 2 == 0) {  // Check if the index is even
                System.out.println("Index " + i + ": " + marks[i]);
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("enter number");
            arr[i]=sc.nextInt();
        }
        System.out.println("print odd arr");
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){    // i control to index
                System.out.println("index"+i+":"+arr[i]);
            }
        }
    }
}
 */

/*
import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            System.out.println("enter number");
            arr[i] = sc.nextInt();
        }
        System.out.println("index ");
        for(int i=0;i<arr.length;i++){
            System.out.println(i);
        }
    }
}
 */

/*
public class BasicArray {
    public static void main(String[] args) {
        int[] arr = new int[0];
        System.out.println(arr.length);
        System.out.println(arr[0]);
    }
}
 */

/*
public class BasicArray {
    public static void main(String[] args) {
        double[] arr = {2,3.5,4,5,3,4.1,3};
        for(int i=0;i<arr.length;i++);
        System.out.println(arr);
    }
}
*/

/*
public class BasicArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
*/

/*
public class BasicArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,'a',3,'b',5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
*/







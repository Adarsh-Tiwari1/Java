/*
public class MultiDimArray {
    public static void main(String[] args) {
        int[][] array2D = new int[3][5];

        // access
        System.out.println(array2D[0][0]);
   }
}
 */

/*
public class MultiDimArray {
    public static void main(String[] args) {
        int[][] array2D = new int[3][5];

        // access
        System.out.println(array2D[0][0]);
        // initialize by initialize static
        int [][] brr2D = {
                {10,20,30,40},
                {5,10,15,20},
                {100,200,300,400}
        };
        System.out.println("brr2D = " + brr2D.length);
        System.out.println("brr2D.length = " + brr2D[2].length);

        for(int i=0;i<brr2D.length;i++){
            for(int j=0;j<brr2D.length;j++){
                System.out.print(brr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */

// copy  all element one array to another array
/*
public class MultiDimArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {arr.length};
        for(int i=0;i<arr.length;i++){ // copy all element one array to another array
            arr1=arr;
        }
        System.out.println("element of orginal array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("doubli cate array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
 */

// replace
/*
public class MultiDimArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                arr[i]=0;
            }
            System.out.println(arr[i]);
        }
    }
}
 */

/*
public class MultiDimArray{
    public static void main(String[] args){
        String str = "12345";
        String newString = str.replace('1','0');
        System.out.println(newString);
        System.out.println(newString.getClass().getName()); // Prints the type of newString
    }
}
 */



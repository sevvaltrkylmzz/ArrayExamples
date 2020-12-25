import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please type the array length");
        int length= scanner.nextInt();
        if (length<0){
            System.out.println("Please enter positive value");
        }
        int []arr=new int[length];
        System.out.println("Please fill the array");
        for (int i=0;i<length;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Your array is : "+Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("The reversed version of your  array is : "+Arrays.toString(arr));
    }
    private static void reverseArray(int[] array)
    {
        int maxIndex= array.length-1;
        int halfIndex=array.length/2;
         for (int i=0;i<halfIndex;i++)
         {
             int temp =array[i];
             array[i]=array[maxIndex-i];
             array[maxIndex-i]=temp;
         }

    }
}

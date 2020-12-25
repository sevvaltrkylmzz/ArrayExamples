import java.util.Scanner;

public class AscendingArrays {
    static Scanner scan;
    public static int i;

    public static int[] getInteger(int n) {
        scan = new Scanner(System.in);
        int [] numbers=new int[n];
        System.out.println("Please enter the numbers");
        for (i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }
        return numbers;
    }

    public static void printInteger(int[] printNumbers) {
        for (i = 0; i < printNumbers.length; i++) {
            System.out.print(printNumbers[i]+" ");
        }
        System.out.println("");
    }
    public static int[] sortArray(int[]ints){
        int []sortedArray=new int[ints.length];
        for (int i=0;i<ints.length;i++)
        {
            sortedArray[i]=ints[i];
        }
        boolean flag=true;
        int temp;
        while(flag){
            flag=false;
            int maxIndex=sortedArray.length-1;
            for (int i=0;i<maxIndex;i++){
                if (sortedArray[i]>sortedArray[i+1])
                {
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        scan =new Scanner(System.in);
        System.out.println("Please enter the array length");
        int y=scan.nextInt();
        int [] firstArray=getInteger(y);
        System.out.println("This is your array");
        printInteger(firstArray);
        int [] sortedArrray= sortArray(firstArray);
        System.out.println("This is the array in ascending order");
        printInteger(sortedArrray);


    }
}

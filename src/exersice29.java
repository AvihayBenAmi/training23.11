import java.util.Random;
import java.util.Scanner;

public class exersice29 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr={2,3,4,45,6,7,20,9};
        int bigNumber;
        bigNumber=theBiggest(arr);
        System.out.print(" "+bigNumber);
    }
    public static int theBiggest(int[] arr){
        int check=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>check){
                check=arr[i];
            }
        }
        return check;
    }
}

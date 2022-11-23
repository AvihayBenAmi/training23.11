import java.util.Random;
import java.util.Scanner;
public class exersice28 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int parameter1;
        int[] arr;
        System.out.println("Enter Parameter For Size Array");
        parameter1=scanner.nextInt();
        arr= randomArray(parameter1);
        System.out.println(" ");
        for(int i=0; i< arr.length; i++){
            System.out.print(" "+arr[i]);}
    }
    public static int[] randomArray(int parameter1){
        int[] arr = new int [parameter1];
        Random rnd=new Random();
        for(int i=0; i<arr.length; i++){
            arr[i]= rnd.nextInt(0,9);
            System.out.print(" "+arr[i]);
        }
        return arr;
    }
}

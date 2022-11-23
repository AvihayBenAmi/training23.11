import java.util.Random;
import java.util.Scanner;
public class exersice30 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int parameter1;
        int showtimes;
        int[] arr={2,5,7,4,5,8,2,4,5,9,3,6,5,4,7};
        System.out.println("Enter Number");
        parameter1=scanner.nextInt();
        showtimes= showtime(arr,parameter1);
        System.out.println(showtimes);
    }
    public static int showtime(int[] arr,int parameter1){
        int showtimes=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==parameter1){
                showtimes++;
            }
        }
        return showtimes;
    }
}

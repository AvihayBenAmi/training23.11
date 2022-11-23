import java.util.Scanner;

public class exersice27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int parameter1;
        int parameter2;
        int[] arr;
        System.out.println("Enter Parameter 1");
        parameter1=scanner.nextInt();
        System.out.println("Enter Parameter 2");
        parameter2=scanner.nextInt();
        arr= newArray(parameter1,parameter2);
        System.out.println(" ");
        for(int i=0; i< arr.length; i++){
            System.out.print(" "+arr[i]);}
        }
    public static int[] newArray(int parameter1, int parameter2){
        int[] arr = new int [parameter1];
        arr[0]=parameter2;
        System.out.print(" "+arr[0]);
        for(int i=1; i<arr.length; i++){
            arr[i]=arr[i-1]+1;
            System.out.print(" "+arr[i]);
        }
        return arr;
    }
}

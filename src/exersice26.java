import java.util.Scanner;

public class exersice26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int parameter1;
        int parameter2;
        System.out.println("Enter Parameter 1");
        parameter1=scanner.nextInt();
        System.out.println("Enter Parameter 2");
        parameter2=scanner.nextInt();
        newArray(parameter1,parameter2);
    }
    public static int[] newArray(int parameter1, int parameter2){
        int[] arr = new int [parameter1];
        for(int i=0; i<arr.length; i++){
            arr[i]=parameter2;
            System.out.print(" "+arr[i]);
        }
        return arr;
    }
}

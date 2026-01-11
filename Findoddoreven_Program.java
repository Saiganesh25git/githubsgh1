import java.util.Scanner;

public class Findoddoreven_Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input number");
        int value=sc.nextInt();
        if(value%2==0){
            System.out.println("The value is even");
        }
        else{
            System.out.println("The value is odd");
        }
    }
}

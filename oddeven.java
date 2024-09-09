import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the Value "); 
        a=sc.nextInt();
        if (a%2==0) {
        System.out.println("Number is Even");
        } else {
        System.out.println("Number is Odd");            
        }
        sc.close();
    }
}
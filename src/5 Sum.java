import java.sql.SQLOutput;
import java.util.Scanner;
 class Sum {
   public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       System.out.println("Welcome to computer");
       System.out.print("Enter  first number:");
       int Num1= input.nextInt();
       System.out.println("Enter Second number:");
       int Num2 = input.nextInt();
       int sum = Num1 + Num2;
       System.out.println("Sum of  number is "+sum);
    }
}

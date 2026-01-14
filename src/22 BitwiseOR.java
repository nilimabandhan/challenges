

import java.util.Scanner;

class BitwiseOR {
    public static void main(String[] args) {
        System.out.println("Showcaseing Bitwise OR Operator");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter The First Number ");
        int a=input.nextInt();
        System.out.print("ENter The Second Number ");
        int b= input.nextInt();
        int c= a | b;
        System.out.println("Bitwise AND of "+a+" "+b+" is "+c);


    }
}

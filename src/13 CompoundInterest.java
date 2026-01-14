import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Compound interest Calculator..");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Your Principle: ");
        double p= input.nextDouble();
        System.out.println("Principle= "+p);

        System.out.print("Enter Time: ");
        double t= input.nextDouble();
        System.out.println("time= "+t);

        System.out.print("Enter Your Rate: ");
        double r= input.nextDouble();
        System.out.println("Rate= "+r);
        double compoundint= (p*t*r)/100;

        System.out.println("Simple Interesr= "+compoundint);
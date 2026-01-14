import java.util.Scanner;

class LoopPattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number ");
        int rows=input.nextInt();
        FirstPattern(rows);
    }

public static void FirstPattern(int maxrows)
{
    int row=0;
    while(row<maxrows){
        System.out.print("* ");
        int i=0;
        while(i<row){
            System.out.print("* ");
            i++;
        }
        System.out.println();
        row++;
    }
}
}


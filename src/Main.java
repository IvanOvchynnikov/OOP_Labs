
import java.sql.Array;
import java.util.Scanner;
import Lab1.*;
import Lab3.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please write the lab you want to run (1 or 3):");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        if(x==1) {
            System.out.println("Please write the sum of money:");
            double money=scanner.nextDouble();
            System.out.println("Please write the year percent:");
            double percent=scanner.nextDouble();
            System.out.println("Please write the number of months:");
            int months= scanner.nextInt();
            Lab1.Lab1_main(money,percent,months);
        }
        else if(x==3){
            Lab3.Lab3_main();
        }
    }
}
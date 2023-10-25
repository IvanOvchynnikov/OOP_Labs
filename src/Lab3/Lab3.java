package Lab3;


import javax.swing.text.Style;
import java.lang.Math;
import java.sql.Array;
import java.util.Scanner;

public class Lab3 {
    static public void Lab3_main(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length of array: ");
        int length=scanner.nextInt();
        OvchiList current=new OvchiList(length);
        System.out.print("Please enter the elements of array: ");
        for(int i=0; i<length; i++){
            current.arr[i]=scanner.nextInt();
        }
        int type=0;
        while(type!=-1){
            System.out.println("Choose the type of the operation you want to do:");
            System.out.println("1: Print the minimal value of array");
            System.out.println("2: Print the maximal value of array");
            System.out.println("3: Print the sum of array");
            System.out.println("4: Print the average value of array");
            System.out.println("5: Print odd elements of array");
            System.out.println("6: Print even elements of array");
            System.out.println("-1: Stop the program");
            type=scanner.nextInt();
            switch (type){
                case 1:
                    current.getMin();
                    break;
                case 2:
                    current.getMax();
                    break;
                case 3:
                    current.getSum();
                    break;
                case 4:
                    current.getAverage();
                    break;
                case 5:
                    current.getOdd();
                    break;
                case 6:
                    current.getEven();
                    break;
            }
        }
    }
}


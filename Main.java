// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.lang.Math;
import java.sql.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length of array: ");
        int length=scanner.nextInt();
        int[] arr= new int[length];
        System.out.println("Please enter the elements of array: ");
        for(int i=0; i<length; i++){
            int element=scanner.nextInt();
            arr[i]=element;
        }
        arrayFunctions arrayFunctions = new arrayFunctions(arr);
        int[] arrayInfo=arrayFunctions.get();
        System.out.println("Minimal value: " + arrayInfo[0]);
        System.out.println("Maximal value: " + arrayInfo[1]);
        System.out.println("Average value: " + arrayInfo[2]);
    }
}

class arrayFunctions{
    int minValue=1000000,maxValue=-1000000,averageValue=0;
    arrayFunctions(int[] arr){
        action(arr);
    }
    private void action(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            maxValue = Math.max(maxValue, arr[i]);
            minValue = Math.min(minValue, arr[i]);
            averageValue += arr[i];
        }
        averageValue/=arr.length;
    }
    public int[] get(){
        int[] arr={minValue,maxValue,averageValue};
        return arr;
    }

}
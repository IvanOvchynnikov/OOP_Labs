package Lab1;
public class Lab1{
    public static void Lab1_main(double x,double y,int z) {
        y /= 100;
        y /= 12;
        double ans = x * Math.pow((1 + y), z);
        System.out.print("Your profit is: ");
        System.out.println(ans - x);
    }
}

package demoPractise;

/**
 * Addition of two user define number
 */
import java.util.Scanner;
public class Prb2 {
    int a,b;
    Prb2(){
    }
    private int addition(int a,int b){
        return(a+b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b=sc.nextInt();
        Prb2 prb=new Prb2();
        System.out.println(a+"+"+b+"="+prb.addition(a,b));
    }
}

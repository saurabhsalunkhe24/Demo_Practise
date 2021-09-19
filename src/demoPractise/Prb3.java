package demoPractise;

/**
 * Addition of two user define number
 */
import java.util.Scanner;

public class Prb3 {
    int a,b;
    Prb3(){
    }
    private int divide(int a,int b){
        return(a/b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b=sc.nextInt();
        Prb3 prb=new Prb3();
        System.out.println(a+"/"+b+"="+prb.divide(a,b));
    }
}

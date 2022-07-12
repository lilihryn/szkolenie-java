package plcybertrainees ;
import java.util.Scanner;
public final class Calculator{


    public  static double main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        double num1=sc.nextDouble();
        System.out.print("Enter second number");
        double num2=sc.nextDouble();
        System.out.print("Choose operator");
        char opr=sc.next().charAt(0);
        solve (num1,num2,opr);

        double res;
        return res;
    }

    private static void solve(double num1, double num2, int opr) {
       double res=0.0;
        if (opr=="+"){
             res=num1+num2;};
        else
        if(opr=="-"){
            res=num1-num2;};
        else
        if(opr=="*"){
             res=num1*num2;};
        else
        if(opr=="/"){
            res=num1/num2;};
        else
            System.out.println("Choose correct operator!");
    }
System.out.printIn("Your answer is - ""+ res);
        return res;


    }




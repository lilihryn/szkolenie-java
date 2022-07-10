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
        char oper=sc.next().charAt(0);
        solve (num1,num2,oper);

        double res = 0.0;
        return res;
    }

    private static void solve(double num1, double num2, char oper) {
       double res=0.0;
        if (oper=="+"){
             res=num1+num2;};
        else;
        if(oper=="-"){
            res=num1-num2;};
        else;
        if(oper=="*"){
             res=num1*num2;};
        else;
        if(oper=="/"){
            res=num1/num2;};
    }
System.out.println("Your answer is - ""+ res);
        return res;


    }




package plcybertrainees;
import java.util.Scanner;

public class Kalk {
    public static String SEPARATOR_SPACE= " ";

   public double kalkulator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zmianna1?");
        double zmianna1 = scanner.nextDouble();
        System.out.println("Zmianna2?");
        double zmianna2 = scanner.nextDouble();
        System.out.println("Jaky operator -,+,/,*?");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double resultat=0.0;

        switch (operator){
            case'+':
                resultat=zmianna1+zmianna2;
                break;
            case'-':
                resultat=zmianna1+zmianna2;
            case'/':
                resultat=zmianna1/zmianna2;
            case'*':
                resultat=zmianna1*zmianna2;
            default:
                System.out.printf(zmianna1+SEPARATOR_SPACE+operator+SEPARATOR_SPACE+zmianna2+"="+resultat);
                return resultat;
        }



       return resultat;
   }


}

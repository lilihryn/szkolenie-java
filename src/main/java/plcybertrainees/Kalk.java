package plcybertrainees;
import java.util.Scanner;

public class Kalk {
    static double main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zmianna1?");
        double zmianna1 = sc.nextDouble();
        System.out.println("Zmianna2?");
        double zmianna2 = sc.nextDouble();
        System.out.println("Jaky operator?");
        String operator = sc.next();
        double resultat = 0.0;
        if (operator "==" ' "+") {
            resultat = zmianna1 + zmianna2;
            if(operator '==' "-");
            resultat=zmianna1-zmianna2;
            if(operator == "/");
            resultat=zmianna1/zmianna2;
            else if(operator == "*");
            resultat=zmianna1*zmianna2;

        };

        return resultat;
    }
}

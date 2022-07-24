package plcybertrainees;


import java.math.BigDecimal;

public class Zmianni {
    public static void main(String[] args) {

    String valString1 = "pierwszy string";
    String valString2 = new String("drugi string");
    Integer valInt1 = 2;
    Integer valInt2 = Integer.valueOf("3");
//    System.out.println("dodawanie: " + add(valInt1, valInt2) + ", odejmowanie: " + subtract(valInt1, valInt2) + ", mnożenie: " + multiplication(valInt1, valInt2) + ", dzielenie: " + division(valInt1, valInt2));
    Double valDouble1 = 10.5;
    Double valDouble2 = Double.valueOf("4.5");

//    System.out.println("dodawanie: " + add(valDouble1, valDouble2) + ", odejmowanie: " + subtract(valDouble1, valDouble2) + ", mnożenie: " + multiplication(valDouble1, valDouble2) + ", dzielenie: " + division(valDouble1, valDouble2));

    BigDecimal valBigDec1 = BigDecimal.valueOf(10.5);
    BigDecimal valBigDec2 = new BigDecimal("4.5");

//    System.out.println("dodawanie: " + add(valBigDec1, valBigDec2) + ", odejmowanie: " + subtract(valBigDec1, valBigDec2) + ", mnożenie: " + multiplication(valBigDec1, valBigDec2) + ", dzielenie: " + division(valBigDec1, valBigDec2));
//testowe //
//        https://github.com/lilihryn/szkolenie-java/invitations
}

private static Integer add(Integer valInt1, Integer valInt2) {
     return valInt1+valInt2;
}
}

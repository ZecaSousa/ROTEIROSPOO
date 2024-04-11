package roteiro3parte2;

import java.util.Scanner;

public class programa13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe o valor de x ");
        double x = input.nextDouble();
        System.out.println("informe a operação ( + , -, *, /)");
        String op = input.next();
        System.out.println("informe o valor de y");
        double y = input.nextDouble();

        switch (op) {
            case "+":
                soma(x, y);

                break;
            case "-":
                subtracao(x, y);
                break;
            case "*":
                multiplicacao(x, y);
                break;
            case "/":
                divisao(x, y);
                break;

            default:
                System.out.println("operação invalida");
                break;
        }

        input.close();

    }

    public static void soma(double x, double y) {
        System.out.println("o resultado : " + (x + y));

    }

    public static void subtracao(double x, double y) {
        System.out.println(" o resultado : " + (x - y));
    }

    public static void multiplicacao(double x, double y) {
        System.out.println(" o resultado : " + (x * y));
    }

    public static void divisao(double x, double y) {
        System.out.println(" o resultado : " + (x / y));
    }

}

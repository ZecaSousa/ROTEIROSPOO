package roteiro3parte1;

import java.util.Scanner;

public class programa12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sb, sr;

        System.out.println("informe o salario base : ");
        sb = input.nextDouble();
        sr = calcSb(sb);
        System.out.println("o salario a receber e de " + sr);

        input.close();
    }

    public static double calcSb(double sb) {
        double imp, grat;

        grat = sb * 5 / 100;
        imp = sb * 7 / 100;
        return sb + grat - imp;
    }

}

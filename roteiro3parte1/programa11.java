package roteiro3parte1;

import java.util.Scanner;

public class programa11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sb, grat, imp, sr;

        System.out.println("informe o salario base : ");
        sb = input.nextDouble();
        grat = calcGrat(sb);
        imp = calcImp(sb);
        sr = sb + grat - imp;

        System.out.println("o salario a receber e de " + sr);

        input.close();
    }

    public static double calcGrat(double sb) {
        return sb * 5 / 100;
    }

    public static double calcImp(double sb) {
        return sb * 7 / 100;
    }

}

package roteiro3parte1;

import java.util.Scanner;

public class programa10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sb, grat, imp, sr;

        System.out.println("informe o salario base : ");
        sb = input.nextDouble();
        grat = sb * 5 / 100;
        imp = sb * 7 / 100;
        sr = sb + grat - imp;

        System.out.println("o salario a receber e de " + sr);

        input.close();
    }

}

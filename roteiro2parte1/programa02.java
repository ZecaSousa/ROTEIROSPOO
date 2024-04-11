package roteiro2parte1;

import java.util.Scanner;

public class programa02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu nome");
        String nome = entrada.nextLine();

        System.out.println("informe sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Nome informado : " + nome + " \nidade informada : " + idade);

        entrada.close();
    }
}

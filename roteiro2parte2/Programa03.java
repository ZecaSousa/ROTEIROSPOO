package roteiro2parte2;

import javax.swing.JOptionPane;

public class Programa03 {

    public static void main(String[] args) {

        System.out.println("Informe o seu nome");

        String nome = JOptionPane.showInputDialog("Informe seu nome ");

        String strIdade = JOptionPane.showInputDialog("Informe sua idade ");
        int idade = Integer.parseInt(strIdade);
        JOptionPane.showMessageDialog(null, "nome informado: " + nome + "\nIdade informada : " + idade);
    }
}

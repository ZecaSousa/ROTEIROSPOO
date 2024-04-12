package roteiro4parte1;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        aluno01.matricula = 111;
        aluno01.nome = "joao";
        aluno01.curso = "sistema de informação";
        aluno01.anoIngresso = 2019;
        aluno01.anoIngresso = 2050;

        System.out.println("matricula  " + aluno01.matricula);
        System.out.println("nome " + aluno01.nome);
        System.out.println("curso " + aluno01.curso);
        System.out.println("Ano ingresso " + aluno01.anoIngresso);

        Aluno aluno02 = new Aluno();
        aluno02.matricula = 493;
        aluno02.nome = "zeca";
        aluno02.curso = "Analise e desenvolvimento de sistema";
        aluno02.anoIngresso = 2003;

        System.out.println("\nmatricula  " + aluno02.matricula);
        System.out.println("nome " + aluno02.nome);
        System.out.println("curso " + aluno02.curso);
        System.out.println("Ano ingresso " + aluno02.anoIngresso);

    }
}

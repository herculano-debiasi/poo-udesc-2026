package exercicio1oo.classes;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno herculano = new Aluno();

        herculano.matricula = "123";
        herculano.nome = "Herculano De Biasi";
        herculano.idade = 51;
        herculano.nota1 = 5; herculano.nota2 = 6;
        herculano.nota3 = 7; herculano.nota4 = 8;

        System.out.println("Matrícula: " + herculano.matricula);
        System.out.println("Nome: " + herculano.nome);
        System.out.println("Idade: " + herculano.idade);
        System.out.println("Nota 1: " + herculano.nota1);
        System.out.println("Nota 2: " + herculano.nota2);
        System.out.println("Nota 3: " + herculano.nota3);
        System.out.println("Nota 4: " + herculano.nota4);

    }
}

package Questions;

public class Quest3 {
    public static void main(String[] args) {
        /*Elabore um programa que receba 3 notas (informadas pela
pessoa desenvolvedora). Em seguida, calcule a média e verifique
se o aluno está aprovado, reprovado ou na final.*/

        double nota1 = 7.0;
        double nota2 = 8.0;
        double nota3 = 5.0;
        double media_Final = (nota1 + nota2 + nota3) / 3;

        if (media_Final > 7.0) {
            System.out.println("Está aprovado!!!");
        } else if (media_Final == 6.0) {
            System.out.println("Vai pra recuperação!!!");
        } else {
            System.out.println("Você está oficialmente lascado!!!");

        }
    }
}
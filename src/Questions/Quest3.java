package Questions;
import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) {
        /*Elabore um programa que receba 3 notas (informadas pela
pessoa desenvolvedora). Em seguida, calcule a média e verifique
se o aluno está aprovado, reprovado ou na final.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        double mediaFinal = (nota1 + nota2 + nota3) / 3;

        if (mediaFinal >= 7.0) {
            System.out.println("Está aprovado!!!");
        } else if (mediaFinal >= 6) {
            System.out.println("Vai pra recuperação!!!");
        } else {
            System.out.println("Você está reprovado!!!");

        }
    }
}
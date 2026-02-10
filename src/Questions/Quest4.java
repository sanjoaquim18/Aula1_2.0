package Questions;

import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário: ");
        double salario_Bruto = scanner.nextDouble();
        double percentual = 0.0;

        if(salario_Bruto <= 900.0){
            percentual = 0.0;
            System.out.println("Isento");
        }
        else if(salario_Bruto <= 1500.0){
            percentual = 0.05;
            System.out.println("O salário tem 5% de desconto");
        }
        else if(salario_Bruto <= 2500.0){
            percentual = 0.10;
            System.out.println("O salário tem 10% de desconto");
        }
        else{
            percentual = 0.20;
            System.out.println("O salário tem 20% de desconto");
        }
        double valor_Desconto = salario_Bruto * percentual;
        double salario_Liquido = salario_Bruto - valor_Desconto;

        System.out.println("O salário bruto é igual a: "+ salario_Bruto);
        System.out.println("O desconto no salário é igual a: "+ valor_Desconto);
        System.out.println("O salário líquido é igual a: "+salario_Liquido);
        scanner.close();
    }
}
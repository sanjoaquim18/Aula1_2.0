package Questions;

public class Quest2 {
    public static void main(String[] args) {
/*Elabore um programa que verifique se uma variável é maior,
menor ou igual a outra e exiba esta informação na tela e exiba.*/

        int v1 = 25;
        int v2 = 15;

        if(v1 > v2){
            System.out.println("É maior");
        }
        else if (v1 == v2){
            System.out.println("É igual");
        }

        else{
            System.out.println("É menor");
        }


    }
}
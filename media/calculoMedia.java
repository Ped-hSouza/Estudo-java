package fundamentos.media;

import java.util.Scanner;

public class calculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas notas você deseja cadastrar: ");
        int times = leitor.nextInt();
        double totalNotas = 0;

        for(int i = 0; i < times; i++){
            System.out.printf("Digite a %dº nota: ", i+1);
            totalNotas += leitor.nextDouble();
        }

        double media = totalNotas / times;

        if(media >= 6){
            System.out.println("Parabéns, Você foi aprovado!!");
        } else {
            System.out.println("Você foi reprovado. Se esforce mais na próxima!");
        }

        System.out.printf("%nSua média foi: %.2f.", media);

        leitor.close();
    }
}

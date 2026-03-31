import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        double n1, n2, n3, med;
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a primeira nota: ");
        n1 = sc.nextDouble();

        System.out.println("digite a segunda nota: ");
        n2 = sc.nextDouble();

        med = (n1 + n2)/2;

        System.out.println("Média das notas: " + med);

        if (med >= 6) {
            System.out.println("Você esta aprovado");
        }

        if (med == 5) {
            System.out.println("Você está de recuperação");
        }

        else {
            System.out.println("Você esta reprovado");
        }

    }

}

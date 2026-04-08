import java.util.Scanner;

public class EX7 {
    static void main() {
        double grau;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um grau em Celcius (°C)");
        grau = sc.nextDouble();

        if (grau > 20){
            System.out.println("Quente");
        }
        if (grau == 20){
            System.out.println("Intermediário");
        }
        if (grau < 20){
            System.out.println("Frio");
        }
    }
}

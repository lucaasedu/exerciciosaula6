import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        double valorCompra, desconto;
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor total da compra: ");
        valorCompra = sc.nextDouble();

        if (valorCompra > 1000) {
            desconto = valorCompra * 0.85;
            System.out.println("Valor final com desconto de 15%: " + desconto);
        }

        else{
            desconto = valorCompra * 0.92;
            System.out.println("Valor final com desconto de 8%: " + desconto);
        }
    }
}

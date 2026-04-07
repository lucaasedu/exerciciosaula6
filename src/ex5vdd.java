import java.util.Scanner;

public class ex5vdd {

    public static void main(String[] args) {
        double l1,l2,l3;
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o lado de um triangulo: ");
        l1 = sc.nextDouble();

        System.out.println("digite o segundo lado: ");
        l2 = sc.nextDouble();

        System.out.println("digite o terceiro lado: ");
        l3 = sc.nextDouble();

        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2){
            System.out.println("Triangulo válido");
        }
        else{
            System.out.println("Triangulo inválido");
        }
    }
}

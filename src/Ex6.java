import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int ano;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um ano: ");
        ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("ano é bissexto");
        }
        else{
            System.out.println("ano não é bissexto");
        }
    }
}
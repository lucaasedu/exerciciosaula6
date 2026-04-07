import java.util.Scanner;

public class ex4variacao {

    public static void main(String[] args) {
        double y, x;
        Scanner sc = new Scanner(System.in);

        System.out.println("digite x");
        x = sc.nextDouble();

        y = (8 / Math.sqrt(Math.pow(x, 2)-25));

        if (x > 5 || x < -5){
            System.out.println("y: " + y);
        }
        else{
            System.out.println("não existe divisão por zero nem raiz quadrada de número negativo no campo dos números reais. Digite outro. ");
        }
    }
}
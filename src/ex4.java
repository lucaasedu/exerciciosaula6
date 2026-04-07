import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        double y, x, eqx, raiz;
        Scanner sc = new Scanner(System.in);

        System.out.println("digite x");
        x = sc.nextDouble();

        eqx = (Math.pow(x, 2)-25);
        raiz = Math.sqrt(eqx);

        if (eqx > 0){
            y = (8/raiz);
            System.out.println("y: " + y);
        }
        else{
            System.out.println("não existe divisão por zero nem raiz quadrada de número negativo no campo dos números reais. Digite outro . ");
        }
    }
}
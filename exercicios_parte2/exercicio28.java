import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Digite 3 valores: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double somaQuadrados = (a*a) + (b*b) + (c*c);
        System.out.println("Soma dos quadrados: " + somaQuadrados);
    }
    
}

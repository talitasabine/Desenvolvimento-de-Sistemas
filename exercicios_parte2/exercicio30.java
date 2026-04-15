import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor em reais: ");
        double reais = sc.nextDouble();
        System.out.print("Cotação dólar: ");
        double cot = sc.nextDouble();
        System.out.println("Em dólares: " + (reais / cot));
        sc.close();
    }

}

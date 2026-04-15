import java.util.Scanner;

public class exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor produto: ");
        double prod = sc.nextDouble();
        System.out.println("Com desconto: " + (prod * 0.88));

        sc.close();
    }
}


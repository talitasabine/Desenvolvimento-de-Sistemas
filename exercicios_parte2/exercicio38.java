import java.util.Scanner;

public class exercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salário: ");
        double sal = sc.nextDouble();
        System.out.println("Novo salário: " + (sal * 1.25));

        sc.close();
    }
}


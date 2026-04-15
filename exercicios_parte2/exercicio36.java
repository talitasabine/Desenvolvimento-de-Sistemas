import java.util.Scanner;

public class exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Altura e raio do cilindro: ");
        double alt = sc.nextDouble(), raio = sc.nextDouble();
        double vol = 3.141592 * raio * raio * alt;
        System.out.println("Volume: " + vol);

        sc.close();
    }
}


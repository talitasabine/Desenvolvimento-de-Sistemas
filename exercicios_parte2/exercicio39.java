import java.util.Scanner;

public class exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 780000;
        System.out.println("1º: " + (total * 0.46));
        System.out.println("2º: " + (total * 0.32));
        System.out.println("3º: " + (total * 0.22));

        sc.close();
    }
}


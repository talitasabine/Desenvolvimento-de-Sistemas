import java.util.Scanner;

public class exercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Salário base: ");
        double base = sc.nextDouble();
        double novo = base * 1.05;
        novo = novo * 0.93;
        System.out.println("Salário final: " + novo);
        
        sc.close();
    }
}


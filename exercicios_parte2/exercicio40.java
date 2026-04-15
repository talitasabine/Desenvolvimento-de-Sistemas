import java.util.Scanner;

public class exercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dias trabalhados: ");
        int dias = sc.nextInt();
        double bruto = dias * 30;
        System.out.println("Salário líquido: " + (bruto * 0.92));
        
        sc.close();
    }
}


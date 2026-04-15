import java.util.Scanner;

public class exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor hora e horas: ");
        double vh = sc.nextDouble(), ht = sc.nextDouble();
        double salario = vh * ht;
        System.out.println("Salário final: " + (salario * 1.10));
        
        sc.close();
    }
}


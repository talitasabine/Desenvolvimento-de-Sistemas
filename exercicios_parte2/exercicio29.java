import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Digite 4 notas: ");
        double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble(), n4 = sc.nextDouble();
        double media = (n1+n2+n3+n4)/4;
        System.out.println("Média: " + media);
    }
    
}

import java.util.Scanner;

public class exercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Comprimento, largura, preço: ");
        double comp = sc.nextDouble(), larg = sc.nextDouble(), preco = sc.nextDouble();
        double custo = 2*(comp+larg)*preco;
        System.out.println("Custo: " + custo);
        
        sc.close();
    }
}
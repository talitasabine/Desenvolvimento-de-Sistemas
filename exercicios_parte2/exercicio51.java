import java.util.Scanner;

public class exercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Coordenadas x y: ");
        double px = sc.nextDouble(), py = sc.nextDouble();
        double dist = Math.sqrt(px*px + py*py);
        System.out.println("Distância: " + dist);
        
        sc.close();
    }
}
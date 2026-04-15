import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("\n26) Metros quadrados: ");
        double mQuad3 = sc.nextDouble();
        double hectares = mQuad3 * 0.0001;
        System.out.println("Hectares: " + hectares);
    sc.close();
    }
    
}

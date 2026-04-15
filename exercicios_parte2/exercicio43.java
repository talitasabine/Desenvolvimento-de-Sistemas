import java.util.Scanner;

public class exercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor venda: ");
        double venda = sc.nextDouble();
        double vista = venda * 0.9;
        double comVista = vista * 0.05;
        double comParcelado = venda * 0.05;
        System.out.println("À vista: " + vista + " comissão: " + comVista);
        System.out.println("Parcelado: " + venda + " comissão: " + comParcelado);
        
        sc.close();
    }
}


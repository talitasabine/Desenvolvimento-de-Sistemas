import java.util.Scanner;
public class exercicio9{
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a temperatura em Celsius: ");
    double celsius2 = sc.nextDouble();
    double kelvin2 = celsius2 + 273.15;
    System.out.println("Temperatura em Kelvin: " + kelvin2);

    sc.close();
    
    }
}

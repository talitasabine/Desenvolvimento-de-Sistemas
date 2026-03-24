public class exercicio6 {
    public static void main(String[] args) throws Exception {
        //exercicio 6 - Leia uma temperatura em graus Celsius e apresente-a convertida em graus
        //Fahrenheit.
        //Fórmula: F = C × (9.0/5.0) + 32.0
        double celsius = Double.parseDouble(System.console().readLine("Digite a temperatura em graus Celsius:"));
        double fahrenheit = celsius * (9.0 / 5.0) + 32.0;
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
    
}

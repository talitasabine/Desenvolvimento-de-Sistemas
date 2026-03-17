public class exercicio7 {
    public static void main(String[] args) throws Exception {
        //exercicio 7 - Leia uma temperatura em graus Fahrenheit e apresente-a convertida em
        //graus Celsius.
        //Fórmula: C = 5.0 × (F − 32.0) / 9.0
        double fahrenheit = Double.parseDouble(System.console().readLine("Digite a temperatura em graus Fahrenheit:"));
        double celsius = 5.0 * (fahrenheit - 32.0) / 9.0;
        System.out.println("A temperatura em graus Celsius é: " + celsius);
    }
    
}

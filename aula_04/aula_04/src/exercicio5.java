public class exercicio5 {
    public static void main(String[] args) throws Exception {
        //exercicio 5 - Leia um número real e imprima a quinta parte desse número.
        
        double real = Double.parseDouble(System.console().readLine("Digite um número real:"));
        double quintaParte = real / 5;

        System.out.println("A quinta parte do número é: " + quintaParte);
    }
    
}

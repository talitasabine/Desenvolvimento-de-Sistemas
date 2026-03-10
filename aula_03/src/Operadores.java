public class Operadores {
    public static void main(String[] args) {

        // 1 OPERADORES ARITMÉTICOS

        int a = 10;
        int b = 3;

        System.out.println("Operadores Aritméticos");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão inteira: " + (a / b)); // resultado inteiro
        System.out.println("Resto: " + (a % b));

        // 2 OPERADORES DE COMPARAÇÃO
        System.out.println("\nOperadores de Comparação");

        System.out.println("a é igual a b: " + (a == b));
        System.out.println("a é diferente de b: " + (a != b));
        System.out.println("a é maior que b: " + (a > b));
        System.out.println("a é menor que b: " + (a < b));
        System.out.println("a é maior ou igual a b: " + (a >= b));
        System.out.println("a é menor ou igual a b: " + (a <= b));

        // 3 OPERADORES LÓGICOS
        boolean temCarteira = true;
        int idade = 20;

        System.out.println("\nOperadores Lógicos");
        System.out.println("Pode dirigir (Idade é maior ou igual a 18 E possui carteira): "
                + (idade >= 18 && temCarteira));
        System.out.println("Pode dirigir (idade é menor que 18 OU possui carteira): "
                + (idade < 18 || temCarteira));
        System.out.println("Não possui carteira (negação da condição): "
                + (!temCarteira));

        // 4 OPERADORES DE ATRIBUIÇÃO

        int x = 10;

        System.out.println("\nOperadores de Atribuição");
        System.out.println("Valor inicial de x: " + x);

        x += 5;
        System.out.println("Somando 5 ao valor de x (x recebe x mais 5): " + x);

        x = -3;
        System.out.println("Subtraindo 3 do valor de x (x recebe x menos 3): " + x);

        x *= 2;
        System.out.println("Multiplicando o valor de x por 2 (x recebe x vezes 2): " + x);

        x /= 4;
        System.out.println("Dividindo o valor de x por 4 (x recebe x dividido por 4): " + x);

        x %= 3;
        System.out.println("Calculando o resto da divisão de x por 3 (x recebe o resto): " + x);

        // 5. OPERADORES BITWISE

        int num1 = 5; // 0101
        int num2 = 3; // 0011

        System.out.println("\n=== BITWISE ===");

        System.out.println("E bit a bit entre num1 e num2 (somente bits iguais a 1 permanecem): "
                + (num1 & num2));

        System.out.println("Ou bit a bit entre num1 e num2 (bits que possuem pelo menos um 1): "
                + (num1 | num2));

        System.out.println("Ou exclusivo entre num1 e num2 (bits diferentes resultam em 1): "
                + (num1 ^ num2));

        System.out.println("Inversão dos bits de num1 (negação bit a bit): "
                + (~num1));

        System.out.println("Deslocamento de bits de num1 para a esquerda em 1 posição (multiplica por 2): "
                + (num1 << 1));

        System.out.println("Deslocamento de bits de num1 para a direita em 1 posição (divide por 2): "
                + (num1 >> 1));

        // 6. EXTRA (incremento/decremento)

        int contador = 5;

        System.out.println("\n=== INCREMENTO / DECREMENTO ===");
        System.out.println("Valor inicial: " + contador);

        System.out.println("contador++: " + (contador++)); // usa depois incrementa
        System.out.println("Após contador++: " + contador);

        System.out.println("++contador: " + (++contador)); // incrementa antes

        // ============================
        // BOA PRÁTICA (Scanner)
        // ============================

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite um número:");
        int numero = scanner.nextInt();
        System.out.println("Número digitado: " + numero);

        scanner.close(); // importante!
    }
}

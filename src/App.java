import java.util.Scanner;  

public class App {
    public static void main(String[] args) throws Exception {
        // Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        // a) o produto do dobro do primeiro com metade do segundo .
        //b) a soma do triplo do primeiro com o terceiro.
        //c) o terceiro elevado ao cubo.
        double real; 
        int int1, int2; 

        System.out.println("Digite um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int1 = teclado.nextInt(); 

        System.out.println("Digite outro número inteiro: ");
        int2 = teclado.nextInt(); 

        System.out.println("Digite um número real: ");
        real = teclado.nextDouble(); 

        System.out.println("O produto do dobro do primeiro com metade do segundo " + (int1 * 2) * (int2 / 2));
        System.out.println("a soma do triplo do primeiro com o terceiro " + ((int1 * 3) + real));
        System.out.println("o terceiro elevado ao cubo " + Math.pow(real, 3) );
        teclado.close();
    }
}

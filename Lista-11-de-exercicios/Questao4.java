//Marcos Fellipe Andrade da Silva
package listasexercicios;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = in.nextLine();
        calcula(frase);
    }

    public static void calcula(String frase) {
        int size;
        size = frase.length();
        for (int i = 0; i < size; i++) {
            if (Character.toLowerCase(frase.charAt(i)) == 'a') {
                frase = frase.replaceAll("a", "@");
            }
            if (Character.toLowerCase(frase.charAt(i)) == 'e') {
                frase = frase.replaceAll("e", "$");
            }
            if (Character.toLowerCase(frase.charAt(i)) == 'i') {
                frase = frase.replaceAll("i", "&");
            }
            if (Character.toLowerCase(frase.charAt(i)) == 'o') {
                frase = frase.replaceAll("o", "*");
            }
            if (Character.toLowerCase(frase.charAt(i)) == 'u') {
                frase = frase.replaceAll("u", "#");
            }
        }
        System.out.println("Frase: " + frase);

    }

}

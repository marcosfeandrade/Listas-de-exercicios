//Marcos Fellipe Andrade da Silva
package listasexercicios;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = in.nextLine();
        calcula(frase);
    }

    public static void calcula(String frase) {
        int countLetras = 0, countDigitos = 0, countSimbolos = 0, countEspaco = 0;
        int size = frase.length();
        for (int i = 0; i < size; i++) {
            if (identificaVogal(frase, i) || identificaConsoante(frase, i)) {
                countLetras++;
            } else if (identificaDigito(frase, i)) {
                countDigitos++;
            } else if (identificaEspaco(frase, i)) {
                countEspaco++;
            } else {
                countSimbolos++;
            }
        }
        System.out.println("Letras: " + countLetras);
        System.out.println("Digitos: " + countDigitos);
        System.out.println("Simbolos: " + countSimbolos);
        System.out.println("Espaços em branco: " + countEspaco);
    }

    public static boolean identificaVogal(String frase, int i) {
        if (Character.toLowerCase(frase.charAt(i)) == 'a'
                || Character.toLowerCase(frase.charAt(i)) == 'e'
                || Character.toLowerCase(frase.charAt(i)) == 'i'
                || Character.toLowerCase(frase.charAt(i)) == 'o'
                || Character.toLowerCase(frase.charAt(i)) == 'u') {
            return true;
        }
        return false;
    }

    public static boolean identificaConsoante(String frase, int i) {
        if (Character.toLowerCase(frase.charAt(i)) == 'b'
                || Character.toLowerCase(frase.charAt(i)) == 'c'
                || Character.toLowerCase(frase.charAt(i)) == 'd'
                || Character.toLowerCase(frase.charAt(i)) == 'f'
                || Character.toLowerCase(frase.charAt(i)) == 'g'
                || Character.toLowerCase(frase.charAt(i)) == 'h'
                || Character.toLowerCase(frase.charAt(i)) == 'j'
                || Character.toLowerCase(frase.charAt(i)) == 'k'
                || Character.toLowerCase(frase.charAt(i)) == 'l'
                || Character.toLowerCase(frase.charAt(i)) == 'm'
                || Character.toLowerCase(frase.charAt(i)) == 'n'
                || Character.toLowerCase(frase.charAt(i)) == 'p'
                || Character.toLowerCase(frase.charAt(i)) == 'q'
                || Character.toLowerCase(frase.charAt(i)) == 'r'
                || Character.toLowerCase(frase.charAt(i)) == 's'
                || Character.toLowerCase(frase.charAt(i)) == 't'
                || Character.toLowerCase(frase.charAt(i)) == 'v'
                || Character.toLowerCase(frase.charAt(i)) == 'w'
                || Character.toLowerCase(frase.charAt(i)) == 'x'
                || Character.toLowerCase(frase.charAt(i)) == 'y'
                || Character.toLowerCase(frase.charAt(i)) == 'z') {
            return true;
        }
        return false;
    }

    public static boolean identificaDigito(String frase, int i) {
        if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9') {
            return true;
        }
        return false;
    }

    public static boolean identificaEspaco(String frase, int i) {
        if (frase.charAt(i) == ' ') {
            return true;
        }
        return false;
    }
}

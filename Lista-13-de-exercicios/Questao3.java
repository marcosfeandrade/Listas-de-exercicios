
package listadeexercicio;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String frase;
        System.out.println("Digite a frase: ");
        frase = in.nextLine();
        ler(frase);
    }
    
    public static void ler(String frase){
        int cont = 0, size = frase.length();
        for (int i = 0; i < size; i++) {
            if(frase.charAt(i) == '.' || frase.charAt(i) == ',' || 
                    frase.charAt(i) == ';' || frase.charAt(i) == ':' ||
                    frase.charAt(i) == '?' || frase.charAt(i) == '!' ||
                    frase.charAt(i) == ' '){
                cont++;
            }
        }
        System.out.println("Esta frase possui " + (cont + 1) + " palavras");
    }
    
}

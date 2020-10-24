//Marcos Fellipe Andrade da Silva
package listasexercicios;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = in.nextLine();
        System.out.println("Digite um charactere: ");
        char letra = in.next().charAt(0);
        calcula (frase, letra);
    }
    
    public static void calcula(String frase, char letra){
        int count = 0, size;
        size = frase.length();
        for (int i = 0; i < size; i++) {
            if(Character.toLowerCase(frase.charAt(i)) == Character.toLowerCase(letra)){
                count++;
            }
        }
        System.out.println(count + " vezes este caractere aparece na frase");
    }
    
}
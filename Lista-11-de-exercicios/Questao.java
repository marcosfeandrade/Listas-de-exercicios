//Marcos Fellipe Andrade da Silva
package listasexercicios;

import java.util.Scanner;

public class Questao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = in.nextLine();
        calcula (frase);
    }
    
    public static void calcula(String frase){
        int count = 0, size;
        size = frase.length();
        for (int i = 0; i < size; i++) {
            if(Character.toLowerCase(frase.charAt(i)) == 'a' || 
                    Character.toLowerCase(frase.charAt(i)) == 'e' ||
                    Character.toLowerCase(frase.charAt(i)) == 'i' ||
                    Character.toLowerCase(frase.charAt(i)) == 'o' ||
                    Character.toLowerCase(frase.charAt(i)) == 'u' ){
                count++;
            }
        }
        System.out.println(count + " vogais presentes na frase");
    }
    
}
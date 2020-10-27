package listasexercicios;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = in.nextLine();
        crip(frase);
    }
    
    public static void crip(String frase){
        int size = frase.length();
        String inv = null;
        for(int i = 0; i < size; i++){
        if(identificaConsoante(frase, i)){
            frase = trocaConsoante(frase);
        }
        inv = reverse(frase, size);
            
        }
        System.out.println(inv);
    }
    
    public static String trocaConsoante(String frase){
            frase = frase.replaceAll("b", "#");
            frase = frase.replaceAll("B", "#");
            frase = frase.replaceAll("c", "#");
            frase = frase.replaceAll("C", "#");
            frase = frase.replaceAll("d", "#");
            frase = frase.replaceAll("D", "#");
            frase = frase.replaceAll("f", "#");
            frase = frase.replaceAll("F", "#");
            frase = frase.replaceAll("g", "#");
            frase = frase.replaceAll("G", "#");
            frase = frase.replaceAll("h", "#");
            frase = frase.replaceAll("H", "#");
            frase = frase.replaceAll("j", "#");
            frase = frase.replaceAll("J", "#");
            frase = frase.replaceAll("k", "#");
            frase = frase.replaceAll("K", "#");
            frase = frase.replaceAll("l", "#");
            frase = frase.replaceAll("L", "#");
            frase = frase.replaceAll("m", "#");
            frase = frase.replaceAll("M", "#");
            frase = frase.replaceAll("n", "#");
            frase = frase.replaceAll("N", "#");
            frase = frase.replaceAll("p", "#");
            frase = frase.replaceAll("P", "#");
            frase = frase.replaceAll("q", "#");
            frase = frase.replaceAll("Q", "#");
            frase = frase.replaceAll("r", "#");
            frase = frase.replaceAll("R", "#");
            frase = frase.replaceAll("s", "#");
            frase = frase.replaceAll("S", "#");
            frase = frase.replaceAll("t", "#");
            frase = frase.replaceAll("T", "#");
            frase = frase.replaceAll("v", "#");
            frase = frase.replaceAll("V", "#");
            frase = frase.replaceAll("w", "#");
            frase = frase.replaceAll("W", "#");
            frase = frase.replaceAll("x", "#");
            frase = frase.replaceAll("X", "#");
            frase = frase.replaceAll("y", "#");
            frase = frase.replaceAll("Y", "#");
            frase = frase.replaceAll("z", "#");
            frase = frase.replaceAll("Z", "#");
            return frase;
    }
    
    public static String reverse (String frase, int size) {
    String temp = "";
    for (int i = frase.length() - 1; i >= 0; i--)
      temp += frase.charAt(i);
    return temp;
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
}
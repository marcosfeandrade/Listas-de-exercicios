//Marcos Fellipe Andrade da Silva
package listasdeexercicios;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        int[][] vect = new int [4][4];
        fillsM(vect);
        sumElements(vect);
    }

    public static void fillsM(int[][] vect) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira os elementos: ");
        for (int i = 0; i < vect.length; i++) {
            for (int c = 0; c < vect[i].length; c++) {
                System.out.println("(" + (c + 1) + ", " + (i + 1) + ")");
                vect[c][i] = in.nextInt();
            }
        }
    }
    
    public static void sumElements(int[][] vect){
        int aux = 0;
        for (int i = 0; i < vect.length - 1; i++) {
            aux += vect[i][i + 1];
        }
        System.out.println("A soma dos elementos acima da diagonal principal é: " + aux);
    }
    
}

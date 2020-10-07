//Marcos Fellipe Andrade da Silva
package listasdeexercicios;

import java.util.Scanner;

public class Questao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] vect;
        int o;
        int aux;
        System.out.println("Ordem da matriz:  ");
        o = in.nextInt();
        vect = new int[o][o];
        fillsM(vect);
        aux = verify(vect);
        if (aux == 0) {
            System.err.println("A matriz não eh um quadrado magico!");
        } else {
            System.out.println("A matriz eh um quadrado magico!");
        }
    }

    public static void fillsM(int[][] vect) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira os elementos: ");
        for (int i = 0; i < vect.length; i++) {
            for (int c = 0; c < vect[i].length; c++) {
                System.out.println("(" + (i + 1) + ", " + (c + 1) + ")");
                vect[i][c] = in.nextInt();
            }
        }
    }

    public static int verify(int[][] vect) {
        int somaL1 = 0;
        int soma = 0;
        for (int l = 0; l < vect[0].length; l++) { // soma os elementos da primeira linha
            somaL1 += vect[0][l];
        }
        for (int i = 0; i < vect.length; i++) {//linhas
            soma = 0;
            for (int j = 0; j < vect[i].length; j++) {
                soma += vect[i][j];
            }
        }
        if (soma != somaL1) {
            return 0;
        }
        for (int j = 0; j < vect[0].length; j++) {//colunas
            soma = 0;
            for (int i = 0; i < vect.length; i++) {
                soma += vect[i][j];
            }
        }
        if (soma != somaL1) {
            return 0;
        }
        soma = 0;
        for (int i = 0; i < vect.length; i++) {//DP
            soma += vect[i][i];

        }
        if (soma != somaL1) {
            return 0;
        }
        int l = 0;
        soma = 0;
        for (int i = vect.length - 1; i >= 0; i--) {//DS
            soma += vect[l][i];
            l++;
        }
        if (soma != somaL1) {
            return 0;
        }
        return 1;
    }

}

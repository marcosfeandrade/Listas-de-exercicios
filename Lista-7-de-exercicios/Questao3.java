//Marcos Fellipe Andrade da Silva
package ListadeExercicios;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] mA;
        int[][] mB;
        int l, c;
        char resp;
        System.out.println("Quantidade de linhas da matriz A: ");
        l = in.nextInt();
        System.out.println("Quantidade de colunas da matriz A: ");
        c = in.nextInt();
        mA = new int[l][c];
        mB = new int[c][l];
        fillsA(mA);
        mB = trans(mA, mB);
        System.out.println("Deseja exibir alguma matriz(S para sim e N para não)? ");
        resp = in.next().charAt(0);
        resp = Character.toUpperCase(resp);
        while (resp != 'S' && resp != 'N') {
            System.out.println("Resposta inv�lida.");
            System.out.println("Deseja exibir alguma matriz(S para sim e N para n�o)? ");
            resp = in.next().charAt(0);
            resp = Character.toUpperCase(resp);
        }
        if (resp == 'S') {
            System.out.println("Qual matriz deseja exibir (A para matriz A e B para a transposta de A): ");
            resp = in.next().charAt(0);
            resp = Character.toUpperCase(resp);
            while (resp != 'A' && resp != 'B') {
                System.out.println("Resposta inv�lida.");
                System.out.println("Deseja exibir alguma matriz(A para matriz A e B para a transposta de A)? ");
                resp = in.next().charAt(0);
                resp = Character.toUpperCase(resp);
            }
            if (resp == 'A') {
                showMatrix(mA);
            } else {
                showMatrix(mB);
            }
        }
    }

    public static void fillsA(int[][] mA) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira: ");
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[i].length; j++) {
                System.out.println("(" + (i + 1) + ", " + (j + 1) + ") = ");
                mA[i][j] = in.nextInt();
            }
        }
    }

    public static int[][] trans(int[][] mA, int[][] mB) {
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[i].length; j++) {
                mB[j][i] = mA[i][j];
            }
        }
        return mB;
    }

    public static void showMatrix(int[][] m) {
        for (int i = 0; i <= m.length - 1; i++) {
            for (int j = 0; j <= m[i].length - 1; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
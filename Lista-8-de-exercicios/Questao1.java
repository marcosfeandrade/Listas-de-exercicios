//Marcos Fellipe Andrade da Silva
package ListadeExercicios;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        int[][] vectM = new int[4][4];
        int aux;
        System.out.println("Preencha a matriz");
        fillsVect(vectM);
        aux = symmetrical(vectM);
        if (aux == 0) {
            System.out.println("A matriz é simétrica!");
        } else {
            System.err.println("A matriz não é simétrica!");
        }
    }

    public static void fillsVect(int[][] vectM) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < vectM.length; i++) {
            for (int j = 0; j < vectM[i].length; j++) {
                System.out.println("(" + (i + 1) + ", " + (j + 1) + ")");
                vectM[i][j] = in.nextInt();
            }
        }
    }

    public static int symmetrical(int[][] vectM) {
        boolean sym = true;
        for (int i = 0; i < vectM.length; i++) {
            for (int j = 0; j < vectM[i].length; j++) {
                if (vectM.length != vectM[i].length) {
                    sym = false;
                }
                if (vectM[i][j] != vectM[j][i]) {
                    sym = false;
                }
            }
        }
        if (sym == true) {
            return 0;
        }
        return -1;
    }

}

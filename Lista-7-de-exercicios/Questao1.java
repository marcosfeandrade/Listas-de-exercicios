//Marcos Fellipe Andrade da Silva
package ListadeExercicios;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        String[] n = new String[20];
        double[][] vectM = new double[20][3]; //alunos = linha; notas = coluna
        fillsName(n, vectM);
    }

    public static void fillsName(String[] n, double[][] vectM) {
        Scanner in = new Scanner(System.in);
        int i;
        for (i = 0; i < vectM.length; i++) {
            System.out.println("Nome do aluno: ");
            n[i] = in.nextLine();
            fillsNote(i, vectM, n);
            showA(n, i, vectM);
        }
    }

    public static void fillsNote(int i, double[][] vectM, String[] n) {
        Scanner in = new Scanner(System.in);
        System.out.println("Primeira nota: ");
        vectM[i][0] = in.nextDouble();
        while (vectM[i][0] < 0 && vectM[i][0] > 10) {
            System.out.println("Apenas notas entre 0 e 10: ");
            vectM[i][0] = in.nextDouble();
        }
        System.out.println("Segunda nota: ");
        vectM[i][1] = in.nextDouble();
        while (vectM[i][1] < 0 && vectM[i][1] > 10) {
            System.out.println("Apenas notas entre 0 e 10: ");
            vectM[i][1] = in.nextDouble();
        }
    }

    public static void showA(String[] n, int i, double[][] vectM) {
        System.out.println("O aluno " + n[i] + " obteve média " + vectM[i][3]);
    }

}

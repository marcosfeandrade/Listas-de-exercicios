//Marcos Fellipe Andrade da Silva
package ListadeExercicios;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        String[] n = new String[20];
        double[][] vectM = new double[20][3]; //alunos = linha; notas = coluna
        fillsName(n, vectM);
        double A = classAverage(vectM);
        System.out.println(percentage(vectM, A) + " alunos ficaram com media abaixo da média da turma");
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
        vectM[i][2] = ((vectM[i][0] * 2) + (vectM[i][1] * 3)) / 5;
    }

    public static void showA(String[] n, int i, double[][] vectM) {
        System.out.println("O aluno " + n[i] + " obteve média " + vectM[i][2]);
    }

    public static double classAverage(double[][] vectM) {
        double A = 0;
        for (int i = 0; i < vectM.length; i++) {
            A = A + vectM[i][2];
        }
        return A / vectM.length;
    }

    public static int percentage(double[][] vectM, double A) {
        int bM = 0;
        for (int i = 0; i < vectM.length; i++) {
            if (vectM[i][2] < A) {
                bM++;
            }
        }
        return bM;
    }

    public static void bigSmallAverage(double[][] vectM) {
        double bigger = -1, smaller = 11;
        for (int i = 0; i < vectM.length; i++) {
            if (vectM[i][2] > bigger) {
                bigger = vectM[i][2];
            }
            if (vectM[i][2] < smaller) {
                smaller = vectM[i][2];
            }
        }
        System.out.println("A maior média da turma foi: " + bigger);
        System.out.println("A menor média da turma foi:" + smaller);
    }
}

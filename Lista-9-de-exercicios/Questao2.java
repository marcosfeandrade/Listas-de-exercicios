//Marcos Fellipe Andrade da Silva
package listasdeexercicios;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] vect;
        int lin;
        int col;
        int min;
        System.out.println("Linhas da matriz:  ");
        lin = in.nextInt();
        System.out.println("Colunas da matriz: ");
        col = in.nextInt();
        vect = new double[lin][col];
        fillsM(vect);
        min = min(vect);
        max(vect, min);
    }

    public static void fillsM(double[][] vect) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira os elementos: ");
        for (int i = 0; i < vect.length; i++) {
            for (int c = 0; c < vect[i].length; c++) {
                System.out.println("(" + (i + 1) + ", " + (c + 1) + ")");
                vect[i][c] = in.nextDouble();
            }
        }
    }
    
    public static int min(double[][] vect){
        double min = Double.MAX_VALUE;
        int l = 0;
        for (int i = 0; i < vect.length; i++) {
            for (int j = 0; j < vect[i].length; j++) {
                if(vect[i][j] < min){
                    min = vect[i][j];
                    l = i;
                }
            }
        }
        return l;
    }
    
    public static void max(double[][] vect, int min){
        double maior = 0;
        for(int i = 0; i < vect.length; i++){
                maior += vect[min][i];
        }
        System.out.println("O MINMAX desta matriz é: " + maior);
    }
}

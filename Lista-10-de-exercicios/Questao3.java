package listasdeexercicios;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        double[][] vect = new double[5][5];
        fillsM(vect);
        double maior = maior(vect);
        multDS(vect, maior);
        
    }

     public static void fillsM(double[][] vect) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira os elementos: ");
        for (int i = 0; i < vect.length; i++) {
            for (int c = 0; c < vect[i].length; c++) {
                System.out.println("(" + (c + 1) + ", " + (i + 1) + ")");
                vect[c][i] = in.nextDouble();
            }
        }
    }
     
     public static double maior(double[][] vect){
         double maior = Double.MIN_VALUE;
         for (int i = 0; i < vect.length; i++) {
             for (int j = 0; j < vect[i].length; j++) {
                 if(vect[i][j] > maior){
                     maior = vect[i][j];
                 }
             }
         }
         return maior;
     }
     
     public static void multDS(double[][] vect, double maior){
         int l = 0;
        for (int i = vect.length - 1; i >= 0; i--) {
            vect[l][i] *= maior;
            l++;
        }
        printM(vect);
     }
     
     public static void printM(double[][] vect) {
        for (int i = 0; i < vect.length; i++) {
            for (int j = 0; j < vect[i].length; j++) {
                System.out.print(vect[i][j] + " ");
            }
            System.out.println();
        }
    }
}

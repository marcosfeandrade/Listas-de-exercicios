package listasdeexercicios;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        double[] vect = new double[10];
        int[][] matrix = new int[5][10]; //armazem(l) x qtd de cada prod(c)
        fillsVect(vect);
        fillsMatrix(matrix);
        prodArm(matrix);
        totalProd(matrix);
        maiorEst(matrix, vect);
        valArm(matrix, vect);
    }

    public static void fillsVect(double[] vect) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira os preços do ");
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Poduto " + (i + 1) + ": ");
            vect[i] = in.nextInt();
        }
    }

    public static void fillsMatrix(int[][] matrix) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a quantidade de cada produto estocada no ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Armazem: " + (i + 1));
                System.out.println("Produto: " + (j + 1));
                matrix[i][j] = in.nextInt();
            }
        }
    }

    public static void prodArm(int[][] matrix) {
        int qtd;

        for (int i = 0; i < matrix.length; i++) {
            qtd = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                qtd += matrix[i][j];
            }
            System.out.print("Armazem " + (i + 1) + " possui ");
            System.out.print(qtd + " produtos");
            System.out.println();
        }
    }

    public static void totalProd(int[][] matrix) {
        int qtd;
        for (int i = 0; i < matrix[0].length; i++) {
            qtd = 0;
            for (int j = 0; j < matrix.length; j++) {
                    qtd += matrix[j][i];
            }
            System.out.println("Produto " + (i + 1) + " há " + qtd + " estocados");
        }
    }
    
    public static void maiorEst(int[][] matrix, double[] vect){
        int maior;
        int j;
        for (int i = 0; i < matrix[0].length; i++) {
           maior = 0;
            for (j = 0; j < matrix.length; j++) {
                if(matrix[j][i] > maior){
                    maior = matrix[j][i];
                }
            }
            System.out.println("O preço do produto de maior estoque " + i + " no armazem " + j + " é " + vect[j]);
        }
    }
    
    public static void menorEst(int[][] matrix){
        int menor;
        int j = 0;
        for (int i = 0; i < matrix.length; i++) {
           menor = Integer.MAX_VALUE;
            for (j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < menor){
                    menor = matrix[i][j];
                }
            }
        }
        System.out.println("O menor estoque é " + j);
    }
    
    public static void valArm(int[][] matrix, double[] vect){
        int j;
        double total;
        for (int i = 0; i < matrix.length; i++) {
            total = 0;
            for (j = 0; j < matrix[i].length; j++) {
               total += matrix[i][j]; 
            }
            System.out.println("O valor total no armazem " + (i + 1) + " foi de " + total);
        }
    }
}

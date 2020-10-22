//Marcos Fellipe Andrade da Silva
package listasdeexercicios;

import java.util.Scanner;

public class Questao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] vect;
        int o;
        boolean aux;
        System.out.println("Insira a ordem da Matriz: ");
        o = in.nextInt();
        vect = new int[o][o];
        fillsM(vect);
        aux = permutationMatrix(vect);
        if(aux){
            System.out.println("A matriz é de permutação! ");
            printM(vect);
        }
        else{
            System.out.println("A matriz não é de permutação! ");
            printM(vect);
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

    public static boolean permutationMatrix(int[][] vect) {
        if(testLine(vect) && testColumn(vect)){
            return true;
        }
        return false;
    }
    
    public static boolean testLine(int[][] vect){
        int count = 0;
        for (int i = 0; i < vect.length; i++) {
            for (int c = 0; c < vect[i].length; c++) {
                if (vect[i][c] < 0 || vect[i][c] > 1) {
                    return false;
                }
                if (vect[i][c] == 1) {
                    count++;
                }
            }
            if (count != 1) {
                    return false;
                }
            count = 0;
        }
        return true;
    }
    
    public static boolean testColumn(int[][] vect){
        int count = 0;
        for (int i = 0; i < vect.length; i++) {
            for (int c = 0; c < vect[i].length; c++) {
                if (vect[c][i] < 0 || vect[c][i] > 1) {
                    return false;
                }
                if (vect[c][i] == 1) {
                    count++;
                }
            }
            if (count != 1) {
                    return false;
                }
            count = 0;
        }
        return true;
    }


    public static void printM(int[][] vect) {
        for (int i = 0; i < vect.length; i++) {
            for (int j = 0; j < vect[i].length; j++) {
                System.out.print(vect[i][j] + " ");
            }
            System.out.println();
        }
    }

}

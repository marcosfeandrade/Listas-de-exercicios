//Marcos Fellipe Andrade da Silva
package ListadeExercicios;

import java.util.Scanner;
import java.util.Random;

public class Questao1 {

    public static void main(String[] args) {
        int[] vect = new int[100];
        int qtt;
        qtt = fillsVect(vect);
        bubbleSort(vect, qtt);
        showValues(vect, qtt);
        searchVect(vect, qtt);
    }

    public static void searchVect(int[] vect, int qtt) {
        Scanner in = new Scanner(System.in);
        int num, ret;
        char resp;
        System.out.println("Deseja buscar um número(s para sim e n para não)? ");
        resp = in.next().charAt(0);
        resp = Character.toUpperCase(resp);
        while (resp != 'S' && resp != 'N') {
            System.out.println("Resposta inválida.");
            System.out.println("Deseja buscar um número(s para sim e n para não)? ");
            resp = in.next().charAt(0);
            resp = Character.toUpperCase(resp);
        }
        if (resp == 'S') {
            System.out.println("Digite o número buscado: ");
            num = in.nextInt();
            ret = binarySearch(vect, qtt, num);
            if (ret != -1) {
                System.out.println("O número " + num + " está presente no vetor na posição " + ret);
            } else {
                System.out.println("Número não encontrado.");
            }
        }
    }

    public static int fillsVect(int[] vect) {
        int i;
        Random gen = new Random();
        for (i = 0; i < vect.length; i++) {
            vect[i] = gen.nextInt(10000) + 1;
        }
        return i;
    }

    public static void bubbleSort(int[] vect, int qtt) {
        int i, end, pos;
        int chave;
        boolean troca;
        end = qtt - 2;
        pos = 0;
        do {
            troca = false;
            for (i = 0; i <= end; i++) {
                if (vect[i] < vect[i + 1]) {
                    chave = vect[i];
                    vect[i] = vect[i + 1];
                    vect[i + 1] = chave;
                    pos = i;
                    troca = true;
                }
            }
            end = pos - 1;
        } while (troca == true);
    }

    public static int binarySearch(int[] vect, int qtt, int num) {
        int mid;
        int low = 0;
        while (low <= qtt) {
            mid = (low + qtt) / 2;
            if (vect[mid] == num) {
                return mid;
            } else if (vect[mid] > num) {
                low = mid + 1;
            } else if (vect[mid] < num) {
                qtt = mid - 1;
            }
        }
        return -1;
    }

    public static void showValues(int[] vect, int qtt) {
        for (int i = 0; i < qtt; i++) {
            System.out.println(vect[i]);
        }
    }

}

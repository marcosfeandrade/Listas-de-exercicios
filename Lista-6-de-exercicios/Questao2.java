//Marcos Fellipe Andrade da Silva
package ListadeExercicios;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        String[] vectN = new String[3];
        int qtt = 0;
        qtt = fillsVect(vectN, qtt);
        bubbleSort(vectN, qtt);
        showValues(vectN, qtt);
        search(vectN, qtt);
    }

    public static void search(String[] vectN, int qtt) {
        Scanner in = new Scanner(System.in);
        char resp = 'S';
        String s;
        while(resp == 'S') {
            System.out.println("Deseja buscar um nome(S para sim e N para não)? ");
            resp = in.next().charAt(0);
            resp = Character.toUpperCase(resp);
            while (resp != 'S' && resp != 'N') {
                System.out.println("Resposta inválida. ");
                System.out.println("Deseja buscar um nome(S para sim e N para não)? ");
                resp = in.next().charAt(0);
                resp = Character.toUpperCase(resp);
            }
            if (resp == 'S') {
                System.out.println("Insira o nome buscado: ");
                s = in.next();
                binarySearch(vectN, qtt, s);
            }
        }
    }

    public static int fillsVect(String[] vect, int qtt) {
        Scanner in = new Scanner(System.in);
        int i;
        for (i = 0; i < vect.length; i++) {
            System.out.println("Insira o nome: ");
            vect[i] = in.nextLine();
        }
        return ++qtt;
    }

    public static void bubbleSort(String[] vect, int qtt) {
        int i, j;
        String aux;
        for (i = 0; i < vect.length - 1; i++) {
            for (j = 0; j < vect.length - 1; j++) {
                if (vect[i].compareTo(vect[j + 1]) > 0) {
                    aux = vect[j];
                    vect[j] = vect[j + 1];
                    vect[j + 1] = aux;
                }
            }
        }
    }

    public static int binarySearch(String[] vect, int qtt, String wan) {
        int mid;
        int low = 0;
        while (low <= qtt) {
            mid = (low + qtt) / 2;
            if (vect[mid] == wan) {
                return mid;
            } else if (vect[mid].compareTo(wan) < 0) {
                low = mid + 1;
            } else if (vect[mid].compareTo(wan) > 0) {
                qtt = mid - 1;
            }
        }
        return -1;
    }

    public static void showValues(String[] vect, int qtt) {
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
    }

}

//Marcos Fellipe Andrade da Silva
package listadeexercicio;

import java.util.Scanner;

public class Questao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        System.out.println("Digite uma placa: ");
        String placa = in.nextLine();
        size = placa.length();
        boolean a = calcula(placa, size);
        if (size != 7) {
            System.out.println("A placa " + placa + " não é válida.");
        } else {
            if (a) {
                System.out.println("A placa " + placa + " é válida.");
            } else {
                System.out.println("A placa " + placa + " não é válida.");
            }
        }
    }

    public static boolean calcula(String placa, int size) {
        for (int i = 0; i < size - 4; i++) {
            if (!Character.isLetter(placa.charAt(i))) {
                return false;
            }
        }
        for (int j = size - 1; j > 2; j--) {
            if (!Character.isDigit(placa.charAt(j))) {
                return false;
            }
        }
        return true;
    }

}

//Marcos Fellipe Andrade da Silva
package listasexercicios;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String car1, car2;
        System.out.println("Digite uma sequencia de caracteres: ");
        car1 = in.nextLine();
        System.out.println("Digite outra sequencia de caracteres: ");
        car2 = in.nextLine();
        if (compara(car1, car2) == -1) {
            System.out.println("As sequencias são diferentes.");
        } else {
            System.out.println("As sequencias são iguais.");
        }
    }

    public static int compara(String car1, String car2) {
        int size = car1.length();
        if (car1.length() != car2.length()) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (car1.charAt(i) != car2.charAt(i)) {
                return -1;
            }
        }
        return 0;
    }
}

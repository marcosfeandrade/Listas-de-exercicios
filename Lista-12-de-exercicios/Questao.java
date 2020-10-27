//Marcos Fellipe Andrade da Silva
package listasexercicios;

import java.util.Scanner;

public class Questao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        System.out.println("Digite uma CPF: ");
        String cpf = in.nextLine();
        size = cpf.length();
        while (size != 11) {
            System.out.println("CPF inválido. Digite novamente");
            cpf = in.nextLine();
            size = cpf.length();
        }
        imprimeCPF(cpf, size);
    }

    public static void imprimeCPF(String cpf, int size) {
        int count = 0;
        for (int i = 0; i < size - 2; i++) {
            if (count == 3) {
                count = 0;
                System.out.print(".");
            }
            System.out.print(cpf.charAt(i));
            count++;
        }
        System.out.print("-");
        for (int j = size - 2; j < size; j++) {
            System.out.print(cpf.charAt(j));
        }
    }

}

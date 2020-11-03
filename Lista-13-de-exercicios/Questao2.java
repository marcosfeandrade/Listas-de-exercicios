package listadeexercicio;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String conta;
        char digito;
        int sizeC;
        System.out.println("Numero da conta: ");
        conta = in.nextLine();
        sizeC = conta.length();
        while (sizeC != 6) {
            System.out.println("Numero inválido. Insira novamente o numero da conta");
            conta = in.nextLine();
            sizeC = conta.length();
        }
        System.out.println("Digito verificador: ");
        digito = in.next().charAt(0);
        verify(conta, digito, sizeC);
    }

    public static void verify(String conta, char digito, int size) {
        int resto, soma = 0;
        char digitoCalculado;
        resto = digito - '0';
        for (int i = 0; i < size; i++) {
            soma = soma + ((conta.charAt(i) - '0') * pow(2, i));
        }
        resto = soma % 11;
        if (resto >= 0 && resto <= 9) {
            digitoCalculado = Integer.toString(resto).charAt(0);
        } else {
            digitoCalculado = 'X';
        }
        if (digitoCalculado == digito) {
            System.out.println("Digito valido.");
        } else {
            System.out.println("Digito invalido.");
        }

    }

    public static int pow(int digito, int i) {
        int j = 1;
        for (int k = 0; k < i; k++) {
            j = j * digito;
        }
        return j;
    }
}

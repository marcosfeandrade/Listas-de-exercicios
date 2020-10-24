//Marcos Fellipe Andrade da Silva
package listasexercicios;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char resp;
        do {
            while(!nomeValida());
            System.out.println("Deseja escrever outro nome(s para sim e n para nÃ£o)? ");
            resp = in.next().charAt(0);
            resp = Character.toLowerCase(resp);
            while (resp != 's' && resp != 'n') {
                System.out.println("Resposta invÃ¡lida.");
                System.out.println("Deseja escrever outro nome(s para sim e n para nÃ£o)? ");
                resp = in.next().charAt(0);
                resp = Character.toLowerCase(resp);
            }
        } while (resp == 's');
    }

    public static boolean nomeValida() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String nome = in.nextLine();
        int size = nome.length();
        for (int i = 0; i < size; i++) {
            if (identificaSimboloeDigito(nome, i)) {
                System.out.println("O nome esta escrito errado");
                return false;
            }
        }
        return true;
    }

    public static boolean identificaSimboloeDigito(String nome, int i) {
        if (nome.charAt(i) == '!' || nome.charAt(i) == '@' || 
                nome.charAt(i) == '#' || nome.charAt(i) == '$' ||
                nome.charAt(i) == '%' || nome.charAt(i) == '&' ||
                nome.charAt(i) == '*' || nome.charAt(i) == '(' ||
                nome.charAt(i) == ')' || nome.charAt(i) == '-' ||
                nome.charAt(i) == '+') {
            return true;
        }
        return false;
    }
}

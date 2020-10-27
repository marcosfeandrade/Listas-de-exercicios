//Marcos Fellipe Andrade da Silva
package listasexercicios;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] med = new double[30];
        String[] nome = new String[30];
        String[] sit = new String[30];
        char resp;
        int posi;
        insereNomes(nome);
        insereNotas(med, nome);
        preencheSituacao(med, sit);
        System.out.println("Deseja buscar algum aluno, S para sim e N para não? ");
        resp = in.next().charAt(0);
        resp = Character.toUpperCase(resp);
        while (resp != 'S' && resp != 'N') {
            System.out.println("Resposta inválida, digite novamente.");
        }
        while (resp == 'S') {
            System.out.println("Digite o nome do aluno buscado: ");
            String buscado = in.nextLine();
            posi = dados(nome, buscado);
            
            System.out.println("Deseja buscar outro aluno, S para sim e N para não? ");
            resp = in.next().charAt(0);
            resp = Character.toUpperCase(resp);
            while (resp != 'S' && resp != 'N') {
                System.out.println("Resposta inválida, digite novamente.");
            }
        }
    }

    public static void insereNomes(String[] nome) {
        int size;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Insira o nome do aluno " + i);
            nome[i] = in.nextLine();
            size = nome[i].length();
            for (int j = 0; j < size; j++) {
                while (!Character.isLetter(nome[i].charAt(j)) && !Character.isSpace(nome[i].charAt(j))) {
                    System.out.println("Nome errado. Insira novamente o nome do aluno " + i);
                    nome[i] = in.nextLine();
                }
            }

        }
    }

    public static void insereNotas(double[] med, String[] nome) {
        Scanner in = new Scanner(System.in);
        double n1, n2;
        for (int i = 0; i < med.length; i++) {
            System.out.println("Insira a primeira nota do aluno " + nome[i] + ": ");
            n1 = in.nextDouble();
            while (n1 < 0 || n1 > 10) {
                System.out.println("Nota inválida. Insira novamente: ");
                n1 = in.nextDouble();
            }
            System.out.println("Insira a segunda nota do aluno " + nome[i] + ": ");
            n2 = in.nextDouble();
            while (n2 < 0 || n2 > 10) {
                System.out.println("Nota inválida. Insira novamente: ");
                n2 = in.nextDouble();
            }
            med[i] = ((n1 * 2) + (n2 * 2)) / 5;
        }
    }

    public static void preencheSituacao(double[] med, String[] sit) {
        for (int i = 0; i < sit.length; i++) {
            if (med[i] < 3) {
                sit[i] = "reprovado";
            } else if (med[i] >= 7) {
                sit[i] = "aprovado";
            } else {
                sit[i] = "em recuperacao";
            }
        }
    }

    public static int dados(String[] nome, String buscado) {
        for(int i = 0; i < nome.length; i++){
            if(buscado.equals(nome[i])){
                return i;
            }
        }
        return -1;
    }
    
    public static void imprimeDados(double[] med, String[] nome, String[] sit){
        for(int i = 0; i < med.length; i++){
            System.out.println("O aluno " + nome[i] + " obteve média " + med[i] + " e foi " + sit[i]);
        }
    }

}

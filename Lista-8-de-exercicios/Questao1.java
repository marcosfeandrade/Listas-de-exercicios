//Marcos Fellipe Andrade da Silva
package ListadeExercicios;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        char gab[] = new char[100];
        char resp[][] = new char[50][100]; //alunos = linhas, resp = colunas
        String nome[] = new String[50];
        int certa[] = new int[50];
        fillsGab(gab);
        fillsName(nome);
        fillsResp(resp, nome);
        correct(gab, resp, certa);
        apRep(certa, nome);
    }

    public static void fillsGab(char[] gab) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < gab.length; i++) {
            System.out.println("Questao " + (i + 1) + ": ");
            gab[i] = in.next().charAt(0);
            gab[i] = Character.toUpperCase(gab[i]);
            while (gab[i] != 'A' && gab[i] != 'B' && gab[i] != 'C' && gab[i] != 'D' && gab[i] != 'E') {
                System.err.println("Resposta invalida, apenas (A, B, C, D ou E)");
                System.out.println("Questao " + (i + 1));
                gab[i] = in.next().charAt(0);
                gab[i] = Character.toUpperCase(gab[i]);
            }
        }
    }

    public static void fillsName(String[] nome) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < nome.length; i++) {
            nome[i] = in.nextLine();
        }
    }

    public static void fillsResp(char[][] resp, String[] nome) {
        Scanner in = new Scanner(System.in);
        for (int a = 0; a < resp.length; a++) {
            for (int r = 0; r < resp[a].length; r++) {
                System.out.println("Aluno " + nome[a] + " insira a resposta da questao " + r + ": ");
                resp[a][r] = in.next().charAt(0);
            }
        }
    }

    public static void correct(char[] gab, char[][] resp, int[] certa) {
        for (int l = 0; l < resp.length; l++) {
            for (int c = 0; c < gab.length; c++) {
                if (resp[l][c] == gab[c]) {
                    certa[l]++;
                }
            }
        }
    }
    
    public static void apRep(int[] certa, String[] nome){
        for(int i = 0; i < certa.length; i++){
            if(certa[i] > 70){
                System.out.println("O aluno " + nome[i] + " esta aprovado!");
            }
            else{
                System.out.println("O aluno " + nome[i] + " esta reprovado");
            }
        }
    }
}

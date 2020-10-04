//Marcos Fellipe Andrade da Silva
package listasdeexercicios;

import java.util.Scanner;

public class Questão3 {

    public static void main(String[] args) {
        double[][] vectM = new double[9][13];
        String[] fruta = {"abacaxi", "banana", "maca", "mamao", "melancia", "melao", "tangerina", "uva"};
        String[] mes = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        fillsM(vectM, fruta, mes);
        menu(vectM, fruta, mes);
    }

    public static void fillsM(double[][] vectM, String[] fruta, String[] mes) {
        Scanner in = new Scanner(System.in);

        for (int c = 0; c < vectM[0].length - 1; c++) { //mes
            for (int l = 0; l < vectM.length - 1; l++) { //preenche fruta
                System.out.println("Informe o valor arrecadado em " + mes[c] + " com a venda de " + fruta[l]);
                vectM[l][c] = in.nextDouble();
            }
        }
        for (int f = 0; f < 8; f++) { //fatura fruta
            for (int s = 0; s < 12; s++) {
                vectM[f][12] += vectM[f][s];
            }
        }
        for (int i = 0; i < 12; i++) { //fatura mes
            for (int j = 0; j < 8; j++) {
                vectM[8][i] += vectM[j][i];
            }
        }
    }

    public static void menu(double[][] vectM, String[] fruta, String[] mes) {
        Scanner in = new Scanner(System.in);
        char resp;
        double aux;
        do {
            System.out.println("Para calcular a fatura média mensal digite 1; ");
            System.out.println("Para calcular a fatura anual de uma fruta digite 2; ");
            System.out.println("Para calcular a fatura mensal digite 3; ");
            System.out.println("Para calcular a fatura anual digite 4; ");
            System.out.println("Para encerrar o programa digite 5. ");
            resp = in.next().charAt(0);
            while (resp != '1' && resp != '2' && resp != '3' && resp != '4' && resp != '5') {
                System.out.println("Resposta inválida. Digite novamente: ");
                resp = in.next().charAt(0);
            }
            switch (resp) {
                case '1':
                    aux = fatMedMes(vectM);
                    System.out.println(aux);
                    break;
                case '2':
                    System.out.println("Digite o nome da fruta: ");
                    aux = fatFruta(vectM, fruta);
                    System.out.println("O faturamento anual foi de: " + aux);
                    break;
                case '3':
                    System.out.println("Digite o mes: ");
                    aux = fatMes(vectM, mes);
                    System.out.println("O faturamento do mês escolhido foi de: " + aux);
                    break;
                case '4':
                    aux = fatAno(vectM);
                    break;
                default:
                    break;
            }
        } while (resp != '5');
    }

    public static double fatMedMes(double[][] vectM) {
        int som = 0;
        for (int i = 0; i < 12; i++) {
            som += vectM[8][i];
        }
        return som / 12;
    }

    public static double fatFruta(double[][] vectM, String[] fruta) {
        Scanner in = new Scanner(System.in);
        String nomeF;
        nomeF = in.nextLine();
        while (!nomeF.equalsIgnoreCase(fruta[0]) && !nomeF.equalsIgnoreCase(fruta[1]) && !nomeF.equalsIgnoreCase(fruta[2]) && !nomeF.equalsIgnoreCase(fruta[3]) && !nomeF.equalsIgnoreCase(fruta[4]) && !nomeF.equalsIgnoreCase(fruta[5]) && !nomeF.equalsIgnoreCase(fruta[6]) && !nomeF.equalsIgnoreCase(fruta[7])) {
            System.out.println("Fruta inválida. Digite novamente: ");
            nomeF = in.nextLine();
        }
        if (nomeF.equalsIgnoreCase(fruta[0])) {
            return vectM[0][12];
        } else if (nomeF.equalsIgnoreCase(fruta[1])) {
            return vectM[1][12];
        } else if (nomeF.equalsIgnoreCase(fruta[2])) {
            return vectM[2][12];
        } else if (nomeF.equalsIgnoreCase(fruta[3])) {
            return vectM[3][12];
        } else if (nomeF.equalsIgnoreCase(fruta[4])) {
            return vectM[4][12];
        } else if (nomeF.equalsIgnoreCase(fruta[5])) {
            return vectM[5][12];
        } else if (nomeF.equalsIgnoreCase(fruta[6])) {
            return vectM[6][12];
        } else {
            return vectM[7][12];
        }
    }

    public static double fatMes(double[][] vectM, String[] mes) {
        Scanner in = new Scanner(System.in);
        String mesF;
        mesF = in.nextLine();
        int linhaMaxima = 8;
        while (mesF != mes[0] && mesF != mes[1] && mesF != mes[2] && mesF != mes[3] && mesF != mes[4] && mesF != mes[5] && mesF != mes[6] && mesF != mes[7] && mesF != mes[8] && mesF != mes[9] && mesF != mes[10] && mesF != mes[11]) {
            System.out.println("Mês inválido. Digite novamente: ");
            mesF = in.nextLine();
        }
        if (mesF == mes[0]) {
            return vectM[linhaMaxima][0];
        } else if (mesF == mes[1]) {
            return vectM[linhaMaxima][1];
        } else if (mesF == mes[2]) {
            return vectM[linhaMaxima][2];
        } else if (mesF == mes[3]) {
            return vectM[linhaMaxima][3];
        } else if (mesF == mes[4]) {
            return vectM[linhaMaxima][4];
        } else if (mesF == mes[5]) {
            return vectM[linhaMaxima][5];
        } else if (mesF == mes[6]) {
            return vectM[linhaMaxima][6];
        } else if (mesF == mes[7]) {
            return vectM[linhaMaxima][7];
        } else if (mesF == mes[8]) {
            return vectM[linhaMaxima][8];
        } else if (mesF == mes[9]) {
            return vectM[linhaMaxima][9];
        } else if (mesF == mes[10]) {
            return vectM[linhaMaxima][10];
        } else {
            return vectM[linhaMaxima][11];
        }
    }

    public static double fatAno(double[][] vectM) {
        return vectM[8][12];
    }
}

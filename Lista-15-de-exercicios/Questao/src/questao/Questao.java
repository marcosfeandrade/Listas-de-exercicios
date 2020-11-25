//Marcos Fellipe Andrade da Silva
package questao;
import java.util.Scanner;
public class Questao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantidade de datas: ");
        int qtd = in.nextInt();
        int dia, mes, ano;
        Data[] d = new Data [qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.println("Dia: ");
            dia = in.nextInt();
            System.out.println("Mês: ");
            mes = in.nextInt();
            System.out.println("Ano: ");
            ano = in.nextInt();
            d[i] = new Data (dia, mes, ano);
        }
        recursos(d);
    }
    
    public static void recursos(Data[] d){
        Scanner in = new Scanner(System.in);
        int resp;
        do{
            System.out.println("Opções: ");
            System.out.println("1- Imprimir data");
            System.out.println("2 - Imprimir data por extenso");
            System.out.println("3 - Comparar");
            System.out.println("4 - Sair");
            resp = in.nextInt();
            if(resp == 1){
                System.out.println("Numero da data: ");
                int resp2 = in.nextInt();
                System.out.println(d[resp2]);
            } else if(resp == 2){
                System.out.println("Numero da data: ");
                int resp2 = in.nextInt();
                System.out.println(d[resp2].dataPorExtenso());
            } else if(resp == 3){
                System.out.println("Numero da primeira data: ");
                int resp2 = in.nextInt();
                System.out.println("Numero da segunda data: ");
                int resp3 = in.nextInt();
                if(d[resp2].compareTo(d[resp3]) == 0){
                    System.out.println("As datas são iguais.");
                } else if(d[resp2].compareTo(d[resp3]) > 0){
                    System.out.println("A primeira data é maior.");
                } else{
                    System.out.println("A segunda data é maior.");
                }
            }
    } while(resp != 4);
    }
}


package questao2;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantidade de objetos: ");
        int quant = in.nextInt();
        in.nextLine();
        String nome;
        int idade;
        char genero;
        double altura, peso;
        int resp;
        Pessoa pes [] = new Pessoa [quant];
        for (int i = 0; i < quant; i++) {
            System.out.println("Nome: ");
            nome = in.nextLine();
            System.out.println("Idade: ");
            idade = in.nextInt();
            System.out.println("Genero(H ou M): ");
            genero = in.next().charAt(0);
            while(genero != 'H' && genero != 'M'){
                System.out.println("Genero inválido. Insira novamente (H ou M)");
                genero = in.next().charAt(0);
            }
            System.out.println("Altura: ");
            altura = in.nextDouble();
            System.out.println("Peso: ");
            peso = in.nextDouble();
            pes [i] = new Pessoa(nome, idade, genero, altura, peso);
            System.out.println(pes[i]);
            in.nextLine();
        }
        do{
            System.out.println("Deseja realizar algo?");
            System.out.println("1 - Alterar idade");
            System.out.println("2 - Alterar peso");
            System.out.println("3 - Alterar altura");
            System.out.println("4 - Comparar idade");
            System.out.println("5 - Não");
            resp = in.nextInt();
            while(resp < 1 || resp > 5){
                System.out.println("Numero inválido. Insira novamente: ");
                resp = in.nextInt();
            }
            if(resp == 1){
                System.out.println("Numero da pessoa que será alterado: ");
                int num = in.nextInt();
                while(num < 0 || num > quant){
                    System.out.println("Numero invalido. Digite novamente");
                    num = in.nextInt();
                }
                pes[num].atualizarIdade();
                System.out.println(pes[num]);
            } else if(resp == 2){
                System.out.println("Numero da pessoa que será alterado: ");
                int num = in.nextInt();
                while(num < 0|| num > quant){
                    System.out.println("Numero invalido. Digite novamente");
                    num = in.nextInt();
                }
                System.out.println("Novo peso: ");
                double peso2 = in.nextDouble();
                pes[num].atualizarPeso(peso2);
                System.out.println(pes[num]);
            } else if (resp == 3){
                System.out.println("Numero da pessoa que será alterado: ");
                int num = in.nextInt();
                while(num < 0|| num > quant){
                    System.out.println("Numero invalido. Digite novamente");
                    num = in.nextInt();
                }
                System.out.println("Nova altura: ");
                double altura2 = in.nextDouble();
                pes[num].atualizarAltura(altura2);
                System.out.println(pes[num]);
            } else if(resp == 4){
                System.out.println("Numero da primeira pessoa a ser comparado: ");
                int num1 = in.nextInt();
                while(num1 < 0|| num1 > quant){
                    System.out.println("Numero invalido. Digite novamente");
                    num1 = in.nextInt();
                }
                System.out.println("Numero do segundo objeto a ser comparado: ");
                int num2 = in.nextInt();
                while(num2 < 0|| num2 > quant){
                    System.out.println("Numero invalido. Digite novamente");
                    num2 = in.nextInt();
                }
                if(pes[num1].compareTo(pes[num2]) == 0){
                        System.out.println("As pessoas tem a mesma idade");
                    } else{
                        System.out.println("As pessoas tem idades diferentes");
                    }
            }
        }while(resp != 5);
    }
    
}

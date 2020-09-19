//Marcos Fellipe Andrade da Silva
package ListadeExercicios;

import java.util.Scanner;

public class Lista5deExercicios {

    public static int remove(int[] vect, int qtt, int num) {
        int i, aux;
        aux = binarySearch(vect, qtt, num);
        if (aux == -1) {
            return -1;
        } else if (aux == -2) {
            return -2;
        } else {
            for (i = 0; i < qtt; i++) {
                if (vect[i] == num) {
                    vect[i] = vect[i + 1];
                }
            }
        }
        return --qtt;
    }

    public static void showsValues(int[] vect, int qtt) {
        for (int i = 0; i < qtt; i++) {
            System.out.print(vect[i] + " ");
        }
        System.out.println();
    }

    public static int binarySearch(int[] vect, int qtt, int num) {
        int mid;
        int ini = 0;

        while (ini <= qtt) {
            mid = (ini + qtt) / 2;
            if (vect[mid] == num) {
                return mid;
            } else if (vect[mid] < num) {
                ini = mid + 1;
            } else if (vect[mid] > num) {
                qtt = mid - 1;
            }
        }
        return -1;
    }

    public static int insert(int[] vect, int qtt, int num) {
        int i, j;
        if (qtt == 0) {
            vect[qtt] = num;
            return ++qtt;
        } else if (qtt == vect.length) {
            return -2;
        } else {
            if (num > vect[qtt - 1]) {
                vect[qtt] = num;
                return ++qtt;
            } else {
                for (i = 0; i <= qtt - 1; i++) {
                    if (num == vect[i]) {
                        return -1;
                    } else {
                        if (vect[i] > num) {
                            break;
                        }
                    }
                }
                for (j = qtt - 1; j >= i; j--) {
                    vect[j + 1] = vect[j];
                }
                vect[i] = num;
                return ++qtt;
            }
        }
    }

    public static void menu(int[] vectA, int[] vectB) {
        Scanner in = new Scanner(System.in);
        int num, ret, aux, bin;
        int qttA = 0, qttB = 0;
        char resp;
        do {
            System.out.println("Escolha a opção: ");
            System.out.println("1 - Armazenar número");
            System.out.println("2 - Procurar número");
            System.out.println("3 - Exibir números pares");
            System.out.println("4 - Exibir números ímpares");
            System.out.println("5 - Remover número");
            System.out.println("6 - Encerrar programa");
            resp = in.next().charAt(0);
            while (resp != '1' && resp != '2' && resp != '3' && resp != '4' && resp != '5') {
                System.out.println("Opção inválida. Escolha novamente a opção: ");
                System.out.println("1 - Armazenar número");
                System.out.println("2 - Procurar número");
                System.out.println("3 - Exibir números pares");
                System.out.println("4 - Exibir números ímpares");
                System.out.println("5 - Remover número");
                System.out.println("6 - Encerrar programa");
                resp = in.next().charAt(0);
            }
            switch (resp) {

                case '1':
                    System.out.println("Apenas numeros diferentes de 0: ");
                    num = in.nextInt();
                    if (num % 2 == 0) {
                        ret = insert(vectA, qttA, num);
                        if (ret == -2) {
                            System.out.println("O vetor está cheio!");
                        } else if (ret == -1) {
                            System.out.println("O número não pode ser repetido.");
                        } else {
                            qttA = ret;
                        }
                    } else {
                        ret = insert(vectB, qttB, num);
                        if (ret == -2) {
                            System.out.println("O vetor está cheio!");
                        } else if (ret == -1) {
                            System.out.println("O número não pode ser repetido.");
                        } else {
                            qttB = ret;
                        }
                    }
                    break;
                case '2':
                    System.out.println("Insira o número buscado: ");
                    num = in.nextInt();
                    if (num % 2 == 0) {
                        bin = binarySearch(vectA, qttA, num);
                        if (bin == -1) {
                            System.out.println("O numero nao foi encontrado");
                        } else {
                            System.out.println("O numero " + num + " foi encontrado na posicao " + bin + " do vetor");
                        }
                    } else {
                        bin = binarySearch(vectB, qttB, num);
                        if (bin == -1) {
                            System.out.println("O numero nao foi encontrado");
                        }
                        System.out.println("O numero " + num + " foi encontrado na posicao " + bin + " do vetor");
                    }
                    break;
                case '3':
                    showsValues(vectA, qttA);
                    break;
                case '4':
                    showsValues(vectB, qttB);
                    break;
                case '5':
                    System.out.println("Insira o numero para remover: ");
                    num = in.nextInt();
                    if (num % 2 == 0) {
                        aux = remove(vectA, qttA, num);
                        if (aux == -1) {
                            System.out.println("Valor não encontrado");
                        } else if (aux == -2) {
                            System.out.println("O vetor está vazio");
                        } else {
                            qttA = aux;
                        }
                    } else {
                        aux = remove(vectB, qttB, num);
                        if (aux == -1) {
                            System.out.println("Valor não encontrado");
                        } else if (aux == -2) {
                            System.out.println("O vetor está vazio");
                        } else {
                            qttB = aux;
                        }
                    }
                    break;
                default:
                    break;
            }
        } while (resp != '6');
    }

    public static void main(String[] args) {
        int[] vectA = new int[50];
        int[] vectB = new int[50];
        menu(vectA, vectB);
    }
}

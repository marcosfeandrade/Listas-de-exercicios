package questaounica;

public class Cadastro {

    private Funcionario[] funcionarios;
    private int qtd;

    public Cadastro() {
        this.funcionarios = new Funcionario[1000];
        this.qtd = 0;
    }

    public void cadastro(Funcionario cadastrando) {
        int retorno = insertSort(cadastrando);
        if (retorno == -1) {
            System.out.println("Matricula ja utilizada por outro funcionario.");
        } else {
            System.out.println("Cadastrado!");
            qtd++;
        }
    }

    public int insertSort(Funcionario cadastrando) {
        int i, j;
        if (this.qtd == 0) {
            this.funcionarios[this.qtd] = cadastrando;
            return 0;
        } else if (this.qtd == this.funcionarios.length) {
            return -2;
        } else {
            if (Integer.parseInt(cadastrando.getMatricula()) 
                    > Integer.parseInt(this.funcionarios[this.qtd - 1].getMatricula())) {
                this.funcionarios[this.qtd] = cadastrando;
                return 0;
            } else {
                for (i = 0; i < this.qtd; i++) {
                    if (cadastrando.getMatricula().equals(this.funcionarios[i].getMatricula())) {
                        return -1;
                    }
                    if (Integer.parseInt(this.funcionarios[i].getMatricula()) 
                            > Integer.parseInt(cadastrando.getMatricula())) {
                        break;
                    }
                }
                for (j = this.qtd - 1; j >= i; j--) {
                    this.funcionarios[j + 1] = this.funcionarios[j];
                }
                this.funcionarios[i] = cadastrando;
                return 0;
            }
        }
    }

    public void informacoesFuncionarios() {
        for (int i = 0; i < this.qtd; i++) {
            System.out.println("-Matricula: " + funcionarios[i].getMatricula() 
                    + " -Nome: " + funcionarios[i].getNome() + " -Cargo: " 
                    + funcionarios[i].getCargo() + " -Ano: " 
                    + funcionarios[i].getAno() + " -Salario: " 
                    + funcionarios[i].getSalario());
        }
    }

    public void buscaFuncionario(String matricula) {
        int retorno = binarySearch(matricula);
        if (retorno == -1) {
            System.out.println("Funcionario não encontrado");
        } else {
            System.out.println("Funcionario esta na posição: " + retorno);
        }
    }

    public int binarySearch(String matricula) {
        int mid;
        int ini = 0;
        int end;
        end = this.qtd - 1;

        while (ini <= end) {
            mid = (ini + end) / 2;
            if (funcionarios[mid].getMatricula().equals(matricula)) {
                return mid;
            } else if (Integer.parseInt(funcionarios[mid].getMatricula()) 
                    < Integer.parseInt(matricula)) {
                ini = mid + 1;
            } else if (Integer.parseInt(funcionarios[mid].getMatricula()) 
                    > Integer.parseInt(matricula)) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public void aumento(String matricula, double percentual) {
        int retorno = binarySearch(matricula);
        if (retorno == -1) {
            System.out.println("Funcionario não encontrado");
        } else {
            double novoSalario = funcionarios[retorno].getSalario() 
                    + funcionarios[retorno].getSalario()
                    * (percentual / 100);
            funcionarios[retorno].setSalario(novoSalario);
        }
    }

    public void dadosUmFuncionario(String matricula) {
        int retorno = binarySearch(matricula);
        if (retorno == -1) {
            System.out.println("Funcionario não encontrado");
        } else {
            System.out.println("-Matricula: "
                    + funcionarios[retorno].getMatricula() + " -Nome: "
                    + funcionarios[retorno].getNome() + " -Cargo: "
                    + funcionarios[retorno].getCargo() + " -Ano: "
                    + funcionarios[retorno].getAno() + " -Salario: "
                    + funcionarios[retorno].getSalario());
        }
    }

    public void demitir(String matricula) {
        int retorno = binarySearch(matricula);
        if (retorno == -1) {
            System.out.println("Funcionario não encontrado");
        } else {
           remove(matricula);
            System.out.println("Funcionario demitido.");
        }
    }
    
    public int remove(String matricula) {
        int aux;
        int i;
        if (qtd == 0) {
            return -2;
        } else {
            aux = binarySearch(matricula);
            if (aux == -1) {
                return -1;
            } else {
                for (i = 0; i < qtd; i++) {
                    funcionarios[i] = funcionarios[i + 1];
                }
                --qtd;
            }
        }
        return qtd;
    }
}
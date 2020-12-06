package questaounica;

public class Funcionario implements Comparable<Funcionario> {

    private String matricula, nome, cargo;
    private double salario;
    private int ano;

    public Funcionario(String matricula, String nome, String cargo, double salario, int ano) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.ano = ano;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void alteraSalario(double novoSalario) {
        this.salario = novoSalario;
    }

    public String toString() {
        return "-Matricula: " + this.getMatricula() + " -Nome: " + this.getNome() + " -Cargo: " + this.getCargo() + " -Ano: " + this.getAno() + " -Salario: " + this.getSalario();
    }

    @Override
    public int compareTo(Funcionario t) {
        return this.getMatricula().compareTo(t.getMatricula());
    }
}

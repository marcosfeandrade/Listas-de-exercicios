//CLASSE PESSOA
package questao2;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private char genero;
    private double altura, peso, pesoI;
    
    public Pessoa (String nome, int idade, char genero, double altura, double peso){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.calcularPesoIdeal();
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    private String getNome(){
        return this.nome;
    }
    
    private void setIdade(int idade){
        this.idade = idade;
    }
    
    private int getIdade(){
        return this.idade;
    }
    
    private void setGenero(char genero){
        this.genero = genero;
    }
    
    private char getGenero(){
        return this.genero;
    }
    
    private void setAltura(double altura){
        this.altura = altura;
    }
    
    private double getAltura(){
        return this.altura;
    }
    
    private void setPesoI(double pesoI){
        this.pesoI = pesoI;
    }
    
    private double getPesoI(){
        return this.pesoI;
    }
    
    private void setPeso (double peso){
        this.peso = peso;
    }
    
    private double getPeso(){
        return this.peso;
    }
    
    public void calcularPesoIdeal() {
        double pesoIdeal = this.peso / (this.altura * this.altura);
        this.setPesoI(pesoIdeal);
    }
    
    public void atualizarAltura(double alt){
        if(alt >= 0.5 && alt <= 2){
            this.setAltura(alt);
            this.calcularPesoIdeal();
        }
    }
    
    public void atualizarPeso(double pes){
        if(pes >= 3 || pes <= 200){
            this.setPeso(pes);
            this.calcularPesoIdeal();
        }
    }
    
    public void atualizarIdade(){
        this.idade += 1;
    }
    
    public String toString() {
        return "Nome: " + this.nome + " peso ideal: " + this.pesoI + " " + this.altura + " " + this.genero + " " + this.idade + " " + this.peso + " ";
    }
    
    public int compareTo(Pessoa num2) {
        int resultado;
        resultado = this.getIdade() - num2.getIdade();
        return resultado;
    }
}
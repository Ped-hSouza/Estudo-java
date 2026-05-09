package fundamentos.gestaoSalarial;

abstract class Funcionario {

    protected String nome;
    protected double salarioBase;

    protected Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    abstract double calcularSalario();
}

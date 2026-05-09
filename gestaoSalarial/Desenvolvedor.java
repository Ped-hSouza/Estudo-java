package fundamentos.gestaoSalarial;

class Desenvolvedor extends Funcionario {

    int numeroProjetos;

    public Desenvolvedor(String nome, double salarioBase, int numeroProjetos) {
        super(nome, salarioBase);
        this.numeroProjetos = numeroProjetos;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + (500*this.numeroProjetos);
    }

}

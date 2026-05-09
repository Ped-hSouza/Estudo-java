package fundamentos.gestaoSalarial;

import java.util.ArrayList;

public class GestaoDeSalario {

    public static void main(String[] args) {

        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        listaFuncionarios.add(new Gerente("Alice", 5000));
        listaFuncionarios.add(new Desenvolvedor("Bob", 4000, 3));

        for (Funcionario funcionario : listaFuncionarios) {

            System.out.printf("%nFuncionário: %s%nSalário: %.2f%n", funcionario.getNome(), funcionario.calcularSalario());

        }


    }
}

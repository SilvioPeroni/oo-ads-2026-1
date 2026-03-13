import java.util.Date;

public class Funcionario extends Pessoa {

    /*
        taxaComissao é um ATRIBUTO DE CLASSE.
        O valor de um atributo de classe é COMPARTILHADO por
        todos os objetos criados a partir da classe que o definiu.
        A declaração de atributos de classe é caracterizada pelo
        uso da palavra-chave "static".
    */
    public static Double taxaComissao = 10.0;

    // Atributos
    public String matricula;
    public String cargo;
    public Double salarioBase;
    public String departamento;
    public Date dataAdmissao;

    // Métodos
    public Double calcularSalario() {
        return this.salarioBase * (1 + (taxaComissao / 100));
    }

    public void aumentarSalarioBase(Double percentual) {
        if(percentual == null || percentual <= 0) {
            throw new IllegalArgumentException("O percentual de aumento deve ser positivo.");
        }
        this.salarioBase = this.salarioBase * (1 + (percentual / 100));
        System.out.println("Salário base atualizado para R$ " + this.salarioBase);
    }

    public void registrarPonto() {
        System.out.println("Ponto registrado para " + this.nome +
                "\nMatrícula: " + this.matricula +
                "\nData/hora:" + new Date()
        );
    }

    @Override
    public String exibirDados() {

        /*
            A palavra-chave "super" é uma referência à classe-base
            (Pessoa) da classe atual (Funcionário).

            Em vez de reescrever o método exibirDados() do zero,
            chamamos a versão do método implementada na classe
            Pessoa, usando a referência "super" (super.exibirDados();)
            e, em seguida, apenas completamos com as informações que
            são particulares de Funcionario.

            Quando uma classe redefine (reescreve) um método de sua
            classe-base, como nesse caso, a versão reescrita na classe
            derivada deve ser marcada com @Override.
        */
        String dadosPessoa = super.exibirDados();
        return dadosPessoa +
                "\nMatricula: " + this.matricula +
                "\nCargo: " + this.cargo +
                "\nSalário base: R$ " + this.salarioBase +
                "\nDepartamento: " + this.departamento +
                "\nData de admissão: " + this.dataAdmissao;
    }
}

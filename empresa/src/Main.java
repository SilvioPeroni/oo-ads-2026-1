import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //teste01();
        //teste02();
        //teste03();
        //prova01();
        teste04();
    }

    public static void teste01() {
        // Criação do primeiro objeto de pessoa
        Pessoa pessoa1 = new Pessoa(
                "Gervásio Gomes Garcia",
                54,
                "123.456.789-01",
                "gervasio.garcia@empresa.com.br",
                "(16) 98765-4321"
        );

        // Atribuindo valores aos atributos
//        pessoa1.nome = "Gervásio Gomes Garcia";
//        pessoa1.idade = 54;
//        pessoa1.cpf = "123.456.789-01";
//        pessoa1.email = "gervasio.garcia@empresa.com.br";
//        pessoa1.telefone = "(16) 98765-4321";

        // Chamando o método para exibir os dados da pessoa 1
        System.out.println(pessoa1.exibirDados());

        System.out.println("-".repeat(80));  // Traço separador

        pessoa1.fazerAniversario();

        // Chamando a apresentação da pessoa, que reflete a nova idade
        pessoa1.apresentar();

        System.out.println("-".repeat(80));  // Traço separador

        // Atualizando o e-mail
        pessoa1.atualizarEmail("ggarcia@outlook.com");

        System.out.println("-".repeat(80));  // Traço separador

        // Exibindo novamente os dados para conferir as alterações feitas
        System.out.println(pessoa1.exibirDados());

        // Alterando novamente o e-mail por meio de manipulação direta
        // do valor do atributo
        pessoa1.email = "garcia.gervasio@bol.com.br";

        System.out.println("-".repeat(80));  // Traço separador

        // Exibindo novamente os dados para conferir as alterações feitas
        System.out.println(pessoa1.exibirDados());

        System.out.println("*".repeat(80));

        // Vamos criar o primeiro objeto da classe Funcionario
        Funcionario func1 = new Funcionario(
                "Veneranda Vieira",
                26,
                "987.654.321-09",
                "veneranda@empresa.com.br",
                "(36) 91234-5678",
                "F0123",
                "Assistente Financeiro",
                3500.00,
                "Gerência Financeira"
        );

        // Dando valor aos atributos do funcionário
        // (inclui atributos herdados de Pessoa)
//        func1.nome = "Veneranda Vieira";
//        func1.idade = 26;
//        func1.cpf = "987.654.321-09";
//        func1.email = "veneranda@empresa.com.br";
//        func1.telefone = "(36) 91234-5678";
//        //----//
//        func1.matricula = "F0123";
//        func1.cargo = "Assistente Financeiro";
//        func1.salarioBase = 3500.00;
//        func1.departamento = "Gerência Financeira";
//        func1.dataAdmissao = new Date();

        // Exibindo os dados do funcionário
        System.out.println(func1.exibirDados());

        System.out.println("-".repeat(80));

        func1.fazerAniversario();

        // Exibindo os dados novamente para verificar mudança de idade
        System.out.println(func1.exibirDados());

        System.out.println("-".repeat(80));

        // Calculando o salário de Veneranda
        Double salarioFinal = func1.calcularSalario();
        System.out.println("O salário final de Veneranda é R$ " + salarioFinal);
    }

    public static void teste02() {

//        System.out.println("%".repeat(80));
//
//        Pessoa p = new Pessoa();
//        System.out.println("Exibindo dados de uma pessoa...");
//        System.out.println(p.exibirDados());
//
//        Funcionario f = new Funcionario();
//        System.out.println("Exibindo dados de um funcionário...");
//        System.out.println(f.exibirDados());
    }

    public static void teste03() {
        ContaBancaria c1 = new ContaBancaria(123,"Adamastor Asdrúbal", 300.00);
        ContaBancaria c2 = new ContaBancaria(456, "Marieta Moraes", 450.00);
        ContaBancaria c3 = new ContaBancaria(789, "Pedrolino Pereira", 280.00);

        c1.depositar(150.00);
        c2.depositar(78.00);
        c3.depositar(110.00);

        c1.sacar(70.00);
        c2.sacar(150.00);
        c3.sacar(44.00);

        c1.exibirSaldo();
        c2.exibirSaldo();
        c3.exibirSaldo();

        System.out.println("*".repeat(80));

        ContaEspecial ce1 = new ContaEspecial(1234, "Bertolino Borges", 500.00, 2000.00);
        ContaEspecial ce2 = new ContaEspecial(5678, "Jeruza Junqueira", 800.00, 1500.00);
        ContaEspecial ce3 = new ContaEspecial(9012, "Orozina Oliveira", 1000.00, 1000.00);

        ce1.exibirSaldo();
        ce1.exibirSaldoReal();

        ce2.exibirSaldo();
        ce2.exibirSaldoReal();

        ce3.exibirSaldo();
        ce3.exibirSaldoReal();

        ce1.depositar(200.00);
        ce2.depositar(250.00);
        ce3.depositar(150.00);

        ce1.sacar(800.00);
        ce2.sacar(2000.00);
        ce3.sacar(1100.00);

        ce1.exibirSaldo();
        ce1.exibirSaldoReal();

        ce2.exibirSaldo();
        ce2.exibirSaldoReal();

        ce3.exibirSaldo();
        ce3.exibirSaldoReal();
    }

    public static void prova01() {
        Estudante e1 = new Estudante(
                "Adamastor Alves",
                20,
                "111.111.111-11",
                "adamastor@faculdade.edu.br",
                "(16) 91111-1111",
                "Administração"
        );

        Estudante e2 = new Estudante(
                "Belisa Borges",
                19,
                "222.222.222-22",
                "belisa@faculdade.edu.br",
                "(16) 92222-2222",
                "Biomedicina"
        );

        Estudante e3 = new Estudante(
                "Cosme Cordeiro",
                18,
                "333.333.333-33",
                "cosme@faculdade.edu.br",
                "(16) 93333-3333",
                "Ciências Contábeis"
        );

        Estudante e4 = new Estudante(
                "Deusdete Duarte",
                21,
                "444.444.444-44",
                "deusdete@faculdade.edu.br",
                "(16) 94444-4444",
                "Direito"
        );

        e1.nota1Bim = 8.5;
        e1.nota2Bim = 6.0;

        e2.nota1Bim = 5.6;
        e2.nota2Bim = 4.3;

        e3.nota1Bim = 10.0;
        e3.nota2Bim = 8.2;

        e4.nota1Bim = 7.0;
        e4.nota2Bim = 4.6;

        System.out.println(e1.exibirDados());
        System.out.println("-".repeat(80));

        System.out.println(e2.exibirDados());
        System.out.println("-".repeat(80));

        System.out.println(e3.exibirDados());
        System.out.println("-".repeat(80));

        System.out.println(e4.exibirDados());
        System.out.println("-".repeat(80));
    }

    public static void teste04() {
        ContaBancaria c1 = new ContaBancaria(987, "Zeferino Zacarias", 500.00);
        c1.exibirSaldo();

        c1.sacar(350.00);
        c1.exibirSaldo();

        // Atributo "saldo" foi privatizado
        // Mudanças no saldo agora só podem ser feitas por meio dos
        // métodos depositar() e sacar()
        //c1.saldo = -100.00;
        //c1.exibirSaldo();

        c1.depositar(200.00);
        c1.exibirSaldo();

        ContaBancaria c2 = new ContaBancaria(654, "Yuri Yamashita", 850.00);
        c2.exibirSaldo();

        c2.setNumConta(40);
        System.out.println("Conta de %s agora tem o número %d.".formatted(c2.getTitular(), c2.getNumConta()));
    }
}
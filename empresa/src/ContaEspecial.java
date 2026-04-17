public class ContaEspecial extends ContaBancaria {

    // Atributo
    private Double limite;

    // Construtor personalizado
    public ContaEspecial(
            Integer numConta,
            String titular,
            Double saldoInicial,
            Double limite
    ) {
        super(numConta, titular, saldoInicial);
        //this.limite = limite;
        this.setLimite(limite);
    }

    // Getter e setter
    public Double getLimite() {
        return this.limite;
    }

    public void setLimite(Double novoLimite) {
        if(novoLimite <= 0) {
            throw new IllegalArgumentException("O limite deve ser maior que zero.");
        }
        this.limite = novoLimite;
    }

    @Override
    public void exibirSaldo() {
        String msg = "Saldo da conta ESPECIAL nº %d de %s é R$ %.2f".formatted(
                this.getNumConta(),
                this.getTitular(),
                this.getSaldo() + this.getLimite()
        );
        System.out.println(msg);
    }

    public void exibirSaldoReal() {
        String msg = "Saldo (real) da conta ESPECIAL nº %d de %s é R$ %.2f".formatted(
                this.getNumConta(),
                this.getTitular(),
                this.getSaldo()
        );
        System.out.println(msg);
    }
}

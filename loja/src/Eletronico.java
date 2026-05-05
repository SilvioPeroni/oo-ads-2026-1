public class Eletronico extends Produto {
    private int voltagem;
    private double consumoWatts;
    private int tempoGarantia;

    public Eletronico(
            String descricao,
            String marca,
            double precoBase,
            double alturaMm,
            double larguraMm,
            double profundidadeMm,
            double pesoG,
            double consumoWatts)
    {
        super(descricao, marca, precoBase, alturaMm, larguraMm, profundidadeMm, pesoG);
        this.voltagem = 110;
        setConsumoWatts(consumoWatts);
        this.tempoGarantia = 12;
    }

    public int getVoltagem() {
        return voltagem; }
    public void setVoltagem(int voltagem) {
        if (voltagem != 110 && voltagem != 220 && voltagem != 0) {
            throw new IllegalArgumentException("Voltagem inválida. Use 110, 220 ou 0 (bivolt)");
        }
        this.voltagem = voltagem;
    }

    public double getConsumoWatts() {
        return consumoWatts; }
    public void setConsumoWatts(double consumoWatts) {
        if (consumoWatts <= 0) {
            throw new IllegalArgumentException("Consumo deve ser maior que 0");
        }
        this.consumoWatts = consumoWatts;
    }

    public int getTempoGarantia() {
        return tempoGarantia; }
    public void setTempoGarantia(int tempoGarantia) {
        if (tempoGarantia <= 0) {
            throw new IllegalArgumentException("Tempo de garantia deve ser maior que 0");
        }
        this.tempoGarantia = tempoGarantia;
    }

    public double calcularCustoEnergia(int horas, double tarifa) {
        return consumoWatts * horas * tarifa;
    }

    public boolean isBivolt() {
        return voltagem == 0;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("=== Eletrônico ===");
        System.out.println("Voltagem: " + voltagem + "V");
        System.out.println("Consumo: " + consumoWatts + "W");
        System.out.println("Garantia: " + tempoGarantia + " meses");
        System.out.println("Bivolt: " + isBivolt());
        System.out.println("-----------------------------");
    }
}
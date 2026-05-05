public class Notebook extends Eletronico {
    private String processador;
    private int memoriaGb;
    private int armazenamentoGb;
    private int bateriaMAh;
    private double telaPol;
    private String tipoPlacaVideo;

    public Notebook(
            String descricao,
            String marca,
            double precoBase,
            double alturaMm,
            double larguraMm,
            double profundidadeMm,
            double pesoG,
            double consumoWatts,
            String processador,
            int memoriaGb,
            int armazenamentoGb)
    {
        super(descricao, marca, precoBase, alturaMm, larguraMm, profundidadeMm, pesoG, consumoWatts);

        setProcessador(processador);
        setMemoriaGb(memoriaGb);
        setArmazenamentoGb(armazenamentoGb);

        this.bateriaMAh = 3000;
        this.telaPol = 15.0;
        this.tipoPlacaVideo = "integrada";
    }

    public String getProcessador()
    { return processador;
    }
    public void setProcessador(String processador) {
        if (processador == null || processador.trim().isEmpty()) {
            throw new IllegalArgumentException("Processador não pode ser vazio");
        }
        this.processador = processador.trim();
    }

    public int getMemoriaGb() {
        return memoriaGb;
    }
    public void setMemoriaGb(int memoriaGb) {
        if (memoriaGb <= 0) throw new IllegalArgumentException("Memória deve ser maior que 0");
        this.memoriaGb = memoriaGb;
    }

    public int getArmazenamentoGb() {
        return armazenamentoGb;
    }
    public void setArmazenamentoGb(int armazenamentoGb) {
        if (armazenamentoGb <= 0) throw new IllegalArgumentException("Armazenamento deve ser maior que 0");
        this.armazenamentoGb = armazenamentoGb;
    }

    public int getBateriaMAh() {
        return bateriaMAh;
    }
    public void setBateriaMAh(int bateriaMAh) {
        if (bateriaMAh <= 0) throw new IllegalArgumentException("Bateria deve ser maior que 0");
        this.bateriaMAh = bateriaMAh;
    }

    public double getTelaPol() {
        return telaPol;
    }
    public void setTelaPol(double telaPol) {
        if (telaPol <= 0) throw new IllegalArgumentException("Tela deve ser maior que 0");
        this.telaPol = telaPol;
    }

    public String getTipoPlacaVideo() {
        return tipoPlacaVideo;
    }
    public void setTipoPlacaVideo(String tipoPlacaVideo) {
        if (!tipoPlacaVideo.equalsIgnoreCase("integrada") &&
                !tipoPlacaVideo.equalsIgnoreCase("dedicada")) {
            throw new IllegalArgumentException("Tipo de placa deve ser 'integrada' ou 'dedicada'");
        }
        this.tipoPlacaVideo = tipoPlacaVideo.toLowerCase();
    }

    public boolean isGamer() {
        return tipoPlacaVideo.equals("dedicada");
    }

    public boolean suportaUpgradeMemoria(int novaMemoriaGb) {
        return (memoriaGb + novaMemoriaGb) <= 64;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoBase = super.calcularPrecoFinal();
        return isGamer() ? precoBase * 1.15 : precoBase;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("=== Notebook ===");
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaGb + " GB");
        System.out.println("Armazenamento: " + armazenamentoGb + " GB");
        System.out.println("Bateria: " + bateriaMAh + " mAh");
        System.out.println("Tela: " + telaPol + "\"");
        System.out.println("Placa de Vídeo: " + tipoPlacaVideo);
        System.out.println("Gamer: " + isGamer());
        System.out.println("Preço Final (com taxa gamer se aplicável): R$ " + calcularPrecoFinal());
        System.out.println("================================");
    }
}
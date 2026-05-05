public class Produto {
    private String descricao;
    private String marca;
    private double precoBase;
    private boolean importado;
    private int estoque;
    private double alturaMm;
    private double larguraMm;
    private double profundidadeMm;
    private double pesoG;

    // Construtor
    public Produto(
            String descricao,
            String marca,
            double precoBase,
            double alturaMm,
            double larguraMm,
            double profundidadeMm,
            double pesoG)
    {
        setDescricao(descricao);
        setMarca(marca);
        setPrecoBase(precoBase);
        this.importado = false;
        this.estoque = 0;
        setAlturaMm(alturaMm);
        setLarguraMm(larguraMm);
        setProfundidadeMm(profundidadeMm);
        setPesoG(pesoG);
    }

    // Getters e Setters com validações
    public String getDescricao() {
        return descricao; }
    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser vazia");
        }
        this.descricao = descricao.trim();
    }

    public String getMarca() {
        return marca; }
    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca não pode ser vazia");
        }
        this.marca = marca.trim();
    }

    public double getPrecoBase() {
        return precoBase; }
    public void setPrecoBase(double precoBase) {
        if (precoBase <= 0) {
            throw new IllegalArgumentException("Preço base deve ser maior que 0");
        }
        this.precoBase = precoBase;
    }

    public boolean isImportado() {
        return importado; }
    public void setImportado(boolean importado) { this.importado = importado; }

    public int getEstoque() {
        return estoque; }
    public void setEstoque(int estoque) {
        if (estoque < 0) {
            throw new IllegalArgumentException("Estoque não pode ser negativo");
        }
        this.estoque = estoque;
    }

    public double getAlturaMm() {
        return alturaMm; }
    public void setAlturaMm(double alturaMm) {
        if (alturaMm <= 0) throw new IllegalArgumentException("Altura deve ser maior que 0");
        this.alturaMm = alturaMm;
    }

    public double getLarguraMm() {
        return larguraMm; }
    public void setLarguraMm(double larguraMm) {
        if (larguraMm <= 0) throw new IllegalArgumentException("Largura deve ser maior que 0");
        this.larguraMm = larguraMm;
    }

    public double getProfundidadeMm() {
        return profundidadeMm; }
    public void setProfundidadeMm(double profundidadeMm) {
        if (profundidadeMm <= 0) throw new IllegalArgumentException("Profundidade deve ser maior que 0");
        this.profundidadeMm = profundidadeMm;
    }

    public double getPesoG() {
        return pesoG; }
    public void setPesoG(double pesoG) {
        if (pesoG <= 0) throw new IllegalArgumentException("Peso deve ser maior que 0");
        this.pesoG = pesoG;
    }

    public double calcularVolumeCm3() {
        return (alturaMm * larguraMm * profundidadeMm) / 1000.0;
    }

    public boolean isDisponivel() {
        return estoque > 0;
    }

    public double calcularPrecoFinal() {
        return importado ? precoBase * 1.10 : precoBase;
    }

    public void exibir() {
        System.out.println("=== Produto ===");
        System.out.println("Descrição: " + descricao);
        System.out.println("Marca: " + marca);
        System.out.println("Preço Base: R$ " + precoBase);
        System.out.println("Importado: " + importado);
        System.out.println("Estoque: " + estoque);
        System.out.println("Dimensões: " + alturaMm + "x" + larguraMm + "x" + profundidadeMm + " mm");
        System.out.println("Peso: " + pesoG + "g");
        System.out.println("Volume: " + calcularVolumeCm3() + " cm³");
        System.out.println("Disponível: " + isDisponivel());
        System.out.println("Preço Final: R$ " + calcularPrecoFinal());
        System.out.println("-----------------------------");
    }
}
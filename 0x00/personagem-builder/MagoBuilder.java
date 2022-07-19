public class MagoBuilder implements Builder {
    
    private String nome;
    private int inteligencia, forca, vigor, resistencia, destreza;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public Mago build() throws Exception {
        return new Mago(nome, inteligencia, forca, vigor, resistencia, destreza);
    }

}

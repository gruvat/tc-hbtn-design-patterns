public abstract class Personagem {
    public String nome;
    public TipoPersonagem tipo;
    public int inteligencia, forca, vigor, resistencia, destreza;

    public Personagem(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia,
            int destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }
    
    public abstract double getDanoAtaque();

    @Override
    public String toString() {
        return "Personagem { nome = " + nome 
                    + ", tipo = " + tipo
                    + ", inteligencia = " + inteligencia
                    + ", forca = " + forca
                    + ", vigor = " + vigor
                    + ", resistencia = " + resistencia
                    + ", destreza = " + destreza
                    + ", dano = " + String.format("%.2f", getDanoAtaque())
                    + " }";
    }

    

}

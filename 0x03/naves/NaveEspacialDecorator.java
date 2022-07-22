public class NaveEspacialDecorator extends NaveEspacial {

    NaveEspacial naveDecorada;

    public NaveEspacialDecorator(NaveEspacial nave) {
        super(nave.getSaude(), nave.getAtaque());
        this.naveDecorada = nave;
    }

    @Override
    public int getAtaque() {
        return naveDecorada.getAtaque();
    }

    @Override
    public int getSaude() {
        return naveDecorada.getSaude();
    }
    
}

public class NaveEspacialDecorator extends NaveEspacial {

    NaveEspacial naveEspacial;

    public NaveEspacialDecorator(NaveEspacial nave) {
        super(nave.getSaude(), nave.getAtaque());
        this.naveEspacial = nave;
    }

    @Override
    public int getAtaque() {
        return naveEspacial.getAtaque();
    }

    @Override
    public int getSaude() {
        return naveEspacial.getSaude();
    }
    
}

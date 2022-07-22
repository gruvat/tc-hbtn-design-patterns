public class CanhaoExtraDecorator extends NaveEspacialDecorator {

    public CanhaoExtraDecorator(NaveEspacial nave) {
        super(nave);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 75;
    }

}

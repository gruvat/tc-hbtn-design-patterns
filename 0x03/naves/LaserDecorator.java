public class LaserDecorator extends NaveEspacialDecorator {

    public LaserDecorator(NaveEspacial nave) {
        super(nave);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 40;
    }

}

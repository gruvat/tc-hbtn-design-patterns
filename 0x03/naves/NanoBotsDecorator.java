public class NanoBotsDecorator extends NaveEspacialDecorator {

    public NanoBotsDecorator(NaveEspacial nave) {
        super(nave);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 25;
    }
    
}

public class ArmaduraDecorator extends NaveEspacialDecorator {

    public ArmaduraDecorator(NaveEspacial nave) {
        super(nave);
    }

    @Override
    public int getSaude() {
        return super.getSaude() + 150;
    }

}

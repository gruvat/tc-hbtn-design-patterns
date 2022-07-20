import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BebidaCafe extends Bebida {

    @Override
    public List<String> obterIngredientes() {
        return new ArrayList<String>(Arrays.asList("cafe"));
    }

    @Override
    public double obterPreco() {
        return 5.35;
    }

}

import java.util.UUID;

public class SalarioService {
    
    private CalculadorSalarioService calculator = CalculadorSalarioService.getCalculadorSalarioService();

    public double calcular(double salarioBruto, 
                        double valorDescontos, 
                        double valorVendas,
                        double percentualComissao) {
        
        return calculator.calcularSalarioLiquido(salarioBruto, valorDescontos, valorVendas, percentualComissao);
    }

    public UUID getUuid() {
        return calculator.uuid;
    }

}

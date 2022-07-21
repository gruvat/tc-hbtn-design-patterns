public class Impressao {
    
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao() {
        paginasTotais = 0;
        paginasColoridas = 0;
        ehFrenteVerso = false;
        valorColoridasFrenteVerso = 0.;
        valorPretoBrancoFrenteVerso = 0.;
        valorColoridasFrenteApenas = 0.;
        valorPretoBrancoFrenteApenas = 0.;
    }


    public Double calcularTotal() {
        return valorColoridasFrenteApenas 
            + valorColoridasFrenteVerso 
            + valorPretoBrancoFrenteApenas 
            + valorPretoBrancoFrenteVerso;
    }

    
    @Override
    public String toString() {
        String tipo = (ehFrenteVerso) ? "frente e verso" : "frente apenas";
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f", 
            paginasTotais,
            paginasColoridas,
            paginasTotais-paginasColoridas,
            tipo,
            calcularTotal()
        );
    }


    public int getPaginasTotais() {
        return paginasTotais;
    }
    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }
    public int getPaginasColoridas() {
        return paginasColoridas;
    }
    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }
    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }
    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }
    public Double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }
    public void setValorColoridasFrenteVerso(Double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }
    public Double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }
    public void setValorPretoBrancoFrenteVerso(Double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }
    public Double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }
    public void setValorColoridasFrenteApenas(Double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }
    public Double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }
    public void setValorPretoBrancoFrenteApenas(Double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    

}

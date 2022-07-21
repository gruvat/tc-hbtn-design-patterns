public class ImpressaoFactory {
    
    public static Impressao createImpressao(TamanhoImpressao tamanho, int totalPaginas, 
                                            int quantidadePaginasColoridas, Boolean ehFrenteVerso) {

        Impressao impressao = new Impressao();
        int quantidadePretaBranco = totalPaginas - quantidadePaginasColoridas;

        impressao.setPaginasTotais(totalPaginas);
        impressao.setPaginasColoridas(quantidadePaginasColoridas);
        impressao.setEhFrenteVerso(ehFrenteVerso);
        
        if(ehFrenteVerso) {
            impressao.setValorColoridasFrenteVerso(calculateValorFrenteVerso(tamanho, TipoImpressao.COLORIDO, quantidadePaginasColoridas));
            impressao.setValorPretoBrancoFrenteVerso(calculateValorFrenteVerso(tamanho, TipoImpressao.PRETO_BRANCO, quantidadePretaBranco));
        } else {
            impressao.setValorColoridasFrenteApenas(calculateValorFrenteApenas(tamanho, TipoImpressao.COLORIDO, quantidadePaginasColoridas));
            impressao.setValorPretoBrancoFrenteApenas(calculateValorFrenteApenas(tamanho, TipoImpressao.PRETO_BRANCO, quantidadePretaBranco));    
        }
        
        return impressao;
    }

    private static Double calculateValorFrenteVerso(TamanhoImpressao tamanho, TipoImpressao tipo, int quantidade) {

        Double price = 0.;

        switch (tamanho) {
            case A2:
                switch (tipo) {
                    case PRETO_BRANCO:
                        price = 0.18;
                        break;
                    case COLORIDO:
                        price = 0.28;
                        break;
                }
            break;
            
            case A3:
                switch (tipo) {
                    case PRETO_BRANCO:
                        price = 0.15;
                        break;
                    case COLORIDO:
                        price = 0.25;
                        break;
                }
            break;

            case A4:
                switch (tipo) {
                    case PRETO_BRANCO:
                        price = 0.1;
                        break;
                    case COLORIDO:
                        price = 0.2;
                        break;
                }
            break;
        }

        return price * quantidade;
    }

    private static Double calculateValorFrenteApenas(TamanhoImpressao tamanho, TipoImpressao tipo, int quantidade) {

        Double price = 0.;

        switch (tamanho) {
            case A2:
                switch (tipo) {
                    case PRETO_BRANCO:
                        price = 0.22;
                        break;
                    case COLORIDO:
                        price = 0.32;
                        break;
                }
            break;
            
            case A3:
                switch (tipo) {
                    case PRETO_BRANCO:
                        price = 0.20;
                        break;
                    case COLORIDO:
                        price = 0.30;
                        break;
                }
            break;

            case A4:
                switch (tipo) {
                    case PRETO_BRANCO:
                        price = 0.15;
                        break;
                    case COLORIDO:
                        price = 0.25;
                        break;
                }
            break;
        }

        return price * quantidade;
    }
    
}

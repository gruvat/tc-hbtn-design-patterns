public class PedidoBuilder extends PedidoAbstractBuilder {
    
    private Pedido pedido;


    public PedidoBuilder() {
        pedido = new Pedido();
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(TipoItemPedido.BATATA, tamanho.name()));
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        pedido.adicionarItemForaCaixa(new ItemPedido(TipoItemPedido.BEBIDA, tipo.name()));
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(TipoItemPedido.BRINDE, tipo.name()));
    }

    @Override
    public void setLanche(TipoLanche tipo) {
        pedido.adicionarItemDentroCaixa(new ItemPedido(TipoItemPedido.LANCHE, tipo.name()));
    }

    public Pedido build() {
        return pedido;
    }

}

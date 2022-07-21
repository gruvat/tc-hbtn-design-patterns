public class ItemPedido {
    private TipoItemPedido tipo;
    private String nome;

    public ItemPedido(TipoItemPedido tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public TipoItemPedido getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedido that = (ItemPedido) o;
        return tipo == that.tipo && nome.equals(that.nome);
    }
    

    @Override
    public String toString() {
        return "ItemPedido{" +
                "tipo=" + tipo +
                ", nome='" + nome + '\'' +
                '}';
    }
    
}

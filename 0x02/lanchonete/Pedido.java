import java.util.HashSet;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;


    public Pedido() {
            itensDentroCaixa = new HashSet<>();
            itensForaCaixa = new HashSet<>();
    }

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        String prt = "	Fora da Caixa:" + System.lineSeparator();
        Boolean flag = false;

        for (ItemPedido ip : itensForaCaixa) {
            if(ip.getTipo().name().equals("LANCHE")) {
                flag = true;
            } else {
                prt += String.format("		- %s %s", ip.getTipo().name(), ip.getNome()) + System.lineSeparator();
            }
        }

        if (flag) {
            prt += "		- LANCHE CHEESEBURGUER" + System.lineSeparator();
        }

        prt += "	Dentro da Caixa:" + System.lineSeparator();

        for (ItemPedido ip : itensDentroCaixa) {
            prt += String.format("		- %s %s", ip.getTipo().name(), ip.getNome()) + System.lineSeparator();
        }

        return prt;
    }

}

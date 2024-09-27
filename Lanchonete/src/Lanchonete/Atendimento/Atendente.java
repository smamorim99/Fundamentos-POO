package Lanchonete.Atendimento;


public class Atendente {
public  void servindoMesa () {
    pegarLancheCozinha();
    LevarPedidoBalcao();
    System.out.println("SERVINDO MESA");
}
private void pegarLancheCozinha () {
    System.out.println("PEGAR LANCHE NA COZINHA");
}
public void receberPagamento (){
    System.out.println("RECEBENDO PAGAMENTO");
}
void trocarGas(){
    System.out.println("ATENDENTE TROCANDO  O GAS");
}

private void LevarPedidoBalcao () {
    System.out.println("PEGANDO PEDIDO NO BALCAO");
}

}

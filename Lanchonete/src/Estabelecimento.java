

import Lanchonete.AreaCliente.Cliente;
import Lanchonete.Atendimento.Atendente;
import Lanchonete.Atendimento.Cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adcSucoNoBalcao();
        cozinheiro.adcLancheNoBalcao();
        cozinheiro.adcComboBalcao();
   
    Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();

    Cliente cliente = new Cliente();
        cliente.escolherLanche();   
        cliente.fazerPedido();
        cliente.pagarConta();
    }

}

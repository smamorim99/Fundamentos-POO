package Lanchonete.AreaCliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("ESCOLHENDO LANCHE");
    }
    public void fazerPedido() {
        System.out.println("FAZENDO PEDIDO");
    }
        public void pagarConta() {
            consultarSaldoAplicativo();
            System.out.println("PAGANDO A CONTA");
    }
 private void consultarSaldoAplicativo() {
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }
    
} 



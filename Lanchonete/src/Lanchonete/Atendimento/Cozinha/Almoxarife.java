package Lanchonete.Atendimento.Cozinha;


public class Almoxarife {
private void controlarEntrada () {
    System.out.println("CONTROLANDO ENTRADA DOS ITENS");
    }
    private void controlarSaida() {
        System.out.println("CONTROLANDO SAIDA DOS ITENS");
    }
    void entregarIngredientes () {
        controlarEntrada();
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }
    void trocarGas (){
        System.out.println("ALMOXARIFE TROCANDO O GAS");
    }
}

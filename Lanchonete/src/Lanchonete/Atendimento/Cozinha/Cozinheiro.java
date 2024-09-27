package Lanchonete.Atendimento.Cozinha;

public class Cozinheiro {
public void adcLancheNoBalcao (){
    System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
}
public void adcSucoNoBalcao () {
    System.out.println("ADIONANDO SUCO NO BALCAO");
}
public void adcComboBalcao () {
    adcLancheNoBalcao();
    adcSucoNoBalcao();
}
private void prepararLanche () {
    pedirParaTrocarGas(null);
    pedirIngredientes(null);
    selecionarIngredientesLanche();
    fritarIngredientesLanche();
    System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
}
private void prepararVitamina () {
    selecionarIngredientesVitamina();
    lavarIngredientes();
    baterVitaminaLiquidificador();
    System.out.println("PREPARANDO VITAMINA");
}
public void prepararCombo () {
    prepararLanche();
    prepararVitamina();
}
private void selecionarIngredientesLanche () {
    System.out.println("SELECIONANDO, PAO, SALADA, OVO E CARNE");
}
private void selecionarIngredientesVitamina () {
    System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
}
private void lavarIngredientes () {
    System.out.println("LAVANDO INGREDIENTES");
}
private void baterVitaminaLiquidificador () {
    System.out.println("BATENDO VITAMINA");
}
private void fritarIngredientesLanche () {
    System.out.println("FRITANDO A CARNE E O OVO");
}
private void pedirParaTrocarGas (Almoxarife meuAmigo) {
    meuAmigo.trocarGas ();
}
private void pedirIngredientes (Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
}

}

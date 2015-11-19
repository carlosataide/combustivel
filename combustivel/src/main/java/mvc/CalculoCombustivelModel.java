
package mvc;

public class CalculoCombustivelModel {
     public float preco_alcool;
     public float preco_gasolina;
     public float calcular_combustivel;
    
    
    public float getPreco_alcool(){
        return preco_alcool;
    }
    
    public void setPreco_alcool(float preco_alcool){
        this.preco_alcool = preco_alcool;
    }

    public float getPreco_gasolina() {
        return preco_gasolina;
    }

    public void setPreco_gasolina(float preco_gasolina) {
        this.preco_gasolina = preco_gasolina;
    }

    public float getCalcular_combustivel() {
        return calcular_combustivel;
    }

    public void setCalcular_combustivel(float calcular_combustivel) {
        this.calcular_combustivel = calcular_combustivel;
    }
}

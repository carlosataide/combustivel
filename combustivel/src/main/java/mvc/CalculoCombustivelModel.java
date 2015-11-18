
package mvc;

public class CalculoCombustivelModel {
    private float preco_alcool;
    private float preco_gasolina;
    private float calcular_combustivel;
    
    public CalculoCombustivelModel(float preco_alcool, float preco_gasolina, float calcular_combustivel){
        this.preco_alcool = preco_alcool;
        this.preco_gasolina = preco_gasolina;
        this.calcular_combustivel = calcular_combustivel;
    }
    
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

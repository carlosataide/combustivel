
package mvc;

public class CalculoCombustivelModel {
     private float preco_alcool;
     private float preco_gasolina;
     private float calcular_combustivel;
     private String mais_vantajoso;
    
    
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
    
    public void calcularCombustivel(){
        float calcular_combustivel = preco_alcool / preco_gasolina;
    }
    
    public void calcularResultado() {
    if(calcular_combustivel < 0.7)
           mais_vantajoso = "Mais vantajoso abastecer álcool";
        else
            mais_vantajoso = "Mais vantajoso abastecer gasolina";
  }
}

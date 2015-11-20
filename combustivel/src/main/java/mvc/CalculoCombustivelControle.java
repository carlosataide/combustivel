
package mvc;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CalculoCombustivelControle extends HttpServlet{
   
    protected void doPost(HttpServletRequest request , HttpServletResponse response) 
            throws ServletException, IOException {
        
        float preco_alcool = Float.parseFloat(request.getParameter("preco_alcool"));
        float preco_gasolina = Float.parseFloat(request.getParameter("preco_gasolina"));
         
        
        CalculoCombustivelModel cCombustivel = new CalculoCombustivelModel();
        cCombustivel.setPreco_alcool(preco_alcool);
        cCombustivel.setPreco_gasolina(preco_gasolina);
        cCombustivel.calcularCombustivel();
        cCombustivel.calcularResultado();
        
        request.setAttribute("calcular_combustivel", cCombustivel);
        request.setAttribute("mais_vantajoso", cCombustivel);
        
        request.getRequestDispatcher("jsp/Calcularcombustivel.jsp").forward(request, response);
    
    }
    
}

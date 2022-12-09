package ConversorMonedas;

import javax.swing.JOptionPane;

/*
 * Clase intermediaria entre Principal y Conversor de Monedas
 * */
public class Function {

	/*
	 * Name: convertirMonedas.
	 * Description: Hace la logica de la conversión de la moneda.
	 * */
	public void convertirMonedas(double valorRecibido) {
		
		/*
		 * Estancia clase ConvertirMonedas
		 * */
		ConvertirMonedas monedas = new ConvertirMonedas();
		
		
		/*
	     * Opciones para convertir
	     * */
	       String optionsConvertir = (String)(JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir tu dinero", 
	    		   								"Monedas", JOptionPane.QUESTION_MESSAGE,
	    		   								null, new Object[] {"De Pesos a Dolar", "De Pesos a Euros", "De Dolar a Pesos", "De Euros a Pesos"}, 
	    		   								"Seleccion" ));
			
	       switch (optionsConvertir) {
				case "De Pesos a Dolar":
					monedas.convertirPesosMexicanosADolar(valorRecibido);
					break;

				case "De Pesos a Euros":
					monedas.convertirPesosMexicanosAEuro(valorRecibido);
					break;
					
				case "De Dolar a Pesos":
					monedas.convertirDolarAPesosMexicanos(valorRecibido);
					break;
					
				case "De Euros a Pesos":
					monedas.convertirEuroAPesosMexicanos(valorRecibido);
					break;
					
				default:
					break;
			} 
	}
	
	
	/*
	 * Name: validacionNumericaDeMonedas.
	 * Description: Verifica que la entrada del usuario sea de tipo numerica.
	 * */
	public double validacionNumericaDeMonedas() {
		boolean canContinue = false;
        Double number = 0.0;
 
        do {
            String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir:");
 
            try {
                number = Double.parseDouble(input);
                canContinue = true;
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe proporcionar un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                canContinue = false;
            }
        } while (!canContinue);
        
        return number;
	}

	
}

package ConversorMonedas;

import javax.swing.*;

public class Principal {
	public static void main(String[] args) {
		
		Function monedas = new Function();
		
		/*
		 * Eleccion de conversion por medio del usuario.
		 * */
		try {
			String options = (String)(JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE,
					null, new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, 
					"Seleccion" ));
			
			/*
			 * Logica de nuestro conversor dependiendo la opción que escoga el usuario.
			 * */
			switch (options) {
		 		case "Conversor de Monedas":
		 			double number = monedas.validacionNumericaDeMonedas();
		 	        monedas.convertirMonedas(number); 	
		 	        
		 	        int selection = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
		 	        System.out.println(selection);
		 	    
		 	       if (JOptionPane.YES_OPTION == selection) {
		 	    	   System.out.println("Vuelve a iniciar la conversion");
		 	       } else {
		 	    	   JOptionPane.showMessageDialog(null, "Programa Terminado");
		 	       }

		 	        
		 		break;
			
		 		case "Conversor de Temperatura":
		 			System.out.println("Bienvenido al conversor de Temperaturas");
		 		break;
			}
			
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Debes de seleccionar una respuesta");
		}
		
	}
}

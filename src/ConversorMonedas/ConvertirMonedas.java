package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	public void convertirPesosMexicanosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 19.78;
		// Reduciendo a dos decimales.
		monedaDolar = (double) Math.round(monedaDolar * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	
	public void convertirPesosMexicanosAEuro(double valorRecibido) {
		double monedaDolar = valorRecibido / 20.88;
		// Reduciendo a dos decimales.
		monedaDolar = (double) Math.round(monedaDolar * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Euros");
	}
	
	public void convertirDolarAPesosMexicanos(double valorRecibido) {
		double monedaPeso = valorRecibido * 19.78;
		// Reduciendo a dos decimales.
		monedaPeso = (double) Math.round(monedaPeso * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos");
	}
	
	public void convertirEuroAPesosMexicanos(double valorRecibido) {
		double monedaPeso = valorRecibido * 20.84;
		// Reduciendo a dos decimales.
		monedaPeso = (double) Math.round(monedaPeso * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos");
	}
	
}

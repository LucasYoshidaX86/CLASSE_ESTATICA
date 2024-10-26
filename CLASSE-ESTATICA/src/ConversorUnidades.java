//Criando classe ConversorUnidades com métodos estáticos.
public class ConversorUnidades {

/*Criação de método estático para calcular temperatura de Celsius para Fahrenheit 
utilizando o cálculo de multiplicação mais adição para encontrar o valor desejado.*/
	public static double celsiusParaFahrenheit (double celsius) {
		return 
				(celsius * 1.8) + 32;
	}
	
/*Criação de método estático para calcular distância de quilômetros para milhas utilizando cálculo de
 multiplicação para encontrar o valor desejado.*/
	public static double quilometrosParaMilhas ( double quilometros) {
		return 
				quilometros * 0.621371; 
	}
	
/*Criação de método estático para calcular peso de gramas para libras, utilizando multiplicação 
 para encontrar valor desejado.*/
	public static double gramasParaLibras (double gramas) {
		return 
				gramas * 0.00220462;  
	}
}

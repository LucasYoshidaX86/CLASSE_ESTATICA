import java.util.Scanner; //Importa para usar função do Scanner.

//Criação de classe main para testar todos os métodos estáticos criados.
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); //Ativação do Scanner.
		
//Perguntando ao usuário a temperatura desejada e utilizando Scanner para receber informação e salvar em "celsius".
		System.out.println("Cálculo de Celsius para Fahrenheit. \nDigite a temperatura desejada em graus Celsius:");
			double celsius = entrada.nextDouble();
//Chamando método estático para calcular a temperatura e após isso, exibi-lo. 		
		double fahrenheit = ConversorUnidades.celsiusParaFahrenheit(celsius);
			System.out.println("A temperatura de graus Celsius " + celsius + " em Fahrenheit é: " + fahrenheit + "\n");
			
			
			
//Perguntando ao usuário a distância desejada e utilizando Scanner para receber informação e salvar em "quilometros".		
		System.out.println("Cálculo de quilômetros em milhas. \nDigite a distância desejada em quilômetros: ");
			double quilometros = entrada.nextDouble();
//Chamando método estático para calcular a distancia e após isso, exibi-lo.			
		double milhas = ConversorUnidades.quilometrosParaMilhas(quilometros);
			System.out.println("A distância de " + quilometros + " quilômetros para milhas é: " + milhas + "\n");
			
			
			
//Perguntando ao usuário o peso desejado e utilizando Scanner para receber informação e salvar em "gramas".			
		System.out.println("Cálculo de gramas em libras. \nDigite o peso desejado em gramas: ");
			double gramas = entrada.nextDouble();
//Chamando método estático para calcular peso e após isso exibi-lo.			
		double libras = ConversorUnidades.gramasParaLibras(gramas);
			System.out.println("O peso " + gramas + " em gramas para libras é: " + libras + "\n");

	}

}

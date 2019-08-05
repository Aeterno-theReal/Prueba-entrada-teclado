import java.util.Scanner;

public class PruebaEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hacemos la prueba de entrada por teclado
		
		//Declaramos la variable para la entrada por teclado
		Scanner teclado= new Scanner(System.in);
		
		int numero1 = -1;
		int numero2 = -1;
		int resultado = -1;
		
		System.out.println("Vamos a realizar una división.");
		//Pedimos el dividendo y el divisor por pantalla para que lo introduzca el usuario
		System.out.println("Introduzca el dividendo: ");
		numero1 = teclado.nextInt();
		System.out.println("Introduzca el divisor: ");
		numero2 = teclado.nextInt();
		
		//Realizamos la validación del divisor que sea distinto a cero.
		if(numero2!=0) //comprobamos que el numero2 sea distinto a 0
		{
			resultado = numero1/numero2;
			System.out.println("El resultado de la división es: " + resultado);
			System.out.println("El módulo es: " + numero1%numero2);
			//El módulo  muestra el resto de la división
		}
		else
		{
			System.out.println("Error: no se puede dividir por 0");
			System.out.println("Error: no se puede dividir por " + numero2 + ", so burro");
		}
		
	}

}

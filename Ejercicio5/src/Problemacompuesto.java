import java.util.Scanner;

////Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y diferencia,
//en caso contrario informar el producto y la división del primero respecto al segundo.//

public class Problemacompuesto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float num1;
		float num2;
		float suma;
		float diferencia;
		float producto;
		float division;
		System.out.println("Ingrese el primer número");
		num1 = teclado.nextFloat();
		System.out.println("Ingrese el segundo número");
		num2 = teclado.nextFloat();
		suma = num1 + num2;
		diferencia = num1 - num2;
		producto = num1 * num2;
		division = num1 / num2;
		if (num1 > num2) {
			System.out.println("La suma de los numeros es: " + suma);
			System.out.println("y la diferencia de los numeros es: " + diferencia);
		} else {
			System.out.println("El producto de los números es: " + producto);
		    System.out.println("y la division de los números es: " + division);
		}
	}
}


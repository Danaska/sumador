import java.util.Scanner;

public class DAMFunciona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); 
	    System.out.println("introduce los digitos a sumar: ");
	    String numeros = myObj.nextLine(); 
	    ASumar suma = new ASumar();
	    System.out.println("La suma es: " + suma.mostrar(numeros));
	}

}

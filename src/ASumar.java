
public class ASumar {
	
	public ASumar() {
		
	}

   /**
    * mostrar es un método para mostrar el numero pasado como parametro.
    * Si solo se le pasa un numero este devuelve " numero = numero"
    * 
    * @param String cadena de numeros	
    * @return String con el la suma de todos los numeros y el total
	*/
	public String mostrar(String cad) {
		String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
        return null;
	}

}

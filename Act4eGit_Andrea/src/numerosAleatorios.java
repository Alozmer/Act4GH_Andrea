public class numerosAleatorios {
	
public static void insertarNumerosAleatorios() {
	
	int[] numeros = new int[20];
	
	for (int i = 0; i < numeros.length; i++) {
	    numeros[i] = (int) (Math.random() * 10) + 1;
	}
}
}
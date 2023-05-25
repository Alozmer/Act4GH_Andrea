public class numerosAleatorios {
	
public static void insertarNumerosAleatorios() {
	
	int[] numeros = new int[20];
	
	for (int i = 0; i < numeros.length; i++) {
	    numeros[i] = (int) (Math.random() * 10) + 1;
	}
}

public static void imprimirArray(int[] array) {
    System.out.println("Contenido del array:");
    for (int numeros : array) {
        System.out.print(numeros + " ");
    }
    System.out.println();
}

}
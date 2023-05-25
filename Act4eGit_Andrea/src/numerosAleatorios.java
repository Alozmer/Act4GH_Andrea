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

public static void contarNumeros(int[] array) {
    int[] contador = new int[11]; // Utilizamos un array de tamaño 11 para almacenar el contador de cada número (índice 0 a 10)

    // Contar ocurrencias de cada número en el array
    for (int num : array) {
        contador[num]++;
    }

    // Mostrar el resultado por pantalla
    System.out.println("Conteo de ocurrencias de números:");
    for (int i = 1; i <= 10; i++) {
        System.out.println("Número " + i + ": " + contador[i] + " veces");
    }
}

}
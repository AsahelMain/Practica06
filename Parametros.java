/**
 * Clase Parametros, en donde se muestran las diferencias entre
 * paso de parametros por valor y por referencia
 * @author Asahel Main
 * @version 1.0
 */

public class Parametros{
    /**
     * Metodo principal
     * @param args Los argumentos
     */
    public static void main(String[] args){
	
	int a = 9;
	int arr[] = {1,2,3,4};

   
	System.out.println("Valor de la variable 'a' antes de llamar al metodo: " + a);
	//El paso de parametros es por valor, entonces la variable "a"
	//no se va a modificar en el metodo main
	incrementarA(a);
	System.out.println("Valor de la variable 'a' despues de llamar al metodo: " + a);

	System.out.print("\n");
	
	System.out.print("Valores del arreglo antes de llamar al metodo: ");
	for(int i = 0; i<arr.length; i++){
	    System.out.print(arr[i] + " ");
	}
	System.out.print("\n");

	//Pasamos arr, lo que es una referencia a la dirección de memoria
	//del primer elemento del arreglo
	//Por lo que los valores del arreglo sí se modificaran en el metodo main
	incrementarB(arr);

	System.out.print("Valores del arreglo despues de llamar al metodo: ");
	for(int i = 0; i<arr.length; i++){
	    System.out.print(arr[i] + " ");
	}
	System.out.print("\n");


	System.out.print("\n");


	//¿Como hacer para modificar a la variable a en el metodo main?
	//Declaramos un arreglo de enteros de longitud 1
	//Le asignamos al elemento el valor de la variable "a"
	int arr2[] = {a};
	
	System.out.print("Valores del arreglo antes de llamar al metodo: ");
	for(int i = 0; i<arr2.length; i++){
	    System.out.print(arr2[i] + " ");
	}
	System.out.print("\n");

	//Ahora pasamos arr2, lo que es una referencia a la direccion de memoria
	//del primer elemento del arreglo
	//Por lo que ahora sí va a modificarse el valor del arreglo en el metodo main
	incrementarB(arr2);

	System.out.print("Valores del arreglo despues de llamar al metodo: ");
	for(int i = 0; i<arr2.length; i++){
	    System.out.print(arr2[i] + " ");
	}
	System.out.print("\n");

	

	
    }

    /**
     * Metodo que incrementa en uno el valor de un entero
     * @param Un entero
     */
    public static void incrementarA(int a){
	a++;
    }

    /**
     * Metodo que incrementa en uno los valores de un arreglo de enteros
     * @param a Un arreglo de enteros
     */
    public static void incrementarB(int[] a){
	for(int i = 0; i<a.length; i++){
	    a[i]++;
	}
    }
}

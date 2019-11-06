
package pabloadivino;
import java.util.Scanner;//importamos la clase Scanner para utilizar la introducción de datos por teclado
/**
 *
 * @author Pablo Morán
 */
public class PabloAdivino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //
     int n = 0,cont = 0;
        int x = (int) (500 *Math.random());//guardamos un valor aleatorio entre 0 y 500 no incluido
        //System.out.print(x);//este system es para ver el numero guardado en x , quitar las dos barras
        // primeras para comprobar
        Scanner sc = new Scanner(System.in);//creamos el objeto sc para utilizar el teclado
        do {//inicio de bucle
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();//introducimos entero
            if (n > x) {//si el numero introducido es mayor entonces...muestra mensaje
                System.out.print("Te pasaste Amigo");
            } else if (n < x){//si no es mayor y es menor entonces...muestra este otro mensaje
                System.out.print("Casi cerca ...");
            }
            cont++;//vamos contando los intentos 
        } while (n != x);//el bucle se repetira mientras no averiguemos el numero
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );//al salir nos muestra
        //los intentos realizados
        sc.close();//cerramos el objeto que hemos utilizado para usar teclado
    }
    
}

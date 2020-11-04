import java.util.*;
public class MatrizArreglo{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        /*arreglo bidimensional
        int arreglo[] = new int[5];
        for(int i = 0; i<arreglo.length; i++){
            System.out.println("Los numeros son: "+i);
        }*/
        //arreglo bidimensional
        int matriz[][] = new int [3][3];
        float sumarfilas = 0;
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz.length; j++){
                System.out.println("Ingrese el numero de la fila "
                + i + " columna " + j + " : ");
                matriz[i][j] = entrada.nextInt();
                //System.out.println(String.format("Mira: %d",matriz[i][j]));
            }
        }
        //suma
        for(int i = 0; i<matriz.length; i++){
            sumarfilas = 0;
            for(int j = 0;
            j<matriz.length; j++){
                sumarfilas += matriz[i][j];
                System.out.println(String.format(" %d ",matriz[i][j]));
            }
            System.out.println(String.format("Suma fila : %f, promedio fila  %f",sumarfilas, sumarfilas/matriz.length));
            System.out.println();
        }
    }
}
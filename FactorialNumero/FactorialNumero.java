import java.util.Scanner;
class FactorialNumero{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int factorial = 1;
        char letra;
        do{
                System.out.println("Ingrese el numero entero positivo del cual quiere obtener su factorial: ");
                numero = entrada.nextInt();
            while(numero != 0){
                factorial = factorial*numero;
                numero--;
            }
            System.out.println("El factorial del numero es igual a: "+factorial);
            System.out.println();
            System.out.println("Si desea repetir el programa teclee la letra <n> si no es asi, teclee cualquier otra letra: ");
            letra = entrada.next().charAt(0);
        }while(letra == 'n');
    }
}
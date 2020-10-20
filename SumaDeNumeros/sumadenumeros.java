import java.util.Scanner;

class sumadenumeros{

    public static void main(String[] args){
        /*
        programa de sumar dos numeros
        */

        Scanner entrada = new Scanner(System.in);

        int num1, num2, resultado;

        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();

        resultado = num1+num2;
        System.out.println("La suma es de: "+resultado);
    }
}
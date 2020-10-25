import java.util.Scanner;
class Calculadora{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        char letra;
        do{
            System.out.println("1. Si desea realizar una suma: ");
            System.out.println("2. Si desea realizar una resta: ");
            System.out.println("3. Si desea realizar una multiplicacion: ");
            System.out.println("4. Si desea realizar una divison: ");
            System.out.println("5. Si desea salir del programa: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = entrada.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: "+resultado);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = entrada.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es de: "+resultado);
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = entrada.nextDouble();
                    resultado = num1*num2;
                    System.out.println("El resultado de la multiplicacion es de: "+resultado);
                    break;
                case 4: 
                    System.out.println("Ingrese el primer numero: ");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = entrada.nextDouble();
                    resultado = num1/num2;
                    System.out.println("El resultado de la division es de: "+resultado);
                    break;
                default:
                    System.out.println("Gracias por usar mi calculadora mi pana");
            }
            System.out.println("Si desea repetir el programa teclee la letra <n> si no es asi, teclee cualquier otra: ");
            letra = entrada.next().charAt(0);
        }while(letra == 'n');
    }
}
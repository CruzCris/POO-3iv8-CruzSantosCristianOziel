/*El uso de metodos dentro de una clase, nos va a ayudar a organizar
el codigo de forma que se pueda dividir en diferentes
procesos que se encarguen de realizar diferentes acciones o funciones.
Los metodos ayudan a la clase a ser mas rapida al momento de ejecutar las tareas*/
import java.util.Scanner;
public class MetodoNum{
    //Programa de saber el numero mayor y menor con metodos para optimizar la operacion
    int m;
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String letra;
        //Cuerpo principal
        //Aqui se ejecuta
        //Crera un objeto de la clase para llamar a sus metodos
        MetodoNum maymen = new MetodoNum();
        do{
        maymen.cargarValores();
        System.out.println("Deseas repetir?");
        letra = entrada.nextLine();
        }while(letra != "s");
    }
    //Metodo con menu de opciones u operaciones
    //Void es vacio y es resevada para metodos que no necesitan parametros
    public void cargarValores(){
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, mayor, menor;
        System.out.println("Ingresa el primer numero a comparar: ");
        num1 = entrada.nextInt();
        System.out.println("Ingresa el segunndo numero a comparar: ");
        num2 = entrada.nextInt();
        System.out.println("Ingresa el tercer numero a comparar: ");
        num3 = entrada.nextInt();
        //mandaremos llamar a un metodo para conocer al mayor y menor
        mayor = calcularMayor(num1, num2, num3);
        menor = calcularmenor(num1, num2, num3);
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
    }
    //recibir los parametros
    public int calcularMayor(int n1, int n2, int n3){
        //operaciones
        //int m;
        if(n1>n2 && n1>n3){
            //asigno v1 a m
            m  = n1;
        }else{
            if(n2>n3){
                m = n2;
            }else{
                m = n3;
            }
        }
        return m;
    }
    public int calcularmenor(int n1, int n2, int n3){
        //operaciones
        //int m;
        if(n1<n2 && n1<n3){
            //asigno v1 a m
            m  = n1;
        }else{
            if(n2<n3){
                m = n2;
            }else{
                m = n3;
            }
        }
        return m;
    }
}
import java.util.Scanner;

class FigurasClasico{

    //programa calcular el a y p de las figuras triangulo, cuadrado, circulo, rectangulo
    //y pentagono
    
    public static void main(String[] args){;

        //instancia de nuestro objeto
        Scanner entrada = new Scanner(System.in);


        //variables
        int base, altura, lado, apotema, radio, opcion;
        double area, perimetro;
        char letra;
        //char es el tipo de dato y letra es la variable
    
        do{

            //el cuerpo del programa
            System.out.println("Elija la opcion desdeada: ");
            System.out.println("1.- Calcular el area y perimetro de un cuadarado: ");
            System.out.println("2.- Calcular el area y perimetro de un triangulo equilatero: ");
            System.out.println("3.- Calcular el area y perimetro de un circulo: ");
            System.out.println("4.- Calcular el area y perimetro de un rectangulo: ");
            System.out.println("5.- Calcular el area y perimetro de un pentagono: ");
            System.out.println("6.- Salir ");

            //asignar la opcion

            opcion = entrada .nextInt();

            //segun, porque vamos a dar opciones a elegir

            switch (opcion) {

             case 1:
                    //aqui es donde se realizan las oeraciones
                    System.out.println("Ingresa el valor del lado: ");
                    lado = entrada.nextInt();

                    perimetro = lado*4;
                    area = lado*lado;

                    System.out.println("El area del cuadrado es de: "+area);
                    System.out.println("El perimetro del cuadrado es: "+perimetro);
                    break;

                case 2:
                    System.out.println("Ingresa el valor de la base: ");
                    base = entrada.nextInt();
                    System.out.println("Ingresa el valor de la altura: ");
                    altura = entrada.nextInt();

                    perimetro = base*3;
                    area = (base*altura)/2;

                    System.out.println("El area del triangulo equilatero es de: "+area);
                    System.out.println("El perimetro del triangulo equilatero es de: "+perimetro);
                    break;

                case 3:
                    System.out.println("Ingresa el valor de la radio: ");
                    radio = entrada.nextInt();

                    perimetro = (2*3.1416)*radio;
                    area = 3.1416*radio*radio;

                    System.out.println("El area del circulo es de: "+area);
                    System.out.println("El perimetro del circulo es de : "+perimetro);
                    break;

                case 4:
                    System.out.println("Ingrese el valor de la base: ");
                    base = entrada.nextInt();
                    System.out.println("Ingrese el valor de la altura: ");
                    altura = entrada.nextInt();

                    area = base*altura;
                    perimetro = (2*base)+(2*altura);

                    System.out.println("El area del rectangulo es de "+area);
                    System.out.println("El perimetro del rectangulo es de: "+perimetro);
                    break;
            
                case 5:
                    System.out.println("Ingrese el valor del lado: ");
                    lado = entrada.nextInt();
                    System.out.println("Ingrese el valor del apotema: ");
                    apotema = entrada.nextInt();

                    perimetro = lado*5;
                    area = (perimetro*apotema)/2;

                    System.out.println("El area del pentagono es de: "+area);
                    System.out.println("El perimetro del pentagono es de: "+perimetro);
                
                default:
                    System.out.println("Gracias por participar");

            }        

            System.out.println("Si desea repetir el programa escriba la letra m");
            //recibe una respuesta
            //booleano o char m
            letra = entrada.next().charAt(0);
            //char es '' string ""
            //char num = 1    1 +1 = 11

        }while(letra == 'm');

    }
}


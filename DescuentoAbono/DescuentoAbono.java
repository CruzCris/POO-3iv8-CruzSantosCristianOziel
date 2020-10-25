import java.util.Scanner;
class DescuentoAbono{
    //programa de descuento de abono
    public static void main(String[] args){;
        Scanner entrada = new Scanner(System.in);
        int edad, abono, opcion;
        double descuento, total;
        char letra;
        do{
            System.out.println("Ingrese su edad: ");
            edad = entrada.nextInt();   
                if(edad > 65){
                    System.out.println("Ingrese el total del abono: ");
                    abono = entrada.nextInt();
                    descuento = abono*.40;
                    total = abono-descuento;
                    System.out.println("Se le ha hecho un descuento y usted tiene que pagar: "+total);
                }
                else{
                    if(edad < 21){
                        System.out.println("Si sus padres son socios presione el numero 1: ");
                        System.out.println("Si sus padres no son socios presione el numero 2: ");
                        opcion = entrada.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("Ingrese el total del abono: ");
                                abono = entrada.nextInt();
                                descuento = abono*.45;
                                total = abono - descuento;
                                System.out.println("Se le ha hecho un descuento y usted tiene que pagar: "+total);
                                break;
                            case 2:
                                System.out.println("Ingrese el total del abono: ");
                                abono = entrada.nextInt();
                                descuento = abono*.25;
                                total = abono - descuento;
                                System.out.println("Se le ha hecho un descuento y usted tiene que pagar: "+total);
                                break;
                            default:
                                System.out.println("Gracias por su abono");
                        }  
                    }
                    else{
                        System.out.println("Ingrese el total de su abono: ");
                        abono = entrada.nextInt();
                        System.out.println("No se le ha hecho ningun descuento, tiene que pagar: "+abono);
                    }
                }
                System.out.print("Si quiere repetir el programa teclee <n> si no es asi, teclee cualquier otra letra: ");
                letra = entrada.next().charAt(0);
        }while(letra == 'n');
    }
}
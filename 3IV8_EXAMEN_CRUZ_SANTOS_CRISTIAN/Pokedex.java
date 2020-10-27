import java.util.Scanner;
class Pokedex{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double defensa1, defensa2, fuerza1, fuerza2, vida, impacto1, impacto2;
        int opcion;
        String id1;
        String id2;
        String id3;
        char letra;
        do{
            System.out.println("Cruz Santos Cristian Oziel 3IV8");
            System.out.println("1. Consultar datos de Charmander: ");
            System.out.println("2. Consultar datos de Bulbasaur: ");
            System.out.println("3. Consultar datos de Squartle: ");
            System.out.println("4. Batalla Pokemon: ");
            System.out.println("5. Salir del programa: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("EL ID de Charmander es 1");
                    System.out.println("El nombre del pokemon es Charmander");
                    System.out.println("La fuerza de Charmander es 20");
                    System.out.println("La defensa de Charmander es 20");
                    System.out.println("La vida de Charmander es 100");
                    System.out.println("El ataque principal de Charmander causa 20 de daño");
                    System.out.println("El ataque secundario de Charmander causa 30 de daño");
                    break;
                case 2: 
                    System.out.println("EL ID de Bulbasur es 2");
                    System.out.println("El nombre del pokemon es Bulbasur");
                    System.out.println("La fuerza de Bulbasur es 10");
                    System.out.println("La defensa de Bulbasor es 10");
                    System.out.println("La vida de Bulbasor es 100");
                    System.out.println("El ataque principal de Bulbasor causa 10 de daño");
                    System.out.println("El ataque secundario de Bulbasor causa 20 de daño");
                    break;
                case 3:
                    System.out.println("EL ID de Squartle es 3");
                    System.out.println("El nombre del pokemon es Squartle");
                    System.out.println("La fuerza de Squartle es 30");
                    System.out.println("La defensa de Squartle es 20");
                    System.out.println("La vida de Squartle es 100");
                    System.out.println("El ataque principal de Squartle causa 20 de daño");
                    System.out.println("El ataque secundario de Squartle causa 30 de daño");
                    break;
                case 4:
                    do{
                        System.out.println("Bienvenido al campo de batalla");
                        System.out.println("1. Si quiere ver la batalla entre Charmander y Bulbasor: ");
                        System.out.println("2. Si quiere ver la batalla entre Charmander y Squartle: ");
                        System.out.println("3. Si quiere ver la batalla entre Bulbasor y Squartle");
                        System.out.println("4. Si desea salir del campo de batalla: ");
                        opcion = entrada.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("Charmander tiene una fuerza de 20 y una defensa de 20");
                                System.out.println("Bulbasor tiene una fuerza de 10 y una defensa de 10");
                                do{
                                    fuerza1 = 20;
                                    fuerza2 = 10;
                                    defensa1 = 20;
                                    defensa2 = 10;
                                    vida = 100;
                                    impacto1 = (fuerza1*defensa1)/3;
                                    vida = vida - impacto1;
                                }while(vida > 0);
                                System.out.println("Gano Charmander y Bulbasor termino con una vida de: "+vida);
                                break;
                            case 2:
                                System.out.println("Charmander tiene una fuerza de 20 y una defensa de 20");
                                System.out.println("Squartle tiene una fuerza de 30 y una defensa de 20");
                                do{
                                    fuerza1 = 20;
                                    fuerza2 = 30;
                                    defensa1 = 20;
                                    defensa2 = 20;
                                    vida = 100;
                                    impacto2 = (fuerza2*defensa2)/3;
                                    vida = vida - impacto2;
                                }while(vida > 0);
                                System.out.println("Gano Squartle y Charmander termino con una vida de: "+vida);
                                break;
                            case 3:
                                System.out.println("Bulbasor tiene una fuerza de 10 y una defensa de 10");
                                System.out.println("Squartle tiene una fuerza de 30 y una defensa de 20");
                                do{
                                    fuerza1 = 10;
                                    fuerza2 = 30;
                                    defensa1 = 10;
                                    defensa2 = 20;
                                    vida = 100;
                                    impacto2 = (fuerza2*defensa2)/3;
                                    vida = vida - impacto2;
                                }while(vida > 0);
                                System.out.println("Squartle gano y Bulabsor termino con una vida de: "+vida);
                                break;
                            default:
                                System.out.println("Gracias por ver mis batallas customizadas jijij");
                        }
                         System.out.println("Si desea presenciar otra batalla teclee <b> si quiere salir o regresa al menu teclee cualquier otra letra: ");
                         letra = entrada.next().charAt(0);   
                    }while(letra == 'b');
                    break;
                default:
                    System.out.println("Regrese pronto a mi Pokedex");
            }//cierre switch general
            System.out.println("Si quiere regresar al menu teclee <s> si no es asi, teclee cualquier ptra letra: ");
            letra = entrada.next().charAt(0);
        }while(letra == 's');
    }
}
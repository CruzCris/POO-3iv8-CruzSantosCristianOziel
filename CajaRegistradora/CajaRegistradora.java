import java.util.Scanner;
class CajaRegistradora{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int productos, opcion;
        double p1, p2, p3, p4, total;
        char letra; 
        do{
            System.out.println("How many productos desea comprar mi pana?: ");
            productos = entrada.nextInt();
            if(productos > 0){
                System.out.println("Elija el productos que desea en esa cantidad (uno solo): ");
                System.out.println("1. churrumais 10 varos: ");
                System.out.println("2. doraditas 7 varos: ");
                System.out.println("3. emperador 13 varos: ");
                System.out.println("4. boing uva 9 varos: ");
                opcion = entrada.nextInt();
                p1 = 10;
                p2 = 7;
                p3 = 13;
                p4 = 9;
                total = 0;
                do{
                    if(opcion == 1){
                        total = p1 + total;
                    }else if(opcion == 2){
                        total = p2 + total;
                    }else if(opcion == 3){
                        total = p3 + total;
                    }else if(opcion == 4){
                        total = p4 + total;
                    }
                    productos = productos - 1;
                }while(productos > 0);
                System.out.println("La factura total es de: "+total);
                System.out.println("Vuelva pronto, gracias");     
            }else{
                System.out.println("Ah sos re troll, regresa despues o compra algo jiji");
            }
            System.out.println("Si desea repetir el programa teclee <n> si no es asi, teclee cualquier otra letra: ");
            letra = entrada.next().charAt(0);
        }while(letra == 'n');     
    }
}
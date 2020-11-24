import java.util.*;
public class Cadenainvertida{
    Scanner leer=new Scanner(System.in);
    public void cadenaInvertida(){
        String cadena="";
        System.out.println("Ingresa la oracion a convertir: ");
        cadena=leer.nextLine();
        String invertida="";
        for(int i=cadena.length()-1;i>=0;i--){
            char car=cadena.charAt(i);
            invertida+=car;
        }
        System.out.println("La invocacion dice: "+invertida);
    }
}
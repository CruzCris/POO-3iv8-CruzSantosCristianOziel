//que pasa si ponen letras en vez de numeros
import java.util.*;
public class OP{
    int y=0;
    Scanner entrada = new Scanner(System.in);
    public void Ejemplo(){
        try{
            System.out.println("Ingresa un valor numerico: ");
            y=entrada.nextInt();
            System.out.println("El numero es: "+y);
            //System.exit(0);
            //cacha el error mediante el objeto e
        }catch(Exception e){
            //mensaje de error
            System.out.println("Ingrese solo valores enteros");
            //saber el tipo de error
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
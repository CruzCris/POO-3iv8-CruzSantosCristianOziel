import javax.swing.JOptionPane;
import java.util.Scanner;
public class Excepciones{
    Scanner leer=new Scanner(System.in);
    int opcion;
    char letra;
    public void ExcepcionesPrincipal(){
        try{
            do{
            //System.out.println("1. Sueldo 2. Abarrotes <La Jenny> 3. Biblioteca");
            //opcion=leer.nextInt();
            opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Sueldo 2. Abarrotes <La Jenny> 3. Biblioteca"));
            switch(opcion){
                case 1:
                    do{
                        Programa4 pagos=new Programa4();
                        pagos.Sueldo();
                        letra=JOptionPane.showInputDialog("Si desea repetir el programa digite <v> si desea salir, digite cualquier otra letra").charAt(0);
                    }while(letra=='v');
                    //System.exit(0);
                    break;
                case 2:
                    do{
                        Proveedores tiendita=new Proveedores();
                        tiendita.Tiendita();
                        letra=JOptionPane.showInputDialog("Si desea repetir el programa digite <v> si desea salir, digite cualquier otra letra").charAt(0);
                    }while(letra=='v');
                    //System.exit(0);
                    break;
                case 3:
                    do{
                        Biblioteca opciones=new Biblioteca();
                        opciones.Opciones();
                        letra=JOptionPane.showInputDialog("Si desea repetir el programa digite <v> si desea salir, digite cualquier otra letra").charAt(0);
                    }while(letra=='v');
                    //System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Gracias por usar mis programas crack");
                    //System.exit(0);
            }
            letra=JOptionPane.showInputDialog("Si desea regresar al menu digite <m> si no cualquier otra letra").charAt(0);
            }while(letra=='m');
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros por favor");
            //System.out.println("Ingrese solo numeros enteros");
        }
    }
}
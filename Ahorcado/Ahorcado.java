import javax.swing.JOptionPane;
import java.util.Scanner;
public class Ahorcado{
        public static void main(String[] args){
            char letra;
            do{
                //metodos
                Metodos juego=new Metodos();
                juego.Juego();
                letra=JOptionPane.showInputDialog("Si quiere jugar de nuevo digite <s> si desea salir digite cualquier otra letra").charAt(0);
            }while(letra=='s');
        }
}
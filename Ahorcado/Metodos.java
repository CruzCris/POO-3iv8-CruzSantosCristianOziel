import javax.swing.JOptionPane;
import java.util.Scanner;
public class Metodos{
    String palabra, player;
    int vidas=6, numeroAn;
    public void Juego(){
        JOptionPane.showMessageDialog(null, "Bienvenido a mi juego del Ahorcado!!");
        player=JOptionPane.showInputDialog("Ingrese el nombre del jugador");
        palabra=JOptionPane.showInputDialog("Ingrese la palabra para jugar al Ahorcado!!!");
        String [] juego={palabra};
        JOptionPane.showMessageDialog(null, "Tienes 6 intentos para adivinar la palabra, si no lo logras pierdes, SUERTE");
        char primera=primera(palabra);
        char ultima=ultima(palabra);
        int numletras=numletras(palabra);
        JOptionPane.showMessageDialog(null, "La primer palabra es "+primera+", la ultima palabra es "+ultima+" y en total son "+numletras+" letras");
        char [] guiones=guiones(palabra);
        juego(guiones, palabra);
        //herencia
        Player puntuacion=new Player(player, vidas);
        puntuacion.Puntuaciones();
    }
    //metodos
    private char[] guiones(String palabra){
        int letras=palabra.length();
        char [] guiones=new char[letras];
        for(int i=0;i<guiones.length;i++){
            guiones[i]='_';
        }
        return guiones;
    }
    private char primera(String palabra){
        char primera=palabra.charAt(0);
        return primera;
    }
    private char ultima(String palabra){
        char ultima=palabra.charAt(palabra.length()-1);
        return ultima;
    }
    private int numletras(String palabra){
        int num=palabra.length();
        return num;
    }
    private void juego(char [] guiones, String palabra){
        boolean Finish=false;
        do{
            System.out.println(guiones);
            char letra=JOptionPane.showInputDialog("Intente una letra").charAt(0);
            boolean acertaste=false;
            for(int i=0;i<palabra.length();i++){
                if(palabra.charAt(i)==letra){
                    guiones[i]=letra;
                    acertaste=true;
                }
            }
            if(!acertaste){
                JOptionPane.showMessageDialog(null, "Esa letra no esta en la palabra, pierdes una vida, sigue intentando");
                vidas--;
                if(vidas==0){
                    JOptionPane.showMessageDialog(null, "Te quedaste sin intentos, suerte a la proxima");
                    Finish=true;
                }
            }else{
                boolean Ganaste=!Pierdes(guiones);
                if(Ganaste){
                    JOptionPane.showMessageDialog(null, "Has acertado la palabra, osi !!!!");
                    //JOptionPane.showMessageDialog(null, "Quedaste con "+vidas+" vidas");
                    Finish=true;
                }
            }
        }while(!Finish);
    }
    private boolean Pierdes(char[] guiones){
        for(char l:guiones){
            if(l=='_'){
                return true;
            }
        }
        return false;
    }
}
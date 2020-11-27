//clase hija
import javax.swing.JOptionPane;
public class Player extends Datos{
    public Player(){

    }
    public Player(String player, int puntuacion){
        super(player, puntuacion);
    }
    public void Puntuaciones(){
        JOptionPane.showMessageDialog(null, "El jugador "+getPlayer()+" quedo con "+getPuntuacion()+" puntos de puntuacion");
    }
}
//clase padre
public class Datos{
    String player;
    int puntuacion;
    public Datos(){

    }
    public Datos(String player, int puntuacion){
        this.player=player;
        this.puntuacion=puntuacion;
    }
    public String getPlayer(){
        return player;
    }
    public void setPlayer(String player){
        this.player=player;
    }
    public int getPuntuacion(){
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion){
        this.puntuacion=puntuacion;
    }
}
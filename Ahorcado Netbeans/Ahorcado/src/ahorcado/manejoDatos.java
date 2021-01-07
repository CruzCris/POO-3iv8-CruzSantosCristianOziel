/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class manejoDatos {
    
    //private ArrayList<Player> listaJugadores;
    ArrayList<Player> listarecuperada=new ArrayList<>();
    
    /*public manejoDatos(){
        listaJugadores=new ArrayList<Player>();
    }
    
    public void registrarJugador(Player p) throws FileNotFoundException, IOException{
        listaJugadores.add(p);
        guardar();
    }
    
    public void guardar() throws FileNotFoundException, IOException{
        FileOutputStream archivo=new FileOutputStream("jugadores.txt");
        ObjectOutputStream salida=new ObjectOutputStream(archivo);
        salida.writeObject(listaJugadores);
        salida.close();
    }
    
    public void verJugadores() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archiv=new FileInputStream("jugadores.txt");
        ObjectInputStream entrada=new ObjectInputStream(archiv);
        listaJugadores=(ArrayList)entrada.readObject();
        for(int i=0;i<listaJugadores.size();i++){
            Player obj=(Player)listaJugadores.get(i);
            System.out.println("Jugador: "+obj.getGt()+"\nEdad: "+obj.getEdad()+"\nPuntuacion: "+obj.getScore());
        }
    }*/
    
    public ArrayList<Player> leerO(){
        try{
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("PLAYERS.txt"));
            
            listarecuperada = (ArrayList<Player>)in.readObject();
            
            in.close();
        
        }catch(Exception e){
            System.out.println("Esperando ..... " + e.getMessage());
        
        }
        return listarecuperada;
    }
    
    void serializar(ArrayList<Player> listaseriar){
        try{
            
            ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream("PLAYERS.txt"));
            objout.writeObject(listaseriar);
            objout.close();
        
        }catch(Exception e){
            System.out.println("Error ... "+ e.getMessage());
        
        }
    }
    
}

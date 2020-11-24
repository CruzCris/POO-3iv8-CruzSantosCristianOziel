import javax.swing.JOptionPane;
public class Biblioteca{
    public void Opciones(){
        char letra;
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Prestamo de libro 2. Devolucion de un libro"));
        switch(opcion){
            case 1:
                do{
                    Prestamo prestamo=new Prestamo("Harry Potter y la Piedra Filosofal", "Harry Potter y la Camara Secreta", "Harry Potter y el Prisionero de Azkaban", "J.K. Rowling", 5, 3, 0, 1, 0, 4);
                    prestamo.MostrarP();
                    letra=JOptionPane.showInputDialog("Si desea hacer otro prestamo digite <p> si no cualquier otra letra").charAt(0);
                }while(letra=='p');
                break;
            case 2:
                do{
                    Devolucion devolucion=new Devolucion("Harry Potter y la Piedra Filosofal", "Harry Potter y la Camara Secreta", "Harry Potter y el Prisionero de Azkaban", "J.K. Rowling", 5, 3, 0, 1, 0, 4);
                    devolucion.MostrarD();
                    letra=JOptionPane.showInputDialog("Si desea hacer otra devolucion digite <d> si no cuaqluier otra letra").charAt(0);
                }while(letra=='d');
                break;
            default:
                JOptionPane.showMessageDialog(null, "Vuelva pronto");
        }
    }
    
}
import javax.swing.JOptionPane;
public class Principal{
    public static void main(String[] args){
        char letra;
        int opcion;
        JOptionPane.showMessageDialog(null, "Bienvenido a mis programas, escoja el que quiera usar!");
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Sueldo  2. Proveedores  3. Biblioteca"));
            switch(opcion){
                case 1:
                    do{
                        letra=JOptionPane.showInputDialog("Si quiere repetir este programa digite <p> si quiere salir o volver al menu digite cualquier otra letra: ").charAt(0);
                    }while(letra=='p');
                    break;
                case 2:
                    do{
                        letra=JOptionPane.showInputDialog("Si quiere repetir este programa digite <p> si quiere salir o volver al menu digite cualquier otra letra: ").charAt(0);
                    }while(letra=='p');
                    break;
                case 3:
                    do{
                        letra=JOptionPane.showInputDialog("Si quiere repetir este programa digite <p> si quiere salir o volver al menu digite cualquier otra letra: ").charAt(0);
                    }while(letra=='p');
                    break;
                default:
                JOptionPane.showMessageDialog(null, "Gracias por dar un vistazo a mi programa");
            }
            letra=JOptionPane.showInputDialog("Si desea volver al menu digite <m> si no digite cualquier otra letra: ").charAt(0);
        }while(letra=='m');
    }
}
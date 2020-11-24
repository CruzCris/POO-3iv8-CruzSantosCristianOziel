import javax.swing.JOptionPane;
public class Proveedores{
    String nombre_cliente;
    double a;
    int costM, costm, n;
    String [] productos = new String[10];
    int [] costo = new int[10];
    public void Tiendita(){
        nombre_cliente=Nombre();
        Productos();
        Costo();
        System.out.println("Su nombre es: "+nombre_cliente);
    }
    private String Nombre(){
        String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
        return nombre;
        
    }
    private void Productos(){
        for(int i=0;i<productos.length;i++){
            String producto=JOptionPane.showInputDialog("Ingrese el producto "+(i+1));
            productos[i]=producto;
        }
        for(int i=0;i<productos.length;i++){
            //JOptionPane.showMessageDialog(null, "Los productos son "+productos[i]);
            System.out.println("El producto "+i+" es: "+productos[i]);
        }
    }
    private void Costo(){
        int total=0;
        int cM=costo[0];
        int csm=costo[0];
        double promedio;
        for(int i=0;i<costo.length;i++){
            int precio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del producto "+(i+1)));
            costo[i]=precio;
            if(costo[i]>0){
                total=total+costo[i];
                total=total;
            }if(costo[i]>cM){
                cM=costo[i];
            }if(costo[i]<csm){
                csm=costo[i];
            }
            System.out.println("El costo del producto "+i+" es "+costo[i]);
        }
        costM=Mayor(cM);
        costm=Menor(csm);
        promedio=Prom(total);
        System.out.println("El costo total de los productos es: "+total+" cacahuadolares");
        System.out.println("El promedio del costo total es: "+promedio);
        System.out.println("El costo mayor es: "+costM+" cacahuadolares");
        System.out.println("El costo menor es: "+costm+" cacahuadolares");
    }
    public double Prom(double suma){
        a=suma/10;
        return a;
    }
    public int Mayor(int numma){
        n=numma;
        return n;
    }
    public int Menor(int numme){
        n=numme;
        return n;
    }
}
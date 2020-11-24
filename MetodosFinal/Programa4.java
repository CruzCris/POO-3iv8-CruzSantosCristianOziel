import javax.swing.JOptionPane;
public class Programa4{
    int id_empleado, puesto, a;
    double sq=5000;
    double sqp=8000;
    double hd;
    double hn;
    double total;
    String nombre_empleado;
    public void Sueldo(){
        nombre_empleado=JOptionPane.showInputDialog("Ingrese su nombre: ");
        do{
            puesto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su puesto (1. Empleado o 2. Supervisor)"));
        }while(puesto!=1 && puesto!=2);
        id_empleado=Confirmacion(puesto);
        Pago();
    }
    private int Confirmacion(int puesto){
        if(puesto==1){
            do{
                id_empleado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID de empleado (a partir de 2, pares para empleados)"));
            }while(id_empleado%2!=0 && id_empleado<=0);
        }else if(puesto==2){
            do{
                id_empleado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID de supervisor (a partir de 3, nones para supervisores: "));
            }while(id_empleado%2==0 && id_empleado<=0);
        }
        a=id_empleado;
        return a;
    }
    private void Pago(){
        if(id_empleado%2==0){
            do{
            hd=Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas diurnas que trabajo esta quincena: "));
            }while(hd<0);
            do{
            hn=Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas extras nocturnas que trabajo esta quincena: "));
            }while(hn<0);
            hd=hd*50;
            hn=hn*60;
            total=sq+hd+hn;
            JOptionPane.showMessageDialog(null, "Su quincena "+nombre_empleado+" de acuerdo a su puesto empleado e ID "+id_empleado+" es: $"+total+" cacahuadolares");
        }else{
            //double inf, gm, isr;
            total=sqp-(sqp*0.2);
            total=total-(total*0.1);
            total=total-(total*0.16);
            JOptionPane.showMessageDialog(null, "Su quincena "+nombre_empleado+" de acuerdo a su puesto supervisor e ID "+id_empleado+" es de: $"+total+" cacahuadolares");
        }
    }
}
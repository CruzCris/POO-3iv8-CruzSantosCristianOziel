import javax.swing.JOptionPane;
public class Sueldo extends Programas{
    private double hd, hn;
    private double sq=5000;
    private double sqs=8000;
    public Sueldo(){

    }
    public Sueldo(String nombre_empleado, String puesto, int id_empleado, double, hd, double hn, double sq, double sqs){
        super(nombre_empleado, puesto, id_empleado);
        this.hd=hd;
        this.hn=hn;
        this.sq=sq;
        this.sqs=sqs;
    }
    public double getHD(){
        return hd;
    }
    public double setHD(double hd){
        this.hd=hd;
    }
    public double getHN(){
        return hn;
    }
    public double setHN(double hn){
        this.hn=hn;
    }
    public double getSQ(){
        return sq;
    }
    public double setSQ(double sq){
        this.sq=sq;
    }
    public double getSQS(){
        return sqs;
    }
    public double setSQS(double sqs){
        this.sqs=sqs;
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Su nombre es: "+getNombre());
        JOptionPane.showMessageDialog(null, "Su puesto es: "+getPuesto());
        JOptionPane.showMessageDialog(null, "Su ID es: "+getID());
    }
}
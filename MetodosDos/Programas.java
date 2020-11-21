public class Programas{
    private String nombre_empleado, puesto;
    private int id_empleado;
    public Programas(){

    }
    public Programas(String nombre_empleado, String puesto, int id_empleado){
        this.nombre_empleado=nombre_empleado;
        this.puesto=puesto;
        this.id_empleado=id_empleado;
    }
    public String getNombre(){
        return nombre_empleado;
    }
    public void setNombre(String nombre_empleado){
        this.nombre_empleado=nombre_empleado;
    }
    public String getPuesto(){
        return puesto;
    }
    public void setPuesto(String puesto){
        this.puesto=puesto;
    }
    public int getID(){
        return id_empleado;
    }
    public void setID(int id_empleado){
        this.id_empleado=id_empleado;
    }
}
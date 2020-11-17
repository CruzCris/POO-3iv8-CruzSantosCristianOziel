//clase animal general para mascotas domesticas
public class Animal{
    //vamos a usar el principio de encapsulamiento para poder
    //proteger e acceso a las variables de la clase
    private String nombre, raza, tipo_alimento;
    private int edad;
    //vamos a crear el constructor
    public Animal(){
        //los constructores se crean automaticamente en java, cuando no
        //son invocados y sirven para la inicializacion de variables
        //y poder crear objetos de la clase
    }
    //acceder a los datos
    public Animal(String nombre, String raza, String tipo_alimento, int edad){
        //para poder acceder a las variables son privadas es necesario
        //utilizar la palabra reservada this
        this.nombre = nombre;
        this.raza = raz;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
    }
    //para poder enviar y obtener las variables necesitamos los get y set
    //obtiene
    public String getNombre(){
        return nombre;
    }
    //establecer
    public void setNombre(String nombres){
        this.nombre = nombre;
    }
    public String getRaza(){
        return raza;
    }
    //establecer
    public void setRaza(String raza){
        this.raza = raza;
    }
    public String getTipoAlimento(){
        return tipo_alimento;
    }
    //establecer
    public void setNombre(String tipo_salimento){
        this.tipo_alimento = tipo_alimento;
    }
    public int getEdad(){
        return edad;
    }
    //establecer
    public void setEdad(int edad){
        this.edad = edad;
    }
}
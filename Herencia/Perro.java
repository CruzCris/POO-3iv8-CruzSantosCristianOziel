public class Perro extends Animal{
    private String ladrido;
    public Perro(){
        //constructor
    }
    //metodo
    public Perro(String nombre, String raza, String tipo_alimento, int edad, String ladrido){
        //palabra reservada super para poder acceder a los atributos de la clase padre
        super(nombre, raza, tipo_alimento, edad);
        //acceso a la variable propia de la clase
        this.ladrido = ladrido;
    }
    public String getLadrido(){
        return ladrido;
    }
    //establecer
    public void setLadrido(String ladrido){
        this.ladrido = ladrido;
    }
    public void MostrarPerro(){
        System.out.println("El nombre del perro es: "+ getNombre()
                                + " su raza es: "+ getRaza()
                                + " come: "+ getTipoAlimento()
                                + " su edad es de: "+ getEdad()
                                + " su ladrido es: "+ getLadrido());

    }
}
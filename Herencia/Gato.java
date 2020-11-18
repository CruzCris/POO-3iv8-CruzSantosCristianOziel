public class Gato extends Animal{
    private int num_vidas;
    public Gato(){

    }
    public Gato(String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
        super(nombre, raza, tipo_alimento, edad);
        //acceso a la variable propia de la clase
        this.num_vidas = num_vidas;
    }
    public int getNumVidas(){
        return num_vidas;
    }
    //establecer
    public void setNumVidas(int num_vidas){
        this.num_vidas = num_vidas;
    }
    public void MostrarGato(){
        System.out.println("El nombre del perro es: "+ getNombre()
                                + " su raza es: "+ getRaza()
                                + " come: "+ getTipoAlimento()
                                + " su edad es de: "+ getEdad()
                                + " su numero de vidas es: "+ getNumVidas());
    }
}
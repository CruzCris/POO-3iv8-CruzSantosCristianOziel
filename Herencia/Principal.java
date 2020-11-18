public class Principal{
    public static void main(String[] args){
        //ahora vamos a realizar los objetos de las clases
        //y sus invocaciones
        Perro dog = new Perro("Chen", "Maltes", "Croquetas", 2, "fuerte");
        Gato cat = new Gato("Pibe", "Callejero", "Atun", 1, 7);
        //los metodos
        dog.MostrarPerro();
        cat.MostrarGato();
    }
}
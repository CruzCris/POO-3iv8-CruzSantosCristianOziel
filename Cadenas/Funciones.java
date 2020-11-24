import java.util.*;
public class Funciones{
    Scanner leer=new Scanner(System.in);
    public void cadenas(){
        String s1="--- namnam";
        System.out.println("La cadena es: "+s1);
        System.out.println("El tamamo de la cadena es: "+s1.length());
        System.out.println("La cadena inicia V o F con ---?"+s1.startsWith("---"));
        System.out.println("La cadena termina V o F con nam?"+s1.endsWith("nam"));
        System.out.println("Ingrese una palabra: ");
        String s2=leer.next();
        System.out.println("La palabra es: "+s2);
        System.out.println("Parte de una subcadena "+s1.indexOf("na"));
        System.out.println("Primera parte: "+s1.substring(4));
        System.out.println("Segunda parte: "+s1.substring(3, 8));
        int valor=24;
        String s22=String.valueOf(valor);
        System.out.println("El valor es de "+s22+" como cadena");
        String s3="20";
        int numero=Integer.parseInt(s3);
        System.out.println("El valor es de "+numero+" ahora es un numero");
        String s4="20.89";
        double num1=Double.parseDouble(s4);
        System.out.println("El valor es de "+num1+" ahora es un numero");
        Integer x=5;
        System.out.println("El valor de "+x.toString()+" ahora es cadena");
        System.out.println("El valor de "+Integer.toString(12)+" ahora es cadena");
    }
}
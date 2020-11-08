import java.util.Scanner;
public class PromedioPares{
    double p;
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        PromedioPares Prom = new PromedioPares();
        Prom.CargarPares();
    }
    public void CargarPares(){
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, prom;
        System.out.println("Ingrese el primer numero: ");
        n1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        n2 = entrada.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        n3 = entrada.nextDouble();
        System.out.println("Ingrese el cuarto numero: ");
        n4 = entrada.nextDouble();
        System.out.println("Ingrese el quinto numero: ");
        n5 = entrada.nextDouble();
        System.out.println("Ingrese el sexto numero: ");
        n6 = entrada.nextDouble();
        System.out.println("Ingrese el septimo numero: ");
        n7 = entrada.nextDouble();
        System.out.println("Ingrese el octavo numero: ");
        n8 = entrada.nextDouble();
        System.out.println("Ingrese el noveno numero: ");
        n9 = entrada.nextDouble();
        System.out.println("Ingrese el decimo numero: ");
        n10 = entrada.nextDouble();
        double [] lista2 = new double[10];
        lista2[0] = n1;
        lista2[1] = n2;
        lista2[2] = n3;
        lista2[3] = n4;
        lista2[4] = n5;
        lista2[5] = n6;
        lista2[6] = n7;
        lista2[7] = n8;
        lista2[8] = n9;
        lista2[9] = n10;
        double sumapar = 0;
        double par = 0;
        for (int i=0; i < lista2.length; i++){
            if(lista2[i]%2 == 0){
                sumapar = sumapar + lista2[i];
                par++;
            }
        }
        prom = PromPar(sumapar, par);
        System.out.println("El promedio de los numeros pares es de: "+prom);
    }
    public double PromPar(double suma, double cant){
        p = suma / cant;
        return p;
    }
}
import java.util.Scanner;
public class PromedioPN{
    double p, n;
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        PromedioPN Promedio = new PromedioPN();
        Promedio.CargarValores();
    }
    public void CargarValores(){
        Scanner entrada = new Scanner(System.in);
        double n1, n2,n3, n4, n5,n6, n7, n8, n9, n10, promp, promn;
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
        double [] lista = new double[10];
        lista[0] = n1;
        lista[1] = n2;
        lista[2] = n3;
        lista[3] = n4;
        lista[4] = n5;
        lista[5] = n6;
        lista[6] = n7;
        lista[7] = n8;
        lista[8] = n9;
        lista[9] = n10;
        double positivos = 0;
        double negativos = 0;
        for (int i=0; i < lista.length; i++){
            if(lista[i] > 0){
                positivos = positivos + lista[i];
            }
            if(lista[i] < 0){
                negativos = negativos + lista[i];
            }
        }
        promp = PromedioP(positivos);
        promn = PromedioN(negativos);
        System.out.println("El promedio de los numero positivos es: "+promp);
        System.out.println("El promedio de los numeros negativos es: "+promn);
    }
    public double PromedioP(double num){
        p = num / 10;
        return p;
    }
    public double PromedioN(double num){
        n = num / 10;
        return n;
    }
}
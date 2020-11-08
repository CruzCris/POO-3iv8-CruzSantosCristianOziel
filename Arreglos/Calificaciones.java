import java.util.Scanner;
public class Calificaciones{
    double p;
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Calificaciones Final = new Calificaciones();
        Final.CargarCalis();
    }
    public void CargarCalis(){
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, cal;
        System.out.println("Ingrese la primer calificacion: ");
        n1 = entrada.nextDouble();
        System.out.println("Ingrese la segunda calificacion: ");
        n2 = entrada.nextDouble();
        System.out.println("Ingrese la tecer calificacion: ");
        n3 = entrada.nextDouble();
        System.out.println("Ingrese la cuarta calificacion: ");
        n4 = entrada.nextDouble();
        System.out.println("Ingrese la quinta calificacion: ");
        n5 = entrada.nextDouble();
        System.out.println("Ingrese la sexta calificacion: ");
        n6 = entrada.nextDouble();
        System.out.println("Ingrese la septima calificacion: ");
        n7 = entrada.nextDouble();
        System.out.println("Ingrese la octava calificacion: ");
        n8 = entrada.nextDouble();
        System.out.println("Ingrese la novena calificacion: ");
        n9 = entrada.nextDouble();
        System.out.println("Ingrese la decima calificacion: ");
        n10 = entrada.nextDouble();
        double [] cali = new double[10];
        cali [0] = n1;
        cali [1] = n2;
        cali [2] = n3;
        cali [3] = n4;
        cali [4] = n5;
        cali [5] = n6;
        cali [6] = n7;
        cali [7] = n8;
        cali [8] = n9;
        cali [9] = n10;
        double total = 0;
        double cM = cali[0];
        double cm = cali[0];
        double calis = cali[0];
        double apro = 0;
        double repro = 0;
        double procal;
        for (int i=0; i < cali.length; i++){
            if(cali[i] > 0){
                total = total + cali[i];
            }if(cali[i] > cM){
                cM = cali[i];
            }if(cali[i] < cm){
                cm = cali[i];
            }if(cali[i] > 0){
                calis = cali[i];
            }if(cali[i] > 5){
                apro++;
            }if(cali[i] <= 5){
                repro++;
            }if(cali[i] > 0){
                calis = cali[i];
            }
            System.out.println("Las calificaciones dadas son: "+cali[i]);
        }
        procal = Prom(total);
        double Mp = cali[0];
        for(int i=0; i > 0; i++){
            if(cali[i] > procal){
                mP++;
            }
        }
        System.out.println("El promedio de todas las calificaciones es: "+procal);
        System.out.println("La calificacion mas alta es: "+cM);
        System.out.println("La calificacion mas baja es: "+cm);
        System.out.println("Las calificaciones mayores al promedio son: "+mP;
        System.out.println("La cantidad de alumnos aprobados son: "+apro);
        System.out.println("La cantidad de alumnos reprobados son: "+repro);

    }
    public double Prom(double suma){
        p = suma / 10;
        return p;
    }
}
import java.util.Scanner;
public class Index{
    double p, n;
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        char letra;
        do{
            System.out.println("Buen dia, bienvenido a mi programa, elija la opcion que desea usar");
            System.out.println("1. Si desea calcular el promedio de los valores + y - de 10 numeros: ");
            System.out.println("2. Si desea caluclar el promedio de los numeros pares de 10 numero: ");
            System.out.println("3. Si desea calcular el promedio y otras cosas de 10 calificaciones: ");
            System.out.println("4. Si desea sumar dos matrices de 3x3: ");
            System.out.println("5. Si desea salir: ");;
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    Index PromedioPN = new Index();
                    PromedioPN.CargarValores();
                    break;
                case 2:
                    Index PromedioPares = new Index();
                    PromedioPares.CargarPares();
                    break;
                case 3:
                    Index Calificaciones = new Index();
                    Calificaciones.CargarCalis();
                    break;
                case 4:
                    Index Matrices = new Index();
                    Matrices.CargarSuma();
                    break;
                default:
                    System.out.println("Gracias por usar mi programa");
            }
            System.out.println("Si desea repetir algun programa teclee <s> si no teclee cualquier otra letra: ");
            letra = entrada.next().charAt(0);
        }while(letra == 's');
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
                Mp++;
            }
        }
        System.out.println("El promedio de todas las calificaciones es: "+procal);
        System.out.println("La calificacion mas alta es: "+cM);
        System.out.println("La calificacion mas baja es: "+cm);
        System.out.println("Las calificaciones mayores al promedio son: "+Mp);
        System.out.println("La cantidad de alumnos aprobados son: "+apro);
        System.out.println("La cantidad de alumnos reprobados son: "+repro);

    }
    public double Prom(double suma){
        p = suma / 10;
        return p;
    }
    public void CargarSuma(){
        Scanner entrada = new Scanner(System.in);
        int matrizA [] [] = new int [3] [3];
        int matrizB [] [] = new int [3] [3];
        System.out.println("Introduce los valores de la matriz A: ");
        for(int i=0; i<3; i++){
            for(int j=0;j<3;j++){
            System.out.println("Fila "+ (i+1) + " Columna " + (j+1) + " = ");
            matrizA[i] [j] = entrada.nextInt();
            }
        }
        System.out.println("-");
        System.out.println("Introduce los valores de la matriz B: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
            System.out.println("Fila "+ (i+1) + " Columana "+ (j+1) + " = ");
            matrizB[i] [j] = entrada.nextInt();
            }
        }
        System.out.println("La suma de la Matriz es: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((matrizA[i][j]+matrizB[i][j])<10){
                   System.out.print(matrizA[i][j]+matrizB[i][j]+"  ");
                }else{
                   System.out.print(matrizA[i][j]+matrizB[i][j]+" "); 
                }if(j==2){
                    System.out.println("");
                }
            }
        }
        System.out.println("la Matriz resta es: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((matrizA[i][j]- matrizB[i][j])<10){
                   System.out.print(matrizA[i][j]-matrizB[i][j]+"  ");
                }else{
                   System.out.print(matrizA[i][j]-matrizB[i][j]+" "); 
                }if(j==2){
                    System.out.println("");
                }
            }     
        }
    }
}
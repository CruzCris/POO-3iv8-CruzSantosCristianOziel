import java.util.Scanner;
public class Matriz{
    int entero;
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Matriz SumaMatrices = new Matriz();
        SumaMatrices.CargarSuma();
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
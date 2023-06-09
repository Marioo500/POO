package practica5;
import java.util.Random;

public class EjerciciosPuntosExtra {


    public static void main(String[] args) {
        //Ejercicio 1 impirmir el quinto elemento
        int[] integerArray1 = {1,20,3,44,5,60,7,88,9,100};
        System.out.println(integerArray1[5]);
        //Ejercicio 2 crear un arreglo con 0 o null y otro con numeros aleatorios, aqui los numeros los use del 0 al 10
        Random rnd = new Random();
        int[] arreglo1 = new int[5];
        int[] arreglo2 = {rnd.nextInt()%10,rnd.nextInt()%10,rnd.nextInt()%10,rnd.nextInt()%10,rnd.nextInt()%10};
        //Imprimo los dos tipos de arreglos 
        for(int i=0; i<arreglo1.length;i++)
        {
            System.out.println(arreglo1[i]);
        }
       for(int i=0; i<arreglo2.length;i++)
        {
            System.out.println(arreglo2[i]);
        }
        //Ejercicio 3 crear dos arreglos unos con objetos identificados y 3 instanciados
        Pajaro paj1, paj2, paj3;
        paj1 = new Pajaro();
        paj2 = new Pajaro();
        paj3 = new Pajaro();
        Pajaro[] pajaros = new Pajaro[]{paj1,paj2,paj3};
        Pajaro[] pajaros2 = new Pajaro[]{new Pajaro(), new Pajaro(), new Pajaro()};
        
        //Ejercicio  4 usar algun metodo de la clase Objetc
        try{
            paj1.wait();
        }catch(Exception e)
        {
            
        }
     }
}

package practica5;

public class Practica5 {
    public static void main(String[] args) {
        Pajaro angry[] = new Pajaro[3]; //Crear solo 3 pajaros 
        
        for(int i = 0; i< angry.length;i++)
        {
            angry[i] = new Pajaro();
        }
        //Crear un objeto de cada tipo de pajaro que existe
        Azul pajaro1 = new Azul(CapturaDatos.capturarCadena("Color"),CapturaDatos.capturarEntero("Velocidad"),CapturaDatos.capturarCadena("Forma"));
        Red pajaro2 = new Red(CapturaDatos.capturarCadena("Color"),CapturaDatos.capturarEntero("Velocidad"),CapturaDatos.capturarCadena("Forma"));
        Amarillo pajaro3 = new Amarillo(CapturaDatos.capturarCadena("Color"),CapturaDatos.capturarEntero("Velocidad"),CapturaDatos.capturarCadena("Forma"));
        
        pajaro1.Triplicarse();
        pajaro2.destruriTodo();
        pajaro3.destruirMadera();
        pajaro1.screamNombre();
    }
}

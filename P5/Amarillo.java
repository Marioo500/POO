package practica5;

public class Amarillo extends Pajaro{
    
        public Amarillo(String color, int velocidad, String forma)
        {
            super(color, velocidad, forma);
        }
        
        public void superVelocidad()
        {
            System.out.println("Se lanzo amarillo con rapidez");
        }
        public void destruirMadera()
        {
            System.out.println("Se lanzo amarillo y destruyo la madera con facilidad");
        }
}

package practica5;

public class Azul extends Pajaro{
        public Azul(String color, int velocidad, String forma)
        {
            super(color, velocidad, forma);
        }
        public void Triplicarse()
        {
            System.out.println("Azul se convirtio en 3");
        }
        public void destruirHielo()
        {
            System.out.println("Azul se lanzo y destuyo mucho hielo");
        }
}

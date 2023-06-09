package practica5;

public class Red extends Pajaro{
    
    public Red(String color, int velocidad, String forma)
    {
        super(color, velocidad, forma);
    }
    
    public void destruriTodo()
    {
        System.out.println("Se lanzo rojo sin destruir casi nada");
    }
}


package practica5;
public class Pajaro {
    String color;
    int velocidad;
    String forma;
     public Pajaro(String color, int velocidad, String forma)
     {
        setColor(color);
        setVelocidad(velocidad);
        setForma(forma);
     }
     public Pajaro()
     {
         //Constructor que uso solo para los puntos extra
     }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;  
    }
    public int getVelocidad()
    {
        return velocidad;
    }
    public void setForma(String forma){
        this.forma = forma;
        
    }
    public String getForma()
    {
        return forma;
    } 
    
    public void screamNombre()
    {
        System.out.println("Soy pajaro " + color);
    }
}

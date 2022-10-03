package vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;
    static int camionetas=0;

    public Camioneta(String placa,int puertas, String nombre, int precio, int peso,Fabricante fabricante, boolean volco){
        super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
        this.volco=volco;
        camionetas++;
    }


    //Setters y getters
    public static int getCamionetas() {return camionetas;}
    public static void setCamionetas(int camionetas) {Camioneta.camionetas = camionetas;}

    public boolean isVolco() {return volco;}
    public void setVolco(boolean volco) {this.volco = volco;}
}

package vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;
    static int camionetas=0;

    public Camioneta(String placa, String nombre, int precio, int peso,Fabricante fabricante, boolean volco){
        super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
        this.volco=volco;
        camionetas++;
    }


    //Setters y getters
    public static int getCamionetas() {return camionetas;}
    public static void setCamionetas(int camionetas) {Camioneta.camionetas = camionetas;}

    public boolean isVolco() {return volco;}
    public void setVolco(boolean volco) {this.volco = volco;}
}

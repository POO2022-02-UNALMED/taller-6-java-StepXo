package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    static int automoviles=0;

    public Automovil(String placa, String nombre, int precio, int peso,Fabricante fabricante, int puestos){
        super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
        this.puestos=puestos;
        automoviles++;
    }


    //Setters y getters
    public static int getAutomoviles() {return automoviles;}
    public static void setAutomoviles(int automoviles) {Automovil.automoviles = automoviles;}

    public int getPuestos() {return puestos;}
    public void setPuestos(int puestos) {this.puestos = puestos;}
}

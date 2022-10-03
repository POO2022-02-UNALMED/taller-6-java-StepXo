package vehiculos;
import java.util.HashMap;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    static int CantidadVehiculos=0;
    private static HashMap<Fabricante,Integer> fabricantes = new HashMap<Fabricante,Integer>();

    public Vehiculo(String placa, int puertas, int velocidadMaxima,String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        this.placa=placa;
        this.puertas=puertas;
        this.velocidadMaxima=velocidadMaxima;
        this.nombre=nombre;
        this.precio=precio;
        this.peso=peso;
        this.traccion=traccion;
        this.fabricante=fabricante;
        CantidadVehiculos++;

        if (fabricantes.containsKey(fabricante)){
            fabricantes.put(fabricante,fabricantes.get(fabricante)+1);
        } else {
            fabricantes.put(fabricante,1);
        }
    }


    public String vehiculosPorTipo(){
        return "Automoviles: " + Automovil.getAutomoviles() +
                "\nCamionetas: " + Camioneta.getCamionetas() +
                "\nCamiones: " + Camion.getCamiones();
    }


    //Setters y getters
    public String getPlaca() {return placa;}
    public void setPlaca(String placa) {this.placa = placa;}

    public int getPuertas() {return puertas;}
    public void setPuertas(int puertas) {this.puertas = puertas;}

    public int getVelocidadMaxima() {return velocidadMaxima;}
    public void setVelocidadMaxima(int velocidadMaxima) {this.velocidadMaxima = velocidadMaxima;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getPrecio() {return precio;}
    public void setPrecio(int precio) {this.precio = precio;}

    public int getPeso() {return peso;}
    public void setPeso(int peso) {this.peso = peso;}

    public String getTraccion() {return traccion;}
    public void setTraccion(String traccion) {this.traccion = traccion;}

    public Fabricante getFabricante() {return fabricante;}
    public void setFabricante(Fabricante fabricante) {this.fabricante = fabricante;}

    public static int getCantidadVehiculos() {return CantidadVehiculos;}
    public static void setCantidadVehiculos(int cantidadVehiculos) {CantidadVehiculos = cantidadVehiculos;}

    public static HashMap<Fabricante, Integer> getFabricantes() {return fabricantes;}
    public static void setFabricantes(HashMap<Fabricante, Integer> fabricantes) {Vehiculo.fabricantes = fabricantes;}
}
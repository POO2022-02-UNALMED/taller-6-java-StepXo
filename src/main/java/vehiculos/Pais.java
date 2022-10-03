package vehiculos;

public class Pais {
    public String nombre;

    public Pais(String nombre){
        this.nombre=nombre;
    }


    public static Pais paisMasVendedor(){
        return Fabricante.fabricaMayorVentas().getPais();
    }


    //Getters y Setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
}
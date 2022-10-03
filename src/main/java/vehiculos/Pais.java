package vehiculos;

public class Pais {
    private String nombre;

    Pais(String nombre){
        this.nombre=nombre;
    }


    public Pais paisMasVendedor(){
        return Fabricante.fabricaMayorVentas().getPais();
    }


    //Getters y Setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
}
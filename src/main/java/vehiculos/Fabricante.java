package vehiculos;
import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static HashMap<Pais,Integer> paises = new HashMap<Pais,Integer>();

    Fabricante(String nombre, Pais pais){
        this.nombre=nombre;
        this.pais=pais;

        if (paises.containsKey(pais)){
            paises.put(pais,paises.get(pais)+1);
        } else {
            paises.put(pais,1);
        }
    }


    public static Fabricante fabricaMayorVentas(){
        int maximo= 0;
        Fabricante vendedor = null;
        for (Map.Entry<Fabricante,Integer> entrada : Vehiculo.getFabricantes().entrySet()){
            if (entrada.getValue() > maximo){
                maximo = entrada.getValue();
                vendedor = entrada.getKey();
            }
        }
        return vendedor;
    }


    //Getters y setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public static HashMap<Pais, Integer> getPaises() {return paises;}
    public static void setPaises(HashMap<Pais, Integer> paises) {Fabricante.paises = paises;}

    public Pais getPais() {return pais;}
    public void setPais(Pais pais) {this.pais = pais;}
}
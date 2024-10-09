import java.util.List;
import java.util.ArrayList;

public class Ubicacion {
    private String criatura;
    private String nombre;
    private List<Ubicacion> adyacentes;
    private TipoUbicacion tipo;

    public Ubicacion(String criatura , String nombre , List<Ubicacion> adyacentes , TipoUbicacion tipo){
        this.criatura = criatura;
        this.nombre = nombre;
        this.adyacentes = adyacentes;
        this.tipo = tipo;
    }

    public void agregarAdyacente (Ubicacion nuevoAdyacente) {
        this.adyacentes.add(nuevoAdyacente);
    }

    public boolean Viajar(Ubicacion destino) {
        return adyacentes.contains(destino);
    }    

    public String getNombre(){
        return this.nombre;
    }
    
}

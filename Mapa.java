import java.util.List;

public class Mapa {
    private Ubicacion actual;
    private List<Ubicacion> ubicaciones;

    public Mapa(Ubicacion actual, List<Ubicacion> ubicaciones) {
        this.actual = actual;
        this.ubicaciones = ubicaciones;
    }

    public void agregarUbicacion(Ubicacion nuevaUbicacion) {
        this.ubicaciones.add(nuevaUbicacion);
    }

    public void viajar(Ubicacion destino) {
        if (this.actual.Viajar(destino)) {
            this.actual = destino;
            System.out.println("Viajaste a " + destino.getNombre() + "!");
        } else {
            System.out.println("No se puede viajar a " + destino.getNombre() + " desde aqui");
        }
    }

    public List<Ubicacion> getUbicaciones() {
        return this.ubicaciones;
    }
}

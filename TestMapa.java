import java.util.ArrayList;
import java.util.List;

public class TestMapa {
    public static void main(String[] args) {
        Ubicacion puebloPaleta = new Ubicacion(null, "Pueblo Paleta", new ArrayList<Ubicacion>(), TipoUbicacion.CIUDAD);
        Ubicacion ciudadVerde = new Ubicacion(null, "Ciudad Verde", new ArrayList<Ubicacion>(), TipoUbicacion.CIUDAD);
        Ubicacion ciudadPlateada = new Ubicacion(null, "Ciudad Plateada", new ArrayList<Ubicacion>(), TipoUbicacion.CIUDAD);
        puebloPaleta.agregarAdyacente(ciudadVerde);
        ciudadVerde.agregarAdyacente(ciudadPlateada);
        ciudadVerde.agregarAdyacente(puebloPaleta);
        ciudadPlateada.agregarAdyacente(ciudadVerde);
        Mapa mapa = new Mapa(puebloPaleta , new ArrayList<Ubicacion>());
        mapa.agregarUbicacion(ciudadPlateada);
        mapa.agregarUbicacion(ciudadVerde);
        mapa.agregarUbicacion(puebloPaleta);
        mapa.viajar(ciudadPlateada);
        mapa.viajar(ciudadVerde);
        mapa.viajar(ciudadPlateada);
        mapa.viajar(puebloPaleta);

    }
}

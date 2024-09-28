package reino.modelo;

public class Jugador {
    private int nivelExperiencia;
    private Heroe heroe;
    private Ubicacion ubicacion;

    public Ubicacion viajarUbicacionNeutral(){
        return ubicacion; 
    }
    public Ubicacion viajarUbicacionConCriatura(){
        return ubicacion; 
    }
    public boolean mejorarPersonaje(){
        return true; 
    }
    public void recolectarRecompensa(){
    }
}

package reino.modelo;

public interface Atacable {
    void atacar(Atacable objetivo); 
    void defender(int danio); 
}

package reino.modelo;

public abstract class Heroe extends Personaje implements Atacable{
	private Jugador duenio;
	
    public abstract void usarHabilidadEspecial(); 

    @Override
    public void atacar(Atacable objetivo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacar'");
    }

    @Override
    public void defender(int danio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'defender'");
    }
}

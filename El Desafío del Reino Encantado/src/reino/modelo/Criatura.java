package reino.modelo;

public class Criatura extends Personaje implements Atacable{
    private int nivel;

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

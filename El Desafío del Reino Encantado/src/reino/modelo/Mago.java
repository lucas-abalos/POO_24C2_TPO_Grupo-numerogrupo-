package reino.modelo;

public class Mago extends Heroe{
    public Mago(String nombre, int nivelAtaque, int nivelDefensa) {
        super(nombre, nivelAtaque, nivelDefensa);
    }

    @Override
    public int usarHabilidadEspecialAtaque(Personaje defensor, int cantGolpes) {
        return 0;
    }

    @Override
    public int usarHabilidadEspecialDefensa(Personaje atacante, int cantGolpes) {
        if (atacante instanceof Troll) {
            return (int)(this.getNivelDefensa() * 1000);  // Aumenta la defensa MUCHO para ser inmune contra golpes de Trolls
        }
        return 0;
    }

    @Override
    public void ganoPelea(){
        // Cuando el mago gana una pelea cura su vida al %100
        this.setVida(100); 
    }
}

package eedd.ra4.videojuego.vo;

/**
 *
 * Jugador: Clase de persistencia que representa un Jugador.
 * 
 * @author Isidoro Nevares Martín - IES Virgen de la Paloma
 * @date 03 marzo 2026
 * 
 * 
 */
public class Jugador extends Personaje {
    private static final int _20 = 20;
	private static final int Nivel = 100;
	private int experiencia;

    public void ganarExperiencia(int puntos) {
        setExperiencia(getExperiencia() + puntos);
        if (getExperiencia() > getNivel()) {
            setNivel(getNivel() + 1);
            setExperiencia(0);
        }
    }
    
    public void ataqueEspecial(Enemigo enemigo) {
        int danio = getNivel() * get20();
        enemigo.setVida(enemigo.getVida() - danio);
    }

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	private static int get20() {
		return _20;
	}
}

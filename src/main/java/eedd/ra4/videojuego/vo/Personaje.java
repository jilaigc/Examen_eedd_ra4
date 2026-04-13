package eedd.ra4.videojuego.vo;

/**
 *
 * Enemigo: Clase de persistencia que representa un Enemigo.
 * 
 * @author Isidoro Nevares Martín - IES Virgen de la Paloma
 * @date 03 marzo 2026
 * 
 * 
 */
public class Personaje implements IAtacable {
    private String nombre;
    private int vida;
    private int nivel;
    
    public void atacar(Personaje objetivo) {
        int danio = getNivel() * 10;
        HacerDanio(objetivo, danio);
    }

	private void HacerDanio(Personaje objetivo, int danio) {
		objetivo.setVida(objetivo.getVida() - danio);
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

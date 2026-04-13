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
public class Personaje {
    public String nombre;
    public int vida;
    public int nivel;
    
    public void atacar(Personaje objetivo) {
        int danio = nivel * 10;
        objetivo.vida -= danio;
    }
}

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
    public int experiencia;

    public void ganarExperiencia(int puntos) {
        experiencia += puntos;
        if (experiencia > 100) {
            nivel++;
            experiencia = 0;
        }
    }
    
    public void ataqueEspecial(Enemigo enemigo) {
        int danio = nivel * 20;
        enemigo.vida -= danio;
    }
}

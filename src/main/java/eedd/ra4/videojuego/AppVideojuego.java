package eedd.ra4.videojuego;

import eedd.ra4.videojuego.vo.Enemigo;
import eedd.ra4.videojuego.vo.Jugador;

/**
 *
 * AppVideojuego: Clase que realiza el tratamiento de un videojuego.
 * 
 * @author Isidoro Nevares Martín - IES Virgen de la Paloma
 * @date 4 dic 2025
 * 
 * 
 */

public class AppVideojuego {
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        jugador.setNombre("Héroe");
        jugador.setVida(100);
        jugador.setNivel(5);
        jugador.setExperiencia(50);

        Enemigo enemigo = new Enemigo();
        enemigo.setNombre("Orco");
        enemigo.setVida(80);
        enemigo.setNivel(3);
        enemigo.setTipo("Guerrero");
        
        jugador.atacar(enemigo);

        System.out.println("Vida del enemigo: " + enemigo.getVida());
    }
}

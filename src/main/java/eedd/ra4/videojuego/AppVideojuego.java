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
        Jugador j = new Jugador();
        j.nombre = "Héroe";
        j.vida = 100;
        j.nivel = 5;
        j.experiencia = 50;

        Enemigo e = new Enemigo();
        e.nombre = "Orco";
        e.vida = 80;
        e.nivel = 3;
        e.tipo = "Guerrero";
        
        j.atacar(e);

        System.out.println("Vida del enemigo: " + e.vida);
    }
}

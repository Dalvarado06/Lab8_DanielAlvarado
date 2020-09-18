/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_danielalvarado;

public class Cancion {
    
    private String nombre;
    private int puntuacion;
    private int anio;
    private String artista;
    private String album;

    public Cancion() {
    }

    public Cancion(String nombre, int puntuacion, int anio, String artista, String album) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.anio = anio;
        this.artista = artista;
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Cancion: " + " nombre = " + nombre + " artista = " + artista;
    }
    
    
}

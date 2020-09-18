/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_danielalvarado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {

    private String nombre;
    private ArrayList<Cancion> listaCanciones = new ArrayList();

    public Playlist() {
    }

    public Playlist(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    @Override
    public String toString() {
        return "Playlist: " + nombre;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fl = null;
        BufferedWriter bw = null;
        
        //String nombre = fi
        
        File archivo = new File("./"+getNombre() + ".txt");

        try {
            fl = new FileWriter(archivo, false);
            bw = new BufferedWriter(fl);

            for (Cancion l : listaCanciones) {
                bw.write(l.getNombre() + "|" + l.getPuntuacion() + "|" + l.getAnio()
                        + "|" + l.getArtista() + "|" + l.getAlbum() + "|");
                bw.newLine();
            }

            bw.flush();

        } catch (Exception e) {
        }

        bw.close();
        fl.close();
    }

    public void cargarLista() {

        Scanner sc = null;
        File archivo = new File(getNombre() + ".txt");

        if (archivo.exists()) {

            try {
                
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    listaCanciones.add(new Cancion(sc.next(), sc.nextInt()
                            , sc.nextInt(), sc.next(), sc.next()));
                    
                }
                
            } catch (Exception e) {
            }

        }
        
        sc.close();
    }

}

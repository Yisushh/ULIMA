/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programalibro;

/**
 *
 * @author otro3
 */
public class Libro {
    private String titulo;
    private String autor;
    private String anioPublicacion;
    private int nroPaginas;
    
    //Constructor

    public Libro(String titulo, String autor, String anioPublicacion, int nroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.nroPaginas = nroPaginas;
    }
    
    //Getters y Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }
    
    //Otros métodos
    
    public String getDatos() {
        return "Titulo: " + this.titulo + "\n" +
                "Autor: " + this.autor + "\n" +
                "Año de Publicación: " + this.anioPublicacion + "\n" +
                "Nro de Páginas: " + this.nroPaginas;
    }
}

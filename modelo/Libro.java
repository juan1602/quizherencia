package modelo;


public class Libro
{
    //Atributos
    protected String autor;
    protected String autor2;
    protected String titulo;
    protected int anioEdicion;
    protected boolean edicionLujo;
    

    //Metodos 
    //Metodos constructor
    public Libro(String titulo, String autor, int anioEdicion,String autor2, boolean edicionLujo) {                                    
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAutor2(autor2);
        this.setEdicionLujo(edicionLujo);
    }

    public String getAutor2() {
        return autor2;
    }

    public void setAutor2(String autor2) {
        this.autor2 = autor2;
    }

    public boolean isEdicionLujo() {
        return edicionLujo;
    }

    public void setEdicionLujo(boolean edicionLujo) {
        this.edicionLujo = edicionLujo;
    }

    public Integer getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(Integer anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String toString()
    {
        return "autor: "+ autor + "\ntitulo: "+ titulo +"\nAño de edicion: " + anioEdicion +"\nEdicion de lujo:"+ edicionLujo;
    }

    


}
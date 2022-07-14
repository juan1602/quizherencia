package modelo;

public class LibroColeccion extends Libro 
{
    //Atributos 
    private String nombreColeccion;
    private int numeroColeccion;

    public LibroColeccion(String titulo,String autor,int anioEdicion,boolean edicionLujo,String autor2,String nombreColeccion, int numeroColeccion)
    {
        super(titulo, autor, anioEdicion, autor2, edicionLujo);
        this.setNombreColeccion(nombreColeccion);
        this.setNumeroColeccion(numeroColeccion);
    }

    public int getNumeroColeccion() {
        return numeroColeccion;
    }

    public void setNumeroColeccion(int numeroColeccion) {
        this.numeroColeccion = numeroColeccion;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
}

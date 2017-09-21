package hansa.com.bo.hbm;

/**
 * Created by VAlaro on 21/9/2017.
 */

public class MenuHansa {

    private String nombre;
    private int foto;


    public MenuHansa(){

    }

    public MenuHansa(String nombre, int foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}

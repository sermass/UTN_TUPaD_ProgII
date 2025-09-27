/*
 * 
 */
package umlpasaportefototitular;

/**
 *
 */
public class Pasaporte {

    private String numero;
    private String fecha;
    private Titular titular;
    private Foto foto;
    
    public Pasaporte(String numero, String fecha,String urlFoto, String formato) {
        this.numero = numero;
        this.fecha = fecha;
        this.foto = new Foto(urlFoto, formato);
    }

    public String mostrarFoto() {
        return foto.getImagen();
    }
    public String mostrarFormato() {
        return foto.getFormato();
    }
    
    

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getFecha() {
        return fecha;
    }

    public Foto getFoto() {
        return foto;
    }
    

    public Titular getTitular() {
        return titular;
    }

     
    
}

/*
 */
package umlcelularbateriausuario;

/**
 *
 */
public class Celular {
    private int imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    

    public Celular(int imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    
    public void mostrar() {
        System.out.println("Celular: " + imei
                + "\n - Marca: " + marca 
                + "\n - Modelo: " + modelo 
                + "\n - Bateria: " + bateria.getModelo() + "- Capacidad: " + bateria.getCapacidad()
                + "\n - Usuario: " + usuario.getNombre() + " Dni: " + usuario.getDni());
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    
    public int getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    
    
}

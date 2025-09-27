/*
 */
package umlcelularbateriausuario;

/**
 *
 */
public class Bateria {
    private String modelo;
    private String capacidad;

    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

}

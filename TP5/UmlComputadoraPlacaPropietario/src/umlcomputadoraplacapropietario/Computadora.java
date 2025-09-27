/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umlcomputadoraplacapropietario;

/**
 *
 * @author Mama y Papa
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private Placamadre placamadre; // Composición
    private Propietario propietario; // Asociación bidireccional 1:1
    
    // Constructor con composición
    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placamadre = new Placamadre(modelo, chipset); // Composición
    }
    
    // Constructor alternativo
    public Computadora(String marca, String numeroSerie, Placamadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placamadre = placaMadre;
    }
    
    // Getters y Setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    public Placamadre getPlacamadre() {
        return placamadre;
    }
    
    public void setPlacamadre(Placamadre placamadre) {
        this.placamadre = placamadre;
    }
    
    public Propietario getPropietario() {
        return propietario;
    }
    
    // Setter controlado para mantener la bidireccionalidad
    public void setPropietario(Propietario propietario) {
        
        this.propietario = propietario;
        
        // Establecer en el nuevo propietario
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
    // Método para obtener información completa
    public String obtenerInformacionCompleta() {
        return "Computadora{" + 
               "marca='" + marca + "'" + 
               ", numeroSerie='" + numeroSerie + "'" + 
               ", placaMadre=" + placamadre + 
               ", propietario=" + (propietario != null ? propietario.getNombre() : "Sin propietario") + 
               "}";
    }
    
    @Override
    public String toString() {
        return "Computadora{marca='" + marca + "', numeroSerie='" + numeroSerie + "'}";
    }
}

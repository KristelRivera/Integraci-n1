/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integración1;

/**
 *
 * @author krist
 */
public class Agente {
    //atributos
    private String agenteVenta;
    private double cedulaAgente;
    private int codigoAgente;
    private String sucursal;
    private String vehículo;
    
    //constructor con parametros
    public Agente(String agenteVenta, double cedulaAgente, int codigoAgente, String sucursal, String vehículo) {
        this.agenteVenta = agenteVenta;
        this.cedulaAgente = cedulaAgente;
        this.codigoAgente = codigoAgente;
        this.sucursal = sucursal;
        this.vehículo = vehículo;
        
    }

    
    //constructor sin parametros
    public Agente() {
        this.agenteVenta = "No se registro nombre";
        this.cedulaAgente = 0 ;
        this.codigoAgente = 0 ;
        this.sucursal = "No se registro sucursal";
        this.vehículo = "No se registro vehículo";
    }
    //gett y sett
    public String getAgenteVenta() {
        return agenteVenta;
    }

    public void setAgenteVenta(String agenteVenta) {
        this.agenteVenta = agenteVenta;
    }

    public double getCedulaAgente() {
        return cedulaAgente;
    }

    public void setCedulaAgente(double cedulaAgente) {
        this.cedulaAgente = cedulaAgente;
    }

    public int getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(int codigoAgente) {
        this.codigoAgente = codigoAgente;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getVehículo() {
        return vehículo;
    }

    public void setVehículo(String vehículo) {
        this.vehículo = vehículo;
    }
    //mostrar info 
    public void despliegaInfo() { 
    System.out.println("Nombre del agente: " + agenteVenta ); 
    System.out.println("Cédula del agente:" +cedulaAgente ); 
    System.out.println("Código del agente:" + codigoAgente); 
    System.out.println("Sucursal del agente:" + sucursal);   
    System.out.println("Vehículo:" + vehículo);  
}
    

    
}

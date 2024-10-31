/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integración1;
/**
 *
 * @author krist
 */
public class Factura{

    static void comprobarBono() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //atributos
    private String nombreCliente;
    private double cedulaCliente;
    private double codigoCliente;
    private double montoFactura;
    private int numeroMes;
    private int electronicos;
    private int automotrices;
    private int  construccion;
    private Agente agente;
 
    //constructor con parametros
    public Factura(String nombreCliente, double cedulaCliente, double codigoCliente, double montoFactura, int numeroMes, int electronicos, int automotrices, int construccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoCliente = codigoCliente;
        this.montoFactura = montoFactura;
        this.numeroMes = numeroMes;
        this.electronicos = electronicos;
        this.automotrices = automotrices;
        this.construccion = construccion;
        agente.puntos=1;
    }
    //sin parametros
    public Factura() {
        this.nombreCliente = "No se ingreso";
        this.cedulaCliente = 0;
        this.codigoCliente = 0;
        this.montoFactura = 0;
        this.numeroMes = 0;
        this.electronicos = 0;
        this.automotrices = 0;
        this.construccion = 0;
    }      
         //metodo public void despliegaInfo() { 
        /*public void comprobarBono (){
        if ( ){

    }*/
    public void comprobarElectronicos(){
    int electronicos = 0;
    double montoFactura = 0;
        if (electronicos >= 3){
        double bono = montoFactura * 0.04;
            System.out.println("Bono del 4%");  
        }
        else{
            double bono = montoFactura * 0.02;
            System.out.println("Bono del 2%");
            
        }
            
        }
    public void comprobarAutomotrices(){
     if(automotrices >= 3){    
     double bono = montoFactura * 0.04;
         System.out.println("Bono del 4%");
    }
    else{
    double bono = montoFactura * 0.02;
         System.out.println("Boo del 2%");
     }
    //public void comprobarConstruccion(){  
    }
    
    //mostrar info 
    public void despliegaInfo() { 
    System.out.println("Nombre del cliente: " + nombreCliente); 
    System.out.println("Cédula del cliente:" +cedulaCliente ); 
    System.out.println("Código del cliente:" + codigoCliente); 
    System.out.println("Monto Factura:" + montoFactura);   
    System.out.println("Mes:" + numeroMes); 
    System.out.println("Contiene productos electronicos:" + electronicos); 
    System.out.println("Contiene productos automotrices:" + automotrices); 
    System.out.println("Contiene productos de construcción:" + construccion);
}
}       


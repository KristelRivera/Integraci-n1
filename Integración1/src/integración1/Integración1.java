/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integración1;

import javax.swing.JOptionPane;

/**
 *
 * @author krist
 */
public class Integración1 {

    private static Factura Factura;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        String agenteVenta = "";
        double cedulaAgente = 0;
        int codigoAgente = 0 ;
        String sucursal = "";
        String vehículo = "";
        //
        String nombreCliente = "";
        double cedulaCliente = 0;
        double codigoCliente = 0;
        double montoFactura = 0;
        int numeroMes = 0;
        int electronicos;
        int automotrices;
        int  construccion;
        Agente agente = null;
        
        
        //pedir variables Agente
        agenteVenta = JOptionPane.showInputDialog("Ingrese su nombre");
        cedulaAgente= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cédula"));
        codigoAgente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su código"));
        sucursal = JOptionPane.showInputDialog("Ingrese la sucursal");
        vehículo = JOptionPane.showInputDialog("Tiene vehículo si o no");
        
        //pedir variables SolicitarFactura
        nombreCliente = JOptionPane.showInputDialog("Ingrese su nombre");
        cedulaCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cédula"));
        codigoCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su código"));
        montoFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a pagar de su factura"));
        numeroMes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # de mes"));
        electronicos = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de productos electronicos que posee la factura"));
        automotrices = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de productos automotrices que posee la factura"));
        construccion = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de  productos de construcción que posee la factura"));

    //instancias
    Agente Agente= new Agente (agenteVenta, cedulaAgente, codigoAgente, sucursal, vehículo);
    Factura = new Factura (nombreCliente, cedulaCliente, codigoCliente, montoFactura, numeroMes, electronicos, automotrices, construccion );
    
    //mostrar datos 
    System.out.println("Mostrar datos");
    Agente.despliegaInfo();
    Factura.despliegaInfo();
    Factura.comprobarBono();
    Factura.comprobarElectronicos();
    Factura.comprobarAutomotrices();
    //Factura.comprobarConstruccion();
     
   
    
}
}